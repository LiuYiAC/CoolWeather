package com.liuyi.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LiuYi on 2017/1/2.
 * 省份实体类
 */

public class Province extends DataSupport {

    private int id;
    //省名
    private String provinceName;
    //省代码
    private int provinceCode;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
