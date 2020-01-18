package org.apache.ibatis.autoconstructor;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: MetaClassTest
 * @description: 测试PropertyTokenizer
 * @author: guanfeng
 * @date: 2020/1/17 15:26
 * @version: V1.0.0
 **/
public class MetaClassTest {
    Logger logger = LoggerFactory.getLogger(MetaClassTest.class);

    @Test
    public void testHasSetter() {
        MetaClass metaClass = MetaClass.forClass(Author.class, new DefaultReflectorFactory());
        logger.info("--------------author-------------");

        System.out.println("id->"+metaClass.hasSetter("id"));
        System.out.println("name->"+metaClass.hasSetter("name"));
        System.out.println("age->"+metaClass.hasSetter("age"));
        System.out.println("测试是否包含Article 信息");

        System.out.println("articles->"+metaClass.hasSetter("articles"));
        System.out.println("title->"+metaClass.hasSetter("title"));


    }
}
