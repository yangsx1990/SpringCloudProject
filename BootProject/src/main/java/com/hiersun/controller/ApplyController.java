package com.hiersun.controller;

/**
 * Created by liubaocheng on 2017/1/3.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.hiersun.entity.Maintenance;
import com.hiersun.entity.PageParam;
import com.hiersun.service.MaintenanceService;
import com.hiersun.service.mapper.MaintenanceMapper;
import com.hiersun.utils.PagerToJQGridEntityUtil;

/**
 * Description: 报修功能控制器
 * Author: liubaocheng
 * Create: 2017-01-03 14:08
 **/
@Controller
@RequestMapping("apply")
public class ApplyController extends BaseController {

	@Autowired private MaintenanceMapper maintenanceMapper;
	@Autowired private MaintenanceService maintenanceService;

	@RequestMapping("add")
	public String apply(Model model, PageParam pageParam) {
		model.addAttribute("maintenance", new Maintenance());
		return "apply/add";
	}
	/**
	 * 重新分配
	 * @param model
	 * @param maintenanceId
	 * @return
	 */
	@RequestMapping(value="/relocate")
	public String relocate(Model model, String maintenanceId) {
		Maintenance maintenance=new Maintenance();
		maintenance.setMaintenanceId(maintenanceId);
		maintenance=maintenanceMapper.selectOne(maintenance);
		model.addAttribute("maintenance", maintenance);
		
			return "apply/relocate";
		
		
				
	}
	/**
	 * 修改
	 * @param model
	 * @param maintenanceId
	 * @return
	 */
	@RequestMapping(value="/editUI")
	public String editUI(Model model, String maintenanceId) {
		Maintenance maintenance=new Maintenance();
		maintenance.setMaintenanceId(maintenanceId);
		maintenance=maintenanceMapper.selectOne(maintenance);
		System.out.println(maintenance.getDealName());
		model.addAttribute("maintenance", maintenance);
		return "apply/add";			
	}
	/**
	 * 保存报修单
	 * @param maintenance
	 * @return
	 */
	@RequestMapping(value = "/save")
	public ResponseEntity<Object> save(Maintenance maintenance) {
		System.out.println("maintenance.getMaintenanceId()="+maintenance.getMaintenanceId());
		try {
			if(StringUtils.hasText(maintenance.getMaintenanceId())){
				maintenanceService.update(maintenance);
			}else{
				maintenanceService.apply(maintenance);
			}
			return new ResponseEntity<Object>(maintenance, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * 修改保修单
	 * @param maintenance
	 * @return
	 */
	@RequestMapping(value = "/editsave")
	public ResponseEntity<Object> editSave(Maintenance maintenance) {
		try {
			maintenanceService.update(maintenance);
			return new ResponseEntity<Object>(maintenance, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	/**
	 * 重新分配保修单
	 * @param maintenance
	 * @return
	 */
	@RequestMapping(value = "/redistribute")
	public ResponseEntity<Object> redistribute(String maintenanceId,int userId,String name) {
		System.out.println("maintenanceId"+maintenanceId+"userId:"+userId+"name"+name);
		try{
			 maintenanceService.redistribute(maintenanceId, userId, name);
			 return new ResponseEntity<Object>("",HttpStatus.OK);
		}catch(Exception e){

			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	/**
	 * 删除报修单
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable int id) {
		try {
			maintenanceService.delete(id);
			return new ResponseEntity<Object>("", HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping("index")
	public String index(Model model, PageParam pageParam, Maintenance maintenance) {
		Page<?> page = startPage(pageParam.getPageNum(), pageParam.getPageSize());
		maintenanceMapper.select(maintenance);
		model.addAttribute("page", page);
		model.addAttribute("maintenance", maintenance);
		//        int total = page.getPages();
		//        model.addAttribute("page",pageParam);
		return "apply/index";
	}
	/**
	 * 分页查询所有保修单
	 * @param pageNum
	 * @param pageSize
	 * @param maintenance
	 * @return
	 */
	@RequestMapping(value = "findAllByPage")
	public ResponseEntity<Object> findAllByPage(Integer pageNum, Integer pageSize, Maintenance maintenance) {
		try {
			Page<?> page = startPage(1, 10);
			maintenanceMapper.select(maintenance);

			return new ResponseEntity<Object>(PagerToJQGridEntityUtil.pagerConvertJQGrid(page), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
