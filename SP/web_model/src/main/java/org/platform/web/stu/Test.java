package org.platform.web.stu;

import org.platform.service.StuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuzhongshuai on 15/11/14.
 */
public class Test {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InterruptedException {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/springConfig.xml");
        StuService stuService =applicationContext.getBean("heheda", StuService.class);

        Map<String, String> stu = new HashMap<String, String>();
        stu.put("id", "asdf12341234111");
        stu.put("name", "asdf1");
        stu.put("age", "23rrrrr1");
        stuService.saveStu(stu);*/
        hhda();



/*
        try {
           *//* FileInputStream inputStream=new FileInputStream("/Users/liuzhongshuai/Downloads/java软件工程师简历.doc");
            FileOutputStream outputStream=new FileOutputStream("/Users/liuzhongshuai/Downloads/java软件工程师简历222.doc");
            FileChannel channel= inputStream.getChannel();
            FileChannel channel1=outputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while (-1!=channel.read(byteBuffer)){
                byteBuffer.flip();
                channel1.write(byteBuffer);
                byteBuffer.clear();
            }
            inputStream.close();
            outputStream.close();
            channel.close();
            channel1.close();*//*

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }


    static  void hhda() throws InterruptedException {
        while(true){
            System.out.print(new Date());
            Thread.sleep(200);
        }
    }
}
