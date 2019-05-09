package com.dzp.subscibe;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dengzhipeng
 * @date 2019/05/08
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("begin start");
        // 加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring/spring.xml" });
        context.start();
        System.out.println("start success");
        // 为保证服务一直开着，利用输入流的阻塞来模拟
        System.in.read();
    }
}
