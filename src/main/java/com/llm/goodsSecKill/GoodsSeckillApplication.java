package com.llm.goodsSecKill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@SpringBootApplication(scanBasePackages = {"com.llm.goodsSecKill"})
public class GoodsSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsSeckillApplication.class, args);
    }

    /**
     * 功能说明：测试接口
     *
     * @author YoSing
     * @createtime 2021/9/13 10:09 AM
     */
    @GetMapping("sayHello")
    public String sayHello() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String data = "Hello guys! It's " + dateFormat.format(new Date()) + " now.";

        return data;
    }
}
