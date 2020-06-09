package com.hq.car_parts.service.grant;

import com.hq.car_parts.entity.grant.StaffLimitMenus;

import java.util.Map;

public interface StaffLimitMenusService {
    void insertStaffLimit(StaffLimitMenus map);

    void deleteStaffLimit(Integer map);

    StaffLimitMenus findLimitByNameAndLimit(StaffLimitMenus limitMenus);

    void deleteStaffAllLimit(String  username);
}
