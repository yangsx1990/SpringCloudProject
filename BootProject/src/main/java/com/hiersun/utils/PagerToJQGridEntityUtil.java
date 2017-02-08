package com.hiersun.utils;

import com.github.pagehelper.Page;
import com.hiersun.vo.JQGridEntity;

public class PagerToJQGridEntityUtil {
	/*public static <T> JQGridEntity<T> pagerConvertJQGrid(Page<?> pageBean, Object userdata) {
		JQGridEntity entity = new JQGridEntity();
		entity.setPage(pageBean.getPageNumber());
		entity.setRecords(Integer.valueOf(pageBean.getTotalRow()));
		entity.setRows(pageBean.getData());
		entity.setTotal(Integer.valueOf(pageBean.getTotalPageNumber()));
		entity.setUserdata(userdata);
		return entity;
	}*/

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> JQGridEntity<T> pagerConvertJQGrid(Page<?> pager) {
		JQGridEntity entity = new JQGridEntity();
		entity.setPage(pager.getPageNum());
		entity.setRecords(Integer.parseInt(String.valueOf(pager.getTotal())));
		entity.setRows(pager);
		pager.getTotal();
		entity.setTotal(pager.getPages());
		return entity;
	}
}