package com.hq.car_parts.mapper.kucun;

import com.hq.car_parts.entity.kucun.RuKu;
import com.hq.car_parts.entity.kucun.RuKuSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RuKuMapper {
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
