package com.hq.car_parts.service.xiaoshou.impl;

import com.hq.car_parts.entity.xiaoshou.XiaoShouT;
import com.hq.car_parts.mapper.xiaoshou.TMapper;
import com.hq.car_parts.service.xiaoshou.XTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XTServiceImpl implements XTService {

    @Autowired
    private TMapper tMapper;

    @Override
    public void insertXiaoShouT(XiaoShouT xt) {
        tMapper.insertXiaoShouT(xt);
    }

    @Override
    public List<XiaoShouT> findAllXiaoShouT() {
        return tMapper.findAllXiaoShouT();
    }

    @Override
    public List<XiaoShouT> getOwnXiaoShouT(String username) {
        return tMapper.getOwnXiaoShouT(username);
    }

    @Override
    public List<XiaoShouT> getFilterXiaoShouT(XiaoShouT shenGouSelect) {
        return tMapper.getFilterXiaoShouT(shenGouSelect);
    }

    @Override
    public XiaoShouT getXiaoShouTByName(String name) {
        return tMapper.getXiaoShouTByName(name);
    }

    @Override
    public void updateNewXiaoShouT(XiaoShouT xt) {

    }

    @Override
    public void updateXiaoShouTBreak(XiaoShouT xt) {

    }

    @Override
    public void updateXiaoShouTUnit(XiaoShouT xt) {

    }

    @Override
    public void updateXiaoShouTDate(XiaoShouT xt) {

    }

    @Override
    public void updateXiaoShouTPrice(XiaoShouT xt) {

    }

    @Override
    public void updateXiaoShouTStatus(XiaoShouT xt) {
        tMapper.updateXiaoShouTStatus(xt);
    }

    @Override
    public void updateXiaoShouT(XiaoShouT xt) {

    }

    @Override
    public void deleteXiaoShouTByNum(String str) {

    }
}
