package com.interview.exercise.test.design.patterns.prototype;

import com.interview.exercise.design.patterns.prototype.DeepPrototype;
import com.interview.exercise.design.patterns.prototype.DeepPrototypeSerializable;
import com.interview.exercise.design.patterns.prototype.SimplePrototype;
import com.interview.exercise.design.patterns.prototype.use.User;
import com.interview.exercise.design.patterns.prototype.use.UserPrototype;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/11
 */
public class PrototypeTest {

    @Test
    public void getCloneBean() throws ParseException, CloneNotSupportedException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = simpleDateFormat.parse("2017-08-08");

        SimplePrototype prototype = new SimplePrototype();
        prototype.setName("陈星");
        prototype.setAge(20);
        prototype.setBirthday(birthday);
        System.out.println(prototype.getBirthday());


        SimplePrototype clone = prototype.clone();
        System.out.println(clone.getBirthday());

        /**
         * 修改应用变量的值
         */
        Date birthday1 = prototype.getBirthday();
        birthday1.setTime(System.currentTimeMillis());
        prototype.setBirthday(birthday1);


        System.out.println(prototype.getBirthday());
        System.out.println(clone.getBirthday());

    }

    @Test
    public void getCloneBean1() throws ParseException, CloneNotSupportedException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2016-06-06");

        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setName("小红");
        deepPrototype.setAge(21);
        deepPrototype.setBirthday(date);

        System.out.println(deepPrototype.getBirthday());

        DeepPrototype clone = deepPrototype.clone();
        System.out.println(clone.getBirthday());

        Date birthday = deepPrototype.getBirthday();
        birthday.setTime(System.currentTimeMillis());
        System.out.println(deepPrototype.getBirthday());
        System.out.println(clone.getBirthday());
    }

    @Test
    public void getCloneBean2() throws ParseException, CloneNotSupportedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2016-06-06");

        DeepPrototypeSerializable deepPrototype = new DeepPrototypeSerializable();
        deepPrototype.setName("小红");
        deepPrototype.setAge(21);
        deepPrototype.setBirthday(date);

        System.out.println(deepPrototype.getBirthday());

        DeepPrototypeSerializable clone = deepPrototype.clone();
        System.out.println(clone.getBirthday());

        Date birthday = deepPrototype.getBirthday();
        birthday.setTime(System.currentTimeMillis());
        System.out.println(deepPrototype.getBirthday());
        System.out.println(clone.getBirthday());
    }

    @Test
    public void getClone() throws CloneNotSupportedException {
        UserPrototype prototype = new UserPrototype();
        prototype.setName("大毛");
        prototype.setAdderss("北京");
        prototype.setAge(21);
        prototype.setSex("1");
        prototype.setBrith(new Date());
        System.out.println(prototype);

        User user = prototype.clone();
        System.out.println(user);

    }

}