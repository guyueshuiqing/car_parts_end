package com.hq.car_parts.service.grant;

import com.hq.car_parts.entity.grant.StaffMenu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface StaffMenuService {
    StaffMenu findLimitByLimitName(String str);
}
