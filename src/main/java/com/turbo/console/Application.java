package com.turbo.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 *
 * @author xianqun.li
 * @date 2017/3/14
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication app = new SpringApplication();
        app.run(Application.class,args);
    }
}
