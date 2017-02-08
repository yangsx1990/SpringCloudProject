package com.hiersun.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiersun.entity.Dict;
import com.hiersun.service.DictService;
import com.hiersun.service.mapper.DictMapper;
import com.hiersun.vo.DictSelelctItem;

@Service
public class DictServiceImpl implements DictService {

	@Autowired DictMapper dictMapper;

	@Override
	public List<Dict> getDictByPid(int pid) {
		return dictMapper.selectByPid(pid);
	}

	@Override
	public List<DictSelelctItem> getDicts(int id) {
		List<DictSelelctItem> items = new ArrayList<DictSelelctItem>();
		List<Dict> dicts = dictMapper.selectByPid(id);
		for (Dict dict : dicts) {
			DictSelelctItem item = new DictSelelctItem();
			if (null != dict) {
				item.setDictName(dict.getDictName());
				item.setDictId(dict.getDictId());
				item.setDictValue(dict.getDictValue());
				item.setChild(getChildDictSelectItems(item));
			}
			items.add(item);
		}

		return items;
	}

	private List<DictSelelctItem> getChildDictSelectItems(DictSelelctItem item) {
		List<DictSelelctItem> items = new ArrayList<DictSelelctItem>();
		List<Dict> dicts = dictMapper.selectByPid(item.getDictId());
		for (Dict dict : dicts) {
			DictSelelctItem item1 = new DictSelelctItem();
			if (null != dict) {
				item1.setDictName(dict.getDictName());
				item1.setDictId(dict.getDictId());
				item1.setDictValue(dict.getDictValue());
				items.add(item1);
			}
		}
		return items;

	}

}
