package com.hq.car_parts.mapper.caigou;

import com.hq.car_parts.entity.caigou.TuiHuo;
import com.hq.car_parts.entity.caigou.TuiHuoSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TuiHuoMapper {
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
