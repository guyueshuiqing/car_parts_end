package com.hq.car_parts.service.xiaoshou.impl;

import com.hq.car_parts.entity.xiaoshou.XiaoShouD;
import com.hq.car_parts.mapper.xiaoshou.DMapper;
import com.hq.car_parts.service.xiaoshou.XDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XDServiceImpl implements XDService {

    @Autowired
    private DMapper dMapper;

    @Override
    public void insertXiaoShouD(XiaoShouD xd) {
        dMapper.insertXiaoShouD(xd);
    }

    @Override
    public List<XiaoShouD> findAllXiaoShouD() {
        return dMapper.findAllXiaoShouD();
    }

    @Override
    public List<XiaoShouD> getOwnXiaoShouD(String username) {
        return dMapper.getOwnXiaoShouD(username);
    }

    @Override
    public List<XiaoShouD> getFilterXiaoShouD(XiaoShouD shenGouSelect) {
        return dMapper.getFilterXiaoShouD(shenGouSelect);
    }

    @Override
    public XiaoShouD getXiaoShouDByName(String name) {
        return dMapper.getXiaoShouDByName(name);
    }

    @Override
    public void updateNewXiaoShouD(XiaoShouD xd) {

    }

    @Override
    public void updateXiaoShouDBreak(XiaoShouD xd) {

    }

    @Override
    public void updateXiaoShouDUnit(XiaoShouD xd) {

    }

    @Override
    public void updateXiaoShouDDate(XiaoShouD xd) {

    }

    @Override
    public void updateXiaoShouDPrice(XiaoShouD xd) {

    }

    @Override
    public void updateXiaoShouDStatus(XiaoShouD xd) {
        dMapper.updateXiaoShouDStatus(xd);
    }

    @Override
    public void updateXiaoShouD(XiaoShouD xd) {

    }

    @Override
    public void deleteXiaoShouDByNum(String str) {

    }
}
