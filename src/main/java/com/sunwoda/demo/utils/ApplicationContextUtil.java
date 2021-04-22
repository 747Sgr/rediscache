package com.sunwoda.demo.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Description:用于获取springboot创建好的工厂
 *
 * @author shiguorang
 * @date 2021-04-22 13:37:18
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    /**
     * 用于保留工厂
     */
    private static ApplicationContext appContext;

    /**
     * @Author shiguorang
     * @Description //将创建好的工厂已参数的形式传这个类
     * @Date 13:55:59 2021-04-22
     * @Param
     * @return
     **/
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appContext = applicationContext;
    }

    /**
     * @Author shiguorang
     * @Description 提供在工厂中获取对象的方法
     * @Date 13:57:09 2021-04-22
     * @Param
     * @return
     **/
    public static Object getBean(String beanName){
        return appContext.getBean(beanName);
    }


}
