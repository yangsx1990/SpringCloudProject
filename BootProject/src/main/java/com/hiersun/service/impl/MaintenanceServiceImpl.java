package com.hiersun.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import tk.mybatis.mapper.entity.Example;

import com.hiersun.Contants;
import com.hiersun.entity.Maintenance;
import com.hiersun.service.MaintenanceService;
import com.hiersun.service.SequenceNumberService;
import com.hiersun.service.mapper.MaintenanceMapper;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {
	@Autowired private MaintenanceMapper maintenanceMapper;
	@Autowired private SequenceNumberService sequenceNumberService;

	@Override
	public Maintenance apply(Maintenance maintenance) {
		//校验
		maintenance.setMaintenanceId(sequenceNumberService.getNumber());
		maintenance.setCreateTime(new Date());
		if (null == maintenance.getDealName() && maintenance.getDealName() == "")
			maintenance.setState(Contants.STATE_UNDEAL);
		else {
			maintenance.setState(Contants.STATE_ALLOCATED);
			maintenance.setAllocateTime(new Date());
		}
		maintenance.setUpdateTime(new Date());
		maintenance.setFlag(Contants.FLAG_NORMAL);
		maintenanceMapper.insert(maintenance);
		return maintenance;
	}

	@Override
	public int delete(int id) {
		Maintenance maintenance = new Maintenance();
		maintenance.setId((long) id);
		maintenance.setFlag(Contants.FLAG_DELETE);
		return maintenanceMapper.updateByPrimaryKeySelective(maintenance);

	}

	@Override
	public Maintenance update(Maintenance maintenance) {
		maintenanceMapper.updateByPrimaryKeySelective(maintenance);
		return maintenance;
	}

	@Override
	public int redistribute(String maintenanceId, int userId, String name) {
		Maintenance maintenance = new Maintenance();
		maintenance.setDealId(userId);
		maintenance.setDealName(name);
		maintenance.setMaintenanceId(maintenanceId);
		int str=maintenanceMapper.updateDealById(maintenance);
		System.out.println("结果是"+str);
		return str;		
	}

}
