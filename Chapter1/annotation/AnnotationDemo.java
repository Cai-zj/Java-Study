package Chapter1.annotation;

import java.lang.annotation.*;

/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: AnnotationDemo
 * @Description: 自定义注解类
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface AnnotationDemo {

    String value();
}
