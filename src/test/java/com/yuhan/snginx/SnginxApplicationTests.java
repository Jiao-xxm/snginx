package com.yuhan.snginx;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = SnginxApplication.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class SnginxApplicationTests {}
