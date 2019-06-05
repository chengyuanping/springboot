package cn.hxzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.hxzy.mapper")//启动类上添加扫描包注解
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
