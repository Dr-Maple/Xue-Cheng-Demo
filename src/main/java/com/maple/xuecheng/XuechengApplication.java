package com.maple.xuecheng;

import ch.qos.logback.core.joran.spi.DefaultClass;

import com.maple.xuechengioc.Ioc;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication

public class XuechengApplication {
    @Ioc
    public static void main(String[] args) {
        Integer a = 100, b = 100;
        Integer c = 1000 , d = 1000;
        System.out.println(a == b ^ c == d ? a == b : c == d);



        System.out.println("123,".split(",").length);
    }


}
