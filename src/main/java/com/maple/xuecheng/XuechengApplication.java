package com.maple.xuecheng;

import ch.qos.logback.core.joran.spi.DefaultClass;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class XuechengApplication {

    public static void main(String[] args) {

        SpringApplication.run(XuechengApplication.class, args);
    }

}
