package com.hq.car_parts.mapper.kucun;

import com.hq.car_parts.entity.kucun.ChuKu;
import com.hq.car_parts.entity.kucun.ChuKuSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChuKuMapper {

    void insertChuKu(ChuKu chuKu);
    List<ChuKu> findAllChuKu();
    List<ChuKu> getOwnChuKu(String username);
    List<ChuKu> getFilterChuKu(ChuKuSelect shenGouSelect);
    void updateChuKuDate(ChuKu chuKu);
    void updateChuKuPrice(ChuKu chuKu);
    void updateChuKuStatus(ChuKu chuKu);
    void updateChuKu(ChuKu chuKu);
    void deleteChuKuByNum(String str);

}
