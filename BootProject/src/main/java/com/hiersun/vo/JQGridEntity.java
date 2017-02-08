package com.hiersun.vo;

import java.util.List;

public class JQGridEntity<T> {
	private Integer page;
	private Integer total;
	private Integer records;
	private List<T> rows;
	private Object userdata;

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return this.records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public List<T> getRows() {
		return this.rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public Object getUserdata() {
		return this.userdata;
	}

	public void setUserdata(Object userdata) {
		this.userdata = userdata;
	}
}