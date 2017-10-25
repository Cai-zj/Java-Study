package Chapter1.annotation;

/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: AnnotationTest
 * @Description: 自定义注解测试类->解析
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */

public class AnnotationTest {

    public static void main(String[] args) {
        try {
            // 使用类加载器加载类
            Class c = Class.forName("Chapter1.annotation.AnnotationDemo");
            // 判断是否存在注解
            boolean isExist = c.isAnnotationPresent(AnnotationDemo.class);
            if (isExist) {
                // 获取注解实例
                AnnotationDemo annotationDemo = (AnnotationDemo) c.getAnnotation(AnnotationDemo.class);
                System.out.println(annotationDemo.value());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
