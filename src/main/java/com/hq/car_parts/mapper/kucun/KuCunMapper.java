package com.hq.car_parts.mapper.kucun;

import com.hq.car_parts.entity.kucun.KuCun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface KuCunMapper {
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
