package com.hq.car_parts.service.kucun.impl;

import com.hq.car_parts.entity.kucun.ChuKu;
import com.hq.car_parts.entity.kucun.ChuKuSelect;
import com.hq.car_parts.mapper.kucun.ChuKuMapper;
import com.hq.car_parts.service.kucun.ChuKuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuKuServiceImpl implements ChuKuService {

    @Autowired
    private ChuKuMapper chuKuMapper;

    @Override
    public void insertChuKu(ChuKu chuKu) {
        chuKuMapper.insertChuKu(chuKu);
    }

    @Override
    public List<ChuKu> findAllChuKu() {
        return chuKuMapper.findAllChuKu();
    }

    @Override
    public List<ChuKu> getOwnChuKu(String username) {
        return chuKuMapper.getOwnChuKu(username);
    }

    @Override
    public List<ChuKu> getFilterChuKu(ChuKuSelect shenGouSelect) {
        return chuKuMapper.getFilterChuKu(shenGouSelect);
    }

    @Override
    public void updateChuKuDate(ChuKu chuKu) {

    }

    @Override
    public void updateChuKuPrice(ChuKu chuKu) {

    }

    @Override
    public void updateChuKuStatus(ChuKu chuKu) {
        chuKuMapper.updateChuKuStatus(chuKu);
    }

    @Override
    public void updateChuKu(ChuKu chuKu) {
        chuKuMapper.updateChuKu(chuKu);
    }

    @Override
    public void deleteChuKuByNum(String str) {
        chuKuMapper.deleteChuKuByNum(str);
    }
}
