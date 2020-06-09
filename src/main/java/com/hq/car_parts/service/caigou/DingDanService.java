package com.hq.car_parts.service.caigou;

import com.hq.car_parts.entity.caigou.DingDan;
import com.hq.car_parts.entity.caigou.DingDanSelect;

import java.util.List;

public interface DingDanService {
    void insertDingDan(DingDan dingDan);

    List<DingDan> findAllDingDan();

    List<DingDan> getOwnDingDan(String username);

    List<DingDan> getFilterDingDan(DingDanSelect dingDanSelect);

    void updateDingDanDate(DingDan dingDan);

    void updateDingDanPrice(DingDan dingDan);

    void updateDingDanStatus(DingDan dingDan);

    void updateDingDan(DingDan dingDan);

    void deleteDingDanByNum(String str);

    DingDan getDingDanByNum(String str);

    List<DingDan> getOwnSort(String name);
}
