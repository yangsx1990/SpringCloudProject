package com.hiersun.vo;

import java.util.List;

public class DictSelelctItem {
	private Integer dictId;
	private String dictName;
	private String dictValue;
	private List<DictSelelctItem> child;

	public Integer getDictId() {
		return dictId;
	}

	public void setDictId(Integer dictId) {
		this.dictId = dictId;
	}

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public List<DictSelelctItem> getChild() {
		return child;
	}

	public void setChild(List<DictSelelctItem> child) {
		this.child = child;
	}

}
