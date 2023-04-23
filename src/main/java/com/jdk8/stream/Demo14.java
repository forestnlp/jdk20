package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo14 {
    public static void main(String[] args) {
        List<String> shiren = Arrays.asList("孔融","李白","杜甫","白居易","刘禹锡","李商隐","杜牧","李贺","张九龄","王之涣","王勃","皇甫松","李珣","李煜","高适","王维","刘长卿","韩愈","柳宗元","顾况","李益","范仲淹"," 欧阳修","陆游","辛弃疾");
        List<String> zhengzhijia = Arrays.asList("秦始皇","商鞅","王安石","吕不韦","朱元璋","曹操","赵匡胤","赢政","刘邦","诸葛亮","李世民","黄帝","武则天","秦始皇","刘邦","刘桓","刘启","李世民","李渊","赵匡胤","铁木真","朱元璋","康熙","乾隆","李煜","成吉思汗");

        Stream<String> s1 = shiren.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> s2 = zhengzhijia.stream().filter(s -> s.startsWith("刘")).skip(2);

        Stream.concat(s1,s2).forEach(System.out::println);

    }
}
