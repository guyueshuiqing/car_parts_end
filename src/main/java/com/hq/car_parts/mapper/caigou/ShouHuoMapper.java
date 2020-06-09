package com.hq.car_parts.mapper.caigou;

import com.hq.car_parts.entity.caigou.ShouHuo;
import com.hq.car_parts.entity.caigou.ShouHuoSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShouHuoMapper {
    void insertShouHuo(ShouHuo dingDan);
    List<ShouHuo> findAllShouHuo();
    List<ShouHuo> getOwnShouHuo(String username);
    List<ShouHuo> getFilterShouHuo(ShouHuoSelect shenGouSelect);
    void updateShouHuoDate(ShouHuo dingDan);
    void updateShouHuoPrice(ShouHuo dingDan);
    void updateShouHuoStatus(ShouHuo dingDan);
    void updateShouHuo(ShouHuo dingDan);
    void deleteShouHuoByNum(String str);

    List<ShouHuo> getOwnSort(String name);

}