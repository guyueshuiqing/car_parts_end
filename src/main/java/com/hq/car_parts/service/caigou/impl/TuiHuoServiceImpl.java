package com.hq.car_parts.service.caigou.impl;

import com.hq.car_parts.entity.caigou.TuiHuo;
import com.hq.car_parts.entity.caigou.TuiHuoSelect;
import com.hq.car_parts.mapper.caigou.TuiHuoMapper;
import com.hq.car_parts.service.caigou.TuiHuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TuiHuoServiceImpl implements TuiHuoService {

    @Autowired
    private TuiHuoMapper tuiHuoMapper;

    @Override
    public void insertTuiHuo(TuiHuo tuiHuo) {
        tuiHuoMapper.insertTuiHuo(tuiHuo);
    }

    @Override
    public List<TuiHuo> findAllTuiHuo() {
        return tuiHuoMapper.findAllTuiHuo();
    }

    @Override
    public List<TuiHuo> getOwnTuiHuo(String username) {
        return tuiHuoMapper.getOwnTuiHuo(username);
    }

    @Override
    public List<TuiHuo> getFilterTuiHuo(TuiHuoSelect tuiHuoSelect) {
        return tuiHuoMapper.getFilterTuiHuo(tuiHuoSelect);
    }

    @Override
    public void updateTuiHuoDate(TuiHuo tuiHuo) {

    }

    @Override
    public void updateTuiHuoPrice(TuiHuo tuiHuo) {

    }

    @Override
    public void updateTuiHuoStatus(TuiHuo tuiHuo) {
        tuiHuoMapper.updateTuiHuoStatus(tuiHuo);
    }

    @Override
    public void updateTuiHuo(TuiHuo tuiHuo) {

    }

    @Override
    public void deleteTuiHuoByNum(String str) {
        tuiHuoMapper.deleteTuiHuoByNum(str);
    }

    @Override
    public List<TuiHuo> getOwnSort(String str) {
        return tuiHuoMapper.getOwnSort(str);
    }
}
