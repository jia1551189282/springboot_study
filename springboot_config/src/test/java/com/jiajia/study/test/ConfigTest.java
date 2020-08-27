package com.jiajia.study.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.jiajia.study.pojo.Person;

/**
 * @author zjiajia
 * @date 2020/8/27 11:03
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTest {

    @Autowired
    Person person;

    @Test
    public void test(){
        System.out.println(person);
    }
}
