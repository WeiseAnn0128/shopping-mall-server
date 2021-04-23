package com.ruoyi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniProgramLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniProgramLoginApplication.class, args);
    }

    public MiniProgramLoginApplication(@Value("${appid}") String appid, @Value("${appsecret}") String appsecret) {
        System.out.println(appid);
        System.out.println(appsecret);
    }

}
