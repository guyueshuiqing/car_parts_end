package com.hq.car_parts.service.kucun;

import com.hq.car_parts.entity.kucun.KuCun;

import java.util.List;

public interface KuCunService {
    void insertKuCun(KuCun kuCun);
    List<KuCun> findAllKuCun();
    List<KuCun> getOwnKuCun(String username);
    List<KuCun> getFilterKuCun(KuCun shenGouSelect);
    KuCun getKuCunByName(String name);
    void updateNewKuCun(KuCun kuCun);
    void updateKuCunBreak(KuCun kuCun);
    void updateKuCunUnit(KuCun kuCun);
    void updateKuCunDate(KuCun kuCun);
    void updateKuCunPrice(KuCun kuCun);
    void updateKuCunStatus(KuCun kuCun);
    void updateKuCun(KuCun kuCun);
    void deleteKuCunByNum(String str);
}
