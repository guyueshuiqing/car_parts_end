package com.hq.car_parts.service.xiaoshou;

import com.hq.car_parts.entity.xiaoshou.XiaoShouD;

import java.util.List;

public interface XDService {
    void insertXiaoShouD(XiaoShouD xd);
    List<XiaoShouD> findAllXiaoShouD();
    List<XiaoShouD> getOwnXiaoShouD(String username);
    List<XiaoShouD> getFilterXiaoShouD(XiaoShouD shenGouSelect);
    XiaoShouD getXiaoShouDByName(String name);
    void updateNewXiaoShouD(XiaoShouD xd);
    void updateXiaoShouDBreak(XiaoShouD xd);
    void updateXiaoShouDUnit(XiaoShouD xd);
    void updateXiaoShouDDate(XiaoShouD xd);
    void updateXiaoShouDPrice(XiaoShouD xd);
    void updateXiaoShouDStatus(XiaoShouD xd);
    void updateXiaoShouD(XiaoShouD xd);
    void deleteXiaoShouDByNum(String str);
}
