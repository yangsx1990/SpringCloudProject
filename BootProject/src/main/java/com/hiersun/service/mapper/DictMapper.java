package com.hiersun.service.mapper;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

import com.hiersun.entity.Dict;

public interface DictMapper extends Mapper<Dict> {

	public List<Dict> selectByPid(int pid);
}