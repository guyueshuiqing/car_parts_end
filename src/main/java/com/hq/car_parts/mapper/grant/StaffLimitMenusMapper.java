package com.hq.car_parts.mapper.grant;

import com.hq.car_parts.entity.grant.StaffLimitMenus;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface StaffLimitMenusMapper {
    void insertStaffLimit(StaffLimitMenus limit);

    void deleteStaffLimit(Integer limit);

    StaffLimitMenus findLimitByNameAndLimit(StaffLimitMenus limitMenus);

    void deleteStaffAllLimit(String  username);
}
