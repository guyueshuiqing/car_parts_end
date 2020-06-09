package com.hq.car_parts.service.kucun.impl;

import com.hq.car_parts.entity.kucun.RuKu;
import com.hq.car_parts.entity.kucun.RuKuSelect;
import com.hq.car_parts.mapper.kucun.RuKuMapper;
import com.hq.car_parts.service.kucun.RuKuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuKuServiceImpl implements RuKuService {

    @Autowired
    private RuKuMapper ruKuMapper;

    @Override
    public void insertRuKu(RuKu ruKu) {
        ruKuMapper.insertRuKu(ruKu);
    }

    @Override
    public List<RuKu> findAllRuKu() {
        return ruKuMapper.findAllRuKu();
    }

    @Override
    public List<RuKu> getOwnRuKu(String username) {
        return ruKuMapper.getOwnRuKu(username);
    }

    @Override
    public List<RuKu> getFilterRuKu(RuKuSelect shenGouSelect) {
        return ruKuMapper.getFilterRuKu(shenGouSelect);
    }

    @Override
    public void updateRuKuDate(RuKu ruKu) {

    }

    @Override
    public void updateRuKuPrice(RuKu ruKu) {

    }

    @Override
    public void updateRuKuStatus(RuKu ruKu) {
        ruKuMapper.updateRuKuStatus(ruKu);
    }

    @Override
    public void updateRuKu(RuKu ruKu) {
        ruKuMapper.updateRuKu(ruKu);
    }

    @Override
    public void deleteRuKuByNum(String str) {
        ruKuMapper.deleteRuKuByNum(str);
    }
}
