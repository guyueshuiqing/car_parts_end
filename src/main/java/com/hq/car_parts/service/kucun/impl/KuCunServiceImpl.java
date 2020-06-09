package com.hq.car_parts.service.kucun.impl;

import com.hq.car_parts.entity.kucun.KuCun;
import com.hq.car_parts.mapper.kucun.KuCunMapper;
import com.hq.car_parts.service.kucun.KuCunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KuCunServiceImpl implements KuCunService {

    @Autowired
    private KuCunMapper kuCunMapper;

    @Override
    public void insertKuCun(KuCun kuCun) {
        kuCunMapper.insertKuCun(kuCun);
    }

    @Override
    public List<KuCun> findAllKuCun() {
        return kuCunMapper.findAllKuCun();
    }

    @Override
    public List<KuCun> getOwnKuCun(String username) {
        return kuCunMapper.getOwnKuCun(username);
    }

    @Override
    public List<KuCun> getFilterKuCun(KuCun shenGouSelect) {
        return kuCunMapper.getFilterKuCun(shenGouSelect);
    }

    @Override
    public KuCun getKuCunByName(String name) {
        return kuCunMapper.getKuCunByName(name);
    }

    @Override
    public void updateNewKuCun(KuCun kuCun) {
        kuCunMapper.updateNewKuCun(kuCun);
    }

    @Override
    public void updateKuCunBreak(KuCun kuCun) {
        kuCunMapper.updateKuCunBreak(kuCun);
    }

    @Override
    public void updateKuCunUnit(KuCun kuCun) {
        kuCunMapper.updateKuCunUnit(kuCun);
    }

    @Override
    public void updateKuCunDate(KuCun kuCun) {

    }

    @Override
    public void updateKuCunPrice(KuCun kuCun) {

    }

    @Override
    public void updateKuCunStatus(KuCun kuCun) {
        kuCunMapper.updateKuCunStatus(kuCun);
    }

    @Override
    public void updateKuCun(KuCun kuCun) {
        kuCunMapper.updateKuCun(kuCun);
    }

    @Override
    public void deleteKuCunByNum(String str) {
        kuCunMapper.deleteKuCunByNum(str);
    }
}
