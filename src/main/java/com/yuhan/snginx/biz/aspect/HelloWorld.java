package com.yuhan.snginx.biz.aspect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author yuzhuJiao
 * @since 2023/08/26
 */
@Slf4j
@Service
public class HelloWorld {

    public void sayHello(){
        log.warn("waring 日志测试");
        System.out.println("hello world");
    }

}
