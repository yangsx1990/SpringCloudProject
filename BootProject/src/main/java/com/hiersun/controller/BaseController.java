package com.hiersun.controller;/**
 * Created by liubaocheng on 2017/1/3.
 */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * Description:基础控制类工具类
 * Author: liubaocheng
 * Create: 2017-01-03 14:19
 **/
public class BaseController {

    /**
     * 默认查询页数
     * @param pageNum  页码
     * @param pageSize 每页显示数量
     * @return
     */
    public Page<?> startPage(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize);
    }
}
