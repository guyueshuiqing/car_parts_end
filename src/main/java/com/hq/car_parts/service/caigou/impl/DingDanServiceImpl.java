package com.hq.car_parts.service.caigou.impl;

import com.hq.car_parts.entity.caigou.DingDan;
import com.hq.car_parts.entity.caigou.DingDanSelect;
import com.hq.car_parts.mapper.caigou.DingDanMapper;
import com.hq.car_parts.service.caigou.DingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DingDanServiceImpl implements DingDanService {

    @Autowired
    private DingDanMapper dingDanMapper;

    @Override
    public void insertDingDan(DingDan dingDan) {
        dingDanMapper.insertDingDan(dingDan);
    }

    @Override
    public List<DingDan> findAllDingDan() {
        return dingDanMapper.findAllDingDan();
    }

    @Override
    public List<DingDan> getOwnDingDan(String username) {
        return dingDanMapper.getOwnDingDan(username);
    }

    @Override
    public List<DingDan> getFilterDingDan(DingDanSelect dingDanSelect) {
        return dingDanMapper.getFilterDingDan(dingDanSelect);
    }

    @Override
    public void updateDingDanDate(DingDan dingDan) {
        dingDanMapper.updateDingDanDate(dingDan);
    }

    @Override
    public void updateDingDanPrice(DingDan dingDan) {
        dingDanMapper.updateDingDanPrice(dingDan);
    }

    @Override
    public void updateDingDanStatus(DingDan dingDan) {
        dingDanMapper.updateDingDanStatus(dingDan);
    }

    @Override
    public void updateDingDan(DingDan dingDan) {
        dingDanMapper.updateDingDan(dingDan);
    }

    @Override
    public void deleteDingDanByNum(String str) {
        dingDanMapper.deleteDingDanByNum(str);
    }

    @Override
    public DingDan getDingDanByNum(String str) {
        return dingDanMapper.getDingDanByNum(str);
    }

    @Override
    public List<DingDan> getOwnSort(String name) {
        return dingDanMapper.getOwnSort(name);
    }
}
