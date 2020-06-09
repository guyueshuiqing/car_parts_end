package com.hq.car_parts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hq.car_parts.mapper")
public class CarPartsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarPartsApplication.class, args);
    }

}
