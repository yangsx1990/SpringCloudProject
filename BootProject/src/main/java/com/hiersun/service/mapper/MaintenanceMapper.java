package com.hiersun.service.mapper;

import java.util.Map;

import com.hiersun.entity.Maintenance;

import tk.mybatis.mapper.common.Mapper;

public interface MaintenanceMapper extends Mapper<Maintenance> {
	public int updateDealById(Maintenance maintenance);
}