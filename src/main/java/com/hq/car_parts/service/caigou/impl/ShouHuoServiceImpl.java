package com.hq.car_parts.service.caigou.impl;

import com.hq.car_parts.entity.caigou.ShouHuo;
import com.hq.car_parts.entity.caigou.ShouHuoSelect;
import com.hq.car_parts.mapper.caigou.ShouHuoMapper;
import com.hq.car_parts.service.caigou.ShouHuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShouHuoServiceImpl implements ShouHuoService {

    @Autowired
    private ShouHuoMapper shouHuoMapper;

    @Override
    public void insertShouHuo(ShouHuo dingDan) {
        shouHuoMapper.insertShouHuo(dingDan);
    }

    @Override
    public List<ShouHuo> findAllShouHuo() {
        return shouHuoMapper.findAllShouHuo();
    }

    @Override
    public List<ShouHuo> getOwnShouHuo(String username) {
        return shouHuoMapper.getOwnShouHuo(username);
    }

    @Override
    public List<ShouHuo> getFilterShouHuo(ShouHuoSelect shenGouSelect) {
        return shouHuoMapper.getFilterShouHuo(shenGouSelect);
    }

    @Override
    public void updateShouHuoDate(ShouHuo dingDan) {
        shouHuoMapper.updateShouHuoDate(dingDan);
    }

    @Override
    public void updateShouHuoPrice(ShouHuo dingDan) {

    }

    @Override
    public void updateShouHuoStatus(ShouHuo dingDan) {
        shouHuoMapper.updateShouHuoStatus(dingDan);
    }

    @Override
    public void updateShouHuo(ShouHuo dingDan) {
        shouHuoMapper.updateShouHuo(dingDan);
    }

    @Override
    public void deleteShouHuoByNum(String str) {
        shouHuoMapper.deleteShouHuoByNum(str);
    }

    @Override
    public List<ShouHuo> getOwnSort(String name) {
        return shouHuoMapper.getOwnSort(name);
    }
}
