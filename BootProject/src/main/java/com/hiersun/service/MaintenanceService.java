package com.hiersun.service;

import com.hiersun.entity.Maintenance;

/**
 * Created by liubaocheng on 2017/1/3.
 */

/**
 * Description: 保修服务控制器
 * Author: liubaocheng
 * Create: 2017-01-03 14:15
 **/
public interface MaintenanceService {

	/**
	 * 报修事件添加
	 * 
	 * @param maintenance
	 * @return
	 */
	public Maintenance apply(Maintenance maintenance);

	/**
	 * 修改事件内容
	 * 
	 * @param maintenance
	 * @return
	 */
	public Maintenance update(Maintenance maintenance);

	/**
	 * 逻辑删除
	 * 
	 * @param id
	 * @return
	 */
	public int delete(int id);
	/**
	 * 重新分配单
	 * @param maintenanceId
	 * @param userId 
	 * @param name
	 */
	int redistribute(String maintenanceId,int userId,String name);

}
