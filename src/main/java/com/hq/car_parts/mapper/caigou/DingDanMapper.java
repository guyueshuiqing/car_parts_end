package com.hq.car_parts.mapper.caigou;

import com.hq.car_parts.entity.caigou.DingDan;
import com.hq.car_parts.entity.caigou.DingDanSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DingDanMapper {
    void insertDingDan(DingDan dingDan);
    List<DingDan> findAllDingDan();
    List<DingDan> getOwnDingDan(String username);
    List<DingDan> getFilterDingDan(DingDanSelect shenGouSelect);
    DingDan getDingDanByNum(String str);
    void updateDingDanDate(DingDan dingDan);
    void updateDingDanPrice(DingDan dingDan);
    void updateDingDanStatus(DingDan dingDan);
    void updateDingDan(DingDan dingDan);
    void deleteDingDanByNum(String str);

    List<DingDan> getOwnSort(String name);

}
