package com.hq.car_parts.service.kucun;

import com.hq.car_parts.entity.kucun.RuKu;
import com.hq.car_parts.entity.kucun.RuKuSelect;

import java.util.List;

public interface RuKuService {
    void insertRuKu(RuKu ruKu);
    List<RuKu> findAllRuKu();
    List<RuKu> getOwnRuKu(String username);
    List<RuKu> getFilterRuKu(RuKuSelect shenGouSelect);
    void updateRuKuDate(RuKu ruKu);
    void updateRuKuPrice(RuKu ruKu);
    void updateRuKuStatus(RuKu ruKu);
    void updateRuKu(RuKu ruKu);
    void deleteRuKuByNum(String str);
}
