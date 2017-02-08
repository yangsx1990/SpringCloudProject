package com.hiersun.service;

import java.util.List;

import com.hiersun.entity.Dict;
import com.hiersun.vo.DictSelelctItem;

public interface DictService {

	/**
	 * 获取下级字典列表数据。
	 * 
	 * @param pid
	 * @return
	 */
	public List<Dict> getDictByPid(int pid);

	/**
	 * 获取字典数据Select数据项
	 * 
	 * @param id
	 * @return
	 */
	public List<DictSelelctItem> getDicts(int id);

}
