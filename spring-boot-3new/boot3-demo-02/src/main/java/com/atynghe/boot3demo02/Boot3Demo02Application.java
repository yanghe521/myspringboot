package com.atynghe.boot3demo02;

import com.atynghe.boot3demo02.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot3Demo02Application {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(Boot3Demo02Application.class, args);
        for (String name : ioc.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        String[] beanNamesForType = ioc.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }


        String[] beanNamesForType1 = ioc.getBeanNamesForType(Cat.class);
        for (String s : beanNamesForType1) {
            System.out.println("cat"+s);
        }
        String[] beanNamesForType2 = ioc.getBeanNamesForType(Dog.class);
        for (String s : beanNamesForType2) {
            System.out.println("dog"+s);
        }

        Pig pig01 = ioc.getBean("pig01",Pig.class);
        System.out.println(pig01);

//        Sheep sheep = ioc.getBean("sheep", Sheep.class);
//        System.out.println(sheep);
        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println("sheep: "+sheep);

    }

}
