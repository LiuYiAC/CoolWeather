package com.liuyi.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LiuYi on 2017/1/2.
 * 市实体
 */

public class City extends DataSupport {
    private int id;
    //市名
    private String cityName;
    //市代码
    private int cityCode;
    //所属省份Id
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
