package Chapter1.annotation;



/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: Child
 * @Description: 子类
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */
@AnnotationDemo("this is Class Annotation")
public class Child implements Person {

    @AnnotationDemo("this is Method Annotation")
    @Override
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void say() {

    }
}
