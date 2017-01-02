package com.liuyi.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LiuYi on 2017/1/2.
 * 县实体
 */

public class County extends DataSupport {
    private int id;
    //县名
    private String countyName;
    //县对应的天气Id
    private String weatherId;
    //所属市
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
