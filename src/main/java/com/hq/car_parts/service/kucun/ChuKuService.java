package com.hq.car_parts.service.kucun;

import com.hq.car_parts.entity.kucun.ChuKu;
import com.hq.car_parts.entity.kucun.ChuKuSelect;

import java.util.List;

public interface ChuKuService {
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
