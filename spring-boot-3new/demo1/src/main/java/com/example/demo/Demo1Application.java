package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
//        List<String> list = Arrays.asList("111","222","333");
////        list.forEach(System.out::println);
//        Collections.sort(list,(o1,o2)-> o1.compareTo(o2));
//        List<String>list3 = list.stream().filter(s-> s.startsWith("111")).collect(Collectors.toList());
//        list3.forEach(System.out::println);
//        List<Integer> list4 = list3.stream().map(s->s.length()).collect(Collectors.toList());
//
//        List<Integer>list5 =Arrays.asList(11,22,33,44,55);
//        Integer sum = 0;
//        for (Integer i : list5) {
//            sum=sum+i;
//        }
//        System.out.println("sum="+sum);
//
//        Integer reduce = list5.stream().reduce(0, (a, b) -> (a + b));
//        System.out.println("reduce="+reduce);

//        List<String>list5 =Arrays.asList("apple","banana","orange");
//        Map<Integer,List<String>> groups = new HashMap<>();
//        for (String s : list5) {
//            if(!groups.containsKey(s.length())){
//                groups.put(s.length(),new ArrayList<>());
//            }
//            groups.get(s.length()).add(s);
//        }
//        System.out.println(groups);
//        Map<Integer, List<String>> group2 = list5.stream().collect(Collectors.groupingBy(String::length));

        cal c =new cal(){

            @Override
            public Integer add(Integer a, Integer b) {
                return a+b;
            }
        };

        System.out.println(c.add(1,2));

        cal c1 = (Integer a,Integer b)->{return a+b;};
        System.out.println(c1.add(1,2));

    }

    interface cal{
        public Integer add(Integer a,Integer b);
    }



}
