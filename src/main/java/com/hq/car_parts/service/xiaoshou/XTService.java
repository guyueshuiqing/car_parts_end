package com.hq.car_parts.service.xiaoshou;

import com.hq.car_parts.entity.xiaoshou.XiaoShouT;

import java.util.List;

public interface XTService {
    void insertXiaoShouT(XiaoShouT xt);
    List<XiaoShouT> findAllXiaoShouT();
    List<XiaoShouT> getOwnXiaoShouT(String username);
    List<XiaoShouT> getFilterXiaoShouT(XiaoShouT shenGouSelect);
    XiaoShouT getXiaoShouTByName(String name);
    void updateNewXiaoShouT(XiaoShouT xt);
    void updateXiaoShouTBreak(XiaoShouT xt);
    void updateXiaoShouTUnit(XiaoShouT xt);
    void updateXiaoShouTDate(XiaoShouT xt);
    void updateXiaoShouTPrice(XiaoShouT xt);
    void updateXiaoShouTStatus(XiaoShouT xt);
    void updateXiaoShouT(XiaoShouT xt);
    void deleteXiaoShouTByNum(String str);
}
