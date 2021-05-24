package com.example.extern_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class ExternConfigurationApplication {

    public static void main(String[] args) throws IOException {

       // SpringApplication.run(ExternConfigurationApplication.class, args);

        SpringApplication  springApplication=new SpringApplication(ExternConfigurationApplication.class);

        Properties properties = new Properties();

        InputStream is= ExternConfigurationApplication.class.getClassLoader().getResourceAsStream("app.properties");


        properties.load(is);

        //在代码中设置的默认配置方式优先级低于配置文件读取
        springApplication.setDefaultProperties(properties);

        springApplication.run(args);


    }

}
