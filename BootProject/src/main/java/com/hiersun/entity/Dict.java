package com.hiersun.entity;

import javax.persistence.*;

public class Dict {
    @Id
    @Column(name = "dict_id")
    private Integer dictId;

    @Column(name = "dict_parent_id")
    private Integer dictParentId;

    @Column(name = "dict_name")
    private String dictName;

    @Column(name = "dict_value")
    private String dictValue;

    private Integer sequence;

    private String description;

    /**
     * 状态 0: 正常 1：删除
     */
    private Byte status;

    /**
     * @return dict_id
     */
    public Integer getDictId() {
        return dictId;
    }

    /**
     * @param dictId
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    /**
     * @return dict_parent_id
     */
    public Integer getDictParentId() {
        return dictParentId;
    }

    /**
     * @param dictParentId
     */
    public void setDictParentId(Integer dictParentId) {
        this.dictParentId = dictParentId;
    }

    /**
     * @return dict_name
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * @param dictName
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * @return dict_value
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * @param dictValue
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * @param sequence
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取状态 0: 正常 1：删除
     *
     * @return status - 状态 0: 正常 1：删除
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 0: 正常 1：删除
     *
     * @param status 状态 0: 正常 1：删除
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}