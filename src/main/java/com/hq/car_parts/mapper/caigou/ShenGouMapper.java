package com.hq.car_parts.mapper.caigou;

import com.hq.car_parts.entity.caigou.ShenGou;
import com.hq.car_parts.entity.caigou.ShenGouSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShenGouMapper {
    void insertShenGou(ShenGou shenGou);
    List<ShenGou> findAllShenGou();
    List<ShenGou> getOwnShenGou(String username);
    List<ShenGou> getFilterShenGou(ShenGouSelect shenGouSelect);
    List<ShenGou> getOwnSort(String name);
    ShenGou getShenGouByNum(String str);

    void updateStatus(ShenGou shenGou);

    void updateShenGou(ShenGou shenGou);

    void deleteShenGouByNum(String number);
}
