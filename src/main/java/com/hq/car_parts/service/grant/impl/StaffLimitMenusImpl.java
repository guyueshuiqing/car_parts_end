package com.hq.car_parts.service.grant.impl;

import com.hq.car_parts.entity.grant.StaffLimitMenus;
import com.hq.car_parts.mapper.grant.StaffLimitMenusMapper;
import com.hq.car_parts.service.grant.StaffLimitMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional
public class StaffLimitMenusImpl implements StaffLimitMenusService {
    @Autowired
    private StaffLimitMenusMapper limitMenusMapper;

    @Override
    public void insertStaffLimit(StaffLimitMenus map) {
        limitMenusMapper.insertStaffLimit(map);
    }

    @Override
    public void deleteStaffLimit(Integer map) {
        limitMenusMapper.deleteStaffLimit(map);
    }

    @Override
    public StaffLimitMenus findLimitByNameAndLimit(StaffLimitMenus limitMenus) {
        return limitMenusMapper.findLimitByNameAndLimit(limitMenus);
    }

    @Override
    public void deleteStaffAllLimit(String username) {
        limitMenusMapper.deleteStaffAllLimit(username);
    }
}
