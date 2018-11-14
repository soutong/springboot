package com.sxt.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lenovo on 2018/8/20.
 */
@SpringBootApplication
public class ApplicationRun
{
   public static void main(String args[]){
       //第一种，直接启动
       SpringApplication.run(ApplicationRun.class,args);
       //第二种，自定义banner图，在resources文件夹下新建banner图片
        //第三种
       System.out.println("xiaogou");

   }

}
