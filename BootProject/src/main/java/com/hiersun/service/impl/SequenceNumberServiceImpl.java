package com.hiersun.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hiersun.entity.SequenceNumber;
import com.hiersun.service.SequenceNumberService;
import com.hiersun.service.mapper.SequenceNumberMapper;

@Service
public class SequenceNumberServiceImpl implements SequenceNumberService {
	@Autowired SequenceNumberMapper sequenceNumberMapper;

	@Override
	@Transactional
	public String getNumber() {
		SimpleDateFormat formatterDate = new SimpleDateFormat("yyyyMMddHHmmss");
		String datenum = formatterDate.format(new Date());
		String result = "E" + datenum;
		SequenceNumber arg0 = getSequenceNumber();
		String strNum = arg0.getVal().toString();
		String strTemp = "";
		for (int i = 0; i < 4 - strNum.length(); i++) {
			strTemp += "0";
		}
		result = result + strTemp + strNum;
		return result;
	}

	@Transactional
	private synchronized SequenceNumber getSequenceNumber() {
		SequenceNumber arg0 = new SequenceNumber();
		arg0.setNumType("maintenance");
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(currentTime);
		arg0.setTimecondition(dateString);
		List<SequenceNumber> sequenceList = sequenceNumberMapper.select(arg0);
		if (null == sequenceList || sequenceList.size() == 0) {
			arg0.setDescription("报修单号");
			arg0.setStep(1);
			arg0.setVal(1);
			sequenceNumberMapper.insert(arg0);
		}
		else {
			arg0 = sequenceList.get(0);
			arg0.setVal(arg0.getVal() + arg0.getStep());
			sequenceNumberMapper.updateByPrimaryKey(arg0);
		}
		return arg0;
	}

}
