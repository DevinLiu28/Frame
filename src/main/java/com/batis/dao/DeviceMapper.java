package com.batis.dao;

import com.batis.pojo.BuyerRecode;
import com.batis.pojo.DeviceIn;
import com.batis.pojo.DeviceRecode;
import com.batis.pojo.RecodeSum;

import java.util.List;

public interface DeviceMapper {
    List<DeviceIn> selectDeviceInByDate(String inDate);

    List<DeviceRecode> selectRecodeByDevice(Integer code);

    List<RecodeSum> selectSum(String code);

    List<BuyerRecode> selectBuy(String buyer);
}
