package com.hq.car_parts.service.caigou.impl;

import com.hq.car_parts.entity.caigou.ShenGou;
import com.hq.car_parts.entity.caigou.ShenGouSelect;
import com.hq.car_parts.mapper.caigou.ShenGouMapper;
import com.hq.car_parts.service.caigou.ShenGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShenGouServiceImpl implements ShenGouService {
    @Autowired
    private ShenGouMapper shenGouMapper;

    @Override
    public void insertShenGou(ShenGou shenGou) {
        shenGouMapper.insertShenGou(shenGou);
    }

    @Override
    public List<ShenGou> findAllShenGou() {
        return shenGouMapper.findAllShenGou();
    }

    @Override
    public List<ShenGou> getOwnShenGou(String username) {
        return shenGouMapper.getOwnShenGou(username);
    }

    @Override
    public List<ShenGou> getFilterShenGou(ShenGouSelect shenGouSelect) {
        return shenGouMapper.getFilterShenGou(shenGouSelect);
    }

    @Override
    public List<ShenGou> getOwnSort(String name) {
        return shenGouMapper.getOwnSort(name);
    }

    @Override
    public ShenGou getShenGouByNum(String str) {
        return shenGouMapper.getShenGouByNum(str);
    }

    @Override
    public void updateStatus(ShenGou shenGou) {
        shenGouMapper.updateStatus(shenGou);
    }

    @Override
    public void updateShenGou(ShenGou shenGou) {
        shenGouMapper.updateShenGou(shenGou);
    }

    @Override
    public void deleteShenGouByNum(String number) {
        shenGouMapper.deleteShenGouByNum(number);
    }

}
