# 
    注解的分类
    
     按照运行机制分   
        - 源码注解   -> 注解只在源码中存在，编译成.class文件就不存在了。
        - 编译时注解 -> 注解在源码和.class文件中都存在。  
                       例如： @Override , @Deprecated ,@Suppvisewarnings  
        - 运行时注解 -> 在运行阶段还起作用，甚至会影响运行逻辑的注解
     
     按照来源分
        - 来自JDK的注解
        - 来自第三方的注解
        - 我们自己定义的注解 
        
     元注解   
     
     ----------------------------- 自定义注解的语法要求 -----------------------------
     @Target({ElementType.METHOD,ElementType.TYPE})     
     @Retention(RetentionPolicy.RUNTIME)
     @Inherited
     @Documented
     public @interface Description{     //使用@interface 关键字定义注解
     
        String desc();                  //成员以无参无异常方式声明
        
        double num();      
           
        String author();
        
        int age() default 18;           //可以指定default为成员指定一个默认值
     }
     
     
     成员类型是受限的，合法的类型包括原始类型及String，Class,Annotation,Enumeration 
     
     如果注解**只有一个成员**，则成员名必须取名为value(),在使用时可以忽略成员名和赋值号(=)
     
     注解类可以没有成员，没有成员的注解称为标识注解 
     
     
     元注解
        给自定义注解使用的注解就是元注解.
     
        如下：
     
     @Target
     ElementType._
        注解的作用域  
            COUNSTRUCTOR 构造方法声明 
            FIELD 字段声明
            LOCAL_VARIABLE 局部变量声明
            METHOD 方法声明
            PACKAGE 包声明
            PARAMETER 参数声明
            TYPE 类 接口
      
      
      在上面已经提过，运行机制，生命
     @Retention 
      RetentionPolicy._
         SOURCE 只在源码显示，编译时会丢弃
         CLASS 编译时会记录到class中，运行时忽略
         RUNTIME 运行时存在，可以通过反射读取
         
         
      @Inherited 
        允许子类继承
      
      @Documented 
        生成javadoc时会生成Java元注解信息