package Chapter1.demo;

import java.lang.annotation.*;

/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: Column
 * @Description: 自定义注解->字段
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Column {

    String value();
}
