package com.hq.car_parts.mapper.grant;

import com.hq.car_parts.entity.grant.StaffMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface StaffMenuMapper {
    StaffMenu findLimitByLimitName(String str);
}
