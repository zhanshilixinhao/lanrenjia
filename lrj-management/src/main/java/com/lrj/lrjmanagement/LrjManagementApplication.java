package com.lrj.lrjmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lrj.lrjmanagement.dao")
public class LrjManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LrjManagementApplication.class, args);
    }

}
