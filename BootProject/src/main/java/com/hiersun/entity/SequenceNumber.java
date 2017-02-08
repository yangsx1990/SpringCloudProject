package com.hiersun.entity;

import javax.persistence.*;

@Table(name = "sequence_number")
public class SequenceNumber {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 序号类型
     */
    @Column(name = "num_type")
    private String numType;

    /**
     * 时间条件
     */
    private String timecondition;

    /**
     * 顺序号值
     */
    private Integer val;

    /**
     * 步长
     */
    private Integer step;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取序号类型
     *
     * @return num_type - 序号类型
     */
    public String getNumType() {
        return numType;
    }

    /**
     * 设置序号类型
     *
     * @param numType 序号类型
     */
    public void setNumType(String numType) {
        this.numType = numType;
    }

    /**
     * 获取时间条件
     *
     * @return timecondition - 时间条件
     */
    public String getTimecondition() {
        return timecondition;
    }

    /**
     * 设置时间条件
     *
     * @param timecondition 时间条件
     */
    public void setTimecondition(String timecondition) {
        this.timecondition = timecondition;
    }

    /**
     * 获取顺序号值
     *
     * @return val - 顺序号值
     */
    public Integer getVal() {
        return val;
    }

    /**
     * 设置顺序号值
     *
     * @param val 顺序号值
     */
    public void setVal(Integer val) {
        this.val = val;
    }

    /**
     * 获取步长
     *
     * @return step - 步长
     */
    public Integer getStep() {
        return step;
    }

    /**
     * 设置步长
     *
     * @param step 步长
     */
    public void setStep(Integer step) {
        this.step = step;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}