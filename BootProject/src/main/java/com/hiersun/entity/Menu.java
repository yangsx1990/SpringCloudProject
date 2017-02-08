package com.hiersun.entity;

import javax.persistence.*;

public class Menu {
    /**
     * 编号
     */
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 父编号
     */
    @Column(name = "parent_menu_id")
    private Integer parentMenuId;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 标识：0：正常 1：禁用
     */
    private Boolean flag;

    /**
     * 描述
     */
    private String description;

    /**
     * 显示顺序
     */
    private Integer sequence;

    /**
     * 所属系统
     */
    @Column(name = "sys_id")
    private String sysId;

    /**
     * 获取编号
     *
     * @return menu_id - 编号
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置编号
     *
     * @param menuId 编号
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取父编号
     *
     * @return parent_menu_id - 父编号
     */
    public Integer getParentMenuId() {
        return parentMenuId;
    }

    /**
     * 设置父编号
     *
     * @param parentMenuId 父编号
     */
    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    /**
     * 获取链接地址
     *
     * @return url - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取标识：0：正常 1：禁用
     *
     * @return flag - 标识：0：正常 1：禁用
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * 设置标识：0：正常 1：禁用
     *
     * @param flag 标识：0：正常 1：禁用
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
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

    /**
     * 获取显示顺序
     *
     * @return sequence - 显示顺序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置显示顺序
     *
     * @param sequence 显示顺序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取所属系统
     *
     * @return sys_id - 所属系统
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * 设置所属系统
     *
     * @param sysId 所属系统
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }
}