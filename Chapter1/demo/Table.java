package Chapter1.demo;

import java.lang.annotation.*;

/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: Table
 * @Description: 自定义注解->类
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Table {

    String value();
}
