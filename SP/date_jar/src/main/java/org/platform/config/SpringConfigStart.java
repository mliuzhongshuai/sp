package org.platform.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuzhongshuai on 15/10/26.
 * spring及mybitais配置文件的初始化类
 */
public class SpringConfigStart {


    /**
     * 初始化spring配置
     */
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring_mybatis.xml");
    }
}
