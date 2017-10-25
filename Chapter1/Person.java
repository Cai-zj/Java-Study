package Chapter1;

/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: Person
 * @Description: 父类
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */
public interface Person {

    public String name();

    public int age();

    @Deprecated
    public void say();
}
