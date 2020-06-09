package com.hq.car_parts.service.caigou;

import com.hq.car_parts.entity.caigou.TuiHuo;
import com.hq.car_parts.entity.caigou.TuiHuoSelect;

import java.util.List;

public interface TuiHuoService {
    void insertTuiHuo(TuiHuo tuiHuo);
    List<TuiHuo> findAllTuiHuo();
    List<TuiHuo> getOwnTuiHuo(String username);
    List<TuiHuo> getFilterTuiHuo(TuiHuoSelect tuiHuoSelect);
    void updateTuiHuoDate(TuiHuo tuiHuo);
    void updateTuiHuoPrice(TuiHuo tuiHuo);
    void updateTuiHuoStatus(TuiHuo tuiHuo);
    void updateTuiHuo(TuiHuo tuiHuo);
    void deleteTuiHuoByNum(String str);
    List<TuiHuo> getOwnSort(String str);
}
