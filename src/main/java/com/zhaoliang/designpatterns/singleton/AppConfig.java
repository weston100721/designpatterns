package com.zhaoliang.designpatterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 采用单例模式实现配置文件的读取。 采用饱汉式的单例模式。
 *
 * @author Administrator
 */
public class AppConfig {
    private volatile static AppConfig instance = null;
    Properties p = new Properties();

    private AppConfig() {
        readConfig();
    }

    /*
     * 此方法加synchronized 关键字，其目的是在并发时保证只有一个实例。
     */
    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                instance = new AppConfig();
            }
        }
        return instance;
    }

    private void readConfig() {
        InputStream in;
        String configFile = "AppConfig.properties";
        in = AppConfig.class.getClassLoader().getResourceAsStream(configFile);
        try {
            p.load(in);
            parameterA = p.getProperty("parameterA");
            parameterB = p.getProperty("parameterB");
        } catch (IOException e) {
            System.out.println("文件加载失败。");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String parameterA;
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

}
