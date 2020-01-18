package org.apache.ibatis.autoconstructor;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: Author
 * @description:
 * @author: guanfeng
 * @date: 2020/1/17 15:13
 * @version: V1.0.0
 **/


public class Author {

    static{
   String[] names={"bob","kitty"};

    }
    private Integer id;
    private String name;
    private Integer age;
    /** 一个作者对应多篇文章 */
    private Article[] articles;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }
}
