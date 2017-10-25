package Chapter1.annotation;


import Chapter1.annotation.Child;
import Chapter1.annotation.Person;

/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: Test
 * @Description: 忽略警告
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */
public class Test {

    @SuppressWarnings("deprecated")
    public void say() {
        Person person = new Child();
        person.say();
    }
}
