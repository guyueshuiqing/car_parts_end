package com.hq.car_parts.service.caigou;

import com.hq.car_parts.entity.caigou.ShouHuo;
import com.hq.car_parts.entity.caigou.ShouHuoSelect;

import java.util.List;

public interface ShouHuoService {
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
