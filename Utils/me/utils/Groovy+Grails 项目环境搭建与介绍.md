# Groovy+Grails 项目环境搭建与介绍

##一 , JDK & Grails SDK & Groovy

首先系统搭好环境是第一步，环境搭好之后，再谈怎么玩这个框架.

a.各组件

1. [JDK7下载地址](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html)
2. [Grails下载地址](https://grails.org/download.html)
3. [Groovy下载地址](http://groovy-lang.org/download.html)

b.相关环境变量配置 :

1. [JDK环境变量](https://jingyan.baidu.com/article/6dad5075d1dc40a123e36ea3.html)
2. [Grails环境变量](https://jingyan.baidu.com/article/86fae3461af6cf3c49121a91.html)
3. [Groovy环境变量](https://jingyan.baidu.com/article/8ebacdf010d52c49f75cd549.html)

c.开发工具&官方文档

1. [IDEA下载](https://www.jetbrains.com/idea/download/previous.html)&[IDEA相关帮助文档](https://www.jetbrains.com/help/idea/grails.html)
2. [Grails-2.5.0官方文档](https://grails.github.io/grails2-doc/2.5.0/index.html)
3. [Redis For Windows下载](https://github.com/MicrosoftArchive/redis/releases)
4. [Tortoise SVN - 1.8.7下载](https://www.filehorse.com/download-tortoisesvn-64/16890/)

## 二 , 公司项目

目前公司使用的Grails 版本分别为 : 1.3.9 /2.2.0 /2.5.0

1. 打开IDEA -> File -> Setting -> Languages & Framework -> Groovy -> 添加Grails SDK 

2. VCS -> Checkout from Version Control -> Subversion -> 添加远程仓库地址拉取项目代码

3. Run -> Edit -> config... 编辑项目启动方式

   启动命令为 : run-app

   Vm options 这里为不同项目作处理:

   nmg 业务系统比较庞大相应分配多资源 :-server -Xms2G -Xmx2G -Xmn256M -XX:PermSize=512M -XX:MaxPermSize=512M -XX:+UseParallelGC -XX:+UseParallelOldGC -XX:ParallelGCThreads=2 -Dserver.port=8001

   uat 前台项目相应分配少资源:-server -Xms512M -Xmx512M -Xmn256M -XX:PermSize=128M -XX:MaxPermSize=512M -XX:+UseParallelGC -XX:+UseParallelOldGC -XX:ParallelGCThreads=2 -Dserver.port=8002

   这里以16G内存分配,只罗列出两个项目,具体根据本身机子配置分配

# 三 ,框架介绍

​      Grails 是搭建在动态语言 Groovy 之上的一个开源 MVC Web 开发框架,Grails 的一个显著特点在于“快”，这主要得益于 Groovy 脚本语言的动态特性，也得益于其“一栈式”的设计。

​      Grails 是一个遵循 MVC 设计模式的 Web 开发框架。它分别用 Domain Class、View、Controller 对应于 MVC 的模型、视图和控制器。可以简单的把一个 Domain Class 理解为数据库中的一张表，Grails 在底层通过 Hibernate 将 Domain Class 和数据库的表进行了映射。View 在 Grails 中指的是 GSP 页面（注意是 GSP 不是 JSP），它用于显示用户界面。GSP 与 JSP 类似，既可以编写静态网页的元素，也可以嵌入 Groovy 代码实现动态内容。Controller 在 Grails 中充当着重要的角色：它可以响应用户的请求，可以接收用户提交的表单，还可以访问模型的数据，并传递给 View。



**Grails常用命令**

1. grails -version // 查看版本
2. grails create-app [project-name] // 创建项目
3. grails generate-all [package-name].[domain-name] // 根据领域类（Domain Class）创建Controller、View、Service、Test
4. grails run-app // 运行项目
5. grails clean // 清除项目缓存，重新构建项目

**命名规范**

1. controller

例如: LoginController
首字母大写的驼峰法，后面加上Controller
controller中的方法命名方式为：首字母小写的驼峰法
例如：def auth(...)

2. domain

例如: User
首字母大写的名词或动词
领域类中的变量对应数据库中的字段，命名方式为：首字母小写的驼峰法 

例如: def name

3. service 

例如：UserService
与domain类对应的名词，后面加上Service，首字母大写的驼峰法

4. jobs 定时任务

例如: SiteMapJob

首字母大写的驼峰法，后面加上Job



**Grails目录结构**

- **domain** 
  领域类 MVC 中的M，这里相当于数据库中表的映射，主要是基于spring的orm

- **controllers** 
  控制器 MVC 中的C,控制类都放在这里，类的闭包就相当与url的一个路由了

- **views** 
  视图 MVC 中的V，渲染的那些页面，gsp文件

- **taglib** 
  标签库 

- **services** 
  服务类，用来存放业务逻辑，如横跨多个domian的业务逻辑

- **utils** 
  工具类

- **scripts** 
  Gant 脚本

- **i18n** 
  国际化语言文件

- **conf** 
  配置文件(如数据源、URL 映射、遗留的Spring 和 Hibernate 配置文件)

- **src/java** 
  Java 源文件(用于存放遗留的Java代码)(该目录中的文件将被编译并包含 WAR 文件中)

- **src/groovy** 
  通用 Groovy 源文件(存放其他那些没有惯例位置的源文件)

- **test** 
  单元测试

- **plugins** 
  Grails插件

- **web-app** 
  web静态文件

  ​

**Grails-MVC示意图**

​      ![Grails MVC 示意图](http://on-img.com/chart_image/5a538029e4b010a6e7099870.png)

