package com.hq.car_parts.service.grant.impl;

import com.hq.car_parts.entity.grant.StaffMenu;
import com.hq.car_parts.mapper.grant.StaffMenuMapper;
import com.hq.car_parts.service.grant.StaffMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StaffMenuImpl implements StaffMenuService {
    @Autowired
    private StaffMenuMapper staffMenuMapper;

    @Override
    public StaffMenu findLimitByLimitName(String str) {
        return staffMenuMapper.findLimitByLimitName(str);
    }
}
