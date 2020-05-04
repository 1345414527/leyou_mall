## 项目背景

- 了解电商行业
- 了解乐优商城项目结构
- 能独立搭建项目基本框架
- 能参考使用ES6的新语法

## 项目分类

主要从需求方、盈利模式、技术侧重点这三个方面来看它们的不同

### 传统项目

各种企业里面用的管理系统（ERP、HR、OA、CRM、物流管理系统......）

- 需求方：公司、企业内部
- 盈利模式：项目本身卖钱
- 技术侧重点：业务功能

### 互联网项目

门户网站、电商网站：baidu.com、qq.com、taobao.com、jd.com ......

- 需求方：广大用户群体
- 盈利模式：虚拟币、增值服务、广告收益......
- 技术侧重点：网站性能、业务功能

而我们今天要聊的就是互联网项目中的重要角色：电商

## 电商行业的发展

### 钱(前)景

近年来，中国的电子商务快速发展，交易额连创新高，电子商务在各领域的应用不断拓展和深化、相关服务业蓬勃发展、支撑体系不断健全完善、创新的动力和能力不断增强。电子商务正在与实体经济深度融合，进入规模性发展阶段，对经济社会生活的影响不断增大，正成为我国经济发展的新引擎。

中国电子商务研究中心数据显示，截止到 2012 年底，中国电子商务市场交易规模达 7.85万亿人民币，同比增长 30.83%。其中，B2B 电子商务交易额达 6.25 万亿，同比增长 27%。而 2011 年全年，中国电子商务市场交易额达 6 万亿人民币，同比增长 33%，占 GDP 比重上升到 13%；2012 年，电子商务占 GDP 的比重已经高达 15%。

![](https://img-blog.csdnimg.cn/20200412221126589.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 数据

![](https://img-blog.csdnimg.cn/20200412221153774.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

来看看双十一的成交数据：

![](https://img-blog.csdnimg.cn/20200412221221686.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

2016双11开场30分钟，创造**每秒交易峰值17.5万笔**，**每秒**支付峰值**12万笔**的新纪录。菜鸟单日物流订单量超过**4.67亿**，创历史新高。

![](https://img-blog.csdnimg.cn/2020041222125841.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 技术特点

从上面的数据我们不仅要看到钱，更要看到背后的技术实力。正是得益于电商行业的高强度并发压力，促使了BAT等巨头们的技术进步。电商行业有些什么特点呢？

- 技术范围广
- 技术新
- 高并发（分布式、静态化技术、缓存技术、异步并发、池化、队列）
- 高可用（集群、负载均衡、限流、降级、熔断）
- 数据量大
- 业务复杂
- 数据安全



## 常用电商模式

电商行业的一些常见模式：

- B2C：商家对个人，如：亚马逊、当当等
- C2C平台：个人对个人，如：闲鱼、拍拍网、ebay
- B2B平台：商家对商家，如：阿里巴巴、八方资源网等
- O2O：线上和线下结合，如：饿了么、电影票、团购等
- P2P：在线金融，贷款，如：网贷之家、人人聚财等。
- B2C平台：天猫、京东、一号店等



## 专业术语

- SaaS：软件即服务

- SOA：面向服务

- RPC：远程过程调用

- RMI：远程方法调用

- PV：(page view)，即页面浏览量；

  用户每1次对网站中的每个网页访问均被记录1次。用户对同一页面的多次访问，访问量累计

- UV：(unique visitor)，独立访客

  指访问某个站点或点击某条新闻的不同IP地址的人数。在同一天内，uv只记录第一次进入网站的具有独立IP的访问者，在同一天内再次访问该网站则不计数。

- PV与带宽：

  - 计算带宽大小需要关注两个指标：峰值流量和页面的平均大小。
  - 计算公式是：网站带宽= ( PV * 平均页面大小（单位MB）* 8 )/统计时间（换算到秒）
  - 为什么要乘以8？
    - 网站大小为单位是字节(Byte)，而计算带宽的单位是bit，1Byte=8bit
  - 这个计算的是平均带宽，高峰期还需要扩大一定倍数

- PV、QPS、并发

  - QPS：每秒处理的请求数量。
    - 比如你的程序处理一个请求平均需要0.1S，那么1秒就可以处理10个请求。QPS自然就是10，多线程情况下，这个数字可能就会有所增加。
  - 由PV和QPS如何需要部署的服务器数量？
    - 根据二八原则，80%的请求集中在20%的时间来计算峰值压力：
    - （每日PV * 80%） / （3600s * 24 * 20%） * 每个页面的请求数 = 每个页面每秒的请求数量
    - 然后除以服务器的QPS值，即可计算得出需要部署的服务器数量



## 项目开发流程

项目经理：管人

技术经理：

产品经理：设计需求原型

测试：

前端：大前端：UI 前端页面。

后端：

移动端：

项目开发流程图：

![](https://img-blog.csdnimg.cn/20200412221836449.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

公司现状：

![](https://img-blog.csdnimg.cn/20200412221901625.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



## 乐优商城介绍

### 项目介绍

- 乐优商城是一个全品类的电商购物网站（B2C）。
- 用户可以在线购买商品、加入购物车、下单
- 可以评论已购买商品
- 管理员可以在后台管理商品的上下架、促销活动
- 管理员可以监控商品销售状况
- 客服可以在后台处理退款操作
- 希望未来3到5年可以支持千万用户的使用



### 系统架构

#### 架构图

乐优商城架构缩略图：

![](https://img-blog.csdnimg.cn/2020041222221994.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 系统架构解读

整个乐优商城可以分为两部分：后台管理系统、前台门户系统。

- 后台管理：
  - 后台系统主要包含以下功能：
    - 商品管理，包括商品分类、品牌、商品规格等信息的管理
    - 销售管理，包括订单统计、订单退款处理、促销活动生成等
    - 用户管理，包括用户控制、冻结、解锁等
    - 权限管理，整个网站的权限控制，采用JWT鉴权方案，对用户及API进行权限控制
    - 统计，各种数据的统计分析展示
  - 后台系统会采用前后端分离开发，而且整个后台管理系统会使用Vue.js框架搭建出单页应用（SPA）。
- 前台门户
  - 前台门户面向的是客户，包含与客户交互的一切功能。例如：
    - 搜索商品
    - 加入购物车
    - 下单
    - 评价商品等等
  - 前台系统我们会使用Thymeleaf模板引擎技术来完成页面开发。出于SEO优化的考虑，我们将不采用单页应用。

![](https://img-blog.csdnimg.cn/20200412222338291.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



无论是前台还是后台系统，都共享相同的微服务集群，包括：

- 商品微服务：商品及商品分类、品牌、库存等的服务
- 搜索微服务：实现搜索功能
- 订单微服务：实现订单相关
- 购物车微服务：实现购物车相关功能
- 用户中心：用户的登录注册等功能
- Eureka注册中心
- Zuul网关服务



## 项目搭建

### 技术选型

前端技术：

- 基础的HTML、CSS、JavaScript（基于ES6标准）
- JQuery
- Vue.js 2.0以及基于Vue的框架：Vuetify（UI框架）
- 前端构建工具：WebPack
- 前端安装包工具：NPM
- Vue脚手架：Vue-cli
- Vue路由：vue-router
- ajax框架：axios
- 基于Vue的富文本框架：quill-editor

后端技术：

- 基础的SpringMVC、Spring 5.x和MyBatis3
- Spring Boot 2.1.10版本
- Spring Cloud Greenwich.SR4
- Redis
- RabbitMQ
- Elasticsearch
- nginx
- FastDFS
- MyCat
- Thymeleaf
- mysql 5.7



### 开发环境

为了保证开发环境的统一，希望每个人都按照我的环境来配置：

- IDEA
- JDK：JDK1.8
- 项目构建：maven 3.6.2
- 版本控制工具：git



### 域名

我们在开发的过程中，为了保证以后的生产、测试环境统一。尽量都采用域名来访问项目。

一级域名：[www.leyou.com，leyou.com](http://www.leyou.com%2Cleyou.com/)

二级域名：manage.leyou.com/item , api.leyou.com

我们可以通过switchhost工具来修改自己的host对应的地址，只要把这些域名指向127.0.0.1，那么跟你用localhost的效果是完全一样的。

switchhost下载连接：https://github.com/oldj/SwitchHosts/releases



### 创建父工程

#### 创建工程

创建Maven工程，打包方式为`pom`，项目名为`leyou-parent`

![](https://img-blog.csdnimg.cn/20200412223610632.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 添加依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-parent</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>pom</packaging>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.10.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>


    <properties>
        <java.version>1.8</java.version>
        <spring-cloud.version>Greenwich.SR4</spring-cloud.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <mybatis.starter.version>2.1.1</mybatis.starter.version>
        <mapper.starter.version>2.1.5</mapper.starter.version>
        <druid.starter.version>1.1.10</druid.starter.version>
        <mysql.version>5.1.38</mysql.version>
        <pageHelper.starter.version>1.2.12</pageHelper.starter.version>
        <fastDFS.client.version>1.26.1-RELEASE</fastDFS.client.version>
        <mybatis.plus.version>3.3.1</mybatis.plus.version>
    </properties>

    <dependencyManagement>
        <dependencies>
            <!-- springCloud -->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!-- mybatis启动器 -->
            <dependency>
                <groupId>org.mybatis.spring.boot</groupId>
                <artifactId>mybatis-spring-boot-starter</artifactId>
                <version>${mybatis.starter.version}</version>
            </dependency>
            <!-- 通用Mapper启动器 -->
            <dependency>
                <groupId>tk.mybatis</groupId>
                <artifactId>mapper-spring-boot-starter</artifactId>
                <version>${mapper.starter.version}</version>
            </dependency>
            <!-- 分页助手启动器 -->
            <dependency>
                <groupId>com.github.pagehelper</groupId>
                <artifactId>pagehelper-spring-boot-starter</artifactId>
                <version>${pageHelper.starter.version}</version>
            </dependency>
            <!-- mysql驱动 -->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${mysql.version}</version>
            </dependency>
            <!--FastDFS客户端-->
            <dependency>
                <groupId>com.github.tobato</groupId>
                <artifactId>fastdfs-client</artifactId>
                <version>${fastDFS.client.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```



> 建议：可以将src文件夹删掉了，因为此模块仅仅做父模块，管理一些依赖。



### 创建EurekaServer

#### 创建工程

![](https://img-blog.csdnimg.cn/20200413162409285.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

创建工程，将模块命名为leyou-registry

#### 添加依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>top.codekiller.leyou</groupId>
        <artifactId>leyou-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-registry</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>
    </dependencies>

</project>
```



#### 修改配置文件

```yaml
server:
  port: 10086

spring:
  application:
    name: leyou-registery

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    register-with-eureka: false # 把自己注册到eureka服务列表
    fetch-registry: false # 拉取eureka服务信息
  server:
    eviction-interval-timer-in-ms: 5000 # 每隔5秒钟，进行一次服务列表的清理
    enable-self-preservation: false
   
logging:
  level: 
    top.codekiller.leyouRegistry: debug
```



#### 编写启动类

```java
package top.codekiller.leyouRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LeyouSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouSpringApplication.class);
    }
}
```



### 创建Zuul网关

#### 创建模块

依旧是选择创建maven模块，项目名为`leyou-gateway`

#### 添加依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>top.codekiller.leyou</groupId>
        <artifactId>leyou-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-gateway</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
    </dependencies>

</project>
```



#### 修改配置文件

```yaml
server:
  port: 10010

spring:
  application:
    name: leyou-gateway

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    fetch-registry: true
    registry-fetch-interval-seconds: 5
    # 还可配置registery的续约时间间隔和过期间隔

zuul:
  prefix: /api

#配置熔断
#hystrix:
#  command:
#    default:
#      execution:
#        isolation:
#          thread:
#            timeoutInMilliseconds: 2000 # 设置hystrix的超时时间2秒
```



#### 编写启动类

```java
package top.codekiller.leyouGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class LeyouGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouGatewayApplication.class);
    }
}
```



### 创建商品微服务

既然是一个全品类的电商购物平台，那么核心自然就是商品。因此我们要搭建的第一个服务，就是商品微服务。其中会包含对于商品相关的一系列内容的管理，包括：

- 商品分类管理
- 品牌管理
- 商品规格参数管理
- 商品管理
- 库存管理

### 微服务的结构

因为与商品的品类相关，我们的工程命名为`leyou-item`.

需要注意的是，我们的leyou-item是一个微服务，那么将来肯定会有其它系统需要来调用服务中提供的接口，获取的接口数据，也需要对应的实体类来封装，因此肯定也会使用到接口中关联的实体类。

因此这里我们需要使用`聚合工程`，将要提供的接口及相关实体类放到独立子工程中，以后别人引用的时候，只需要知道坐标即可。

**我们会在leyou-item中创建两个子工程：**

- `leyou-item-interface`：主要是对外暴露的接口及相关实体类
- `leyou-item-service`：所有业务逻辑及内部使用接口

调用关系如图所示：

![](https://img-blog.csdnimg.cn/20200413171428348.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### leyou-item

因为是聚合工程，所以把项目打包方式设置为`pom`，创建完成后把src目录删除

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <modules>
        <module>leyou-item-interface</module>
        <module>leyou-item-service</module>
    </modules>

    <parent>
        <groupId>top.codekiller.leyou</groupId>
        <artifactId>leyou-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-item</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>pom</packaging>

</project>
```



### leyou-item-interface

在`leyou-item`下创建`leyou-item-interface`模块

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>leyou-item</artifactId>
        <groupId>top.codekiller.leyou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-item-interface</artifactId>


</project>
```



### leyou-item-service

在`leyou-item`下创建`leyou-item-service`模块

#### 引入依赖

思考一下我们需要什么？

- Eureka客户端
- web启动器
- mybatis-plus
- 连接池，我们用druid
- mysql驱动
- 千万不能忘了，我们自己也需要`leyou-item-interface`中的实体类

这些依赖，我们在顶级父工程：leyou中已经添加好了。所以直接引入即可：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>leyou-item</artifactId>
        <groupId>top.codekiller.leyou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-item-service</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.20</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    </dependencies>

</project>
```



#### 修改配置文件

```yaml
server:
  port: 8081
spring:
  application:
    name: item-service
  datasource:
    username: root
    password: root
    url: jdbc:mysql://localhost:3306/leyoumall?characterEncoding=UTF-8&serverTimezone=UTC
    type: com.alibaba.druid.pool.DruidDataSource
    # 下面为连接池的补充设置，应用到上面所有数据源中
    # 初始化大小，最小，最大
    initialSize: 5   #初始化创建的连接数
    minIdle: 5  #最小空闲连接数
    maxActive: 20 #最大活跃连接数，不宜设置过多
    # 配置获取连接等待超时的时间
    maxWait: 60000
    # 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
    timeBetweenEvictionRunsMillis: 60000
    # 配置一个连接在池中最小生存的时间，单位是毫秒
    minEvictableIdleTimeMillis: 30000
    #用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。
    validationQuery: select 'x';
    #建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，
    testWhileIdle: true
    #申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
    testOnBorrow: false
    #归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
    testOnReturn: false
    # 打开PSCache，并且指定每个连接上PSCache的大小
    #是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
    poolPreparedStatements: true
    #要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。
    #在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100
    maxPoolPreparedStatementPerConnectionSize: 20
    # 配置监控统计拦截的filters，去掉后监控界面sql无法统计，stat用于监控统计，'wall'用于防火墙，防御sql注入，slf4j用于日志
    filters: stat,wall,slf4j
    # 通过connectProperties属性来打开mergeSql功能；慢SQL记录
    connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000
    # 合并多个DruidDataSource的监控数据
    useGlobalDataSourceStat: true
eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    register-with-eureka: true
  instance:
    lease-renewal-interval-in-seconds: 5
    lease-expiration-duration-in-seconds: 15

mybatis-plus:
  type-aliases-package: top.codekiller.leyou.pojo
```



#### 编写启动类

```java
@SpringCloudApplication
public class LeyouItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouItemServiceApplication.class);
    }
}
```



### 添加商品微服务的路由规则

既然商品微服务已经创建，接下来肯定要添加路由规则到Zuul中，我们不使用默认的路由规则。

修改`leyou-gateway`工程的application.yaml配置文件：

```yaml
server:
  port: 10010

spring:
  application:
    name: leyou-gateway

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    fetch-registry: true
    registry-fetch-interval-seconds: 5
    # 还可配置registery的续约时间间隔和过期间隔

zuul:
  prefix: /api
  routes: 
    item-service: /item/**

#配置熔断
#hystrix:
#  command:
#    default:
#      execution:
#        isolation:
#          thread:
#            timeoutInMilliseconds: 2000 # 设置hystrix的超时时间2秒
```



### 启动测试

我们分别启动：`leyou-registry`，`leyou-gateway`，`leyou-item-service`

为了测试路由规则是否畅通，我们是不是需要在`item-service`中编写一个controller接口呢？

其实不需要，SpringBoot提供了一个依赖：`actuator`

只要我们添加了actuator的依赖，它就会为我们生成一系列的访问接口：

- /info
- /health
- /refresh
- ...

在`item-service`中添加依赖：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```



因为我们没有添加信息，所以是一个空的json，但是可以肯定的是：我们能够访问到item-service了。

接下来我们通过路由访问试试，根据路由规则，我们需要访问的地址是：http://localhost:10010/api/item/actuator/info

> 访问不到重启网关后再试



### 通用工具模块

有些工具或通用的约定内容，我们希望各个服务共享，因此需要创建一个工具模块：`leyou-common`

在`leyou-parent`创建leyou-common模块

![](https://img-blog.csdnimg.cn/2020041318575416.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



- `leyou-parent`：父工程，管理版本号
  - `leyou-common`：通用工程(存放工具类类等)
  - `leyou-gateway`：网关工程，拦截并分发请求
  - `leyou-item`：商品聚合工程
    - `leyou-item-interface`：存放pojo对象
    - `leyou-item-service`：对外提供rest接口的具体实现
- `leyou-registry`：eureka注册中心





## 搭建后台管理前台页面



将前端页面工程解压后移动到工作空间下，然后使用IDEA打开，安装依赖

### 安装依赖

我们只需要打开终端，进入项目目录，输入：`npm install`命令，即可安装这些依赖。

![](https://img-blog.csdnimg.cn/20200415185956325.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 运行测试

![](https://img-blog.csdnimg.cn/20200415190246616.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

在package.json文件中有scripts启动脚本配置，可以输入命令：`npm run dev`或者`npm start`

![](https://img-blog.csdnimg.cn/20200415190221482.png)

![](https://img-blog.csdnimg.cn/20200415190338924.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

发现默认的端口是9001。访问：[http://localhost:9001](http://localhost:9001/)



### 目录结构

![](https://img-blog.csdnimg.cn/20200415194327373.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



webpack：是一个现代 JavaScript 应用程序的*静态模块打包器(module bundler)*。并且提供了前端项目的热部署插件。



### 通用关系

我们最主要理清index.html、main.js、App.vue之间的关系：



![](https://img-blog.csdnimg.cn/20200415194433692.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



理一下：

- index.html：html模板文件。定义了空的`div`，其id为`app`。

- main.js：**实例化vue对象**，并且通过id选择器绑定到index.html的div中，因此**main.js的内容都将在index.html的div中显示**。main.js中使用了App组件，即App.vue，main.js中还定义了路由，路由的信息

  `import router from './router'`，是引入当前文件夹下的router文件夹，由于router只有一个文件而且名称为`index.js`，所以可以直接写文件夹名称

- index.js：定义请求路径和组件的映射关系。相当于之前的`<vue-router>`

- App.vue中也没有内容，而是定义了vue-router的锚点：`<router-view>`,我们之前讲过，vue-router路由后的组件将会在锚点展示。

- 最终结论：**一切路由后的内容都将通过App.vue在index.html中显示。**

- 访问流程：用户在浏览器输入路径，例如：http://localhost:9001/#/item/brand --> index.js(/item/brand路径对应pages/item/Brand.vue组件) --> 该组件显示在App.vue的锚点位置 --> main.js使用了App.vue组件，并把该组件渲染在index.html文件中（id为“app”的div中）

![](https://img-blog.csdnimg.cn/20200415194643108.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

也就是说index.html中最终展现的是App.vue中的内容。index.html引用它之后，就拥有了vue的内容（包括组件、样式等），所以，main.js也是**webpack打包的入口**。

![](https://img-blog.csdnimg.cn/20200415194703260.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### Vuetify

#### 为什么学习UI框架

Vue虽然会帮我们进行视图的渲染，但样式还是由我们自己来完成。这显然不是我们的强项，因此后端开发人员一般都喜欢使用一些现成的UI组件，拿来即用，常见的例如：

- BootStrap
- LayUI
- EasyUI
- ZUI

然而这些UI组件的基因天生与Vue不合，因为他们更多的是利用DOM操作，借助于jQuery实现，而不是MVVM的思想。

而目前与Vue吻合的UI框架也非常的多，国内比较知名的如：

- element-ui：饿了么出品
- i-view：某公司出品

然而我们都不用，我们今天推荐的是一款国外的框架：Vuetify

官方网站：https://vuetifyjs.com/zh-Hans/



#### 为什么选择Vuetify

有中国的为什么还要用外国的？原因如下：

- Vuetify几乎不需要任何CSS代码，而element-ui许多布局样式需要我们来编写
- Vuetify从底层构建起来的语义化组件。简单易学，容易记住。
- Vuetify基于Material Design（谷歌推出的多平台设计规范），更加美观，动画效果酷炫，且风格统一

这是官网的说明：

![](https://img-blog.csdnimg.cn/2020041520515683.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

缺陷：

- 目前官网虽然有中文文档，但因为翻译问题，几乎不太能看。



#### 怎么用

基于官方网站的文档进行学习：

![](https://img-blog.csdnimg.cn/20200415205220659.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



我们重点关注`UI components`即可，里面有大量的UI组件，我们要用的时候再查看，不用现在学习，先看下有什么：

![](https://img-blog.csdnimg.cn/20200415205323319.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200415205344100.png)

以后用到什么组件，就来查询即可。



### 项目页面布局

接下来我们一起看下页面布局。

Layout组件是我们的整个页面的布局组件：

![](https://img-blog.csdnimg.cn/20200415205532208.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

一个典型的三块布局。包含左，上，中三部分：

![](https://img-blog.csdnimg.cn/20200415205633811.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

里面使用了Vuetify中的2个组件和一个布局元素：



#### 导航抽屉

`v-navigation-drawer` ：导航抽屉，主要用于容纳应用程序中的页面的导航链接。

![](https://img-blog.csdnimg.cn/20200415205723507.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 工具栏

`v-toolbar`：工具栏通常是网站导航的主要途径。可以与导航抽屉一起很好地工作，动态选择是否打开导航抽屉，实现可伸缩的侧边栏。

![](https://img-blog.csdnimg.cn/20200415205809979.png)



#### 布局元素

`v-content`：并不是一个组件，而是标记页面布局的元素。可以根据您指定的**app**组件的结构动态调整大小，使得您可以创建高度可定制的组件。

那么问题来了：`v-content`中的内容来自哪里？

![](https://img-blog.csdnimg.cn/20200415205859286.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

- Layout映射的路径是`/`
- 除了Login以外的所有组件，都是定义在Layout的children属性，并且路径都是`/`的下面
- 因此当路由到子组件时，会在Layout中定义的锚点中显示。
- 并且Layout中的其它部分不会变化，这就实现了布局的共享。





### 使用域名访问本地仓库



#### 统一环境

我们现在访问页面使用的是：[http://localhost:9001](http://localhost:9001/)

有没有什么问题？

实际开发中，会有不同的环境：

- 开发环境：自己的电脑
- 测试环境：提供给测试人员使用的环境
- 预发布环境：数据是和生成环境的数据一致，运行最新的项目代码进去测试
- 生产环境：项目最终发布上线的环境

如果不同环境使用不同的ip去访问，可能会出现一些问题。为了保证所有环境的一致，我们会在各种环境下都使用域名来访问。

我们将使用以下域名：

- 主域名是：[www.leyou.com，leyou.com](http://www.leyou.com%2Cleyou.com/)
- 管理系统域名：manage.leyou.com
- 网关域名：api.leyou.com
- ...

但是最终，我们希望这些域名指向的还是我们本机的某个端口。

那么，当我们在浏览器输入一个域名时，浏览器是如何找到对应服务的ip和端口的呢？



#### 域名解析

一个域名一定会被解析为一个或多个ip。这一般会包含两步：

- 本地域名解析

  浏览器会首先在本机的hosts文件中查找域名映射的IP地址，如果查找到就返回IP ，没找到则进行域名服务器解析，一般本地解析都会失败，因为默认这个文件是空的。

  - Windows下的hosts文件地址：C:/Windows/System32/drivers/etc/hosts
  - Linux下的hosts文件所在路径： /etc/hosts

  样式：

  ```java
  # My hosts
  127.0.0.1 localhost
  ```

- 域名服务器解析

  本地解析失败，才会进行域名服务器解析，域名服务器就是网络中的一台计算机，里面记录了所有注册备案的域名和ip映射关系，一般只要域名是正确的，并且备案通过，一定能找到。



#### 解决域名解析问题

我们不可能去购买一个域名，因此我们可以伪造本地的hosts文件，实现对域名的解析。修改本地的host为：

```java
127.0.0.1 api.leyou.com
127.0.0.1 manage.leyou.com
```

这样就实现了域名的关系映射了。

每次在C盘寻找hosts文件并修改是非常麻烦的，给大家推荐一个快捷修改host的工具

[下载连接](https://github.com/oldj/SwitchHosts/releases)

解压，运行exe文件，效果：

![](https://img-blog.csdnimg.cn/20200415210244411.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

Linux版效果

![](https://img-blog.csdnimg.cn/20200415210304625.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们添加了两个映射关系（中间用空格隔开）：

- 127.0.0.1 api.leyou.com ：我们的网关Zuul
- 127.0.0.1 manage.leyou.com：我们的后台系统地址

切换为生效状态然后访问：[http://manage.leyou.com:9001](http://manage.leyou.com:9001/)

出现如下效果就代表配置成功

![](https://img-blog.csdnimg.cn/20200415215912328.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### Invalid Host header解

原因：我们配置了项目访问的路径，虽然manage.leyou.com映射的ip也是127.0.0.1，但是webpack会验证host是否符合配置。

![](https://img-blog.csdnimg.cn/20200415220421917.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



在webpack.dev.conf.js中取消host验证：`disableHostCheck: true`

![](https://img-blog.csdnimg.cn/20200415220453216.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



退出重新启动，`npm start`，刷新浏览器



### Nginx解决端口问题

域名问题解决了，但是现在要访问后台页面，还得自己加上端口：`http://manage.taotao.com:9001`。

这就不够优雅了。我们希望的是直接域名访问：`http://manage.taotao.com`。这种情况下端口默认是80，如何才能把请求转移到9001端口呢？

这里就要用到反向代理工具：Nginx

[nginx介绍](https://www.codekiller.top/2020/03/20/nginx/)

#### 什么是Nginx

![](https://img-blog.csdnimg.cn/20200415220614730.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



nginx可以作为web服务器，但更多的时候，我们把它作为网关，因为它具备网关必备的功能：

- 反向代理
- 负载均衡
- 动态路由
- 请求过滤



#### nginx作为web服务器

Web服务器分2类：

- web应用服务器，如：
  - tomcat
  - resin
  - jetty
- web服务器，如：
  - Apache 服务器
  - Nginx
  - IIS

区分：web服务器不能解析jsp等页面，只能处理js、css、html等静态资源。 并发：web服务器的并发能力远高于web应用服务器。



#### nginx做反向代理

什么是反向代理？

- 代理：通过客户机的配置，实现让一台服务器代理客户机，客户的所有请求都交给代理服务器处理。
- 反向代理：用一台服务器，代理真实服务器，用户访问时，不再是访问真实服务器，而是代理服务器。

nginx可以当做反向代理服务器来使用：

- 我们需要提前在nginx中配置好反向代理的规则，不同的请求，交给不同的真实服务器处理
- 当请求到达nginx，nginx会根据已经定义的规则进行请求的转发，从而实现路由功能

利用反向代理，就可以解决我们前面所说的端口问题，如图

![](https://img-blog.csdnimg.cn/20200415221847920.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### nginx安装

#### [windows](https://cloudlandboy.github.io/myNote/#/project/leyoumall/manageweb?id=windows)

> 安装

安装非常简单，下载后直接解压即可，绿色免安装，舒服！

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1575448111000.gif)

解压后，目录结构：

![](https://img-blog.csdnimg.cn/20200415222209511.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

1. conf：配置目录
2. contrib：第三方依赖
3. html：默认的静态资源目录，类似于tomcat的webapps
4. logs：日志目录
5. nginx.exe：启动程序。可双击运行，但不建议这么做。

> 反向代理配置

![](https://img-blog.csdnimg.cn/20200415222253675.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



nginx中的每个server就是一个反向代理配置，可以有多个server

完整配置：

```nginx
#user  nobody;
worker_processes  1;

events {
    worker_connections  1024;
}

http {
    include       mime.types;
    default_type  application/octet-stream;
    sendfile        on;

    keepalive_timeout  65;

    gzip  on;
    server {
        listen       80;
        server_name  manage.leyou.com;

        proxy_set_header X-Forwarded-Host $host;
        proxy_set_header X-Forwarded-Server $host;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;

        location / {
            proxy_pass http://127.0.0.1:9001;
            proxy_connect_timeout 600;
            proxy_read_timeout 600;
        }
    }
    server {
        listen       80;
        server_name  api.leyou.com;

        proxy_set_header X-Forwarded-Host $host;
        proxy_set_header X-Forwarded-Server $host;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;

        location / {
            proxy_pass http://127.0.0.1:20001;
            proxy_connect_timeout 600;
            proxy_read_timeout 600;
        }
    }
}Copy to clipboardErrorCopied
```

> 使用

nginx可以通过命令行来启动，操作命令：

- 启动：`start nginx.exe`
- 停止：`nginx.exe -s stop`
- 重新加载：`nginx.exe -s reload`

启动过程会闪烁一下，启动成功后，任务管理器中会有两个nginx进程：

![](https://img-blog.csdnimg.cn/20200415224807777.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 测试

启动nginx(如果已经启动，则使用reload命令重新加载即可)，然后直接用域名访问后台管理系统：

现在实现了域名访问网站了，中间的流程是怎样的呢？

![](https://img-blog.csdnimg.cn/20200415224903283.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

1. 浏览器准备发起请求，访问[http://mamage.leyou.com，但需要进行域名解析](http://mamage.leyou.xn--com%2C-8k6f46wu7gh88a1t5djsc54a173ck2v/)

2. 优先进行本地域名解析，因为我们修改了hosts，所以解析成功，得到地址：127.0.0.1

3. 请求被发往解析得到的ip，并且默认使用80端口：[http://127.0.0.1:80](http://127.0.0.1/)

   本机的nginx一直监听80端口，因此捕获这个请求

4. nginx中配置了反向代理规则，将manage.leyou.com代理到127.0.0.1:9001，因此请求被转发

5. 后台系统的webpack server监听的端口是9001，得到请求并处理，完成后将响应返回到nginx

6. nginx将得到的结果返回到浏览器



### 实现商品分类

商城的核心自然是商品，而商品多了以后，肯定要进行分类，并且不同的商品会有不同的品牌信息，我们需要依次去完成：商品分类、品牌、商品的开发。

首先将sql文件导入数据库：[leyou.sql](https://cloudlandboy.github.io/project/leyoumall/assets/leyou.sql)

```sql
CREATE TABLE `tb_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目id',
  `name` varchar(20) NOT NULL COMMENT '类目名称',
  `parent_id` bigint(20) NOT NULL COMMENT '父类目id,顶级类目填0',
  `is_parent` tinyint(1) NOT NULL COMMENT '是否为父节点，0为否，1为是',
  `sort` int(4) NOT NULL COMMENT '排序指数，越小越靠前',
  PRIMARY KEY (`id`),
  KEY `key_parent_id` (`parent_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1424 DEFAULT CHARSET=utf8 COMMENT='商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系';
```

因为商品分类会有层级关系，因此这里我们加入了`parent_id`字段，对本表中的其它分类进行自关联。



#### 实现功能

在浏览器页面点击“分类管理”菜单：

![](https://img-blog.csdnimg.cn/20200415233247313.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



根据这个路由路径到路由文件（src/route/index.js），可以定位到分类管理页面：

![](https://img-blog.csdnimg.cn/20200415233312869.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

由路由文件知，页面是src/pages/item/Category.vue

![](https://img-blog.csdnimg.cn/20200416171402472.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



商品分类使用了树状结构，而这种结构的组件vuetify并没有为我们提供，这里自定义了一个树状组件。不要求实现或者查询组件的实现，只要求可以参照文档使用该组件即可：



#### 异步请求

点击商品管理下的分类管理子菜单，在浏览器控制台可以看到：

![](https://img-blog.csdnimg.cn/20200416171451408.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

页面中没有，只是发起了一条请求：http://api.leyou.com/api/item/category/list?pid=0

大家可能会觉得很奇怪，我们明明是使用的相对路径：/item/category/list，讲道理发起的请求地址应该是：

http://manage.leyou.com/item/category/list

但实际却是：

http://api.leyou.com/api/item/category/list?pid=0

这是因为，我们有一个全局的配置文件，对所有的请求路径进行了约定：

![](https://img-blog.csdnimg.cn/20200416171515762.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



路径是`http://api.leyou.com`，并且默认加上了/api的前缀，这恰好与我们的网关设置匹配，我们只需要把地址改成网关的地址即可,因为我们使用了nginx反向代理，这里可以写域名。

接下来，我们要做的事情就是编写后台接口，返回对应的数据即可。



#### 实体类

在`leyou-item-interface`中添加category实体类：

![](https://img-blog.csdnimg.cn/20200416171559210.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



```java
package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Category {

    @TableId
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;  //注意isParent生成的getter和setter方法需要手动加上is
    private Integer sort;


}
```



<span style="color: red">注意在这里加上mybatis-plus和lombok的依赖</span>>

```xml
<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
    </dependency>
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
    </dependency>
</dependencies>
```



#### Controller

编写一个controller一般需要知道四个内容：

- 请求方式：决定我们用GetMapping还是PostMapping
- 请求路径：决定映射路径
- 请求参数：决定方法的参数
- 返回值结果：决定方法的返回值

在刚才页面发起的请求中，我们就能得到绝大多数信息：

![](https://img-blog.csdnimg.cn/20200416171905540.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



- 请求方式：Get，查询肯定是get请求

- 请求路径：/api/item/category/list。其中/api是网关前缀，/item是网关的路由映射，真实的路径应该是/category/list

- 请求参数：pid=0，根据tree组件的说明，应该是父节点的id，第一次查询为0，那就是查询一级类目

- 返回结果：？？

  根据前面tree组件的用法我们知道，返回的应该是json数组：

```json
[
    { 
        "id": 74,
        "name": "手机",
        "parentId": 0,
        "isParent": true,
        "sort": 2
    },
     { 
        "id": 75,
        "name": "家用电器",
        "parentId": 0,
        "isParent": true,
        "sort": 3
    }
]

```

对应的java类型可以是List集合，里面的元素就是类目对象了。也就是`List`

![](https://img-blog.csdnimg.cn/20200416172055897.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

controller代码：

```java
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryBypid(@RequestParam(value="pid",defaultValue = "0")Long pid){
        if(pid==null||pid<0){
            //400:参数不合法
            //return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            //return ResponseEntity<>(HttpStatus.BAD_REQUEST);
            return ResponseEntity.badRequest().build();
        }
        List<Category> categories = this.categoryService.queryCategoryByPid(pid);
        if(CollectionUtils.isEmpty(categories)){
            //404：资源服务器未找到
            //return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            return ResponseEntity.notFound().build();
        }
        //200：查询成功
        return ResponseEntity.ok(categories);
    }
```



#### Service

```java
@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        return this.categoryMapper.selectList(new QueryWrapper<Category>().lambda()
                                        .eq(Category::getParentId,pid));

    }
}
```



#### mapper

```java
public interface CategoryMapper extends BaseMapper<Category> {

}
```

要注意，我们并没有在mapper接口上声明@Mapper注解，那么mybatis如何才能找到接口呢？

我们在MP的配置类上添加一个扫描包功能：

```java
@Configuration
@MapperScan("top.codekiller.leyou.mapper")
public class MybatisPlusconfig {
}
```



#### 运行产生的问题

![](https://img-blog.csdnimg.cn/20200416202911519.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

发现报错了！

浏览器直接访问没事，但是这里却报错，什么原因？

这其实是浏览器的同源策略造成的跨域问题。





### 跨域问题

跨域：浏览器对于javascript的同源策略的限制 。

以下情况都属于跨域：

| 跨域原因说明       | 示例                                   |
| ------------------ | -------------------------------------- |
| 域名不同           | `www.jd.com` 与 `www.taobao.com`       |
| 域名相同，端口不同 | `www.jd.com:8080` 与 `www.jd.com:8081` |
| 二级域名不同       | `item.jd.com` 与 `miaosha.jd.com`      |

如果**域名和端口都相同，但是请求路径不同**，不属于跨域，如：

```http
www.jd.com/item
www.jd.com/goods
```

http和https也属于跨域

而我们刚才是从`manage.leyou.com`去访问`api.leyou.com`，这属于二级域名不同，跨域了。



### 为什么会有跨域问题

跨域不一定都会有跨域问题。

因为跨域问题是浏览器对于ajax请求的一种安全限制：**一个页面发起的ajax请求，只能是与当前页域名相同的路径**，这能有效的阻止跨站攻击。

因此：**跨域问题 是针对ajax的一种限制**。

但是这却给我们的开发带来了不便，而且在实际生产环境中，肯定会有很多台服务器之间交互，地址和端口都可能不同，怎么办？



### 解决跨域问题的方案

目前比较常用的跨域解决方案有3种：

- Jsonp

  最早的解决方案，利用script标签可以跨域的原理实现。

  限制：

  - 需要服务的支持
  - 只能发起GET请求

- nginx反向代理

  思路是：利用nginx把跨域反向代理为不跨域，支持各种请求方式

  缺点：需要在nginx进行额外配置，语义不清晰

- CORS

  规范化的跨域请求解决方案，安全可靠。

  优势：

  - 在服务端进行控制是否允许跨域，可自定义规则
  - 支持各种请求方式

  缺点：

  - 会产生额外的请求

我们这里会采用cors的跨域方案。



### Cors解决跨域



#### 什么是cors

CORS是一个W3C标准，全称是"跨域资源共享"（Cross-origin resource sharing）。

它允许浏览器向跨源服务器，发出[`XMLHttpRequest`](http://www.ruanyifeng.com/blog/2012/09/xmlhttprequest_level_2.html)请求，从而克服了AJAX只能[同源](http://www.ruanyifeng.com/blog/2016/04/same-origin-policy.html)使用的限制。

CORS需要浏览器和服务器同时支持。目前，所有浏览器都支持该功能，IE浏览器不能低于IE10。

- 浏览器端：

  目前，所有浏览器都支持该功能（IE10以下不行）。整个CORS通信过程，都是浏览器自动完成，不需要用户参与。

- 服务端：

  CORS通信与AJAX没有任何差别，因此你不需要改变以前的业务逻辑。只不过，浏览器会在请求中携带一些头信息，我们需要以此判断是否允许其跨域，然后在响应头中加入一些信息即可。这一般通过过滤器完成即可。



#### 原理

浏览器会将ajax请求分为两类，其处理方案略有差异：简单请求、特殊请求。



#### 简单请求

只要同时满足以下两大条件，就属于简单请求。：

（1) 请求方法是以下三种方法之一：

- HEAD
- GET
- POST

（2）HTTP的头信息不超出以下几种字段：

- Accept
- Accept-Language
- Content-Language
- Last-Event-ID
- Content-Type：只限于三个值`application/x-www-form-urlencoded`、`multipart/form-data`、`text/plain`

当浏览器发现发起的ajax请求是简单请求时，会在请求头中携带一个字段：`Origin`.

![](https://img-blog.csdnimg.cn/20200416180514144.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





Origin中会指出当前请求属于哪个域（协议+域名+端口）。服务会根据这个值决定是否允许其跨域。

如果服务器允许跨域，需要在返回的响应头中携带下面信息：

```http
Access-Control-Allow-Origin: http://manage.leyou.com
Access-Control-Allow-Credentials: true
Content-Type: text/html; charset=utf-8Copy to clipboardErrorCopied
```

- `Access-Control-Allow-Origin`：可接受的域，是一个具体域名或者*（代表任意域名）
- `Access-Control-Allow-Credentials`：是否允许携带cookie，默认情况下，cors不会携带cookie，除非这个值是true

> 有关cookie：

要想操作cookie，需要满足3个条件：

- 服务的响应头中需要携带Access-Control-Allow-Credentials并且为true。
- 浏览器发起ajax需要指定withCredentials 为true
- 响应头中的Access-Control-Allow-Origin一定不能为*，必须是指定的域名



#### 特殊请求

不符合简单请求的条件，会被浏览器判定为特殊请求,，例如请求方式为PUT。

> 预检请求

特殊请求会在正式通信之前，增加一次HTTP查询请求，称为"预检"请求（preflight）。

浏览器先询问服务器，当前网页所在的域名是否在服务器的许可名单之中，以及可以使用哪些HTTP动词和头信息字段。只有得到肯定答复，浏览器才会发出正式的`XMLHttpRequest`请求，否则就报错。

一个“预检”请求的样板：

```http
OPTIONS /cors HTTP/1.1
Origin: http://manage.leyou.com
Access-Control-Request-Method: PUT
Access-Control-Request-Headers: X-Custom-Header
Host: api.leyou.com
Accept-Language: en-US
Connection: keep-alive
User-Agent: Mozilla/5.0...Copy to clipboardErrorCopied
```

与简单请求相比，除了Origin以外，多了两个头：

- Access-Control-Request-Method：接下来会用到的请求方式，比如PUT
- Access-Control-Request-Headers：会额外用到的头信息

> 预检请求的响应

服务的收到预检请求，如果许可跨域，会发出响应：

```http
HTTP/1.1 200 OK
Date: Mon, 01 Dec 2008 01:15:39 GMT
Server: Apache/2.0.61 (Unix)
Access-Control-Allow-Origin: http://manage.leyou.com
Access-Control-Allow-Credentials: true
Access-Control-Allow-Methods: GET, POST, PUT
Access-Control-Allow-Headers: X-Custom-Header
Access-Control-Max-Age: 1728000
Content-Type: text/html; charset=utf-8
Content-Encoding: gzip
Content-Length: 0
Keep-Alive: timeout=2, max=100
Connection: Keep-Alive
Content-Type: text/plainCopy to clipboardErrorCopied
```

除了`Access-Control-Allow-Origin`和`Access-Control-Allow-Credentials`以外，这里又额外多出3个头：

- Access-Control-Allow-Methods：允许访问的方式
- Access-Control-Allow-Headers：允许携带的头
- Access-Control-Max-Age：本次许可的有效时长，单位是秒，**过期之前的ajax请求就无需再次进行预检了**

如果浏览器得到上述响应，则认定为可以跨域，后续就跟简单请求的处理是一样的了。



#### 实现

虽然原理比较复杂，但是前面说过：

- 浏览器端都有浏览器自动完成，我们无需操心
- 服务端可以通过拦截器统一实现，不必每次都去进行跨域判定的编写。

事实上，SpringMVC已经帮我们写好了CORS的跨域过滤器：CorsFilter ,内部已经实现了刚才所讲的判定逻辑，我们直接用就好了。

在`leyou-gateway`中编写一个配置类，并且注册CorsFilter：

```java
@Configuration
public class LeyouCorsConfiguration {

    @Bean
    public CorsFilter corsFilter(){
        //初始化cors配置对象
        CorsConfiguration configuration=new CorsConfiguration();
        configuration.setAllowCredentials(true);
        //允许跨域的域名。如果要携带cookie，不能写*。*：代表所有的域名都可以跨域访问
        configuration.addAllowedOrigin("http://manage.leyou.com");
        configuration.addAllowedMethod("*");  //*：代表所有的请求方法 :GET,POST,PUT,DELETE
        configuration.addAllowedHeader("*"); //允许携带任何头信息
        //初始化cors配置源对象
        UrlBasedCorsConfigurationSource configurationSource=new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",configuration);
        //返回corsFilter实例，参数：cors配置源对象
        return new CorsFilter(configurationSource);
    }
}
```

结构：

![](https://img-blog.csdnimg.cn/20200416202556518.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



重启网关，然后刷新页面测试，访问是否正常正常：http://manage.leyou.com/#/item/category





### 品牌的查询

商品分类完成以后，自然轮到了品牌功能了。

先看看我们要实现的效果：

![](https://img-blog.csdnimg.cn/2020041622252086.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

点击“品牌管理”菜单：

路由路径：/item/brand

根据路由文件知，对应的页面是：src/pages/item/Brand.vue

页面会发送如下请求：

![](https://img-blog.csdnimg.cn/20200416222556100.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 数据库表

```mysql
CREATE TABLE `tb_brand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '品牌id',
  `name` varchar(50) NOT NULL COMMENT '品牌名称',
  `image` varchar(200) DEFAULT '' COMMENT '品牌图片地址',
  `letter` char(1) DEFAULT '' COMMENT '品牌的首字母',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=325400 DEFAULT CHARSET=utf8 COMMENT='品牌表，一个品牌下有多个商品（spu），一对多关系';
```

简单的四个字段，不多解释。

这里需要注意的是，品牌和商品分类之间是多对多关系。因此我们有一张中间表，来维护两者间关系：

```mysql
CREATE TABLE `tb_category_brand` (
  `category_id` bigint(20) NOT NULL COMMENT '商品类目id',
  `brand_id` bigint(20) NOT NULL COMMENT '品牌id',
  PRIMARY KEY (`category_id`,`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品分类和品牌的中间表，两者是多对多关系';
```

但是，你可能会发现，这张表中并**没有设置外键约束**，似乎与数据库的设计范式不符。为什么这么做？

- 外键会严重影响数据库读写的效率
- 数据删除时会比较麻烦

在电商行业，性能是非常重要的。我们宁可在代码中通过逻辑来维护表关系，也不设置外键。



#### 实体类

![](https://img-blog.csdnimg.cn/20200416222959364.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
@Data
public class Brand {
    @TableId
    private Long id;
    private String name;
    private String image;
    private Character letter;

}
```



#### Controller

编写controller先思考四个问题，参照前端页面的控制台

- 请求方式：查询，肯定是Get
- 请求路径：分页查询，/brand/page
- 请求参数：根据我们刚才编写的页面，有分页功能，有排序功能，有搜索过滤功能，因此至少要有5个参数：
  - page：当前页，int
  - rows：每页大小，int
  - sortBy：排序字段，String
  - desc：是否为降序，boolean
  - key：搜索关键词，String
- 响应结果：分页结果一般至少需要两个数据
  - total：总条数
  - items：当前页数据
  - totalPage：有些还需要总页数

这里我们封装一个类，来表示分页结果

由于这个分页类可能不止商品服务中需要其他服务可能也需要，所以我们给它放在`leyou-common`中

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T>  {

    /**
     * 当前数据总条数
     */
    private Long total;
    /**
     * 当前总页数
     */
    private Integer totalPage;
    /**
     * 当前页数据
     */
    private List<T> items;
}
```

然后在leyou-item-service工程的pom.xml中引入leyou-common的依赖

```xml
<!--leyou-common-->
<dependency>
    <groupId>com.leyou.common</groupId>
    <artifactId>leyou-common</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

接下来，我们编写Controller

```java
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    IBrandService brandService;


    /**
     * 根据查询条件分页查询品牌信息，并排序
     * @param key 关键字
     * @param page  查询页数
     * @param rows  显示行数
     * @param sortBy 通过那个字段进行排序
     * @param desc  是否是降序
     * @return
     */
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandsByPage(@RequestParam(value="key",required = false)String key,
                                                               @RequestParam(value="page",defaultValue = "1")Integer page,
                                                               @RequestParam(value="rows",defaultValue = "5")Integer rows,
                                                               @RequestParam(value="sortBy",required = false)String sortBy,
                                                               @RequestParam(value="desc",required = false)Boolean desc){
        PageResult<Brand> result = this.brandService.queryBrandByPage(key, page, rows, sortBy, desc);
        if( CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

}
```



#### Service

```java
@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;
    /**
     * 根据查询条件分页查询品牌信息，并排序
     * @param key 关键字
     * @param page  查询页数
     * @param rows  显示行数
     * @param sortBy 通过那个字段进行排序
     * @param desc  是否是降序
     * @return
     */
    @Override
    public PageResult<Brand> queryBrandByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc) {
        QueryWrapper<Brand> queryWrapper=new QueryWrapper<Brand>();
        //根据name模糊查询，或者根据首字母查询
        if(StringUtils.isNotBlank(key)){
            queryWrapper.like("name",key).or().eq("letter",key);
        }

        //添加排序条件
        if(StringUtils.isNotBlank(sortBy)){
            if (desc) {
                queryWrapper.orderByDesc(sortBy);
            } else {
                queryWrapper.orderByAsc(sortBy);
            }
        }

        //通过分页查询
        IPage<Brand> rpage=this.brandMapper.selectPage(new Page<Brand>(page,rows),queryWrapper);
        return new PageResult<Brand>(rpage.getTotal(),(int)rpage.getPages(),rpage.getRecords());

    }
}
```



#### mapper

```java
public interface BrandMapper extends BaseMapper<Brand> {}
```





### 异步查询工具axios

异步查询数据，自然是通过ajax查询，大家首先想起的肯定是jQuery。但jQuery与MVVM的思想不吻合，而且ajax只是jQuery的一小部分。因此不可能为了发起ajax请求而去引用这么大的一个库。



#### axios

Vue官方推荐的ajax请求框架叫做：axios，看下demo：

![](https://img-blog.csdnimg.cn/20200416223701586.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





axios的Get请求语法：

```js
axios.get("/item/category/list?pid=0") // 请求路径和请求参数拼接
    .then(function(resp){
        // 成功回调函数
    })
    .catch(function(){
        // 失败回调函数
    })
// 参数较多时，可以通过params来传递参数
axios.get("/item/category/list", {
        params:{
            pid:0
        }
    })
    .then(function(resp){})// 成功时的回调
    .catch(function(error){})// 失败时的回调Copy to clipboardErrorCopied
```

axios的POST请求语法：

比如新增一个用户

```js
axios.post("/user",{
        name:"Jack",
        age:21
    })
    .then(function(resp){})
    .catch(function(error){})Copy to clipboardErrorCopied
```

注意，POST请求传参，不需要像GET请求那样定义一个对象，在对象的params参数中传参。post()方法的第二个参数对象，就是将来要传递的参数

PUT和DELETE请求与POST请求类似



#### axios的全局配置

而在我们的项目中，已经引入了axios，并且进行了简单的封装，在src下的http.js中：

![](https://img-blog.csdnimg.cn/20200416223746638.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



http.js中对axios进行了一些默认配置：

```js
import Vue from 'vue'
import axios from 'axios'
import config from './config'
// config中定义的基础路径是：http://api.leyou.com/api
axios.defaults.baseURL = config.api; // 设置axios的基础请求路径
axios.defaults.timeout = 2000; // 设置axios的请求时间

Vue.prototype.$http = axios;// 将axios赋值给Vue原型的$http属性，这样所有vue实例都可使用该对象
```

http.js中导入了config的配置，还记得吗？

![](https://img-blog.csdnimg.cn/20200416223850220.png)

- http.js对axios进行了全局配置：`baseURL=config.api`，即`http://api.leyou.com/api`。因此以后所有用axios发起的请求，都会以这个地址作为前缀。
- 通过`Vue.property.$http = axios`，将`axios`赋值给了 Vue原型中的`$http`。这样以后所有的Vue实例都可以访问到$http，也就是访问到了axios了。



#### 项目中如何使用

我们在组件`Brand.vue`的getDataFromServer方法，通过$http发起get请求，测试查询品牌的接口，看是否能获取到数据：

![](https://img-blog.csdnimg.cn/20200416224028395.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

网络监视：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200416224113488.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

resp到底都有那些数据，查看控制台结果：

![](https://img-blog.csdnimg.cn/20200416224208416.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



可以看到，在请求成功的返回结果response中，有一个data属性，里面就是真正的响应数据。

响应结果中与我们设计的一致，包含3个内容：

- total：总条数，目前是165
- items：当前页数据
- totalPage：总页数，我们没有返回



### 分页和过滤原理

#### 分页

点击分页，会发起请求，通过浏览器工具查看，会发现pagination对象的属性一直在变化：

![](https://img-blog.csdnimg.cn/20200416224347859.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们可以利用Vue的监视功能：watch，当pagination发生改变时，会调用我们的回调函数，我们在回调函数中进行数据的查询！

具体实现：

![](https://img-blog.csdnimg.cn/20200416224407548.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

成功实现分页功能：

![](https://img-blog.csdnimg.cn/20200416224916387.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 过滤

过滤字段对应的是search属性，我们只要监视这个属性即可:

![](https://img-blog.csdnimg.cn/20200416224938153.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

查看网络请求：

![](https://img-blog.csdnimg.cn/2020041622500041.png)

页面结果：

![](https://img-blog.csdnimg.cn/20200416225021937.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



## 品牌管理和图片上传



### 品牌新增

上节完成了品牌的查询，接下来就是新增功能。点击新增品牌按钮

![](https://img-blog.csdnimg.cn/20200417001356284.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



Brand.vue页面有一个提交按钮：

![](https://img-blog.csdnimg.cn/20200417001419126.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



点击触发addBrand方法：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1545222464105.png)



把数据模型之的show置为true，而页面中有一个弹窗与show绑定：

![](https://img-blog.csdnimg.cn/20200417001503496.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



弹窗中有一个表单子组件，并且是一个局部子组件，有页面可以找到该组件：

![](https://img-blog.csdnimg.cn/20200417001750396.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





###页面实现

#### 重置表单

重置表单相对简单，因为v-form组件已经提供了reset方法，用来清空表单数据。只要我们拿到表单组件对象，就可以调用方法了。

我们可以通过`$refs`内置对象来获取表单组件。

首先，在表单上定义`ref`属性：

![](https://img-blog.csdnimg.cn/20200417152816927.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后，在页面查看`this.$refs`属性：

```js
      reset(){
        // 重置表单
        console.log(this);
      }
```

查看如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200417152847923.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

看到`this.$refs`中只有一个属性，就是`myBrandForm`

我们在clear中来获取表单对象并调用reset方法：

![](https://img-blog.csdnimg.cn/2020041715291781.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



要注意的是，这里我们还手动把this.categories清空了，因为我写的级联选择组件并没有跟表单结合起来。需要手动清空。



#### 表单校验

##### 校验规则

Vuetify的表单校验，是通过rules属性来指定的：

![](https://img-blog.csdnimg.cn/20200417153037914.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

校验规则的写法：

![](https://img-blog.csdnimg.cn/20200417153056869.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

说明：

- 规则是一个数组
- 数组中的元素是一个函数，该函数接收表单项的值作为参数，函数返回值两种情况：
  - 返回true，代表成功，
  - 返回错误提示信息，代表失败

#### [编写校验](https://cloudlandboy.github.io/myNote/#/project/leyoumall/brand?id=编写校验)

我们有四个字段：

- name：做非空校验和长度校验，长度必须大于1
- letter：首字母，校验长度为1，非空。
- image：图片，不做校验，图片可以为空
- categories：非空校验，自定义组件已经帮我们完成，不用写了

首先，我们定义规则：

![](https://img-blog.csdnimg.cn/20200417153141163.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后，在页面标签中指定：

```html
<v-text-field v-model="brand.name" label="请输入品牌名称" hint="例如：oppo" :rules="[rules.required, rules.nameLength]"></v-text-field>
<v-text-field v-model="brand.letter" label="请输入品牌首字母" hint="例如：O" :rules="[rules.letter]"></v-text-field>
```

效果：

![](https://img-blog.csdnimg.cn/20200417153204227.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 表单提交

在submit方法中添加表单提交的逻辑：

```vue
submit() {
    console.log(this.$qs);
    // 表单校验
    if (this.$refs.myBrandForm.validate()) {
        // 定义一个请求参数对象，通过解构表达式来获取brand中的属性{categories letter name image}
        const {categories, letter, ...params} = this.brand; // params:{name, image, cids, letter}
        // 数据库中只要保存分类的id即可，因此我们对categories的值进行处理,只保留id，并转为字符串
        params.cids = categories.map(c => c.id).join(",");
        // 将字母都处理为大写
        params.letter = letter.toUpperCase();
        // 将数据提交到后台
        // this.$http.post('/item/brand', this.$qs.stringify(params))
        this.$http({
            method: this.isEdit ? 'put' : 'post',
            url: '/item/brand',
            data: params
        }).then(() => {
            // 关闭窗口
            this.$emit("close");
            this.$message.success("保存成功！");
        })
            .catch(() => {
            this.$message.error("保存失败！");
        });
    }
}
```

1. 通过`this.$refs.myBrandForm`选中表单，然后调用表单的`validate`方法，进行表单校验。返回boolean值，true代表校验通过
2. 通过解构表达式来获取brand中的值，categories需要处理，单独获取。其它的存入params对象中
3. 品牌和商品分类的中间表只保存两者的id，而brand.categories中保存的是对象数组，里面有id和name属性，因此这里通过数组的map功能转为id数组，然后通过join方法拼接为字符串
4. 发起请求
5. 弹窗提示成功还是失败，这里用到的是我们的自定义组件功能message组件：

![](https://img-blog.csdnimg.cn/20200417153256248.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

1. 这个插件把`$message`对象绑定到了Vue的原型上，因此我们可以通过`this.$message`来直接调用。

   包含以下常用方法：

- info、error、success、warning等，弹出一个带有提示信息的窗口，色调与为普通（灰）、错误（红色）、成功（绿色）和警告（黄色）。使用方法：this.$message.info("msg")
- confirm：确认框。用法：`this.$message.confirm("确认框的提示信息")`，返回一个Promise。



### 后台实现新增

我们先看以下前台的请求参数信息，除了cids其他三个字段brand实体中都有，我们可以封装到实体中接收，cids直接用参数接收![](https://img-blog.csdnimg.cn/20200417153323555.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### Controller

还是一样，先分析四个内容：

- 请求方式：POST
- 请求路径：/brand
- 请求参数：brand对象，外加商品分类的id数组cids
- 返回值：无，只需要响应状态码

代码：

```java
@PostMapping()
public ResponseEntity<Void> saveBrand(Brand brand,@RequestParam("cids") List<Long> cids){
    this.brandService.saveBrand(brand,cids);
    return ResponseEntity.status(HttpStatus.CREATED).build();

}
```



#### Service

这里要注意，我们不仅要新增品牌，还要维护品牌和商品分类的中间表。

```java
/**
     * 增加品牌
     * @param brand 商品的信息
     * @param cids  商品的分类
     */
@Override
@Transactional
public void saveBrand(Brand brand, List<Long> cids) {
    //先新增brand
    this.brandMapper.insert(brand);
    //再新增中间表
    cids.forEach(cid->{
        this.brandMapper.insertCategoryAndBrand(cid,brand.getId());
    });

}
```



这里调用了brandMapper中的一个自定义方法，来实现中间表的数据新增



#### Mapper

通用Mapper只能处理单表，也就是Brand的数据，因此我们手动编写一个方法及sql，实现中间表的新增：

```java
    /**
     * 在中间表中插入数据
     * @param cid 分类id
     * @param bid 品牌id
     */
    @Insert("insert into tb_category_brand values(#{cid},#{bid})")
    void insertCategoryAndBrand(@Param("cid") Long cid, @Param("bid") Long bid);
```



### 测试

![](https://img-blog.csdnimg.cn/20200417155546287.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

400：请求参数不合法



### 解决400

#### 原因分析

我们填写表单并提交，发现报错了。查看控制台的请求详情：

发现请求的数据格式是JSON格式。

> 原因分析：

axios处理请求体的原则会根据请求数据的格式来定：

- 如果请求体是对象：会转为json发送

- 如果请求体是String：会作为普通表单请求发送，但需要我们自己保证String的格式是键值对。

  如：name=jack&age=12



#### qs工具

QS是一个第三方库，我们可以用`npm install qs --save`来安装。不过我们在项目中已经集成了，大家无需安装：

![](https://img-blog.csdnimg.cn/20200417155704174.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这个工具的名字：QS，即Query String，请求参数字符串。

什么是请求参数字符串？例如： name=jack&age=21

QS工具可以便捷的实现 JS的Object与QueryString的转换。

在我们的项目中，将QS注入到了Vue的原型对象中，我们可以通过`this.$qs`来获取这个工具：

![](https://img-blog.csdnimg.cn/20200417155734818.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们将`this.$qs`对象打印到控制台：

```js
created(){
    console.log(this.$qs);
}
```

发现其中有3个方法：

![](https://img-blog.csdnimg.cn/20200417155756169.png)

这里我们要使用的方法是stringify，它可以把Object转为QueryString。

测试一下，使用浏览器工具，把qs对象保存为一个临时变量temp1，然后调用stringify方法：



#### 解决问题

修改页面，对参数处理后发送：

![](https://img-blog.csdnimg.cn/20200417160409451.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





然后再次发起请求，发现请求成功：



### 完成后关闭窗口(已完成)

我们发现有一个问题：新增不管成功还是失败，窗口都一致在这里，不会关闭。

这样很不友好，我们希望如果新增失败，窗口保持；但是新增成功，窗口关闭才对。

因此，我们需要**在新增的ajax请求完成以后，关闭窗口**

但问题在于，控制窗口是否显示的标记在父组件：MyBrand.vue中。子组件如何才能操作父组件的属性？或者告诉父组件该关闭窗口了？

之前我们讲过一个父子组件的通信，有印象吗？

- 第一步：在父组件中定义一个函数，用来关闭窗口，不过之前已经定义过了。父组件在使用子组件时，绑定事件，关联到这个函数：Brand.vue

```vue
<!--对话框的内容，表单-->
<v-card-text class="px-5" style="height:400px">
    <brand-form @close="closeWindow" :oldBrand="oldBrand" :isEdit="isEdit"/>
</v-card-text>
```

第二步，子组件通过`this.$emit`调用父组件的函数：BrandForm.vue

![](https://img-blog.csdnimg.cn/20200417160602696.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



测试一下，保存成功：

![](https://img-blog.csdnimg.cn/20200417160627180.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



我们优化一下，关闭的同时重新加载数据：

```js
closeWindow(){
    // 关闭窗口
    this.show = false;
    // 重新加载数据
    this.getDataFromServer();
}
```





### 实现图片的上传

刚才的新增实现中，我们并没有上传图片，接下来我们一起完成图片上传逻辑。

文件的上传并不只是在品牌管理中有需求，以后的其它服务也可能需要，因此我们创建一个独立的微服务，专门处理各种上传。



#### 创建module

![](https://img-blog.csdnimg.cn/20200417171202709.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 依赖

我们需要EurekaClient和web依赖：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>leyou-parent</artifactId>
        <groupId>top.codekiller.leyou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-upload</artifactId>

    <dependencies>
        <dependency>
              <groupId>org.springframework.cloud</groupId>
              <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
         <!--可以生成配置类提示文件-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
         <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>
</project>
```



#### 编写配置

```yaml
server:
  port: 8082
spring:
  application:
    name: upload-service
  servlet:
    multipart:
      file-size-threshold: 5MB
eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
  instance:
    lease-expiration-duration-in-seconds: 15
    lease-renewal-interval-in-seconds: 5
```

需要注意的是，我们应该添加了限制文件大小的配置



#### 引导类

```java
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouUploadApplication.class, args);
    }
```





#### 编写上传功能

文件上传功能，也是自定义组件完成的.

在页面中的使用：

![](https://img-blog.csdnimg.cn/20200417171447737.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### Controller

编写controller需要知道4个内容：结合用法指南

- 请求方式：上传肯定是POST
- 请求路径：/upload/image
- 请求参数：文件，参数名是file，SpringMVC会封装为一个接口：MultipartFile
- 返回结果：上传成功后得到的文件的url路径，也就是返回String

代码如下：

```java
@RestController
@RequestMapping("upload")
public class UploadController {

    @Autowired
    UploadService uploadService;

    /**
     * 上传图片
     * @param file
     * @return
     */
    @PostMapping("image")
    public ResponseEntity<String>  uploadImage(@RequestParam("file")MultipartFile file){
        String url=uploadService.uploadImage(file);
        if(StringUtils.isBlank(url)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(url);
    }
}
```



#### UploadProperties

可以通过配置文件编写允许的contentType的类型

```java
@Data
@ConfigurationProperties(prefix = "uploadinfo")
@Component
public class UploadProperties {

    private List<String> contentTypes;

    private String imageUrl;

    private String savePath;
}
```



application.yml

```yaml
uploadinfo:
  content-types:
    - image/gif
    - image/jpeg
    - image/png
  imageUrl: http://image.leyou.com/
  savePath: F:\\乐优商城上传的图片\\
```



#### Service

在上传文件过程中，我们需要对上传的内容进行校验：

1. 校验文件大小
2. 校验文件的媒体类型
3. 校验文件的内容

文件大小在Spring的配置文件中设置，因此已经会被校验，我们不用管。

具体代码：

```java
package top.codekiller.leyou.upload.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.codekiller.leyou.upload.properties.UploadProperties;
import top.codekiller.leyou.upload.service.IUploadService;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


@Slf4j
@EnableConfigurationProperties(UploadProperties.class)
@Service
public class UploadService implements IUploadService {

    private UploadProperties uploadProperties;



    //构造器注入properties
    public UploadService(UploadProperties uploadProperties){
        this.uploadProperties=uploadProperties;
    }


    /**
     * 上传图片
     * @param file
     * @return
     */
    @Override
    public String uploadImage(MultipartFile file) {
        String originName=file.getOriginalFilename();
        //验证文件类型
        String contentType=file.getContentType();
        if(!uploadProperties.getContentTypes().contains(contentType)){
            //使用日志记录不合法的信息
            log.info("文件类型不合法: {}",originName);
            return null;
        }

        try {
            //校验文件的内容
            BufferedImage bufferedImage= ImageIO.read(file.getInputStream());
            if(bufferedImage==null){
                log.info("文件的内容不合法: {}",originName);
                return null;
            }
            //获取文件类型
            String suffix=StringUtils.substringAfterLast(originName,".");
            UUID uuid=UUID.randomUUID();
            String id=uuid.toString();
            //保存到服务器
            file.transferTo(new File(uploadProperties.getSavePath()+id+"."+suffix));
            //返回url，进行回显
            log.info("上传成功:{}"+originName);
            return uploadProperties.getImageUrl()+originName;
        } catch (IOException e){
            log.info("服务器内部错误:{}",originName);
            e.printStackTrace();
        }

        return null;

    }
}

```





这里有一个问题：为什么图片地址需要使用另外的url？

- 图片不能保存在服务器内部，这样会对服务器产生额外的加载负担
- 一般静态资源都应该使用独立域名，这样访问静态资源时不会携带一些不必要的cookie，减小请求的数据量



#### 配置nginx

虽然实现了文件上传功能并且返回了文件访问地址，但是我们无法通过返回的地址直接访问到图片，接下来我们配置Nginx静态资源访问来回显图片

找到nginx配置文件添加以下内容

```nginx
server {
    listen       80;
    server_name  image.leyou.com;

    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;

    location / {
        proxy_connect_timeout 600;
        proxy_read_timeout 600;
        root F:/乐优商城上传的图片/ ;
    }
}
```

然后配置本地hosts文件

```
# leyouMall

127.0.0.1 api.leyou.com
127.0.0.1 manage.leyou.com
127.0.0.1 image.leyou.com
```

然后访问上传后回显的url就可以访问到图片了

#### 测试上传

有两个工具可以进行测试

Postman(需下载)和Advanced REST client(直接在谷歌商店里面搜)



### 绕过网关

图片上传是文件的传输，如果也经过Zuul网关的代理，文件就会经过多次网路传输，造成不必要的网络负担。在高并发时，可能导致网络阻塞，Zuul网关不可用。这样我们的整个系统就瘫痪了。

所以，我们上传文件的请求就不经过网关来处理了。



#### zuul的路由过滤

Zuul中提供了一个ignored-patterns属性，用来忽略不希望路由的URL路径，示例：

```properties
zuul.ignored-patterns: /upload/**
```

路径过滤会对一切微服务进行判定。

Zuul还提供了`ignored-services`属性，进行服务过滤：

```properties
zuul.ignored-services: upload-servie
```

我们这里采用忽略服务：

```yaml
zuul:
  ignored-services:
    - upload-service # 忽略upload-service服务
```

上面的配置采用了集合语法，代表可以配置多个。



#### nginx的rewirte指令

现在，我们查看页面的访问路径：

```html
<v-upload
      v-model="brand.image" 
      url="/upload/image" 
      :multiple="false" 
      :pic-width="250" :pic-height="90"
      />
```



![](https://img-blog.csdnimg.cn/2020041720011088.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



可以看到这个地址不对，依然是去找Zuul网关，因为我们的系统全局配置了URL地址。怎么办？

有同学会想：修改页面请求地址不就好了。

注意：原则上，我们是不能把除了网关以外的服务对外暴露的，不安全。

既然不能修改页面请求，那么就只能在Nginx反向代理上做文章了。

我们修改nginx配置，将以/api/upload开头的请求拦截下来，转交到真实的服务地址:

```nginx
server {
    listen       80;
    server_name  api.leyou.com;

    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;

    location /api/upload {
        proxy_pass http://localhost:8082/upload;

        #rewirte "^/api/(.*)$" /$1 break;
    }

    location / {
        proxy_pass http://127.0.0.1:10010;
        proxy_connect_timeout 600;
        proxy_read_timeout 600;
    }
}
```

两种方式:

1. 通过proxy_pass跳转

   ```nginx
    proxy_pass http://localhost:8082/upload;
   ```

   

2. 通过重定向的方式

   ```nginx
   proxy_pass http://127.0.0.1:7002;
   rewrite "^/api/(.*)$" /$1 break; 
   ```

   

- 首先，我们映射路径是/api/upload，而下面一个映射路径是 / ，根据最长路径匹配原则，/api/upload优先级更高。也就是说，凡是以/api/upload开头的路径，都会被第一个配置处理

- `proxy_pass`：反向代理，这次我们代理到7002端口，也就是upload-service服务

- `rewrite "^/api/(.*)$" /$1 break`，路径重写：

  - `"^/api/(.*)$"`：匹配路径的正则表达式，用了分组语法，把`/api/`以后的所有部分当做1组

  - `/$1`：重写的目标路径，这里用$1引用前面正则表达式匹配到的分组（组编号从1开始），即`/api/`后面的所有。这样新的路径就是除去`/api/`以外的所有，就达到了去除`/api`前缀的目的

  - `break`：指令，常用的有2个，分别是：last、break

    - last：重写路径结束后，将得到的路径重新进行一次路径匹配
    - break：重写路径结束后，不再重新匹配路径。

    我们这里不能选择last，否则以新的路径/upload/image来匹配，就不会被正确的匹配到7002端口了

修改完成，输入`nginx -s reload`命令重新加载配置。然后再次上传试试。



### 跨域问题

重启nginx，再次上传，发现跟上次的状态码已经不一样了，但是依然报错：

![](https://img-blog.csdnimg.cn/20200417200722550.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

不过庆幸的是，这个错误已经不是第一次见了，跨域问题。因为之前我们的跨域问题是在网关中解决的，现在不经过网关了，所以要在这里也添加一个CorsFilter

我们在upload-service中添加一个CorsFilter即可：

![](https://img-blog.csdnimg.cn/20200417200753470.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
@Configuration
public class LeyouCorsConfiguration {

    @Bean
    public CorsFilter corsFilter() {
        //1.添加CORS配置信息
        CorsConfiguration config = new CorsConfiguration();
        //1) 允许的域,不要写*，否则cookie就无法使用了
        config.addAllowedOrigin("http://manage.leyou.com");
        //3) 允许的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("POST");
        // 4）允许的头信息
        config.addAllowedHeader("*");

        //2.添加映射路径，我们拦截一切请求
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);

        //3.返回新的CorsFilter.
        return new CorsFilter(configSource);
    }
}
```

再次测试：

![](https://img-blog.csdnimg.cn/20200417200841162.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 文件上传的缺陷

先思考一下，现在上传的功能，有没有什么问题？

上传本身没有任何问题，问题出在保存文件的方式，我们是保存在服务器机器，就会有下面的问题：

- 单机器存储，存储能力有限
- 无法进行水平扩展，因为多台机器的文件无法共享,会出现访问不到的情况
- 数据没有备份，有单点故障风险
- 并发能力差

这个时候，最好使用分布式文件存储来代替本地文件存储。





### FastDFS

#### 什么是分布式文件系统

分布式文件系统（Distributed File System）是指文件系统管理的物理存储资源不一定直接连接在本地节点上，而是通过计算机网络与节点相连。

通俗来讲：

- 传统文件系统管理的文件就存储在本机。
- 分布式文件系统管理的文件存储在很多机器，这些机器通过网络连接，要被统一管理。无论是上传或者访问文件，都需要通过管理中心来访问

####什么是FastDFS

FastDFS是由淘宝的余庆先生所开发的一个轻量级、高性能的开源分布式文件系统。用纯C语言开发，功能丰富：

- 文件存储
- 文件同步
- 文件访问（上传、下载）
- 存取负载均衡
- 在线扩容

适合有大容量存储需求的应用或系统。同类的分布式文件系统有谷歌的GFS、HDFS（Hadoop）、TFS（淘宝）等。

#### FastDFS架构

先上图：

![](https://img-blog.csdnimg.cn/20200418145238986.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



FastDFS两个主要的角色：Tracker Server 和 Storage Server 。

- Tracker Server：跟踪服务器，主要负责调度storage节点与client通信，在访问上起负载均衡的作用，和记录storage节点的运行状态，是连接client和storage节点的枢纽。
- Storage Server：存储服务器，保存文件和文件的meta data（元数据），每个storage server会启动一个单独的线程主动向Tracker cluster中每个tracker server报告其状态信息，包括磁盘使用情况，文件同步情况及文件上传下载次数统计等信息
- Group：文件组，多台Storage Server的集群。上传一个文件到同组内的一台机器上后，FastDFS会将该文件即时同步到同组内的其它所有机器上，起到备份的作用。不同组的服务器，保存的数据不同，而且相互独立，不进行通信。
- Tracker Cluster：跟踪服务器的集群，有一组Tracker Server（跟踪服务器）组成。
- Storage Cluster ：存储集群，有多个Group组成。



#### 上传和下载流程

> 上传

![](https://img-blog.csdnimg.cn/20200418145416981.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



1. Client通过Tracker server查找可用的Storage server。
2. Tracker server向Client返回一台可用的Storage server的IP地址和端口号。
3. Client直接通过Tracker server返回的IP地址和端口与其中一台Storage server建立连接并进行文件上传。
4. 上传完成，Storage server返回Client一个文件ID，文件上传结束。



> 下载

![](https://img-blog.csdnimg.cn/20200418145701661.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

1. Client通过Tracker server查找要下载文件所在的的Storage server。
2. Tracker server向Client返回包含指定文件的某个Storage server的IP地址和端口号。
3. Client直接通过Tracker server返回的IP地址和端口与其中一台Storage server建立连接并指定要下载文件。
4. 下载文件成功。



#### 安装和使用

所需文件下载地址：https://github.com/happyfish100

参考资料：[FastDFS的安装](https://codekiller.top/2020/04/28/leyou-mall-tools/#toc-heading-38)





### java客户端

余庆先生提供了一个Java客户端，但是作为一个C程序员，写的java代码可想而知。而且已经很久不维护了。

这里推荐一个开源的FastDFS客户端，支持最新的SpringBoot2.0。

配置使用极为简单，支持连接池，支持自动生成缩略图，狂拽酷炫吊炸天啊，有木有。

地址：[tobato/FastDFS_client](https://github.com/tobato/FastDFS_Client)

![](https://img-blog.csdnimg.cn/20200418151916773.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



接下来，我们就用FastDFS改造**leyou-upload**工程。



####  引入依赖

在父工程中，我们已经管理了依赖，版本为：

```xml
<fastDFS.client.version>1.26.7</fastDFS.client.version>
```

因此，这里我们直接在taotao-upload工程的pom.xml中引入坐标即可：

```xml
<dependency>
    <groupId>com.github.tobato</groupId>
    <artifactId>fastdfs-client</artifactId>
</dependency>
```



#### 引入配置类

![](https://img-blog.csdnimg.cn/20200418151956320.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

纯java配置：

```java
@Configuration
@Import(FdfsClientConfig.class)
// 解决jmx重复注册bean的问题
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class FastClientImporter {

}
```



#### 编写FastDFS属性

在application.yml配置文件中追加如下内容：

```yaml
fdfs:
  so-timeout: 1501 # 超时时间
  connect-timeout: 601 # 连接超时时间
  thumb-image: # 缩略图
    width: 60
    height: 60
  tracker-list: # tracker地址：你的虚拟机服务器地址+端口（默认是22122）
    - 172.16.145.141:22122
```





#### 配置hosts

将来通过域名：image.leyou.com这个域名访问fastDFS服务器上的图片资源。所以，需要代理到虚拟机地址：

配置hosts文件，使image.leyou.com可以访问fastDFS服务器

![](https://img-blog.csdnimg.cn/20200418152107865.png)



#### 测试

创建测试类：

![](https://img-blog.csdnimg.cn/20200418152129474.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

把以下内容copy进去：

```java
@SpringBootTest
@RunWith(SpringRunner.class)
public class FastDFSTest {

    @Autowired
    private FastFileStorageClient storageClient;

    @Autowired
    private ThumbImageConfig thumbImageConfig;

    @Test
    public void testUpload() throws FileNotFoundException {
        //找一张本地图片路径
        File file = new File("/home/cloudlandboy/Pictures/bg/4oyg9n.jpg");
        // 上传并保存图片，参数：1-上传的文件流 2-文件的大小 3-文件的后缀 4-可以不管他
        StorePath storePath = this.storageClient.uploadFile(
                new FileInputStream(file), file.length(), "jpg", null);
        // 带分组的路径
        System.out.println(storePath.getFullPath());
        // 不带分组的路径
        System.out.println(storePath.getPath());
    }

    @Test
    public void testUploadAndCreateThumb() throws FileNotFoundException {
        //找一张本地图片路径
        File file = new File("/home/cloudlandboy/Pictures/bg/201909232212.jpeg");
        // 上传并且生成缩略图
        StorePath storePath = this.storageClient.uploadImageAndCrtThumbImage(
                new FileInputStream(file), file.length(), "jpeg", null);
        // 带分组的路径
        System.out.println(storePath.getFullPath());
        // 不带分组的路径
        System.out.println(storePath.getPath());
        // 获取缩略图路径
        String path = thumbImageConfig.getThumbImagePath(storePath.getPath());
        System.out.println(path);
    }
}
```

如果出现 `com.github.tobato.fastdfs.exception.FdfsServerException: 错误码：2，错误信息：找不到节点或文件`，查看是不是没有创建文件夹 `mkdir -p /leyou/storage`，然后重新启动`service fdfs_storaged restart`

testUpload结果：

```
group1/M00/00/00/rBCRjV3osRKADvQLABG-h8hKM_c874.jpg
M00/00/00/rBCRjV3osRKADvQLABG-h8hKM_c874.jpg
```

testUploadAndCreateThumb结果：

```
group1/M00/00/00/wKg4ZVsWmD-ARnWiAABAhya2V0c772.png
M00/00/00/wKg4ZVsWmD-ARnWiAABAhya2V0c772.png
M00/00/00/wKg4ZVsWmD-ARnWiAABAhya2V0c772_60x60.png
```

访问http://image.leyou.com/+返回的地址路径（**注意加组名（group1）**）



#### 改造上传逻辑

```java
@Slf4j
@EnableConfigurationProperties(UploadProperties.class)
@Service
public class UploadService implements IUploadService {

    private UploadProperties uploadProperties;

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

    //构造器注入properties
    public UploadService(UploadProperties uploadProperties){
        this.uploadProperties=uploadProperties;
    }
    

    /**
     * 上传图片
     * @param file
     * @return
     */
    @Override
    public String uploadImage(MultipartFile file) {
        String originName=file.getOriginalFilename();
        //验证文件类型
        String contentType=file.getContentType();
        if(!uploadProperties.getContentTypes().contains(contentType)){
            //使用日志记录不合法的信息
            log.info("文件类型不合法: {}",originName);
            return null;
        }

        try {
            //校验文件的内容
            BufferedImage bufferedImage= ImageIO.read(file.getInputStream());
            if(bufferedImage==null){
                log.info("文件的内容不合法: {}",originName);
                return null;
            }
            //获取文件类型
            String suffix=StringUtils.substringAfterLast(originName,".");
//            UUID uuid=UUID.randomUUID();
//            String id=uuid.toString();
            //保存到服务器
//            file.transferTo(new File(uploadProperties.getSavePath()+id+"."+suffix));
            StorePath storePath=fastFileStorageClient.uploadFile(file.getInputStream(),file.getSize(),suffix,null);
            //返回url，进行回显
            log.info("上传成功:{}"+originName);
            return uploadProperties.getImageUrl()+storePath.getFullPath();
        } catch (IOException e){
            log.info("服务器内部错误:{}",originName);
            e.printStackTrace();
        }

        return null;

    }
}
```

只需要把原来保存文件的逻辑去掉，然后上传到FastDFS即可。



### 页面上传测试

发现上传成功：

![](https://img-blog.csdnimg.cn/20200418152451542.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







##  页面规格数据结构

乐优商城是一个全品类的电商网站，因此商品的种类繁多，每一件商品，其属性又有差别。为了更准确描述商品及细分差别，抽象出两个概念：SPU和SKU，了解一下：



### SPU和SKU

SPU：Standard Product Unit （标准产品单位） ，一组具有共同属性的商品集

SKU：Stock Keeping Unit（库存量单位），SPU商品集因具体特性不同而细分的每个商品

以图为例来看：

![](https://img-blog.csdnimg.cn/20200418153206635.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



- 本页的 华为Mate10 就是一个商品集（SPU）
- 因为颜色、内存等不同，而细分出不同的Mate10，如亮黑色128G版。（SKU）

可以看出：

- SPU是一个抽象的商品集概念，为了方便后台的管理。
- SKU才是具体要销售的商品，每一个SKU的价格、库存可能会不一样，用户购买的是SKU而不是SPU



### 数据库设计

#### 思考并发现问题

弄清楚了SPU和SKU的概念区分，接下来我们一起思考一下该如何设计数据库表。

首先来看SPU，大家一起思考下SPU应该有哪些字段来描述？

>id:主键
>title：标题
>description：描述
>specification：规格
>packaging_list：包装
>after_service：售后服务
>comment：评价
>category_id：商品分类
>brand_id：品牌

似乎并不复杂，但是大家仔细思考一下，商品的规格字段你如何填写？

![](https://img-blog.csdnimg.cn/20200419171420583.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

不同商品的规格不一定相同，数据库中要如何保存？

再看下SKU，大家觉得应该有什么字段？

>id：主键
>spu_id：关联的spu
>price：价格
>images：图片
>stock：库存
>颜色？
>内存？
>硬盘？

碰到难题了，不同的商品分类，可能属性是不一样的，比如手机有内存，衣服有尺码没有内存，我们是全品类的电商网站，这些不同的商品的不同属性，如何设计到一张表中？

其实颜色、内存、硬盘属性都是规格参数中的字段。所以，要解决这个问题，首先要能清楚规格参数。



#### 分析规格参数

仔细查看每一种商品的规格你会发现：

虽然商品规格千变万化，但是同一类商品（如手机）的规格是统一的，有图为证：

> 华为的规格：

![](https://img-blog.csdnimg.cn/20200419171444430.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

> 三星的规格：

![](https://img-blog.csdnimg.cn/20200419171501496.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### SKU的特有属性

SPU中会有一些特殊属性，用来区分不同的SKU，我们称为SKU特有属性。如华为META10的颜色、内存属性。

不同种类的商品，一个手机，一个衣服，其SKU属性不相同。

同一种类的商品，比如都是衣服，SKU属性基本是一样的，都是颜色、尺码等。

这样说起来，似乎SKU的特有属性也是与分类相关的？事实上，仔细观察你会发现，**SKU的特有属性是商品规格参数的一部分**：

![](https://img-blog.csdnimg.cn/20200419171535980.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

也就是说，我们没必要单独对SKU的特有属性进行设计，它可以看做是规格参数中的一部分。这样规格参数中的属性可以标记成两部分：

- spu下所有sku共享的规格属性（称为全局属性）
- 每个sku不同的规格属性（称为特有属性）



#### 搜素属性

打开一个搜索页，我们来看看过滤的条件：

![](https://img-blog.csdnimg.cn/20200419171558983.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

你会发现，过滤条件中的屏幕尺寸、运行内存、网路、机身内存、电池容量、CPU核数等，在规格参数中都能找到：

![](https://img-blog.csdnimg.cn/20200419171617560.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

也就是说，规格参数中的数据，将来会有一部分作为搜索条件来使用。我们可以在设计时，将这部分属性标记出来，将来做搜索的时候，作为过滤条件。要注意的是，无论是SPU的全局属性，还是SKU的特有属性，都有可能作为搜索过滤条件的，并不冲突，而是有一个交集：

![](https://img-blog.csdnimg.cn/20200419171633511.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 规格参数表

#### 表结构

我们看下规格参数的格式：

![](https://img-blog.csdnimg.cn/20200419171651714.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以看到规格参数是分组的，每一组都有多个参数键值对。不过对于规格参数的模板而言，其值现在是不确定的，不同的商品值肯定不同，模板中只要保存组信息、组内参数信息即可。

因此我们设计了两张表：

- tb_spec_group：组，与商品分类关联

- tb_spec_param：参数名，与组关联，一对多

  

#### 规格表

规格参数分组表：tb_spec_group

```mysql
CREATE TABLE `tb_spec_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cid` bigint(20) NOT NULL COMMENT '商品分类id，一个分类下有多个规格组',
  `name` varchar(50) NOT NULL COMMENT '规格组的名称',
  PRIMARY KEY (`id`),
  KEY `key_category` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='规格参数的分组表，每个商品分类下有多个规格参数组';
```



![](https://img-blog.csdnimg.cn/20200419171728162.png)

规格组有3个字段：

- id：主键
- cid：商品分类id，一个分类下有多个模板
- name：该规格组的名称。



#### 规格参数

规格参数表：tb_spec_param

```mysql
CREATE TABLE `tb_spec_param` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cid` bigint(20) NOT NULL COMMENT '商品分类id',
  `group_id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL COMMENT '参数名',
  `numeric` tinyint(1) NOT NULL COMMENT '是否是数字类型参数，true或false',
  `unit` varchar(255) DEFAULT '' COMMENT '数字类型参数的单位，非数字类型可以为空',
  `generic` tinyint(1) NOT NULL COMMENT '是否是sku通用属性，true或false',
  `searching` tinyint(1) NOT NULL COMMENT '是否用于搜索过滤，true或false',
  `segments` varchar(1000) DEFAULT '' COMMENT '数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0',
  PRIMARY KEY (`id`),
  KEY `key_group` (`group_id`),
  KEY `key_category` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='规格参数组下的参数名';
```

![](https://img-blog.csdnimg.cn/20200419171853838.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

按道理来说，我们的规格参数就只需要记录参数名、组id、商品分类id即可。但是这里却多出了很多字段，为什么？

还记得我们之前的分析吧，规格参数中有一部分是 SKU的通用属性，一部分是SKU的特有属性，而且其中会有一些将来用作搜索过滤，这些信息都需要标记出来。

> 通用属性

用一个布尔类型字段来标记是否为通用：

- generic来标记是否为通用属性：
  - true：代表通用属性
  - false：代表sku特有属性

> 搜索过滤

与搜索相关的有两个字段：

- searching：标记是否用作过滤
  - true：用于过滤搜索
  - false：不用于过滤
- segments：某些数值类型的参数，在搜索时需要按区间划分，这里提前确定好划分区间
  - 比如电池容量，0~~2000mAh，2000mAh~~3000mAh，3000mAh~4000mAh

> 数值类型

某些规格参数可能为数值类型，这样的数据才需要划分区间，我们有两个字段来描述：

- numberic：是否为数值类型
  - true：数值类型
  - false：不是数值类型
- unit：参数的单位



### 商品规格参数管理

####  整体布局

打开规格参数页面，看到如下内容：

![](https://img-blog.csdnimg.cn/20200419171911155.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

商品分类树我们之前已经做过，所以这里可以直接展示出来。

因为规格是跟商品分类绑定的，因此首先会展现商品分类树，并且提示你要选择商品分类，才能看到规格参数的模板。一起了解下页面的实现：

![](https://img-blog.csdnimg.cn/20200419172012289.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

页面结构：

![](https://img-blog.csdnimg.cn/20200419172028702.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这里使用了`v-layout`来完成页面布局，并且添加了row属性，代表接下来的内容是行布局（左右）。

可以看出页面分成2个部分：

- `<v-flex xs3>`：左侧，内部又分上下两部分：商品分类树及标题
  - `v-card-title`：标题部分，这里是提示信息，告诉用户要先选择分类，才能看到模板
  - `v-tree`：这里用到的是我们之前讲过的树组件，展示商品分类树，
- `<v-flex xs9 class="px-1">`：右侧：内部是规格参数展示



#### 右侧规格

当我们点击一个分类时，最终要达到的效果：

![](https://img-blog.csdnimg.cn/20200419172124584.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以看到右侧分为上下两部分：

- 上部：面包屑，显示当前选中的分类
- 下部：table，显示规格参数信息

页面实现：

![](https://img-blog.csdnimg.cn/20200419172146592.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以看到右侧并不是我们熟悉的 `v-data-table`，而是一个`spec-group`组件（规格组）和`spec-param`组件（规格参数），这是我们定义的独立组件：

![](https://img-blog.csdnimg.cn/20200419172202781.png)

在SpecGroup中定义了表格：

![](https://img-blog.csdnimg.cn/20200419172225736.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



###  规格组的查询

#### 树节点的点击事件

当我们点击树节点时，要将`v-dialog`打开，因此必须绑定一个点击事件：（Specification.vue）

![](https://img-blog.csdnimg.cn/20200419172250852.png)

我们来看下`handleClick`方法：（Specification.vue）

![](https://img-blog.csdnimg.cn/2020041917231286.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

点击事件发生时，发生了两件事：

- 记录当前选中的节点，选中的就是商品分类
- `showGroup`被置为true，则规格组就会显示了。

同时，我们把被选中的节点（商品分类）的id传递给了`SpecGroup`组件：（Specification.vue）

![](https://img-blog.csdnimg.cn/2020041917233074.png)



#### 页面查询规格组

来看下`SpecGroup.vue`中的实现：

![](https://img-blog.csdnimg.cn/20200419172352119.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们查看页面控制台，可以看到请求已经发出

![](https://img-blog.csdnimg.cn/20200419172407559.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 后端代码

> 实体类

在`leyou-item-interface`中添加实体类：

![](https://img-blog.csdnimg.cn/20200419172501368.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

内容：

```java
package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import java.util.List;

@Data
public class SpecGroup {
    @TableId
    private Long id;
    private Long cid;
    private String name;
    @TableField(exist = false)
    private List<SpecParam> params;
}
```



```java
package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SpecParam {
    @TableId
    private Long id;
    private Long cid;
    private Long groupId;
    private String name;
    @TableField(value="`numeric`") //在mysql中是关键字
    private Boolean numeric;
    private String unit;
    private Boolean generic;
    private Boolean searching;
    private String segments;
}
```



在`leyou-item-service`中编写业务：

![](https://img-blog.csdnimg.cn/20200419172647659.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



> Controller

先分析下需要的东西，在页面的ajax请求中可以看出：

- 请求方式：get
- 请求路径：/spec/groups/{cid} ，这里通过路径占位符传递商品分类的id
- 请求参数：商品分类id
- 返回结果：页面是直接把`resp.data`赋值给了groups：

```java
package top.codekiller.leyou.controller;

import com.mysql.fabric.xmlrpc.base.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import top.codekiller.leyou.pojo.SpecGroup;
import top.codekiller.leyou.pojo.SpecParam;
import top.codekiller.leyou.service.impl.SpecificationService;

import java.util.List;

@RestController
@RequestMapping("spec")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    /**
     * 根据分类id查询参数组
     * @param cid
     * @return
     */
    @GetMapping("groups/{cid}")
    public ResponseEntity<List<SpecGroup>> querySpecGroupsByCid(@PathVariable("cid") Long cid){
        List<SpecGroup> groups=this.specificationService.queryGroupByCid(cid);
        if(CollectionUtils.isEmpty(groups)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(groups);

    }
}

```





> mapper

```java
public interface SpecGroupMapper extends BaseMapper<SpecGroup> {
}
```



#### 页面访问测试

目前，我们数据库只为手机分类（76）提供了规格组：

![](https://img-blog.csdnimg.cn/20200419173806125.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



![](https://img-blog.csdnimg.cn/20200419173844752.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





###  规格参数查询

#### 表格切换

当我们点击规格组，会切换到规格参数显示，肯定是在规格组中绑定了点击事件：

![](https://img-blog.csdnimg.cn/2020041917391136.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们看下事件处理：

![](https://img-blog.csdnimg.cn/20200419173929896.png)

可以看到这里是使用了父子通信，子组件触发了select事件：

再来看下父组件的事件绑定：

![](https://img-blog.csdnimg.cn/20200419173945137.png)

事件处理：

![](https://img-blog.csdnimg.cn/20200419174001419.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



这里我们记录了选中的分组，并且把标记设置为false，这样规格组就不显示了，而是显示：`SpecParam`

并且，我们把group也传递到`spec-param`组件：

![](https://img-blog.csdnimg.cn/20200419184636807.png)





#### 页面查询规格参数

我们来看`SpecParam.vue`的实现：

![](https://img-blog.csdnimg.cn/20200419184715642.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

查看页面控制台，发现请求已经发出：	![](https://img-blog.csdnimg.cn/20200419184736940.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





报404，因为我们还没有实现后台逻辑，接下来就去实现。



#### 后台实现

> SpecificationController

分析：

- 请求方式：GET
- 请求路径：/spec/params
- 请求参数：gid，分组id
- 返回结果：该分组下的规格参数集合`List`

代码：

```java
package top.codekiller.leyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import top.codekiller.leyou.pojo.SpecGroup;
import top.codekiller.leyou.pojo.SpecParam;
import top.codekiller.leyou.service.impl.SpecificationService;
import java.util.List;

@RestController
@RequestMapping("spec")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    /**
     * 根据分类id查询参数组
     * @param cid
     * @return
     */
    @GetMapping("groups/{cid}")
    public ResponseEntity<List<SpecGroup>> querySpecGroupsByCid(@PathVariable("cid") Long cid){
        List<SpecGroup> groups=this.specificationService.queryGroupByCid(cid);
        if(CollectionUtils.isEmpty(groups)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(groups);

    }

    /**
     * 根据组id查询组的参数
     */
    @GetMapping("params")
    public ResponseEntity<List<SpecParam>> queryParams(@RequestParam("gid")Integer gid){
        List<SpecParam> params=this.specificationService.queryParams(gid);
        if(CollectionUtils.isEmpty(params)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(params);
    }
}

```



> Service



```java
package top.codekiller.leyou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.codekiller.leyou.mapper.SpecGroupMapper;
import top.codekiller.leyou.mapper.SpecParamMapper;
import top.codekiller.leyou.pojo.SpecGroup;
import top.codekiller.leyou.pojo.SpecParam;
import top.codekiller.leyou.service.ISpecificationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpecificationService implements ISpecificationService {
    @Autowired
    private SpecGroupMapper specGroupMapper;

    @Autowired
    private SpecParamMapper specParamMapper;


    /**
     * 根据分类id查询参数组
     * @param cid
     * @return
     */
    @Override
    public List<SpecGroup> queryGroupByCid(Long cid) {
        Map<String,Object> map=new HashMap<>();
        map.put("cid",cid);
        return specGroupMapper.selectByMap(map);
    }


    /**
     * 根据组id查询组参数
     * @param gid
     * @return
     */
    @Override
    public List<SpecParam> queryParams(Integer gid) {
        List<SpecParam> params=this.specParamMapper.selectList(new QueryWrapper<SpecParam>().lambda()
                                                                .eq(SpecParam::getGroupId,gid));
        return params;
    }
}
```





> Mapper

```java
public interface SpecParamMapper extends BaseMapper<SpecParam> {
}
```





### 增、删、改

> TODO 时间有限没做

页面中接口都已定义，要做的就是实现后台接口。





### SPU和SKU数据结构

规格确定以后，就可以添加商品了,先看下数据库表

#### SPU表

SPU表：

```mysql
CREATE TABLE `tb_spu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'spu id',
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
  `sub_title` varchar(255) DEFAULT '' COMMENT '子标题',
  `cid1` bigint(20) NOT NULL COMMENT '1级类目id',
  `cid2` bigint(20) NOT NULL COMMENT '2级类目id',
  `cid3` bigint(20) NOT NULL COMMENT '3级类目id',
  `brand_id` bigint(20) NOT NULL COMMENT '商品所属品牌id',
  `saleable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否上架，0下架，1上架',
  `valid` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效，0已删除，1有效',
  `create_time` datetime DEFAULT NULL COMMENT '添加时间',
  `last_update_time` datetime DEFAULT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=208 DEFAULT CHARSET=utf8 COMMENT='spu表，该表描述的是一个抽象的商品，比如 iphone8';
```



![](https://img-blog.csdnimg.cn/20200419223218188.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



与我们前面分析的基本类似，但是似乎少了一些字段，比如商品描述。

我们做了表的垂直拆分，将SPU的详情放到了另一张表：tb_spu_detail

```mysql
CREATE TABLE `tb_spu_detail` (
  `spu_id` bigint(20) NOT NULL,
  `description` text COMMENT '商品描述信息',
  `generic_spec` varchar(10000) NOT NULL DEFAULT '' COMMENT '通用规格参数数据',
  `special_spec` varchar(1000) NOT NULL COMMENT '特有规格参数及可选值信息，json格式',
  `packing_list` varchar(3000) DEFAULT '' COMMENT '包装清单',
  `after_service` varchar(3000) DEFAULT '' COMMENT '售后服务',
  PRIMARY KEY (`spu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

![](https://img-blog.csdnimg.cn/20200419223314338.png)

这张表中的数据都比较大，为了不影响主表的查询效率我们拆分出这张表。

需要注意的是这两个字段：generic_spec和special_spec。

前面讲过规格参数与商品分类绑定，一个分类下的所有SPU具有类似的规格参数。SPU下的SKU可能会有不同的规格参数信息，因此我们计划是这样：

- SPUDetail中保存通用的规格参数信息。
- SKU中保存特有规格参数。

来看下我们的表如何存储这些信息。



##### generic_spec字段

首先是`generic_spec`，其中保存通用规格参数信息的值，这里为了方便查询，使用了json格式：

> 整体来看：

![](https://img-blog.csdnimg.cn/20200419223500762.png)



json结构，其中都是键值对：

- key：对应的规格参数的`spec_param`的id
- value：对应规格参数的值





##### special_spec

我们说spu中只保存通用规格参数，那么为什么有多出了一个`special_spec`字段呢？

以手机为例，品牌、操作系统等肯定是全局通用属性，内存、颜色等肯定是特有属性。

当你确定了一个SPU，比如小米的：红米4X

全局属性值都是固定的了：

>品牌：小米
>型号：红米4X

特有属性举例：

>颜色：[香槟金, 樱花粉, 磨砂黑]
>内存：[2G, 3G]
>机身存储：[16GB, 32GB]

颜色、内存、机身存储，作为SKU特有属性，key虽然一样，但是SPU下的每一个SKU，其值都不一样，所以值会有很多，形成数组。

我们在SPU中，会把特有属性的所有值都记录下来，形成一个数组：

里面又有哪些内容呢？

来看数据格式：

![](https://img-blog.csdnimg.cn/2020041922354872.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



也是json结构：

- key：规格参数id
- value：spu属性的数组

那么问题来：特有规格参数应该在sku中记录才对，为什么在spu中也要记录一份？

因为我们有时候需要把所有规格参数都查询出来，而不是只查询1个sku的属性。比如，商品详情页展示可选的规格参数时：

![](https://img-blog.csdnimg.cn/20200419223609175.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### SKU表

```mysql
CREATE TABLE `tb_sku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'sku id',
  `spu_id` bigint(20) NOT NULL COMMENT 'spu id',
  `title` varchar(255) NOT NULL COMMENT '商品标题',
  `images` varchar(1000) DEFAULT '' COMMENT '商品的图片，多个图片以‘,’分割',
  `price` bigint(15) NOT NULL DEFAULT '0' COMMENT '销售价格，单位为分',
  `indexes` varchar(100) COMMENT '特有规格属性在spu属性模板中的对应下标组合',
  `own_spec` varchar(1000) COMMENT 'sku的特有规格参数，json格式',
  `enable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有效，0无效，1有效',
  `create_time` datetime NOT NULL COMMENT '添加时间',
  `last_update_time` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `key_spu_id` (`spu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='sku表,该表表示具体的商品实体,如黑色的64GB的iphone 8';
```

![](https://img-blog.csdnimg.cn/20200419223735480.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



还有一张表，代表库存：

```mysql
CREATE TABLE `tb_stock` (
  `sku_id` bigint(20) NOT NULL COMMENT '库存对应的商品sku id',
  `seckill_stock` int(9) DEFAULT '0' COMMENT '可秒杀库存',
  `seckill_total` int(9) DEFAULT '0' COMMENT '秒杀总数量',
  `stock` int(9) NOT NULL COMMENT '库存数量',
  PRIMARY KEY (`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库存表，代表库存，秒杀库存等信息';
```



![](https://img-blog.csdnimg.cn/20200419224939958.png)

问题：为什么要将库存独立一张表？

因为库存字段写频率较高，而SKU的其它字段以读为主，因此我们将两张表分离，读写不会干扰。

特别需要注意的是sku表中的`indexes`字段和`own_spec`字段。sku中应该保存特有规格参数的值，就在这两个字段中。



##### indexex字段

在SPU表中，已经对特有规格参数及可选项进行了保存，结构如下：

```jso
{
    "4": [
        "香槟金",
        "樱花粉",
        "磨砂黑"
    ],
    "12": [
        "2GB",
        "3GB"
    ],
    "13": [
        "16GB",
        "32GB"
    ]
}
```

这些特有属性如果排列组合，会产生12个不同的SKU，而不同的SKU，其属性就是上面备选项中的一个。

比如：

- 红米4X，香槟金，2GB内存，16GB存储
- 红米4X，磨砂黑，2GB内存，32GB存储

你会发现，每一个属性值，对应于SPUoptions数组的一个选项，如果我们记录下角标，就是这样：

- 红米4X，0,0,0
- 红米4X，2,0,1

既然如此，我们是不是可以将不同角标串联起来，作为SPU下不同SKU的标示。这就是我们的indexes字段。

![](https://img-blog.csdnimg.cn/20200419225116557.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这个设计在商品详情页会特别有用：

![](https://img-blog.csdnimg.cn/20200419225147980.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





当用户点击选中一个特有属性，你就能根据 角标快速定位到sku。



##### own——spec字段

看结构：

```json
{"4":"香槟金","12":"2GB","13":"16GB"}Copy to clipboardErrorCopied
```

保存的是特有属性的键值对。

SPU中保存的是可选项，但不确定具体的值，而SKU中的保存的就是具体的值。



### 导入图片信息

> [图片下载](https://www.lanzous.com/i7vc6ub)

现在商品表中虽然有数据，但是所有的图片信息都是无法访问的，我们需要把图片导入到安装fastdfs的虚拟机上：

1. 创建static文件夹

   ```shell
   mkdir static
   ```

2. 接着将图片压缩包上传到static文件下后解压

```
# 如果没安装unzip先安装
yum install unzip

unzip images.zipCopy to clipboardErrorCopied
```

3. 修改Nginx配置，使nginx反向代理这些图片地址：

```shell
vim /opt/nginx/conf/nginx.confCopy to clipboardErrorCopied
```

4. 修改成如下配置：

```nginx
server {
    listen       80;
    server_name  image.leyou.com;

    # 监听域名中带有group的，交给FastDFS模块处理
    location ~/group([0-9])/ {
        ngx_fastdfs_module;
    }
    # 将其它图片代理指向本地的/leyou/static目录
    location / {
        root   /leyou/static/;
    }

    error_page   500 502 503 504  /50x.html;
    location = /50x.html {
        root   html;
    }

}Copy to clipboardErrorCopied
```

5. 不要忘记重新加载nginx配置

```shell
nginx -s reloadCopy to clipboardErrorCopied
```

6. 访问测试

http://image.leyou.com/images/6/8/1524297350205.jpg



### 商品请求

#### 页面请求

先看整体页面结构（Goods.vue）：

![](https://img-blog.csdnimg.cn/20200419225740443.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



并且在Vue实例挂载后就会发起查询(mounted调用getDataFromServer方法初始化数据)：

![](https://img-blog.csdnimg.cn/20200419225755487.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们刷新页面，可以看到浏览器发起已经发起了查询商品数据的请求，但是却发现发起了两次请求：

![](https://img-blog.csdnimg.cn/20200419225841568.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



> 发起两次请求的原因

![](https://img-blog.csdnimg.cn/20200419225941152.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以看到页面有两处地方会导致发送请求，一个是在页面渲染之后的钩子函数中，另一个是在监听分页信息的函数中，因为在初始化的时候vue会给`pagination`赋值一些初始化数据，而监听函数监听到之后就会调用发送请求的方法，所以我们只需要监听函数即可，钩子函数就不需要了



#### 后端代码

页面已经准备好，接下来在后台提供分页查询SPU的功能。

先来看一下页面需要哪些数据

![](https://img-blog.csdnimg.cn/20200419230206888.png)

`id` 和 `title`分别对应商品id和商品标题，这两个字段在spu表中都有，也就在实体类中也有

但是`cname`和`bname`是分类名称和品牌名称，spu表中只有1-3级分类的id和品牌id，实体类也就没有这两个字段，而由不能直接修改实体类，所以需要新建一个bo类去继承spu实体类扩展属性字段

![](https://img-blog.csdnimg.cn/20200419230306678.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



![](https://img-blog.csdnimg.cn/20200419230452446.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



##### 实体类

在leyou-item-interface工程中添加实体类：

Spu:

```java
package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.util.Date;

@Data
public class Spu {
    @TableId
    private Long id;
    private Long brandId;
    private Long cid1;// 1级类目
    private Long cid2;// 2级类目
    private Long cid3;// 3级类目
    private String title;// 标题
    private String subTitle;// 子标题
    private Boolean saleable;// 是否上架
    private Boolean valid;// 是否有效，逻辑删除用
    private Date createTime;// 创建时间
    private Date lastUpdateTime;// 最后修改时间
}
```



SpuDetails:

```java
package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SpuDetail {
    @TableId
    private Long spuId;// 对应的SPU的id
    private String description;// 商品描述
    private String specialSpec;// 商品特殊规格的名称及可选值模板
    private String genericSpec;// 商品的全局规格属性
    private String packingList;// 包装清单
    private String afterService;// 售后服务
}
```



SpuBo:

```java
package top.codekiller.leyou.pojo.bo;

import lombok.Data;
import top.codekiller.leyou.pojo.Spu;

@Data
public class SpuBo extends Spu {
    /**
     * 通过cid获取分类id
     */
    private String cname;
    /**
     * 通过bid获取品牌id
     */
    private String bname;
}
```



##### Controller

先分析：

- 请求方式：GET
- 请求路径：/spu/page
- 请求参数：
  - page：当前页
  - rows：每页大小
  - key：过滤条件
  - saleable：上架或下架
- 返回结果：商品SPU的分页信息。

编写controller代码：

我们把与商品相关的一切业务接口都放到一起，起名为GoodsController，业务层也是这样

```java
package top.codekiller.leyou.controller;

import com.leyou.common.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.codekiller.leyou.pojo.bo.SpuBo;
import top.codekiller.leyou.service.IGoodsService;

@RestController
public class GoodsController {
    @Autowired
    IGoodsService goodsService;

    @GetMapping("spu/page")
    public ResponseEntity<PageResult<SpuBo>> querySpuByPage(@RequestParam(value="key",required = false) String key,
                                                            @RequestParam(value="saleable",required = false) Boolean saleable,
                                                            @RequestParam(value="page",defaultValue = "1") Integer page,
                                                            @RequestParam(value="rows",defaultValue = "5") Integer rows){
        PageResult<SpuBo> result=this.goodsService.querySpuByPage(key,saleable,page,rows);
        if(result==null|| CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);

    }
}

```



##### Service

所有商品相关的业务（包括SPU和SKU）放到一个业务下：GoodsService。

```java
package top.codekiller.leyou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leyou.common.pojo.PageResult;
import com.netflix.discovery.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import top.codekiller.leyou.mapper.BrandMapper;
import top.codekiller.leyou.mapper.CategoryMapper;
import top.codekiller.leyou.mapper.SpuDetailMapper;
import top.codekiller.leyou.mapper.SpuMapper;
import top.codekiller.leyou.pojo.Brand;
import top.codekiller.leyou.pojo.Category;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.pojo.bo.SpuBo;
import top.codekiller.leyou.service.IGoodsService;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoodsService implements IGoodsService {

    @Autowired
    private SpuMapper spuMapper;

    @Autowired
    private SpuDetailMapper spuDetailMapper;

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据条件来分页查询Spu
     * @param key 关键字
     * @param saleable 是否上架
     * @param page 查询的页码
     * @param rows 当前页的数据量
     * @return
     */
    @Override
    public PageResult<SpuBo> querySpuByPage(String key, Boolean saleable, Integer page, Integer rows) {
        LambdaQueryWrapper<Spu> queryWrapper=new QueryWrapper<Spu>().lambda();
        //添加查询条件
        if(StringUtils.isNotBlank(key)){
            queryWrapper.like(Spu::getTitle,key);
        }
        //添加上下架的过滤
        if(saleable!=null) {
            queryWrapper.eq(Spu::getSaleable, saleable);
        }
        //进行分页查询,获取当前页对象
        IPage<Spu> ipage=spuMapper.selectPage(new Page<Spu>(page,rows),queryWrapper);
        //获取spu集合
        List<Spu> spus=ipage.getRecords();
        //转化成spubo的集合
        List<SpuBo> spuBos=spus.stream().map(spu->{
            SpuBo spuBo = new SpuBo();
            BeanUtils.copyProperties(spu,spuBo);
            //查询品牌名称
            Brand brand=this.brandMapper.selectById(spu.getBrandId());
            spuBo.setBname(brand.getName());
            //查询分类名称
            List<String> categoryNames=this.categoryService.queryNamesByIds(Arrays.asList(spu.getCid1(),spu.getCid2(),spu.getCid3()));
            String cname=StringUtils.join(categoryNames,"-");
            spuBo.setCname(cname);
            return spuBo;
        }).collect(Collectors.toList());
        //返回pageResult<SpuBo>
        PageResult<SpuBo> pageResult=new PageResult<SpuBo>(ipage.getTotal(),(int)ipage.getPages(),spuBos);
        return pageResult;
    }
}
```



##### CategoryService中扩展查询名称的功能

页面需要商品的分类名称需要在这里查询，因此要额外提供查询分类名称的功能，

在CategoryService中添加功能：

```java
package top.codekiller.leyou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.codekiller.leyou.mapper.CategoryMapper;
import top.codekiller.leyou.pojo.Category;
import top.codekiller.leyou.service.ICategoryService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        return this.categoryMapper.selectList(new QueryWrapper<Category>().lambda()
                                        .eq(Category::getParentId,pid));
    }


    /**
     * 根据id查询分类名称
     * @param ids
     * @return
     */
    @Override
    public List<String> queryNamesByIds(List<Long> ids) {
        List<Category> categories=this.categoryMapper.selectBatchIds(ids);
        return categories.stream().map(category -> category.getName()).collect(Collectors.toList());
    }
}

```



##### Mapper

```java
public interface SpuMapper extends BaseMapper<Spu> {
}
```

```java
public interface SpuDetailMapper extends BaseMapper<SpuDetail> {
}
```



#### 测试

![](https://img-blog.csdnimg.cn/20200419231155952.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







##  ![在这里插入图片描述](https://img-blog.csdnimg.cn/20200424233908702.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)商品管理

### 商品新增

当我们点击新增商品按钮就会出现一个弹窗：

![](https://img-blog.csdnimg.cn/20200420153144353.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



里面把商品的数据分为了4部分来填写：

- 基本信息：主要是一些简单的文本数据，包含了SPU和SpuDetail的部分数据，如
  - 商品分类：是SPU中的`cid1`，`cid2`，`cid3`属性
  - 品牌：是spu中的`brandId`属性
  - 标题：是spu中的`title`属性
  - 子标题：是spu中的`subTitle`属性
  - 售后服务：是SpuDetail中的`afterService`属性
  - 包装列表：是SpuDetail中的`packingList`属性
- 商品描述：是SpuDetail中的`description`属性，数据较多，所以单独放一个页面
- 规格参数：商品规格信息，对应SpuDetail中的`genericSpec`属性
- SKU属性：spu下的所有Sku信息

对应到页面中的四个`stepper-content`：

![](https://img-blog.csdnimg.cn/20200420153206198.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 弹窗事件

弹窗是一个独立组件：

![](https://img-blog.csdnimg.cn/20200420153233337.png)

并且在Goods组件中已经引用它：

![](https://img-blog.csdnimg.cn/20200420153248943.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

并且在页面中渲染：

![](https://img-blog.csdnimg.cn/20200420153308626.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

在`新增商品`按钮的点击事件中，改变这个`dialog`的`show`属性：

![](https://img-blog.csdnimg.cn/20200420153329659.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



![](https://img-blog.csdnimg.cn/20200420153341303.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 基本数据

我们先来看下基本数据：

![](https://img-blog.csdnimg.cn/20200420153359991.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 商品分类

商品分类信息查询我们之前已经做过，所以这里的级联选框已经实现完成：

![](https://img-blog.csdnimg.cn/20200420153420881.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

刷新页面，可以看到请求已经发出：

![](https://img-blog.csdnimg.cn/20200420153438539.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200420153449889.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

效果：

![](https://img-blog.csdnimg.cn/20200420153506286.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 品牌选择

##### 页面

品牌也是一个下拉选框，不过其选项是不确定的，只有当用户选择了商品分类，才会把这个分类下的所有品牌展示出来。

所以页面编写了watch函数，监控商品分类的变化，每当商品分类值有变化，就会发起请求，查询品牌列表：

![](https://img-blog.csdnimg.cn/20200420153526344.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

选择商品分类后，可以看到请求发起：![](https://img-blog.csdnimg.cn/20200420153540772.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





接下来，我们只要编写后台接口，根据商品分类id，查询对应品牌即可。



##### 后端代码



页面需要去后台查询品牌信息，我们自然需要提供：

请求方式：GET

请求路径：/brand/cid/{cid}

请求参数：cid

响应数据：品牌集合

> <strong style="font-size: 23px">BrandController</strong>

```java
/**
     * 通过分类id获取对应的品牌集合
     * @param cid
     * @return
     */
    @GetMapping("cid/{cid}")
    public ResponseEntity<List<Brand>> queryBrandsByCid(@PathVariable("cid") Long cid){
        List<Brand> brands=this.brandService.queryBrandByCid(cid);
        if(CollectionUtils.isEmpty(brands)){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(brands);
    }
```



> <strong style="font-size: 23px">IBrandService</strong>

```java
    /**
     * 通过分类id获取对应的品牌集合
     * @param cid category.id
     * @return
     */
    List<Brand> queryBrandByCid(Long cid);
```



> <strong style="font-size: 23px">BrandService</strong>

```java
/**
     * 通过分类id获取对应的品牌集合
     * @param cid category.id
     * @return
     */
    @Override
    public List<Brand> queryBrandByCid(Long cid) {
        return this.brandMapper.selectBrandByCid(cid);

    }
```



> <strong style="font-size: 23px">BrandMapper</strong>

根据分类查询品牌有中间表，需要自己编写Sql：

```java
     /**
     * 通过分类id获取品牌集合
     * @param cid
     * @return
     */
    @Select("select * from tb_brand  a inner join  tb_category_brand b on a.id=b.brand_id where b.category_id=#{cid}")
    List<Brand> selectBrandByCid(Long cid);
```

效果：

![](https://img-blog.csdnimg.cn/20200420154910385.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 其他文本框

剩余的几个属性：标题、子标题等都是普通文本框，我们直接填写即可，没有需要特别注意的。

![](https://img-blog.csdnimg.cn/20200420154939591.png)



### 商品描述

商品描述信息比较复杂，而且图文并茂，甚至包括视频。

这样的内容，一般都会使用富文本编辑器。





#### 富文本编辑器

百度百科：

![](https://img-blog.csdnimg.cn/202004201823348.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





通俗来说：富文本，就是比较丰富的文本编辑器。普通的框只能输入文字，而富文本还能给文字加颜色样式等。

富文本编辑器有很多，例如：KindEditor、Ueditor。但并不原生支持vue

但是我们今天要说的，是一款支持Vue的富文本编辑器：`vue-quill-editor`



##### vue-quill-editor

GitHub的主页：https://github.com/surmon-china/vue-quill-editor

Vue-Quill-Editor是一个基于Quill的富文本编辑器：[Quill的官网](https://quilljs.com/)

![](https://img-blog.csdnimg.cn/20200420182418100.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



##### 使用指南

使用非常简单：已经在项目中集成。以下步骤不需操作，仅供参考

第一步：安装，使用npm命令：

```shell
npm install vue-quill-editor --save
```

第二步：加载，在js中引入：

全局引入：

```js
import Vue from 'vue'
import VueQuillEditor from 'vue-quill-editor'

const options = {}; /* { default global options } */

Vue.use(VueQuillEditor, options); // options可选
```

局部引入：

```js
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'

import {quillEditor} from 'vue-quill-editor'

var vm = new Vue({
    components:{
        quillEditor
    }
})
```

我们这里采用局部引用：

![](https://img-blog.csdnimg.cn/20200420182514615.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



第三步：页面使用：

```html
<quill-editor v-model="goods.spuDetail.description" :options="editorOption"/>
```





#### 自定义富文本编辑器

不过这个组件有个小问题，就是图片上传的无法直接上传到后台，因此我们对其进行了封装，支持了图片的上传。

![](https://img-blog.csdnimg.cn/20200420182605118.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



使用也非常简单：

```html
<v-stepper-content step="2">
    <v-editor v-model="goods.spuDetail.description" upload-url="/upload/image"/>
</v-stepper-content>
```

- upload-url：是图片上传的路径
- v-model：双向绑定，将富文本编辑器的内容绑定到goods.spuDetail.description





#### 效果

![](https://img-blog.csdnimg.cn/20200420182712944.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 商品规格参数(SPU)

规格参数的查询我们之前也已经编写过接口，因为商品规格参数也是与商品分类绑定，所以需要在商品分类变化后去查询，我们也是通过watch监控来实现：

![](https://img-blog.csdnimg.cn/20200420182850651.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





可以看到这里是根据商品分类id查询规格参数：SpecParam。我们之前写过一个根据gid（分组id）来查询规格参数的接口，我们接下来完成根据分类id查询规格参数。



#### Controller

我们在原来的根据 gid（规格组id)查询规格参数的接口上，添加一个参数：cid，即商品分类id。

等一下， 考虑到以后可能还会根据是否搜索、是否为通用属性等条件过滤，我们多添加几个过滤条件：

```java
     /**
     * 根据条件查询规格参数
     * @param cid 分类id
     * @param gid 组id
     * @param generic 是否是通用参数
     * @param searching 是否是特殊参数
     * @return
     */
@GetMapping("params")
public ResponseEntity<List<SpecParam>> queryParams(@RequestParam(value = "gid",required = false)Long gid,
                                                   @RequestParam(value = "cid",required = false)Long cid,
                                                   @RequestParam(value = "generic",required = false) Boolean generic,
                                                   @RequestParam(value="searching",required = false) Boolean searching){
    List<SpecParam> params=this.specificationService.queryParams(gid,cid,generic,searching);
    System.out.println(params);
    if(CollectionUtils.isEmpty(params)){
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(params);
}
```





#### Service

```java
    /**
     * 根据条件查询规格参数
     * @param cid 分类id
     * @param gid 组id
     * @param generic 是否是通用参数
     * @param searching 是否是特殊参数
     * @return
     */
    @Override
    public List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching) {
        SpecParam params=new SpecParam();
        params.setCid(cid);
        params.setGroupId(gid);
        params.setGeneric(generic);
        params.setSearching(searching);
        return specParamMapper.selectList(new QueryWrapper<SpecParam>(params));
    }
```



#### 页面

![](https://img-blog.csdnimg.cn/20200420183604450.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







### SKU信息

Sku属性是SPU下的每个商品的不同特征，如图：

![](https://img-blog.csdnimg.cn/20200420183651314.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



当我们填写一些属性后，会在页面下方生成一个sku表格，大家可以计算下会生成多少个不同属性的Sku呢？

当你选择了上图中的这些选项时：

- 颜色共2种：迷夜黑，勃艮第红，绚丽蓝
- 内存共2种：4GB，6GB
- 机身存储1种：64GB，128GB

此时会产生多少种SKU呢？ 应该是 3 * 2 * 2 = 12种，这其实就是在求笛卡尔积。

我们会在页面下方生成一个sku的表格：

![](https://img-blog.csdnimg.cn/20200420183711500.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 表单提交

在sku列表的下方，有一个提交按钮

![](https://img-blog.csdnimg.cn/20200420183740973.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



并且绑定了事件

![](https://img-blog.csdnimg.cn/20200420183755259.png)





击后会组织数据并向后台提交：

```js
    submit() {
      // 表单校验。
      if(!this.$refs.basic.validate){
        this.$message.error("请先完成表单内容！");
      }
      // 先处理goods，用结构表达式接收,除了categories外，都接收到goodsParams中
      const {
        categories: [{ id: cid1 }, { id: cid2 }, { id: cid3 }],
        ...goodsParams
      } = this.goods;
      // 处理规格参数
      const specs = {};
      this.specs.forEach(({ id,v }) => {
        specs[id] = v;
      });
      // 处理特有规格参数模板
      const specTemplate = {};
      this.specialSpecs.forEach(({ id, options }) => {
        specTemplate[id] = options;
      });
      // 处理sku
      const skus = this.skus
        .filter(s => s.enable)
        .map(({ price, stock, enable, images, indexes, ...rest }) => {
          // 标题，在spu的title基础上，拼接特有规格属性值
          const title = goodsParams.title + " " + Object.values(rest).map(v => v.v).join(" ");
          const obj = {};
          Object.values(rest).forEach(v => {
            obj[v.id] = v.v;
          });
          return {
            price: this.$format(price), // 价格需要格式化
            stock,
            indexes,
            enable,
            title, // 基本属性
            images: images ? images.join(",") : '', // 图片
            ownSpec: JSON.stringify(obj) // 特有规格参数
          };
        });
      Object.assign(goodsParams, {
        cid1,
        cid2,
        cid3, // 商品分类
        skus // sku列表
      });
      goodsParams.spuDetail.genericSpec = JSON.stringify(specs);
      goodsParams.spuDetail.specialSpec = JSON.stringify(specTemplate);

      // 提交到后台
      this.$http({
        method: this.isEdit ? "put" : "post",
        url: "/item/goods",
        data: goodsParams
      })
        .then(() => {
          // 成功，关闭窗口
          this.$emit("close");
          // 提示成功
          this.$message.success("保存成功了");
        })
        .catch(() => {
          this.$message.error("保存失败！");
        });
    }
```

点击提交，查看提交的数据格式：

![](https://img-blog.csdnimg.cn/20200420183831261.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





整体是一个json格式数据，包含Spu表所有数据：

- brandId：品牌id
- cid1、cid2、cid3：商品分类id
- subTitle：副标题
- title：标题
- spuDetail：是一个json对象，代表商品详情表数据
  - afterService：售后服务
  - description：商品描述
  - packingList：包装列表
  - specialSpec：sku规格属性模板
  - genericSpec：通用规格参数
- skus：spu下的所有sku数组，元素是每个sku对象：
  - title：标题
  - images：图片
  - price：价格
  - stock：库存
  - ownSpec：特有规格参数
  - indexes：特有规格参数的下标



### 后端代码

#### 实体类

SPU和SpuDetail实体类已经添加过，添加Sku和Stock对象并修改(SpuBo)[#spubo]：

![](https://img-blog.csdnimg.cn/20200420184603499.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



> <strong style="font-size: 20px">SKU</strong>

```java
package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.util.Date;

@Data
public class Sku {
    @TableId
    private Long id;
    private Long spuId;
    private String title;
    private String images;
    private Long price;
    private String ownSpec;// 商品特殊规格的键值对
    private String indexes;// 商品特殊规格的下标
    private Boolean enable;// 是否有效，逻辑删除用
    private Date createTime;// 创建时间
    private Date lastUpdateTime;// 最后修改时间
    @TableField(exist = false)
    private Integer stock;// 库存
}
```

`注意：这里保存了一个库存字段，在数据库中是另外一张表保存的，方便查询。`



> <strong style="font-size: 20px">Stock</strong>

```java
package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Stock {
    @TableId(type = IdType.INPUT)
    private Long skuId;
    private Integer seckillStock;// 秒杀可用库存
    private Integer seckillTotal;// 已秒杀数量
    private Integer stock;// 正常库存

}
```



#### Mapper

都是通用Mapper，略

目录结构：

![](https://img-blog.csdnimg.cn/20200420184917761.png)





#### GoodsController

结合浏览器页面控制台，可以发现：

请求方式：POST

请求路径：/goods

请求参数：Spu的json格式的对象，spu中包含spuDetail和Sku集合。这里我们该怎么接收？我们之前定义了一个SpuBo对象，作为业务对象。这里也可以用它，不过需要再扩展spuDetail和skus字段：

<span id="spubo">修改SpuBo:</span>

```java
package top.codekiller.leyou.pojo.bo;

import lombok.Data;
import top.codekiller.leyou.pojo.Sku;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.pojo.SpuDetail;
import java.util.List;

@Data
public class SpuBo extends Spu {
    /**
     * 通过cid获取分类name
     */
    private String cname;

    /**
     * 通过bid获取品牌name
     */
    private String bname;

    /**
     * 商品详情
     */
    private SpuDetail spuDetail;

    /**
     * sku集合
     */
    private List<Sku> skus;
}
```





```java
    /**
     * 增加商品的spu和sku
     * @param spuBo
     * @return
     */
@PostMapping("goods")
public ResponseEntity<Void> saveGoods(@RequestBody SpuBo spuBo){
    this.goodsService.saveGoods(spuBo);
    return ResponseEntity.status(HttpStatus.CREATED).build();
}
```



> 注意：通过@RequestBody注解来接收Json请求，还有之前如果设置了全局映射路径为spu要注意下



#### GoodsService

这里的逻辑比较复杂，我们除了要对SPU新增以外，还要对SpuDetail、Sku、Stock进行保存

```java

/**
* 增加商品的spu和sku
* @param spuBo
*/
@Override
@Transactional(rollbackFor = Exception.class)
public void saveGoods(SpuBo spuBo) {
    //先新增spu
    //防止id注入
    spuBo.setId(null);
    spuBo.setSaleable(true);
    spuBo.setValid(true);
    spuBo.setCreateTime(new Date());
    spuBo.setLastUpdateTime(spuBo.getCreateTime());
    this.spuMapper.insert(spuBo);
    //再去新增spuDetail
    SpuDetail spuDetail=spuBo.getSpuDetail();
    spuDetail.setSpuId(spuBo.getId());
    this.spuDetailMapper.insert(spuDetail);

    List<Sku> skus=spuBo.getSkus();
    skus.forEach(sku->{
        //新增sku
        sku.setId(null);
        sku.setSpuId(spuBo.getId());
        sku.setCreateTime(new Date());
        sku.setLastUpdateTime(sku.getCreateTime());
        this.skuMapper.insert(sku);

        //新增stock
        Stock stock=new Stock();
        stock.setSkuId(sku.getId());
        stock.setStock(sku.getStock());
        this.stockMapper.insert(stock);
    });
}
```







### 商品修改

#### 编辑按钮点击事件

在商品详情页，每一个商品后面，都会有一个编辑按钮：

![](https://img-blog.csdnimg.cn/20200420221117933.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

点击这个按钮，就会打开一个商品编辑窗口，我们看下它所绑定的点击事件：（在item/Goods.vue）

![](https://img-blog.csdnimg.cn/20200420221206946.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

对应的方法：

![](https://img-blog.csdnimg.cn/20200420221228687.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



可以看到这里发起了两个请求，在查询商品详情和sku信息。

因为在商品列表页面，只有spu的基本信息：id、标题、品牌、商品分类等。比较复杂的商品详情（spuDetail)和sku信息都没有，编辑页面要回显数据，就需要查询这些内容。

因此，接下来我们就编写后台接口，提供查询服务接口。



#### 查询SpuDetail接口

> <strong style="font-size:20px">GoodsController</strong>

需要分析的内容：

- 请求方式：GET
- 请求路径：/spu/detail/{id}
- 请求参数：id，应该是spu的id
- 返回结果：SpuDetail对象

```java
     /**
     * 根据spu的id查询SpuDetail
     * @param spuId
     * @return
     */
@GetMapping("spu/detail/{spuId}")
public ResponseEntity<SpuDetail> querySpuDetailBySpuId(@PathVariable("spuId") Long spuId){
    SpuDetail detail=this.goodsService.querySpuBySupId(spuId);
    if(detail==null){
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(detail);
}
```





> <strong style="font-size:20px">GoodsService</strong>

```java
     /**
     * 根据spu的id查询SpuDetail
     * @param spuId
     * @return
     */
@Override
public SpuDetail querySpuBySupId(Long spuId) {
    return spuDetailMapper.selectById(spuId);
}
```





#### 查询Sku

> 分析

- 请求方式：Get
- 请求路径：/sku/list
- 请求参数：id，应该是spu的id
- 返回结果：sku的集合

> <strong style="font-size:20px">GoodsController</strong>

```java
/**
     * 根据spu的id查询sku的集合
     * @param spuId
     * @return
     */
@GetMapping("sku/list")
public ResponseEntity<List<Sku>> querySkuBySpuId(@RequestParam("id")Long spuId){
    List<Sku> skus=this.goodsService.querySkuBySpuId(spuId);
    if(CollectionUtils.isEmpty(skus)){
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(skus);
}
```



> <strong style="font-size:20px">GoodsService</strong>

需要注意的是，为了页面回显方便，我们一并把sku的库存stock也查询出来

```java
@Override
public List<Sku> querySkuBySpuId(Long spuId) {
    return this.skuMapper.querySkuBySpuId(spuId);
}
```





#### 页面回显

随便点击一个编辑按钮，发现数据回显完成：

![](https://img-blog.csdnimg.cn/20200420221612227.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200420221623925.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200420221633650.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 页面提交

这里的保存按钮与新增其实是同一个，因此提交的逻辑也是一样的，这里不再赘述。

随便修改点数据，然后点击保存，可以看到浏览器已经发出请求：

![](https://img-blog.csdnimg.cn/20200420221702595.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 后台实现

接下来，我们编写后台，实现修改商品接口。

> <strong style="font-size:20px">GoodsController</strong>

- 请求方式：PUT
- 请求路径：/
- 请求参数：Spu对象
- 返回结果：无

```java
    /**
     * 更新商品
     * @param spuBo
     * @return
     */
    @PutMapping("goods")
    public ResponseEntity<Void> updateGoods(@RequestBody SpuBo spuBo){
        this.goodsService.updateGoods(spuBo);
        return ResponseEntity.noContent().build();
    }
```





> <strong style="font-size:20px">GoodsService</strong>

spu数据可以修改，但是SKU数据无法修改，因为有可能之前存在的SKU现在已经不存在了，或者以前的sku属性都不存在了。比如以前内存有4G，现在没了。

因此这里直接删除以前的SKU，然后新增即可。

然后新增sku和开始新增商品中新增sku的代码一致，可以将保存sku和库存的方法抽取成一个方法

代码：

```java
/**
     * 更新商品
     * @param spuBo
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateGoods(SpuBo spuBo) {
        //根据spuid查询要删除的sku
        List<Sku> skus=this.skuMapper.selectList(new QueryWrapper<Sku>().lambda().eq(Sku::getSpuId,spuBo.getId()));
        //删除stock
        skus.forEach(sku -> {
            this.stockMapper.deleteById(sku.getId());
        });

        //删除sku
        skus.forEach(sku->{
            this.skuMapper.deleteById(sku.getId());
        });

        //新增sku和stock
        this.saveSkuAndStock(spuBo);

        //更新spu和spuDetails
        spuBo.setCreateTime(null);
        spuBo.setLastUpdateTime(new Date());
        spuBo.setValid(null);
        spuBo.setSaleable(null);
        this.spuMapper.updateById(spuBo);
        this.spuDetailMapper.updateById(spuBo.getSpuDetail());
    }

    /**
     * 对sku和库存的插入进行了一个封装
     * @param spuBo
     */
    @Transactional(rollbackFor = Exception.class)
    public void saveSkuAndStock(SpuBo spuBo){
        List<Sku> skus=spuBo.getSkus();
        skus.forEach(sku->{
            //新增sku
            sku.setId(null);
            sku.setSpuId(spuBo.getId());
            sku.setCreateTime(new Date());
            sku.setLastUpdateTime(sku.getCreateTime());
            this.skuMapper.insert(sku);

            //新增stock
            Stock stock=new Stock();
            stock.setSkuId(sku.getId());
            stock.setStock(sku.getStock());
            this.stockMapper.insert(stock);
        });
    }
```



#### 其他

*TODO* 商品的删除、上下架等有时间完善。







##  搭建前台系统

后台系统的内容暂时告一段落，有了商品，接下来我们就要在页面展示商品，给用户提供浏览和购买的入口，那就是我们的门户系统。

门户系统面向的是用户，安全性很重要，而且搜索引擎对于单页应用并不友好。因此我们的门户系统不再采用与后台系统类似的SPA（单页应用）。

依然是前后端分离，不过前端的页面会使用独立的html，在每个页面中使用vue来做页面渲染。

### 静态资源

webpack打包多页应用配置比较繁琐，项目结构也相对复杂。这里为了简化开发（毕竟我们不是专业的前端人员），我们不再使用webpack，而是直接编写原生的静态HTML。



### 导入静态资源

将静态资源压缩包移动到工作空间下解压，然后IDEA打开



### live-server

没有webpack，我们就无法使用webpack-dev-server运行这个项目，实现热部署。

所以，这里我们使用另外一种热部署方式：live-server，



###简介

地址；https://www.npmjs.com/package/live-server

![](https://img-blog.csdnimg.cn/20200420230957292.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





这是一款带有热加载功能的小型开发服务器。用它来展示你的HTML / JavaScript / CSS，但不能用于部署最终的网站。



### 安装和运行参数

安装，使用npm命令即可，这里建议全局安装，以后任意位置可用

```shell
npm install -g live-server
```

运行时，直接输入命令：

```shell
live-server
```

![](https://img-blog.csdnimg.cn/20200420231119750.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



另外，你可以在运行命令后，跟上一些参数以配置：

- `--port=NUMBER` - 选择要使用的端口，默认值：PORT env var或8080
- `--host=ADDRESS` - 选择要绑定的主机地址，默认值：IP env var或0.0.0.0（“任意地址”）
- `--no-browser` - 禁止自动Web浏览器启动
- `--browser=BROWSER` - 指定使用浏览器而不是系统默认值
- `--quiet | -q` - 禁止记录
- `--verbose | -V` - 更多日志记录（记录所有请求，显示所有侦听的IPv4接口等）
- `--open=PATH` - 启动浏览器到PATH而不是服务器root
- `--watch=PATH` - 用逗号分隔的路径来专门监视变化（默认值：观看所有内容）
- `--ignore=PATH`- 要忽略的逗号分隔的路径字符串（[anymatch](https://github.com/es128/anymatch) -compatible definition）
- `--ignorePattern=RGXP`-文件的正则表达式忽略（即`.*\.jade`）（**不推荐使用**赞成`--ignore`）
- `--middleware=PATH` - 导出要添加的中间件功能的.js文件的路径; 可以是没有路径的名称，也可以是引用`middleware`文件夹中捆绑的中间件的扩展名
- `--entry-file=PATH` - 提供此文件（服务器根目录）代替丢失的文件（对单页应用程序有用）
- `--mount=ROUTE:PATH` - 在定义的路线下提供路径内容（可能有多个定义）
- `--spa` - 将请求从/ abc转换为/＃/ abc（方便单页应用）
- `--wait=MILLISECONDS` - （默认100ms）等待所有更改，然后重新加载
- `--htpasswd=PATH` - 启用期待位于PATH的htpasswd文件的http-auth
- `--cors` - 为任何来源启用CORS（反映请求源，支持凭证的请求）
- `--https=PATH` - 到HTTPS配置模块的路径
- `--proxy=ROUTE:URL` - 代理ROUTE到URL的所有请求
- `--help | -h` - 显示简洁的使用提示并退出
- `--version | -v` - 显示版本并退出



### 测试

我们进入leyou-portal目录，输入命令：

```shell
live-server --port=9002
```

![](https://img-blog.csdnimg.cn/20200420231232484.png)



### 域名访问

现在我们访问只能通过：[http://127.0.0.1:9002](http://127.0.0.1:9002/)

我们希望用域名访问：[http://www.leyou.com](http://www.leyou.com/)

第一步，修改hosts文件，添加一行配置：

```
127.0.0.1 www.leyou.com
```

第二步，修改nginx配置，将[www.leyou.com反向代理到127.0.0.1:9002](http://www.leyou.xn--com127-rx8ik9tf2dptai62z.0.0.1:9002/)

```nginx
server {
    listen       80;
    server_name  www.leyou.com;

    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;

    location / {
        proxy_pass http://127.0.0.1:9002;
        proxy_connect_timeout 600;
        proxy_read_timeout 600;
    }
}
```

注意：www域名要配置在其他域名的前面，否则会被其他域名先匹配到

重新加载nginx配置：`nginx -s reload`

![](https://img-blog.csdnimg.cn/20200420231301596.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### common.js

为了方便后续的开发，我们在前台系统中定义了一些工具，放在了common.js中：

![](https://img-blog.csdnimg.cn/20200420231324115.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

部分代码截图：

![](https://img-blog.csdnimg.cn/202004202313476.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



首先对axios进行了一些全局配置，请求超时时间，请求的基础路径，是否允许跨域操作cookie等

定义了对象 ly ，也叫leyou，包含了下面的属性：

- getUrlParam(key)：获取url路径中的参数
- http：axios对象的别名。以后发起ajax请求，可以用ly.http.get()
- store：localstorage便捷操作，后面用到再详细说明
- formatPrice：格式化价格，如果传入的是字符串，则扩大100被并转为数字，如果传入是数字，则缩小100倍并转为字符串
- formatDate(val, pattern)：对日期对象val按照指定的pattern模板进行格式化
- stringify：将对象转为参数字符串
- parse：将参数字符串变为js对象



## Elasticsearch的安装和使用

用户访问我们的首页，一般都会直接搜索来寻找自己想要购买的商品。

而商品的数量非常多，而且分类繁杂。如何能正确的显示出用户想要的商品，并进行合理的过滤，尽快促成交易，是搜索系统要研究的核心。

面对这样复杂的搜索业务和数据量，使用传统数据库搜索就显得力不从心，一般我们都会使用全文检索技术，比如之前大家学习过的Solr。

不过今天，我们要讲的是另一个全文检索技术：Elasticsearch。



### 简介

Elastic官网：https://www.elastic.co/cn/

Elastic有一条完整的产品线及解决方案：Elasticsearch、Kibana、Logstash等，前面说的三个就是大家常说的ELK技术栈。

![](https://img-blog.csdnimg.cn/20200421183844766.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

Elasticsearch官网：https://www.elastic.co/cn/products/elasticsearch

![](https://img-blog.csdnimg.cn/20200421183905850.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







如上所述，Elasticsearch具备以下特点：

- 分布式，无需人工搭建集群（solr就需要人为配置，使用Zookeeper作为注册中心）
- Restful风格，一切API都遵循Rest原则，容易上手
- 近实时搜索，数据更新在Elasticsearch中几乎是完全同步的。



### 安装和配置

为了模拟真实场景，我们将在linux下安装Elasticsearch。

需要虚拟机JDK1.8及以上，为了方便直接安装openjdk

```shell
yum install java-1.8.0-openjdk -y
```



### 新建一个用户leyou

出于安全考虑，elasticsearch默认不允许以root账号运行。

创建用户：

```sh
useradd leyou
```

设置密码：

```shell
passwd leyou
```

切换用户：

```shell
su leyou
```



### 上传安装包，并解压

安装包下载：https://www.elastic.co/cn/downloads/elasticsearch

我们将安装包上传到：/home/leyou目录



解压缩：

```shell
tar -xvf elasticsearch-6.3.0-linux-x86_64.tar.gz
```

我们把目录重命名：

```shell
mv elasticsearch-6.3.0 elasticsearch
```





### 修改配置

我们进入config目录：`cd config`

需要修改的配置文件有两个：

![](https://img-blog.csdnimg.cn/20200421184252903.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





1. **jvm.options**

   Elasticsearch基于Lucene的，而Lucene底层是java实现，因此我们需要配置jvm参数。

   编辑jvm.options：

   ```shell
   vim jvm.options
   ```

   默认配置如下：

   ```shell
   -Xms1g
   -Xmx1g
   ```

   内存占用太多了，我们调小一些：

   ```shell
   -Xms512m
   -Xmx512m
   ```

2. **elasticsearch.yml**

```shell
vim elasticsearch.yml
```

修改数据和日志目录：

```shell
path.data: /home/leyou/elasticsearch/data # 数据目录位置
path.logs: /home/leyou/elasticsearch/logs # 日志目录位置
```

我们把data和logs目录修改指向了elasticsearch的安装目录。但是data目录并不存在，因此我们需要创建出来。

进入elasticsearch的根目录，然后创建：

```shell
mkdir data
```

修改绑定的ip：

```shell
vim config/elasticsearch.yml
network.host: 0.0.0.0 # 绑定到0.0.0.0，允许任何ip来访问
```

默认只允许本机访问，修改为0.0.0.0后则可以远程访问

目前我们是做的单机安装，如果要做集群，只需要在这个配置文件中添加其它节点信息即可。

> elasticsearch.yml的其它可配置信息：

| 属性名                             | 说明                                                         |
| ---------------------------------- | ------------------------------------------------------------ |
| cluster.name                       | 配置elasticsearch的集群名称，默认是elasticsearch。建议修改成一个有意义的名称。 |
| node.name                          | 节点名，es会默认随机指定一个名字，建议指定一个有意义的名称，方便管理 |
| path.conf                          | 设置配置文件的存储路径，tar或zip包安装默认在es根目录下的config文件夹，rpm安装默认在/etc/ elasticsearch |
| path.data                          | 设置索引数据的存储路径，默认是es根目录下的data文件夹，可以设置多个存储路径，用逗号隔开 |
| path.logs                          | 设置日志文件的存储路径，默认是es根目录下的logs文件夹         |
| path.plugins                       | 设置插件的存放路径，默认是es根目录下的plugins文件夹          |
| bootstrap.memory_lock              | 设置为true可以锁住ES使用的内存，避免内存进行swap             |
| network.host                       | 设置bind_host和publish_host，设置为0.0.0.0允许外网访问       |
| http.port                          | 设置对外服务的http端口，默认为9200。                         |
| transport.tcp.port                 | 集群结点之间通信端口                                         |
| discovery.zen.ping.timeout         | 设置ES自动发现节点连接超时的时间，默认为3秒，如果网络延迟高可设置大些 |
| discovery.zen.minimum_master_nodes | 主结点数量的最少值 ,此值的公式为：(master_eligible_nodes / 2) + 1 ，比如：有3个符合要求的主结点，那么这里要设置为2 |
|                                    |                                                              |



### 运行

进入elasticsearch/bin目录，可以看到下面的执行文件：

![](https://img-blog.csdnimg.cn/20200421184353511.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后输入命令：

```shell
./elasticsearch
```



### 错误解决

我这里是报了两个错误

![](https://img-blog.csdnimg.cn/20200421184413473.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 错误1：内核过低

![](https://img-blog.csdnimg.cn/20200421184431580.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

如果使用的是centos6，其linux内核版本为2.6。而Elasticsearch的插件要求至少3.5以上版本。不过没关系，我们禁用这个插件即可。

修改elasticsearch.yml文件，在最下面添加如下配置：

```shell
bootstrap.system_call_filter: false
```

然后重启



#### 错误2：文件权限不足

再次启动，又出错了：

![](https://img-blog.csdnimg.cn/20200421184450452.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



```shell
[1]: max file descriptors [4096] for elasticsearch process likely too low, increase to at least [65536]
```

我们用的是leyou用户，而不是root，所以文件权限不足。

**首先用root用户登录。**

然后修改配置文件:

```shell
vim /etc/security/limits.conf
```

添加下面的内容：

```shell
* soft nofile 65536

* hard nofile 131072

* soft nproc 4096

* hard nproc 4096
```

![](https://img-blog.csdnimg.cn/20200421184629386.png)





#### 错误3：线程数不够

> centos7不用修改

```shell
[1]: max number of threads [1024] for user [leyou] is too low, increase to at least [4096]
```

这是线程数不够。

继续修改配置：

```shell
vim /etc/security/limits.d/20-nproc.conf 
```

修改下面的内容：

```shell
* soft nproc 1024
```

改为：

```shell
* soft nproc 4096
```





#### 错误4：进程虚拟内存

```shell
[3]: max virtual memory areas vm.max_map_count [65530] likely too low, increase to at least [262144]
```

vm.max_map_count：限制一个进程可以拥有的VMA(虚拟内存区域)的数量，继续修改配置文件， ：

```shell
vim /etc/sysctl.conf 
```

添加下面内容：

```shell
vm.max_map_count=655360
```

然后执行命令：

```shell
sysctl -p
```



#### 错误5： 默认设置

```shell
the default discovery settings are unsuitable for production use; at least one of [discovery.seed_hosts, discovery.seed_providers, cluster.initial_master_nodes] must be configured
```

修改 elasticsearch.yml

取消注释保留一个节点

```shell
cluster.initial_master_nodes: ["node-1"]
```

并将`node.name: "node-1"`的注释打开

![](https://img-blog.csdnimg.cn/20200421190559607.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 重启终端

所有错误修改完毕，一定要重启你的连接终端，否则配置无效(我这里没有重启完全ok)。

```shell
sysctl -p
```



### [启动](https://cloudlandboy.github.io/myNote/#/project/leyoumall/elasticsearch?id=启动)

可以看到绑定了两个端口:

- 9300：集群节点间通讯接口
- 9200：客户端访问接口

在浏览器中访问：[http://172.16.145.141:9200](http://172.16.145.141:9200/)

![](https://img-blog.csdnimg.cn/20200421194447199.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 安装Kibana

#### 什么是kibana？

![](https://img-blog.csdnimg.cn/20200421194524571.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

Kibana是一个基于Node.js的Elasticsearch索引数据统计工具，可以利用Elasticsearch的聚合功能，生成各种图表，如柱形图，线状图，饼图等。

而且还提供了操作Elasticsearch索引数据的控制台，并且提供了一定的API提示，非常有利于我们学习Elasticsearch的语法。



#### 安装

因为Kibana依赖于node，我们的虚拟机没有安装node，而开发系统中安装过。所以我们选择在开发系统下使用kibana。

与elasticsearch保持一致，也是6.3.0

下载地址：https://www.elastic.co/cn/downloads/kibana

解压到特定目录即可



#### 运行配置

> 配置

进入安装目录下的config目录，修改kibana.yml文件：

修改elasticsearch服务器的地址：

```shell
elasticsearch.hosts: ["http://172.16.145.141:9200"]
```

![](https://img-blog.csdnimg.cn/20200421194649298.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



> 运行

进入安装目录下的bin目录：

双击运行：

发现kibana的监听端口是5601

我们访问：[http://127.0.0.1:5601](http://127.0.0.1:5601/)



#### 控制台

选择左侧的DevTools菜单，即可进入控制台页面：

![](https://img-blog.csdnimg.cn/20200421194838347.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

在页面右侧，我们就可以输入请求，访问Elasticsearch了。

![](https://img-blog.csdnimg.cn/20200421194905575.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 安装ik分词器

Lucene的IK分词器早在2012年已经没有维护了，现在我们要使用的是在其基础上维护升级的版本，并且开发为ElasticSearch的集成插件了，与Elasticsearch一起维护升级，版本也保持一致

下载地址：https://github.com/medcl/elasticsearch-analysis-ik/releases



#### 安装

将下载后的压缩包上传的elasticsearch目录的plugins目录下

使用unzip命令解压：

```shell
unzip elasticsearch-analysis-ik-7.5.0.zip -d ik-analyzer
```

将压缩包删除

```shell
rm -rf elasticsearch-analysis-ik-7.5.0.zip
```

然后重启elasticsearch：



#### 测试

大家先不管语法，我们先测试一波。

在kibana控制台输入下面的请求：

```json
POST _analyze
{
  "analyzer": "ik_max_word",
  "text":     "我是中国人"
}
```

运行得到结果：

```json
{
  "tokens": [
    {
      "token": "我",
      "start_offset": 0,
      "end_offset": 1,
      "type": "CN_CHAR",
      "position": 0
    },
    {
      "token": "是",
      "start_offset": 1,
      "end_offset": 2,
      "type": "CN_CHAR",
      "position": 1
    },
    {
      "token": "中国人",
      "start_offset": 2,
      "end_offset": 5,
      "type": "CN_WORD",
      "position": 2
    },
    {
      "token": "中国",
      "start_offset": 2,
      "end_offset": 4,
      "type": "CN_WORD",
      "position": 3
    },
    {
      "token": "国人",
      "start_offset": 3,
      "end_offset": 5,
      "type": "CN_WORD",
      "position": 4
    }
  ]
}
```







###  API

Elasticsearch提供了Rest风格的API，即http请求接口，而且也提供了各种语言的客户端API

#### Rest风格的API

文档地址：https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html

![](https://img-blog.csdnimg.cn/20200421195110736.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 客户端API

Elasticsearch支持的客户端非常多：https://www.elastic.co/guide/en/elasticsearch/client/index.html

![](https://img-blog.csdnimg.cn/20200421195143275.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

点击Java Rest Client后，你会发现又有两个：

![](https://img-blog.csdnimg.cn/20200421195200232.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





Low Level Rest Client是低级别封装，提供一些基础功能，但更灵活

High Level Rest Client，是在Low Level Rest Client基础上进行的高级别封装，功能更丰富和完善，而且API会变的简单



#### 如何学习

建议先学习Rest风格API，了解发起请求的底层实现，请求体格式等。





### 操作索引

#### 基本概念

Elasticsearch也是基于Lucene的全文检索库，本质也是存储数据，很多概念与MySQL类似的。

对比关系：

```java
索引（indices）--------------------------------Databases 数据库

  类型（type）-----------------------------Table 数据表

     文档（Document）----------------Row 行

       字段（Field）-------------------Columns 列 
```

详细说明：

| 概念                 | 说明                                                         |
| -------------------- | ------------------------------------------------------------ |
| 索引（indices)       | indices是index的复数，代表许多的索引，                       |
| 类型（type）         | 类型是模拟mysql中的table概念，一个索引下可以有不同类型的索引，比如商品索引，订单索引，其数据格式不同。不过这会导致索引混乱，因此未来版本中会移除这个概念 |
| 文档（document）     | 存入索引原始的数据。比如每一条商品信息，就是一个文档         |
| 字段（field）        | 文档中的属性                                                 |
| 映射配置（mappings） | 字段的数据类型、属性、是否索引、是否存储等特性               |



是不是与Lucene和solr中的概念类似。

另外，在SolrCloud中，有一些集群相关的概念，在Elasticsearch也有类似的：

- 索引集（Indices，index的复数）：逻辑上的完整索引 collection1
- 分片（shard）：数据拆分后的各个部分
- 副本（replica）：每个分片的复制

要注意的是：Elasticsearch本身就是分布式的，因此即便你只有一个节点，Elasticsearch默认也会对你的数据进行分片和副本操作，当你向集群添加新数据时，数据也会在新加入的节点中进行平衡。



#### 创建索引

##### 语法

Elasticsearch采用Rest风格API，因此其API就是一次http请求，你可以用任何工具发起http请求

创建索引的请求格式：

- 请求方式：PUT

- 请求路径：/索引名

- 请求参数：json格式：

  ```json
  {
      "settings": {
          "number_of_shards": 3,
          "number_of_replicas": 2
        }
  }
  ```

  - settings：索引的设置
    - number_of_shards：分片数量
    - number_of_replicas：副本数量



##### 测试

我们先用postman来试试

![](https://img-blog.csdnimg.cn/20200421202445964.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



可以看到索引创建成功了。



##### 使用

![](https://img-blog.csdnimg.cn/202004212027534.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

kibana的控制台，可以对http请求进行简化，示例：

![](https://img-blog.csdnimg.cn/20200421203143932.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

相当于是省去了elasticsearch的服务器地址

而且还有语法提示，非常舒服。



#### 查看索引

> 语法

Get请求可以帮我们查看索引信息，格式：

```java
GET /索引名
```

![](https://img-blog.csdnimg.cn/20200421203440335.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

或者，我们可以使用*来查询所有索引配置：

![](https://img-blog.csdnimg.cn/20200421203514765.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 删除索引

删除索引使用DELETE请求

> 语法

```java
DELETE /索引名
```

> 示例

![](https://img-blog.csdnimg.cn/20200421203652857.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





当然，我们也可以用HEAD请求，查看索引是否存在：

![](https://img-blog.csdnimg.cn/20200421203735318.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 映射配置

索引有了，接下来肯定是添加数据。但是，在添加数据之前必须定义映射。

什么是映射？

> 映射是定义文档的过程，文档包含哪些字段，这些字段是否保存，是否索引，是否分词等

只有配置清楚，Elasticsearch才会帮我们进行索引的创建（不一定）



####  创建映射字段

> 语法

请求方式依然是PUT

```
PUT /索引库名/_mapping/类型名称
{
  "properties": {
    "字段名": {
      "type": "类型",
      "index": true，
      "store": true，
      "analyzer": "分词器"
    }
  }
}
```

- 类型名称：就是前面讲的type的概念，类似于数据库中的不同表（已经不建议使用，7.x版本中需要配置，8.x后就会被删除）

![](https://img-blog.csdnimg.cn/2020042120474232.png)

- 字段名：任意填写 ，可以指定许多属性，例如：
- type：类型，可以是text、long、short、date、integer、object等
- index：是否索引，默认为true
- store：是否存储，默认为false
- analyzer：分词器，这里的`ik_max_word`即使用ik分词器

> 示例

发起请求：

```java
PUT heima/_mapping/goods
{
  "properties": {
    "title": {
      "type": "text",
      "analyzer": "ik_max_word"
    },
    "images": {
      "type": "keyword",
      "index": false
    },
    "price": {
      "type": "float"
    }
    
  }
}
```



> 在7.0.0之后的版本，可能会报错

![](https://img-blog.csdnimg.cn/20200421205024434.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

原因:

![](https://img-blog.csdnimg.cn/20200421205104948.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



解决

```java
PUT test_store/_mapping/goods?include_type_name=true
{
  "properties": {
    "title": {
      "type": "text",
      "analyzer": "ik_max_word"
    },
    "images": {
      "type": "keyword",
      "index": "false"
    },
    "price": {
      "type": "float"
    }
  }
}
```

![](https://img-blog.csdnimg.cn/20200421205237652.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以用下面的方式替代

```json
PUT test_store/_mapping
{
  "properties": {
    "goods": {
      "properties": {
        "title": {
          "type": "text",
          "analyzer": "ik_max_word"
        },
        "images": {
          "type": "keyword",
          "index": "false"
        },
        "price": {
          "type": "float"
        }
      }
    }
  }
}
```



#### 查看映射关系

> 语法：

```json
GET /索引名/_mapping
```

> 示例：

```json
GET /test_store/_mapping
```

> 响应：



#### 字段属性详解

##### <span style="font-size: 22px">type</span>

Elasticsearch中支持的数据类型非常丰富：

![](https://img-blog.csdnimg.cn/20200421205411284.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





我们说几个关键的：

- String类型，又分两种：

  - text：可分词，不可参与聚合
  - keyword：不可分词，数据会作为完整字段进行匹配，可以参与聚合

- Numerical：数值类型，分两类

  - 基本数据类型：long、interger、short、byte、double、float、half_float
  - 浮点数的高精度类型：scaled_float
    - 需要指定一个精度因子，比如10或100。elasticsearch会把真实值乘以这个因子后存储，取出时再还原。

- Date：日期类型

  elasticsearch可以对日期格式化为字符串存储，但是建议我们存储为毫秒值，存储为long，节省空间。



##### <span style="font-size: 22px">index</span>

index影响字段的索引情况。

- true：字段会被索引，则可以用来进行搜索。默认值就是true
- false：字段不会被索引，不能用来搜索

index的默认值就是true，也就是说你不进行任何配置，所有字段都会被索引。

但是有些字段是我们不希望被索引的，比如商品的图片信息，就需要手动设置index为false。



##### <span style="font-size: 22px">store</span>

是否将数据进行额外存储。

在学习lucene和solr时，我们知道如果一个字段的store设置为false，那么在文档列表中就不会有这个字段的值，用户的搜索结果中不会显示出来。

但是在Elasticsearch中，即便store设置为false，也可以搜索到结果。

原因是Elasticsearch在创建文档索引时，会将文档中的原始数据备份，保存到一个叫做`_source`的属性中。而且我们可以通过过滤`_source`来选择哪些要显示，哪些不显示。

而如果设置store为true，就会在`_source`以外额外存储一份数据，多余，因此一般我们都会将store设置为false，事实上，**store的默认值就是false。**



##### <span style="font-size: 22px">boost</span>

激励因子，这个与lucene中一样

其它的不再一一讲解，用的不多，参考官方文档：

![](https://img-blog.csdnimg.cn/2020042120572852.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)









### 新增数据

#### 随机生成id

通过POST请求，可以向一个已经存在的索引中添加数据。

> 语法：

```json
POST /索引名 {    "key":"value" }
```

```json
POST heima/goods
{
  "goods": {
    "title":"小米手机",
    "images":"http://image.leyou.com/12479122.jpg",
    "price":2699.00
  }
}
```

响应：

```json
{
  "_index" : "test_store",
  "_type" : "_doc",
  "_id" : "wa923W4BPaxfFKWjLa43",
  "_version" : 1,
  "result" : "created",
  "_shards" : {
    "total" : 3,
    "successful" : 1,
    "failed" : 0
  },
  "_seq_no" : 1,
  "_primary_term" : 1
}
```

通过kibana查看数据：

```json
GET heima/goods
{
  "query": {
    "match_all": {}
  }
}
{
  "_index" : "test_store",
  "_type" : "_doc",
  "_id" : "wK9p3W4BPaxfFKWjSK7K",
  "_score" : 1.0,
  "_source" : {
    "goods" : {
      "title" : "小米手机",
      "images" : "http://image.leyou.com/12479122.jpg",
      "price" : 2699.0
    }
  }
}
```

- `_source`：源文档信息，所有的数据都在里面。
- `_id`：这条文档的唯一标示，与文档自己的id字段没有关联





#### 自定义id

如果我们想要自己新增的时候指定id，可以这么做：

```json
PUT /索引名/_doc/id值
{
    ...
}

```

示例：

```json
PUT heima/goods/123
{
  "goods": {
    "title":"红米手机",
    "images":"http://image.leyou.com/12479122.jpg",
    "price":999.00
  }
}
```

得到的数据：

```json
{
  "_index" : "test_store",
  "_type" : "_doc",
  "_id" : "123",
  "_version" : 1,
  "result" : "created",
  "_shards" : {
    "total" : 3,
    "successful" : 1,
    "failed" : 0
  },
  "_seq_no" : 2,
  "_primary_term" : 1
}
```



####智能判断

在学习Solr时我们发现，我们在新增数据时，只能使用提前配置好映射属性的字段，否则就会报错。

不过在Elasticsearch中并没有这样的规定。

事实上Elasticsearch非常智能，你不需要给索引设置任何mapping映射，它也可以根据你输入的数据来判断类型，动态添加数据映射。

测试一下：

```json
put /heima/goods/3
{
    "goods": {
        "title":"超米手机",
        "images":"http://image.leyou.com/12479122.jpg",
        "price":2899.00,
        "stock": 200,
        "saleable":true
    }
}
```

我们额外添加了stock库存，和saleable是否上架两个字段。

来看结果：

```json
{
  "_index": "test_store",
  "_type": "goods",
  "_id": "3",
  "_version": 1,
  "_score": 1,
  "_source": {
    "title": "超米手机",
    "images": "http://image.leyou.com/12479122.jpg",
    "price": 2899,
    "stock": 200,
    "saleable": true
  }
}
```

在看下索引的映射关系:

```json
{
  "test_store" : {
    "mappings" : {
      "properties" : {
        "goods" : {
          "properties" : {
            "images" : {
              "type" : "keyword",
              "index" : false
            },
            "price" : {
              "type" : "float"
            },
            "saleable" : {
              "type" : "boolean"
            },
            "stock" : {
              "type" : "long"
            },
            "title" : {
              "type" : "text",
              "analyzer" : "ik_max_word"
            }
          }
        }
      }
    }
  }
}
```

stock和saleable都被成功映射了。



### 修改数据

请求方式为PUT，指定id

- id对应文档存在，则修改
- id对应文档不存在，则新增

比如，我们把id为5的数据进行修改：

```java
POST(PUT) /heima/goods/5
{
  "title": "小米电视",
  "images": "http://image.leyou.com/154.jpg",
  "price": 1099.00,
  "saleable": true
}
```

```java
{
    "_index": "heima",
    "_type": "goods",
    "_id": "5",
    "_score": 2.3491275,
    "_source": {
        "title": "小米电视",
        "images": "http://image.leyou.com/154.jpg",
        "price": 1099,
        "saleable": true
    }
},
```





### 删除数据

删除使用DELETE请求，同样，需要根据id进行删除：

> 语法

```
DELETE /索引名/_doc/id值
```

> 示例：

```
DELETE /heima/goods/4x3XnHEBx0JRCCpwPnSX
```





### 查询数据

我们从4块来讲查询：

- 基本查询
- `_source`过滤
- 结果过滤
- 高级查询
- 排序



### 基本查询

> 基本语法

```json
GET /索引名/_search
{
    "query":{
        "查询类型":{
            "查询条件":"查询条件值"
        }
    }
}
```

这里的query代表一个查询对象，里面可以有不同的查询属性

- 查询类型：
  - 例如：`match_all`， `match`，`term` ， `range` 等等
- 查询条件：查询条件会根据类型的不同，写法也有差异，后面详细讲解



#### 查询所有

> 示例：

```java
GET  /heima/_search
{
  "query": {
    "match_all": {}
  }
}
```

- `query`：代表查询对象
- `match_all`：代表查询所有

```json
{
  "took": 2,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 5,
    "max_score": 1,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "1",
        "_score": 1,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "2",
        "_score": 1,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        }
      }
    ]
  }
}
```

- `took`：查询花费时间，单位是毫秒

- `time_out`：是否超时

- `_shards`：分片信息

- ```
  hits
  ```

  ：搜索结果总览对象

  - `total`：搜索到的总条数

  - `max_score`：所有结果中文档得分的最高分

  - ```
    hits
    ```

    ：搜索结果的文档对象数组，每个元素是一条搜索到的文档信息

    - `_index`：索引
    - `_type`：文档类型
    - `_id`：文档id
    - `_score`：文档得分
    - `_source`：文档的源数据



####   匹配查询

```json
GET /heima/_search
{
  "query": {
    "match": {
      "title": {
        "query": "小米电视手机",
      }
    }
  }
}
```

- or关系

`match`类型查询，会把查询条件进行分词，然后进行查询,多个词条之间是or的关系

```json
GET /heima/_search
{
  "query": {
    "match": {
      "goods.title": "小米电视"
    }
  }
}
```

结果：

```json
"hits": {
    "total": 2,
    "max_score": 0.6931472,
    "hits": [
        {
            "_index": "test_store",
            "_type": "goods",
            "_id": "tmUBomQB_mwm6wH_EC1-",
            "_score": 0.6931472,
            "_source": {
                "title": "小米手机",
                "images": "http://image.leyou.com/12479122.jpg",
                "price": 2699
            }
        },
        {
            "_index": "test_store",
            "_type": "goods",
            "_id": "3",
            "_score": 0.5753642,
            "_source": {
                "title": "小米电视4A",
                "images": "http://image.leyou.com/12479122.jpg",
                "price": 3899
            }
        }
    ]
}
```

在上面的案例中，不仅会查询到电视，而且与小米相关的都会查询到，多个词之间是`or`的关系。

- and关系

某些情况下，我们需要更精确查找，我们希望这个关系变成`and`，可以这样做：

```json
GET /heima/_search
{
  "query": {
    "match": {
      "goods.title": {
        "query": "小米电视",
        "operator": "and"
      }
    }
  }
}
```

结果：

```json
{
  "took": 2,
  "timed_out": false,
  "_shards": {
    "total": 3,
    "successful": 3,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 1,
    "max_score": 0.5753642,
    "hits": [
      {
        "_index": "test_store",
        "_type": "goods",
        "_id": "3",
        "_score": 0.5753642,
        "_source": {
          "title": "小米电视4A",
          "images": "http://image.leyou.com/12479122.jpg",
          "price": 3899
        }
      }
    ]
  }
}
```

本例中，只有同时包含`小米`和`电视`的词条才会被搜索到。

- or和and之间？

在 `or` 与 `and` 间二选一有点过于非黑即白。 如果用户给定的条件分词后有 5 个查询词项，想查找只包含其中 4 个词的文档，该如何处理？将 operator 操作符参数设置成 `and` 只会将此文档排除。

有时候这正是我们期望的，但在全文搜索的大多数应用场景下，我们既想包含那些可能相关的文档，同时又排除那些不太相关的。换句话说，我们想要处于中间某种结果。

`match` 查询支持 `minimum_should_match` 最小匹配参数， 这让我们可以指定必须匹配的词项数用来表示一个文档是否相关。我们可以将其设置为某个具体数字，更常用的做法是将其设置为一个`百分数`，因为我们无法控制用户搜索时输入的单词数量：

```json
GET /heima/_search
{
  "query": {
    "match": {
      "goods.title": {
        "query": "小米曲面电视",
        "minimum_should_match": "75%"
      }
    }
  }
}
```

本例中，搜索语句可以分为3个词，如果使用and关系，需要同时满足3个词才会被搜索到。这里我们采用最小品牌数：75%，那么也就是说只要匹配到总词条数量的75%即可，这里3*75% 约等于2。所以只要包含2个词条就算满足条件了。

结果：

![](https://img-blog.csdnimg.cn/20200421215744939.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







#### 多字段查询（multi_match）

`multi_match`与`match`类似，不同的是它可以在多个字段中查询

```json
GET heima/_search
{
 "query": {
   "multi_match": {
     "query": "小米",
     "fields": ["title","subtitle"]
   }
 } 
  
}
```

新增一条记录

```
POST /heima/goods
{
  "goods": {
    "title":"华为手机",
    "subTitle":"小米是小虾米",
    "images":"http://image.leyou.com/12479122.jpg",
    "price":2699.00
  }
}
```

本例中，我们会在title字段和subtitle字段中查询`小米`这个词





#### 词条匹配(term)

`term` 查询被用于精确值 匹配，这些精确值可能是数字、时间、布尔或者那些**未分词**的字符串

```json
GET  heima/_search
{
  "query": {
    "term": {
      "title": {
        "value": "小米"
      }
    }
  }
}
```

结果：

```json
{
  "took": 1,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 2,
    "max_score": 1.0630728,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 1.0630728,
        "_source": {
          "title": "小米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 1.0630728,
        "_source": {
          "title": "小米电视",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      }
    ]
  }
}
```



#### 多词条精确匹配(terms)

`terms` 查询和 term 查询一样，但它允许你指定多值进行匹配。如果这个字段包含了指定值中的任何一个值，那么这个文档满足条件：

```json
GET /heima/_search
{
  "query": {
    "terms": {
      "title": [
        "小米",
        "华为"
      ]
    }
  } 
}
```

结果：

```json
{
  "took": 1,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 3,
    "max_score": 1,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 1,
        "_source": {
          "title": "小米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 1,
        "_source": {
          "title": "小米电视",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "6",
        "_score": 1,
        "_source": {
          "title": "华为手机",
          "subtitle": "小米",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      }
    ]
  }
}{
  "took": 1,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 2,
    "max_score": 1.1631508,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 1.1631508,
        "_source": {
          "title": "小米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 1.1631508,
        "_source": {
          "title": "小米电视",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      }
    ]
  }
}
```



### 结果过滤

默认情况下，elasticsearch在搜索的结果中，会把文档中保存在`_source`的所有字段都返回。

如果我们只想获取其中的部分字段，我们可以添加`_source`的过滤

#### 直接指定字段

示例：

```json
GET /heima/_search
{
  "_source": ["title"], 
  "query": {
    "terms": {
      "title": [
        "小米",
        "华为"
      ]
    }
  }
  
}
```

返回的结果：

```json
{
  "took": 2,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 3,
    "max_score": 1,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 1,
        "_source": {
          "title": "小米手机"
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 1,
        "_source": {
          "title": "小米电视"
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "6",
        "_score": 1,
        "_source": {
          "title": "华为手机"
        }
      }
    ]
  }
}
```



>  指定includes和excludes

我们也可以通过：

- includes：来指定想要显示的字段
- excludes：来指定不想要显示的字段

二者都是可选的。

示例：

```json
GET /heima/_search
{
  "_source": {
    "excludes": ["title"],
    "includes": ["images"]
    }, 
  "query": {
    "terms": {
      "title": [
        "小米",
        "华为"
      ]
    }
  }
}
```

```json
{
  "took": 1,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 3,
    "max_score": 1,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 1,
        "_source": {
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 1,
        "_source": {
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "6",
        "_score": 1,
        "_source": {
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099
        }
      }
    ]
  }
}
```







### 高级查询

#### 布尔查询(bool)

`bool`把各种其它查询通过`must`（与）、`must_not`（非）、`should`（或）的方式进行组合

```json
GET heima/_search
{
  "query": {
    "bool": {
      "should": [
        {
          "match": {
            "title": "小米"
          }
        },
        {
          "terms": {
            "price": [
              "1099",
              "3099"
            ]
          }
        }
      ],
      "must": [
        {
          "term": {
            "saleable": {
              "value": "true"
            }
          }
        }
      ]
    }
    
  }
}
```

```json
{
  "took": 3,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 7,
    "max_score": 2.2276893,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 2.2276893,
        "_source": {
          "title": "小米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 2.2276893,
        "_source": {
          "title": "小米电视",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "6",
        "_score": 1.0645385,
        "_source": {
          "title": "华为手机",
          "subtitle": "小米",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "7",
        "_score": 1.0645385,
        "_source": {
          "title": "小",
          "subtitle": "小",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "1",
        "_score": 0.06453852,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "2",
        "_score": 0.06453852,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "3",
        "_score": 0.06453852,
        "_source": {
          "title": "中米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2099,
          "saleable": true
        }
      }
    ]
  }
}
```





#### 范围查询(range)

`range` 查询找出那些落在指定区间内的数字或者时间

```json
# 范围查询

GET heima/_search
{
  "query": {
    "range": {
      "price": {
        "gte": 2300,
        "lte": 4000
      }
    }
  } 
}
```

`range`查询允许以下字符：

| 操作符 | 说明     |
| ------ | -------- |
| gt     | 大于     |
| gte    | 大于等于 |
| lt     | 小于     |
| lte    | 小于等于 |





#### 模糊查询（fuzzy）

`fuzzy` 查询是 `term` 查询的模糊等价。它`允许用户搜索词条与实际词条的拼写出现偏差`，但是偏差的编辑距离不得超过2：

```json
# 模糊查询 
GET heima/_search
{
  "query": {
    "fuzzy": {
      "title": {
        "value": "小米手"
      }
    }
  }
  
}
```

```json
{
  "took": 2,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 2,
    "max_score": 0.5815754,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 0.5815754,
        "_source": {
          "title": "小米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 0.5815754,
        "_source": {
          "title": "小米电视",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      }
    ]
  }
}
```



我们可以通过`fuzziness`来指定允许的编辑距离：

```json
# 模糊查询 
GET heima/_search
{
  "query": {
    "fuzzy": {
      "title": {
        "value": "小米手",
        "fuzziness": 2
      }
    }
  }
  
}
```

```json
{
  "took": 6,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 6,
    "max_score": 0.5815754,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": 0.5815754,
        "_source": {
          "title": "小米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "5",
        "_score": 0.5815754,
        "_source": {
          "title": "小米电视",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "1",
        "_score": 0,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "2",
        "_score": 0,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "3",
        "_score": 0,
        "_source": {
          "title": "中米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2099,
          "saleable": true
        }
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "7",
        "_score": 0,
        "_source": {
          "title": "小",
          "subtitle": "小",
          "images": "http://image.leyou.com/154.jpg",
          "price": 1099,
          "saleable": true
        }
      }
    ]
  }
}
```





### 过滤(filter)

> **条件查询中进行过滤**

所有的查询都会影响到文档的评分及排名。如果我们需要在查询结果中进行过滤，并且不希望过滤条件影响评分，那么就不要把过滤条件作为查询条件来用。而是使用`filter`方式

```json
# filter
GET  heima/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "match": {
            "title": "手机"
          }
        }
      ],
      "filter": {
        "range": {
          "price": {
            "gte": 2699,
            "lte": 3099
          }
        }
      }
    }
  }
}
```



注意：`filter`中还可以再次进行`bool`组合条件过滤。

> **无查询条件，直接过滤**

如果一次查询只有过滤，没有查询条件，不希望进行评分，我们可以使用`constant_score`取代只有 filter 语句的 bool 查询。在性能上是完全相同的，但对于提高查询简洁性和清晰度有很大帮助。



```json
# filter
GET  heima/_search
{
  "query": {
    "bool": {
      "filter": {
        "range": {
          "price": {
            "gte": 2699,
            "lte": 3099
          }
        }
      }
    }
  }
}
```

`此刻评分为0`

![](https://img-blog.csdnimg.cn/20200421232336207.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







### 排序

`sort` 可以让我们按照不同的字段进行排序，并且通过`order`指定排序的方式。

可以`单字段排序`也可以`多字段排序`。

> 多字段排序如果第一个字段相同，会按照第二个字段排序

```json
# filter和sort
GET  heima/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "match": {
            "title": "手机"
          }
        }
      ],
      "filter": {
        "range": {
          "price": {
            "gte": 2699,
            "lte": 3099
          }
        }
      }
    }
  },
  "sort": [
    {
      "price": {
        "order": "desc"
      },
      "_id": {
        "order": "asc"
      }
    }
  ]
}
```

```json
{
  "took": 35,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 3,
    "max_score": null,
    "hits": [
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "4",
        "_score": null,
        "_source": {
          "title": "小米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 3099,
          "saleable": true
        },
        "sort": [
          3099,
          "4"
        ]
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "1",
        "_score": null,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        },
        "sort": [
          2799,
          "1"
        ]
      },
      {
        "_index": "heima",
        "_type": "goods",
        "_id": "2",
        "_score": null,
        "_source": {
          "title": "大米手机",
          "images": "http://image.leyou.com/154.jpg",
          "price": 2799,
          "saleable": true
        },
        "sort": [
          2799,
          "2"
        ]
      }
    ]
  }
}
```





### 聚合aggregations

聚合可以让我们极其方便的实现对数据的统计、分析。例如：

- 什么品牌的手机最受欢迎？
- 这些手机的平均价格、最高价格、最低价格？
- 这些手机每月的销售情况如何？

实现这些统计功能的比数据库的sql要方便的多，而且查询速度非常快，可以实现实时搜索效果。



#### 基本概念

Elasticsearch中的聚合，包含多种类型，最常用的两种，一个叫`桶`，一个叫`度量`：

> **桶（bucket）**

桶的作用，是按照某种方式对数据进行分组，每一组数据在ES中称为一个`桶`，例如我们根据国籍对人划分，可以得到`中国桶`、`英国桶`，`日本桶`……或者我们按照年龄段对人进行划分：0~~10,10~~20,20~~30,30~~40等。

Elasticsearch中提供的划分桶的方式有很多：

- Date Histogram Aggregation：根据日期阶梯分组，例如给定阶梯为周，会自动每周分为一组
- Histogram Aggregation：根据数值阶梯分组，与日期类似
- Terms Aggregation：根据词条内容分组，词条内容完全匹配的为一组
- Range Aggregation：数值和日期的范围分组，指定开始和结束，然后按段分组
- ……

bucket aggregations 只负责对数据进行分组，并不进行计算，因此往往bucket中往往会嵌套另一种聚合：metrics aggregations即度量

> **度量（metrics）**

分组完成以后，我们一般会对组中的数据进行聚合运算，例如求平均值、最大、最小、求和等，这些在ES中称为`度量`

比较常用的一些度量聚合方式：

- Avg Aggregation：求平均值
- Max Aggregation：求最大值
- Min Aggregation：求最小值
- Percentiles Aggregation：求百分比
- Stats Aggregation：同时返回avg、max、min、sum、count等
- Sum Aggregation：求和
- Top hits Aggregation：求前几
- Value Count Aggregation：求总数
- ……

为了测试聚合，我们先批量导入一些数据

创建索引：

```json
PUT /cars
{
  "settings": {
    "number_of_replicas": 0,
    "number_of_shards": 1
  },
  "mappings": {
    "transactions": {
      "properties": {
        "color": {
          "type": "keyword"
        },
        "make": {
          "type": "keyword"
        }
      }
    }
  }
}
```

> **注意**：在ES中，需要进行聚合、排序、过滤的字段其处理方式比较特殊，因此不能被分词。这里我们将color和make这两个文字类型的字段设置为keyword类型，这个类型不会被分词，将来就可以参与聚合

导入数据

```json
POST /cars/transactions/_bulk
{ "index": {}}
{ "transactions":{"price" : 10000, "color" : "red", "make" : "honda", "sold" : "2014-10-28" }}
{ "index": {}}
{ "transactions":{"price" : 20000, "color" : "red", "make" : "honda", "sold" : "2014-11-05" }}
{ "index": {}}
{ "transactions":{"price" : 30000, "color" : "green", "make" : "ford", "sold" : "2014-05-18" }}
{ "index": {}}
{ "transactions":{"price" : 15000, "color" : "blue", "make" : "toyota", "sold" : "2014-07-02" }}
{ "index": {}}
{ "transactions":{"price" : 12000, "color" : "green", "make" : "toyota", "sold" : "2014-08-19" }}
{ "index": {}}
{ "transactions":{"price" : 20000, "color" : "red", "make" : "honda", "sold" : "2014-11-05" }}
{ "index": {}}
{ "transactions":{"price" : 80000, "color" : "red", "make" : "bmw", "sold" : "2014-01-01" }}
{ "index": {}}
{ "transactions":{"price" : 25000, "color" : "blue", "make" : "ford", "sold" : "2014-02-12" }}
```





#### 聚合为桶

首先，我们按照 汽车的颜色`color`来划分`桶`

```json
GET cars/_search
{
  "size": 0, 
  "aggs": {
    "popular_color": {
      "terms": {
        "field": "transactions.color.keyword"
      }
    }
  } 
}
```

>color的类型为keyword，所以必须加上keyword，不然会报错。



- size： 查询条数，这里设置为0，因为我们不关心搜索到的数据，只关心聚合结果，提高效率
- aggs：声明这是一个聚合查询，是aggregations的缩写
  - popular_colors：给这次聚合起一个名字，任意。
    - terms：划分桶的方式，这里是根据词条划分
      - field：划分桶的字段

结果:

```json
{
  "took": 1,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 8,
    "max_score": 0,
    "hits": []
  },
  "aggregations": {
    "popular_color": {
      "doc_count_error_upper_bound": 0,
      "sum_other_doc_count": 0,
      "buckets": [
        {
          "key": "red",
          "doc_count": 4
        },
        {
          "key": "blue",
          "doc_count": 2
        },
        {
          "key": "green",
          "doc_count": 2
        }
      ]
    }
  }
}
```

- hits：查询结果为空，因为我们设置了size为0
- aggregations：聚合的结果
- popular_colors：我们定义的聚合名称
- buckets：查找到的桶，每个不同的color字段值都会形成一个桶
  - key：这个桶对应的color字段的值
  - doc_count：这个桶中的文档数量

通过聚合的结果我们发现，目前红色的小车比较畅销！





#### 桶内度量

前面的例子告诉我们每个桶里面的文档数量，这很有用。 但通常，我们的应用需要提供更复杂的文档度量。 例如，每种颜色汽车的平均价格是多少？

因此，我们需要告诉Elasticsearch`使用哪个字段`，`使用何种度量方式`进行运算，这些信息要嵌套在`桶`内，`度量`的运算会基于`桶`内的文档进行

现在，我们为刚刚的聚合结果添加 求价格平均值的度量：

```java
GET cars/_search
{
  "size": 0, 
  "aggs": {
    "popular_color": {
      "terms": {
        "field": "transactions.color.keyword"
      },
      "aggs": {
        "price_avg": {
          "avg": {
            "field": "transactions.price"
          }
        }
      }
    }
  }
}
```

- aggs：我们在上一个aggs(popular_colors)中添加新的aggs。可见`度量`也是一个聚合
- avg_price：聚合的名称
- avg：度量的类型，这里是求平均值
- field：度量运算的字段

结果

```json
{
  "took": 1,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 8,
    "max_score": 0,
    "hits": []
  },
  "aggregations": {
    "popular_color": {
      "doc_count_error_upper_bound": 0,
      "sum_other_doc_count": 0,
      "buckets": [
        {
          "key": "red",
          "doc_count": 4,
          "price_avg": {
            "value": 32500
          }
        },
        {
          "key": "blue",
          "doc_count": 2,
          "price_avg": {
            "value": 20000
          }
        },
        {
          "key": "green",
          "doc_count": 2,
          "price_avg": {
            "value": 21000
          }
        }
      ]
    }
  }
}
```



可以看到每个桶中都有自己的`avg_price`字段，这是度量聚合的结果



#### 桶内嵌套桶

刚刚的案例中，我们在桶内嵌套度量运算。事实上桶不仅可以嵌套运算， 还可以再嵌套其它桶。也就是说在每个分组中，再分更多组。

比如：我们想统计每种颜色的汽车中，分别属于哪个制造商，按照`make`字段再进行分桶

```json
GET cars/_search
{
  "size": 0, 
  "aggs": {
    "popular_color": {
      "terms": {
        "field": "transactions.color.keyword"
      },
      "aggs": {
        "price_avg": {
          "avg": {
            "field": "transactions.price"
          }
        },
        "maker": {
          "terms": {
            "field": "transactions.make.keyword"
          }
        }
      }
    }
  }
}
```

- 原来的color桶和avg计算我们不变
- maker：在嵌套的aggs下新添一个桶，叫做maker
- terms：桶的划分类型依然是词条
- filed：这里根据make字段进行划分

结果:

```json
{
  "took": 0,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 8,
    "max_score": 0,
    "hits": []
  },
  "aggregations": {
    "popular_color": {
      "doc_count_error_upper_bound": 0,
      "sum_other_doc_count": 0,
      "buckets": [
        {
          "key": "red",
          "doc_count": 4,
          "maker": {
            "doc_count_error_upper_bound": 0,
            "sum_other_doc_count": 0,
            "buckets": [
              {
                "key": "honda",
                "doc_count": 3
              },
              {
                "key": "bmw",
                "doc_count": 1
              }
            ]
          },
          "price_avg": {
            "value": 32500
          }
        },
        {
          "key": "blue",
          "doc_count": 2,
          "maker": {
            "doc_count_error_upper_bound": 0,
            "sum_other_doc_count": 0,
            "buckets": [
              {
                "key": "ford",
                "doc_count": 1
              },
              {
                "key": "toyota",
                "doc_count": 1
              }
            ]
          },
          "price_avg": {
            "value": 20000
          }
        },
        {
          "key": "green",
          "doc_count": 2,
          "maker": {
            "doc_count_error_upper_bound": 0,
            "sum_other_doc_count": 0,
            "buckets": [
              {
                "key": "ford",
                "doc_count": 1
              },
              {
                "key": "toyota",
                "doc_count": 1
              }
            ]
          },
          "price_avg": {
            "value": 21000
          }
        }
      ]
    }
  }
}
```

- 我们可以看到，新的聚合`maker`被嵌套在原来每一个`color`的桶中。
- 每个颜色下面都根据 `make`字段进行了分组
- 我们能读取到的信息：
  - 红色车共有4辆
  - 红色车的平均售价是 $32，500 美元。
  - 其中3辆是 Honda 本田制造，1辆是 BMW 宝马制造。







### 划分桶的其他几种方式

前面讲了，划分桶的方式有很多，例如：

- Date Histogram Aggregation：根据日期阶梯分组，例如给定阶梯为周，会自动每周分为一组
- Histogram Aggregation：根据数值阶梯分组，与日期类似
- Terms Aggregation：根据词条内容分组，词条内容完全匹配的为一组
- Range Aggregation：数值和日期的范围分组，指定开始和结束，然后按段分组

刚刚的案例中，我们采用的是Terms Aggregation，即根据词条划分桶。

接下来，我们再学习几个比较实用的：





### 阶梯分桶Histogram

> 原理：

histogram是把数值类型的字段，按照一定的阶梯大小进行分组。你需要指定一个阶梯值（interval）来划分阶梯大小。

举例：

比如你有价格字段，如果你设定interval的值为200，那么阶梯就会是这样的：

0，200，400，600，...

上面列出的是每个阶梯的key，也是区间的启点。

如果一件商品的价格是450，会落入哪个阶梯区间呢？计算公式如下：

```json
bucket_key = Math.floor((value - offset) / interval) * interval + offset
```

value：就是当前数据的值，本例中是450

offset：起始偏移量，默认为0

interval：阶梯间隔，比如200

因此你得到的key = Math.floor((450 - 0) / 200) * 200 + 0 = 400

> 操作一下：

比如，我们对汽车的价格进行分组，指定间隔interval为5000：

```json
GET /cars/_search
{
  "size": 0,
  "aggs": {
    "price_histogram": {
      "histogram": {
        "field": "transactions.price",
        "interval": 5000,
        "min_doc_count": 1
      }
    }
  } 
}
```

结果：

```json
{
  "took": 2,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 8,
    "max_score": 0,
    "hits": []
  },
  "aggregations": {
    "price_histogram": {
      "buckets": [
        {
          "key": 10000,
          "doc_count": 2
        },
        {
          "key": 15000,
          "doc_count": 1
        },
        {
          "key": 20000,
          "doc_count": 2
        },
        {
          "key": 25000,
          "doc_count": 1
        },
        {
          "key": 30000,
          "doc_count": 1
        },
        {
          "key": 80000,
          "doc_count": 1
        }
      ]
    }
  }
}
```



> 所有的doc_cout都大于1，因为我们增加一个参数min_doc_count为1，来约束最少文档数量为1，这样文档数量为0的桶会被过滤



### 范围分桶range

范围分桶与阶梯分桶类似，也是把数字按照阶段进行分组，只不过range方式需要你自己指定每一组的起始和结束大小。

```json
GET cars/_search
{
  "size": 0,
  "aggs": {
    "price_range": {
      "range": {
        "field": "transactions.price",
        "ranges": [
          {
            "from": 50000,
            "to": 100000
          },
          {
            "from": 5000,
            "to": 50000
          }
        ]
      }
    }
  } 
}
```

结果:

```json
{
  "took": 2,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 8,
    "max_score": 0,
    "hits": []
  },
  "aggregations": {
    "price_range": {
      "buckets": [
        {
          "key": "5000.0-50000.0",
          "from": 5000,
          "to": 50000,
          "doc_count": 7
        },
        {
          "key": "50000.0-100000.0",
          "from": 50000,
          "to": 100000,
          "doc_count": 1
        }
      ]
    }
  }
}
```







## SpringData Elasticsearch

Elasticsearch提供的Java客户端有一些不太方便的地方：

- 很多地方需要拼接Json字符串，在java中拼接字符串有多恐怖你应该懂的
- 需要自己把对象序列化为json存储
- 查询到结果也需要自己反序列化为对象

因此，直接学习Spring提供的套件：Spring Data Elasticsearch。



### 简介

Spring Data Elasticsearch是Spring Data项目下的一个子模块。

查看 Spring Data的官网：http://projects.spring.io/spring-data/

![](https://img-blog.csdnimg.cn/20200422143110586.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



> Spring Data的使命是为数据访问提供熟悉且一致的基于Spring的编程模型，同时仍保留底层数据存储的特殊特性。
>
> 它使得使用数据访问技术，关系数据库和非关系数据库，map-reduce框架和基于云的数据服务变得容易。这是一个总括项目，其中包含许多特定于给定数据库的子项目。这些令人兴奋的技术项目背后，是由许多公司和开发人员合作开发的。

Spring Data 的使命是给各种数据访问提供统一的编程接口，不管是关系型数据库（如MySQL），还是非关系数据库（如Redis），或者类似Elasticsearch这样的索引数据库。从而简化开发人员的代码，提高开发效率。

包含很多不同数据操作的模块：

![](https://img-blog.csdnimg.cn/2020042214440727.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

Spring Data Elasticsearch的页面：https://projects.spring.io/spring-data-elasticsearch/

![](https://img-blog.csdnimg.cn/20200422144428853.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



特征：

- 支持Spring的基于`@Configuration`的java配置方式，或者XML配置方式
- 提供了用于操作ES的便捷工具类**`ElasticsearchTemplate`**。包括实现文档到POJO之间的自动智能映射。
- 利用Spring的数据转换服务实现的功能丰富的对象映射
- 基于注解的元数据映射方式，而且可扩展以支持更多不同的数据格式
- 根据持久层接口自动生成对应实现方法，无需人工编写基本操作代码（类似mybatis，根据接口自动得到实现）。当然，也支持人工定制查询



### 创建工程

我们使用spring脚手架新建一个demo，学习Elasticsearch



### 配置文件

application.yml文件配置，使用`ElasticsearchRestTemplate`如下配置：

```yaml
spring:
  elasticsearch:
    rest:
      uris:
        - 172.16.145.141:9200
```

使用`ElasticsearchTemplate`如下配置

```yaml
spring:
  data:
    elasticsearch:
      cluster-name: elasticsearch
      cluster-nodes: 172.16.145.141:9300
```





### 实体类和注解



```java
package top.codekiller.test.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "item",type = "docs",shards = 1,replicas = 0)
public class Item {
    @Id
    Long id;
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    String title; //标题
    @Field(type = FieldType.Keyword)
    String category;// 分类
    @Field(type = FieldType.Keyword)
    String brand; // 品牌
    @Field(type = FieldType.Double)
    Double price; // 价格
    @Field(type = FieldType.Keyword,index = false)
    String images; // 图片地址
}
```



> 映射

Spring Data通过注解来声明字段的映射属性，有下面的三个注解：

- `@Document`

   

  作用在类，标记实体类为文档对象，一般有四个属性

  - indexName：对应索引名称
  - type：对应在索引中的类型
  - shards：分片数量，默认5
  - replicas：副本数量，默认1

- `@Id` 作用在成员变量，标记一个字段作为id主键

- `@Field`

   

  作用在成员变量，标记为文档的字段，并指定字段映射属性：

  - type：字段类型，取值是枚举：FieldType
  - index：是否索引，布尔类型，默认是true
  - store：是否存储，布尔类型，默认是false
  - analyzer：分词器名称：ik_max_word





### Template索引操作

> 创建索引

ElasticsearchTemplate中提供了创建索引的API：

```java
@SpringBootTest
public class ElasticsearchTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void testIndex() throws Exception{
        // 创建索引，会根据Item类的@Document注解信息来创建
        this.elasticsearchTemplate.createIndex(Item.class);
        // 配置映射，会根据Item类中的id、Field等字段来自动完成映射
        this.elasticsearchTemplate.putMapping(Item.class);
    }
}
```





### Repository文档操作

Spring Data 的强大之处，就在于你不用写任何DAO处理，自动根据方法名或类的信息进行CRUD操作。只要你定义一个接口，然后继承Repository提供的一些子接口，就能具备各种基本的CRUD功能。

我们只需要定义接口，然后继承它就OK了。

![](https://img-blog.csdnimg.cn/20200422162146658.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
}
```



#### 新增文档

```java
@Autowired
private ItemRepository itemRepository;

/**
     * 新增数据
     */
@Test
public void testCreate(){
    //新增单个
    Item item = new Item(1L, "小米手机7", "手机",
                         "小米", 3499.00, "http://image.leyou.com/13123.jpg");
    this.itemRepository.save(item);

    //新增多个
    List<Item> list = new ArrayList<>();
    list.add(new Item(2L, "坚果手机R1", "手机", "锤子", 3699.00, "http://image.leyou.com/123.jpg"));
    list.add(new Item(3L, "华为META10", "手机", "华为", 4499.00, "http://image.leyou.com/3.jpg"));
    // 接收对象集合，实现批量新增
    itemRepository.saveAll(list);

}
```





#### 修改文档

修改和新增是同一个接口，区分的依据就是id，这一点跟我们在页面发起PUT请求是类似的。

```java
@Test
public void testUpdateDocument() throws Exception {
    //将title：小米手机改为 黑米手机666
    Item item = new Item(1L, "黑米手机666", "手机",
            "小米", 3499.00, "http://image.leyou.com/13123.jpg");
    itemRepository.save(item);
}
```





#### 基本查询

ElasticsearchRepository提供了一些基本的查询方法：

我们来试试查询所有：

```java
/**
* 查询数据
*/
@Test
public void testQuery(){
    //根据id查询单条
    Optional<Item> item=this.itemRepository.findById(1L);
    System.out.println(item);

    //查询多条,并按price降序排序
    Iterable<Item> items=this.itemRepository.findAll(Sort.by("price").descending());
    items.forEach(System.out::println);

}
}
```







### 自定义方法

Spring Data 的另一个强大功能，是根据方法名称自动实现功能。

比如：你的方法名叫做：findByTitle，那么它就知道你是根据title查询，然后自动帮你完成，无需写实现类。

当然，方法名称要符合一定的约定：

| Keyword               | Sample                               | Elasticsearch Query String                                   |
| --------------------- | ------------------------------------ | ------------------------------------------------------------ |
| `And`                 | `findByNameAndPrice`                 | `{"bool" : {"must" : [ {"field" : {"name" : "?"}}, {"field" : {"price" : "?"}} ]}}` |
| `Or`                  | `findByNameOrPrice`                  | `{"bool" : {"should" : [ {"field" : {"name" : "?"}}, {"field" : {"price" : "?"}} ]}}` |
| `Is`                  | `findByName`                         | `{"bool" : {"must" : {"field" : {"name" : "?"}}}}`           |
| `Not`                 | `findByNameNot`                      | `{"bool" : {"must_not" : {"field" : {"name" : "?"}}}}`       |
| `Between`             | `findByPriceBetween`                 | `{"bool" : {"must" : {"range" : {"price" : {"from" : ?,"to" : ?,"include_lower" : true,"include_upper" : true}}}}}` |
| `LessThanEqual`       | `findByPriceLessThan`                | `{"bool" : {"must" : {"range" : {"price" : {"from" : null,"to" : ?,"include_lower" : true,"include_upper" : true}}}}}` |
| `GreaterThanEqual`    | `findByPriceGreaterThan`             | `{"bool" : {"must" : {"range" : {"price" : {"from" : ?,"to" : null,"include_lower" : true,"include_upper" : true}}}}}` |
| `Before`              | `findByPriceBefore`                  | `{"bool" : {"must" : {"range" : {"price" : {"from" : null,"to" : ?,"include_lower" : true,"include_upper" : true}}}}}` |
| `After`               | `findByPriceAfter`                   | `{"bool" : {"must" : {"range" : {"price" : {"from" : ?,"to" : null,"include_lower" : true,"include_upper" : true}}}}}` |
| `Like`                | `findByNameLike`                     | `{"bool" : {"must" : {"field" : {"name" : {"query" : "?*","analyze_wildcard" : true}}}}}` |
| `StartingWith`        | `findByNameStartingWith`             | `{"bool" : {"must" : {"field" : {"name" : {"query" : "?*","analyze_wildcard" : true}}}}}` |
| `EndingWith`          | `findByNameEndingWith`               | `{"bool" : {"must" : {"field" : {"name" : {"query" : "*?","analyze_wildcard" : true}}}}}` |
| `Contains/Containing` | `findByNameContaining`               | `{"bool" : {"must" : {"field" : {"name" : {"query" : "**?**","analyze_wildcard" : true}}}}}` |
| `In`                  | `findByNameIn(Collectionnames)`      | `{"bool" : {"must" : {"bool" : {"should" : [ {"field" : {"name" : "?"}}, {"field" : {"name" : "?"}} ]}}}}` |
| `NotIn`               | `findByNameNotIn(Collectionnames)`   | `{"bool" : {"must_not" : {"bool" : {"should" : {"field" : {"name" : "?"}}}}}}` |
| `Near`                | `findByStoreNear`                    | `Not Supported Yet !`                                        |
| `True`                | `findByAvailableTrue`                | `{"bool" : {"must" : {"field" : {"available" : true}}}}`     |
| `False`               | `findByAvailableFalse`               | `{"bool" : {"must" : {"field" : {"available" : false}}}}`    |
| `OrderBy`             | `findByAvailableTrueOrderByNameDesc` | `{"sort" : [{ "name" : {"order" : "desc"} }],"bool" : {"must" : {"field" : {"available" : true}}}}` |



```java
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {

    /**
     * 按照title进行match查询
     * @param title
     * @return
     */
    List<Item> findByTitle(String title);

    /**
     * 按照price进行range查询
     * @param d1
     * @param d2
     * @return
     */
    List<Item> findByPriceBetween(Double d1,Double d2);
}
```

测试方法

```java
    /**
     * 测试自定义方法
     */
@Test
public void testFindByTitle(){
    List<Item> items = this.itemRepository.findByTitle("手机");
    items.forEach(System.out::println);

    System.out.println("---------------------------------");

    List<Item> items2=this.itemRepository.findByPriceBetween(3699.0,4499.0);
    items2.forEach(System.out::println);
}
```

结果:

![](https://img-blog.csdnimg.cn/20200422164155282.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



虽然基本查询和自定义方法已经很强大了，但是如果是复杂查询（模糊、通配符、词条查询等）就显得力不从心了。此时，我们只能使用原生查询。



### 高级查询

#### 基本查询

```java
    /**
     * 高级查询
     */
@Test
public void testSearch(){
    //通过查询构建器工具构建查询条件
    MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("title", "手机");
    Iterable<Item> items = this.itemRepository.search(queryBuilder);
    items.forEach(System.out::println);

}
```

Repository的search方法需要QueryBuilder参数，elasticSearch为我们提供了一个对象QueryBuilders：

![](https://img-blog.csdnimg.cn/20200422165354727.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

QueryBuilders提供了大量的静态方法，用于生成各种不同类型的查询对象，例如：词条、模糊、通配符等QueryBuilder对象。

elasticsearch提供很多可用的查询方式，但是不够灵活。如果想玩过滤或者聚合查询等就很难了。





#### 自定义查询

```java
    /**
     * 高级查询-自定义查询
     */
@Test
public void testNative(){
    //构建自定义查询构建器
    NativeSearchQueryBuilder builder=new NativeSearchQueryBuilder();

    //添加基本的查询条件
    builder.withQuery(QueryBuilders.matchQuery("title","手机"));

    //添加排序
    builder.withSort(SortBuilders.fieldSort("price").order(SortOrder.ASC));

    //添加分页条件，page：页码(从0开始)，size：每页显示条目数
    builder.withPageable(PageRequest.of(2-1,1));

    //执行查询，获取分页结果集
    Page<Item> page = this.itemRepository.search(builder.build());
    System.out.println("总页数：" + page.getTotalPages());
    System.out.println("总条数：" + page.getTotalElements());
    System.out.println("每页显示条数：" + page.getSize());
    System.out.println("当前页码：" + page.getNumber());
    page.getContent().forEach(System.out::println);

}
```



结果:

![](https://img-blog.csdnimg.cn/20200422171345890.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



NativeSearchQueryBuilder：Spring提供的一个`查询条件构建器`，帮助构建json格式的请求体

`Page`：默认是分页查询，因此返回的是一个分页的结果对象，包含属性：

- totalElements：总条数
- totalPages：总页数
- Iterator：迭代器，本身实现了Iterator接口，因此可直接迭代得到当前页的数据
- 其它属性：

![](https://img-blog.csdnimg.cn/20200422171010973.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







### 聚合

#### 聚合为桶

桶就是分组，比如这里我们按照品牌brand进行分组：

这里`ElasticsearchTemplate`和`ElasticsearchRestTemplate`有点不一样

使用`ElasticsearchTemplate`如下获取

```java
@Test
public void testAggs(){
    //初始化自定义查询构建器
    NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();
    //添加聚合
    queryBuilder.addAggregation(AggregationBuilders.terms("brandAgg").field("brand")
                                .subAggregation(AggregationBuilders.avg("price_avg").field("price")));
    //添加结果集过滤，不包含任何字段
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{},null));
    //执行聚合查询
    AggregatedPage<Item>  itemPage= (AggregatedPage<Item>) this.itemRepository.search(queryBuilder.build());
    //解析聚合结果集.从结果中取出名为brands的那个聚合，因为是利用String类型字段来进行的term聚合，所以结果要强转为StringTerm类型
    StringTerms brandAgg= (StringTerms)itemPage.getAggregation("brandAgg");
    List<StringTerms.Bucket> buckets = brandAgg.getBuckets();
    buckets.forEach(bucket -> {
        System.out.println(bucket.getKeyAsString());
        System.out.println(bucket.getDocCount());
        Map<String, Aggregation> subAggregation = bucket.getAggregations().asMap();
        InternalAvg avg =(InternalAvg)subAggregation.get("price_avg");
        System.out.println(avg.getValue());
    });
}
```



使用ElasticsearchRestTemplate

```java
@Test
public void testNativeQueryAggregation() throws Exception {
    // 构建查询条件
    NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();

    // 不查询任何字段
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{}, null));

    //添加一个新的聚合，聚合类型为terms，聚合名称为brands，聚合字段为brand
    queryBuilder.addAggregation(AggregationBuilders.terms("brandAgg").field("brand"));

    //执行查询
    Page<Item> pageResult = this.itemRepository.search(queryBuilder.build());

    //把结果强转为AggregatedPage类型
    AggregatedPage<Item> aggregatedPageResult = (AggregatedPage<Item>) pageResult;

    //从结果中取出名为brands的那个聚合，因为是利用String类型字段来进行的term聚合，所以结果要强转为StringTerm类型
    ParsedStringTerms parsedStringTerms = (ParsedStringTerms) aggregatedPageResult.getAggregation("brandAgg");
    //获取桶
    List<ParsedStringTerms.ParsedBucket> buckets = (List<ParsedStringTerms.ParsedBucket>) parsedStringTerms.getBuckets();

    for (ParsedStringTerms.ParsedBucket bucket : buckets) {
        //获取桶中的key，即品牌名称
        System.out.println(bucket.getKeyAsString());
        //获取桶中的文档数量
        System.out.println(bucket.getDocCount());
    }
}

```



关键API：

- `AggregationBuilders`：聚合的构建工厂类。所有聚合都由这个类来构建，看看他的静态方法：

![](https://img-blog.csdnimg.cn/20200422213914156.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

`AggregatedPage`：聚合查询的结果类。它是`Page`的子接口：

![](https://img-blog.csdnimg.cn/20200422213935867.png)

`AggregatedPage`在`Page`功能的基础上，拓展了与聚合相关的功能，它其实就是对聚合结果的一种封装，大家可以对照聚合结果的JSON结构来看。

![](https://img-blog.csdnimg.cn/20200422213955370.png)

而返回的结果都是Aggregation类型对象，不过根据字段类型不同，又有不同的子类表示

![](https://img-blog.csdnimg.cn/20200422214020655.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们看下页面的查询的JSON结果与Java类的对照关系：

![](https://img-blog.csdnimg.cn/20200422214039496.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)











## 基本商品搜索

### 创建搜索服务

创建module：`leyou-search`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>top.codekiller.leyou</groupId>
        <artifactId>leyou-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-search</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>leyou-search</name>
    <description>Demo project for Spring Boot</description>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
        <dependency>
            <groupId>top.codekiller.leyou</groupId>
            <artifactId>leyou-common</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```



application

```yaml
server:
  port: 8083

spring:
  application:
    name: serach-service
  data:
    elasticsearch:
      cluster-name: elasticsearch
      cluster-nodes: 192.168.0.1:9300

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    registry-fetch-interval-seconds: 10
  instance:
    lease-renewal-interval-in-seconds: 5
    lease-expiration-duration-in-seconds: 15
```



引导类：

```java
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LeyouSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouSearchApplication.class, args);
    }

}
```







### 索引库数据格式分析

接下来，我们需要商品数据导入索引库，便于用户搜索。

那么问题来了，我们有SPU和SKU，到底如何保存到索引库？



#### 以结果为导向

来看下京东的搜索结果页：

![在这里插入图片描述](https://img-blog.csdnimg.cn/2020042222353262.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



可以看到，每一个搜索结果都有至少1个商品，当我们选择大图下方的小图，商品会跟着变化。

因此，**搜索的结果是SPU，即多个SKU的集合**。

既然搜索的结果是SPU，那么我们索引库中存储的应该也是SPU，但是却需要包含SKU的信息。



#### 需要什么数据

再来看看页面中有什么数据：

![](https://img-blog.csdnimg.cn/2020042222364642.png)



直观能看到的：图片、价格、标题、副标题

暗藏的数据：spu的id，sku的id

另外，页面还有过滤条件：

![](https://img-blog.csdnimg.cn/20200422223721945.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



这些过滤条件也都需要存储到索引库中，包括：

商品分类、品牌、可用来搜索的规格参数等

综上所述，我们需要的数据格式有：

spuId、SkuId、商品分类id、品牌id、图片、价格、商品的创建时间、sku信息集、可搜索的规格参数



#### 最终的数据结构

我们创建一个类，封装要保存到索引库的数据，并设置映射属性：

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "goods",type="docs",replicas = 0,shards = 1)
public class Goods {
    /**
     * spuid
     */
    @Id
    private Long id;
    /**
     * 所有需要搜索的信息，包括标题，分类，品牌
     */
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String all;
    /**
     * 卖点
     */
    @Field(type=FieldType.Keyword,index = false)
    private String subTitle;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 一级分类
     */
    private Long cid1;
    /**
     * 二级分类
     */
    private Long cid2;
    /**
     * 三级分类
     */
    private Long cid3;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 价格集合
     */
    private List<Long> price;
    /**
     * List<sku>信息的json结构
     */
    @Field(type=FieldType.Keyword,index=false)
    private String skus;
    /**
     * 可搜索的规格参数，key是参数名，值是参数值
     */
    private Map<String,Object> specs;
}
```

一些特殊字段解释：

- all：用来进行全文检索的字段，里面包含标题、商品分类信息

- price：价格数组，是所有sku的价格集合。方便根据价格进行筛选过滤

- skus：用于页面展示的sku信息，不索引，不搜索。包含skuId、image、price、title字段

- specs：所有规格参数的集合。key是参数名，值是参数值。

  例如：我们在specs中存储 内存：4G,6G，颜色为红色，转为json就是：

```json
{
    "specs":{
        "内存":[4G,6G],
        "颜色":"红色"
    }
}
```

当存储到索引库时，elasticsearch会处理为两个字段：

- specs.内存：[4G,6G]
- specs.颜色：红色

另外， 对于字符串类型，还会额外存储一个字段，这个字段不会分词，用作聚合。

- specs.颜色.keyword：红色





### 商品微服务提供接口

索引库中的数据来自于数据库，我们不能直接去查询商品的数据库，因为真实开发中，每个微服务都是相互独立的，包括数据库也是一样。所以我们只能调用商品微服务提供的接口服务。

先思考我们需要的数据：

- SPU信息（Spu）
- SKU信息（Sku）
- SPU的详情 （SpuDetail）
- 商品分类名称（拼接all字段）（Category）
- 品牌名称 （Brand）
- 规格参数（SpuDetail.genericSpec，Sku.ownSpec）

再思考我们需要哪些服务：

- 第一：分页查询spu的服务，已有。
- 第二：根据spuId查询sku的服务，已有
- 第三：根据spuId查询SpuDetail的服务，已有
- 第四：根据商品分类id，查询商品分类名称，`无`
- 第五：根据商品品牌id，查询商品的品牌，`无`
- 第六：规格参数接口 已有

因此我们需要额外提供一个查询商品分类名称的接口。



#### 商品分类名称查询

> Controller

在CategoryController中添加接口：

```java
/**
     * 通过id的集合获取分类名称的集合
     * @param ids
     * @return
     */
    @GetMapping
    public ResponseEntity<List<String>> queryNameByIds(@RequestParam("ids") List<Long> ids){
        List<String> names = this.categoryService.queryNamesByIds(ids);
        if(CollectionUtils.isEmpty(names)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(names);

    }
```



> service

```java
@Override
public List<String> queryNamesByIds(List<Long> ids) {
    List<Category> categories=this.categoryMapper.selectBatchIds(ids);
    return categories.stream().map(category -> category.getName()).collect(Collectors.toList());
}
```





#### 商品品牌查询

> controller

```java
/**
     * 通过id获取brand
     * @param id
     * @return
     */
@GetMapping("{id}")
public ResponseEntity<Brand> queryBrandById(@PathVariable("id") Long id){
    Brand brand=this.brandService.queryBrandById();
    if(brand==null){
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(brand);
}
```



> service

```java
@Override
public Brand queryBrandById(Long id) {
    return this.brandMapper.selectById(id);
}
```







#### 编写FeignClient

##### 问题展现

操作leyou-search工程

现在，我们要在搜索微服务调用商品微服务的接口。

第一步要在leyou-search工程中，引入商品微服务依赖：`leyou-item-interface`。

```xml
<!--商品微服务-->
<dependency>
    <groupId>com.leyou.item</groupId>
    <artifactId>leyou-item-interface</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
<dependency>
    <groupId>com.leyou.common</groupId>
    <artifactId>leyou-common</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```



配置文件

```yaml
server:
  port: 8083

spring:
  application:
    name: serach-service
  data:
    elasticsearch:
      cluster-name: elasticsearch
      cluster-nodes: 39.97.180.158:9300
  main:
    allow-bean-definition-overriding: true

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    registry-fetch-interval-seconds: 10
  instance:
    lease-renewal-interval-in-seconds: 5
    lease-expiration-duration-in-seconds: 15

ribbon:
  ConnectTimeout: 50000 #请求连接的超时时间，默认时间为1秒
  ReadTimeout: 50000 #请求处理的超时时间
```





##### 编写API

- 我们的服务提供方不仅提供实体类，还要提供api接口声明
- 调用方不用自己编写接口方法声明，直接继承提供方给的Api接口即可，

第一步：服务的提供方在`leyou-item-interface`中提供API接口，并编写接口声明：

![](https://img-blog.csdnimg.cn/20200415233312869.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



商品分类服务接口：

返回值不再使用ResponseEntity：

> GoodsApi

```java
public interface GoodsApi {
    /**
     * 根据spu的id查询SpuDetail
     * @param spuId
     * @return
     */
    @GetMapping("spu/detail/{spuId}")
    SpuDetail querySpuDetailBySpuId(@PathVariable("spuId") Long spuId);

    /**
     * 根据分页条件查询spu
     * @param key 关键字
     * @param saleable 上架/下架
     * @param page 当前页码
     * @param rows 当前页行
     * @return
     */
    @GetMapping("spu/page")
    PageResult<Spu> querySpuByPage(@RequestParam(value = "key", required = false) String key,
                                   @RequestParam(value = "saleable", required = false) Boolean saleable,
                                   @RequestParam(value = "page", defaultValue = "1") Integer page,
                                   @RequestParam(value = "rows", defaultValue = "5") Integer rows);

    /**
     * 根据spu的id查询sku的集合
     * @param spuId
     * @return
     */
    @GetMapping("sku/list")
    List<Sku> querySkuBySpuId(@RequestParam("id") Long spuId);


}
```



> BrandApi

```java
public interface BrandApi {

    /**
     * 通过id获取brand
     * @param id
     * @return
     */
    @GetMapping("brand/{id}")
    Brand queryBrandById(@PathVariable("id") Long id);
}
```



> CategoryApi

```java
public interface CategoryApi {

    /**
     * 通过id的集合获取分类名称的集合
     * @param ids
     * @return
     */
    @GetMapping("category")
    List<String> queryNameByIds(@RequestParam("ids") List<Long> ids);
}
```



> SpecificationApi

```java
public interface SpecificationApi {

    /**
     * 根据条件查询规格参数
     * @param cid 分类id
     * @param gid 组id
     * @param generic 是否是通用参数
     * @param searching 是否是特殊参数
     * @return
     */
    @GetMapping("spec/params")
    public ResponseEntity<List<SpecParam>> queryParams(@RequestParam(value = "gid",required = false)Long gid,
                                                       @RequestParam(value = "cid",required = false)Long cid,
                                                       @RequestParam(value = "generic",required = false) Boolean generic,
                                                       @RequestParam(value="searching",required = false) Boolean searching);

    }
}
```



第二步：在调用方`leyou-search`中编写FeignClient，但不要写方法声明了，直接继承`leyou-item-interface`提供的api接口：

![](https://img-blog.csdnimg.cn/20200423193317217.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

商品的FeignClient：

```java
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {
}
```

商品分类的FeignClient：

```java
@FeignClient(value = "item-service")
public interface CategoryClient extends CategoryApi {
}
```

品牌的FeignClient：

```java
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
```

规格参数的FeignClient:

```java
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {
}
```

是不是简单多了？





### 导入数据

#### 创建GoodsRepository

![](https://img-blog.csdnimg.cn/20200424162321167.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
```



#### 创建索引并导入数据

导入数据其实就是查询数据，然后把查询到的Spu转变为Goods来保存，因此我们先编写一个SearchService，然后在里面定义一个方法， 把Spu转为Goods

```java
package top.codekiller.leyou.search.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import top.codekiller.leyou.pojo.*;
import top.codekiller.leyou.search.client.BrandClient;
import top.codekiller.leyou.search.client.CategoryClient;
import top.codekiller.leyou.search.client.GoodsClient;
import top.codekiller.leyou.search.client.SpecificationClient;
import top.codekiller.leyou.search.pojo.Goods;
import top.codekiller.leyou.search.service.ISearchService;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SearchService  implements ISearchService {

    @Autowired
    private CategoryClient categoryClient;

    @Autowired
    private GoodsClient goodsClient;

    @Autowired
    private BrandClient brandClient;

    @Autowired
    private SpecificationClient specificationClient;

    private static final ObjectMapper MAPPER=new ObjectMapper();

    @Override
    public Goods buildGoods(Spu spu) throws IOException {
        //通过分类的id查询分类名称
        List<String> names=this.categoryClient.queryNameByIds(Arrays.asList(spu.getCid1(),spu.getCid2(),spu.getCid3()));

        //根据品牌id查询品牌
        Brand brand=this.brandClient.queryBrandById(spu.getBrandId());

        //根据spuId查询所有的sku
        List<Sku> skus = this.goodsClient.querySkuBySpuId(spu.getId());
        //初始化一个价格集合
        List<Long> prices=skus.stream().map(sku-> sku.getPrice()).collect(Collectors.toList());
        //收集sku的必要字段信息
        List<Map<String,Object>> skuMapList=new ArrayList<>();
        skus.forEach(sku->{
            Map<String,Object> map=new HashMap<>();
            map.put("id",sku.getId());
            map.put("title",sku.getTitle());
            map.put("price",sku.getPrice());
            //获取sku中的图片，数据库的图片可能是多张，多张以“，”分割，返回图片数组，我们获取第一张图片
            map.put("image",StringUtils.isBlank(sku.getImages())?"":StringUtils.split(sku.getImages(),",")[0]);
            skuMapList.add(map);
        });

        //获取spu中的cid3查询出所有的搜索规格参数
        List<SpecParam> params=this.specificationClient.queryParams(null, spu.getCid3(), null, true);

        //根据spuId获取spuDetail,并且获取通用参数
        SpuDetail spuDetail=this.goodsClient.querySpuDetailBySpuId(spu.getId());
        //把通用的规格参数值，进行反序列化
        Map<String,Object> genericSpecMap=MAPPER.readValue(spuDetail.getGenericSpec(),new TypeReference<Map<String,Object>>(){});
        //把特殊的规格参数值，进行序列化
        Map<String,List<Object>> specialSpecMap=MAPPER.readValue(spuDetail.getSpecialSpec(),new TypeReference<HashMap<String,List<Object>>>(){});



        Map<String,Object> specs=new HashMap<>();
        params.forEach(param->{
            //判断规格参数的类型，是否是通用的规格参数
            if(param.getGeneric()){
                //如果是通用类型的参数，则从genericSpecMap获取规格参数值
                String value= genericSpecMap.get(param.getId().toString()).toString();
                //判断是否为数字类型，如果是数字类型，应该返回一个区间
                if(param.getNumeric()){
                    specs.put(param.getName(),this.chooseSegment(value,param));
                }
                specs.put(param.getName(),value);
            }else {
                //如果是特殊的规格参数，从specialSpecMap中获取值
                List<Object> value =specialSpecMap.get(param.getId().toString());
                specs.put(param.getName(),value);
            }

        });


        Goods goods=new Goods();
        goods.setId(spu.getId());
        goods.setCid1(spu.getCid1());
        goods.setCid2(spu.getCid2());
        goods.setCid3(spu.getCid3());
        goods.setBrandId(spu.getBrandId());
        goods.setCreateTime(spu.getCreateTime());
        goods.setSubTitle(spu.getSubTitle());

        //拼接All字段，需要分类名称和品牌名称。“ ”设置空格分割是防止不同类别连着一起而被分词
        goods.setAll(spu.getTitle()+" "+ StringUtils.join(names," ") +" "+brand.getName());

        //获取spu下的所有sku价格
        goods.setPrice(prices);

        //获取spu下的所有sku，并且转为json字符串
        String skuInfo = null;
        try {
            skuInfo = MAPPER.writeValueAsString(skuMapList);
        } catch (JsonProcessingException e) {
            log.error("sku信息转化为json异常："+e.toString());
        }
        goods.setSkus(skuInfo);
        //获取所有查询的规格参数(name:value)
        goods.setSpecs(specs);

        return goods;
    }

    /**
     * 获取可选区间
     *
     * @param value
     * @param p
     * @return
     */
    private String chooseSegment(String value, SpecParam p) {
        double val = NumberUtils.toDouble(value);
        String result = "其它";
        // 保存数值段
        for (String segment : p.getSegments().split(",")) {
            String[] segs = segment.split("-");
            // 获取数值范围
            double begin = NumberUtils.toDouble(segs[0]);
            double end = Double.MAX_VALUE;
            if (segs.length == 2) {
                end = NumberUtils.toDouble(segs[1]);
            }
            // 判断是否在范围内
            if (val >= begin && val < end) {
                if (segs.length == 1) {
                    result = segs[0] + p.getUnit() + "以上";
                } else if (begin == 0) {
                    result = segs[1] + p.getUnit() + "以下";
                } else {
                    result = segment + p.getUnit();
                }
                break;
            }
        }
        return result;
    }
}
```

因为过滤参数中有一类比较特殊，就是数值区间：

![](https://img-blog.csdnimg.cn/20200424162605619.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

所以我们在存入时要进行处理：

```java
private String chooseSegment(String value, SpecParam p) {
    double val = NumberUtils.toDouble(value);
    String result = "其它";
    // 保存数值段
    for (String segment : p.getSegments().split(",")) {
        String[] segs = segment.split("-");
        // 获取数值范围
        double begin = NumberUtils.toDouble(segs[0]);
        double end = Double.MAX_VALUE;
        if(segs.length == 2){
            end = NumberUtils.toDouble(segs[1]);
        }
        // 判断是否在范围内
        if(val >= begin && val < end){
            if(segs.length == 1){
                result = segs[0] + p.getUnit() + "以上";
            }else if(begin == 0){
                result = segs[1] + p.getUnit() + "以下";
            }else{
                result = segment + p.getUnit();
            }
            break;
        }
    }
    return result;
}
```

然后编写一个测试类，循环查询Spu，然后调用IndexService中的方法，把SPU变为Goods，然后写入索引库：

```java
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeyouSearchApplication.class)
public class ElasticTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private SearchService searchService;

    @Autowired
    private GoodsClient goodsClient;

    @Test
    public void test(){
        //创建索引和映射
        this.elasticsearchTemplate.createIndex(Goods.class);
        this.elasticsearchTemplate.putMapping(Goods.class);

        Integer page = 1;
        Integer rows = 100;
        do {

            //分页查询spu，获取分页结果集
            PageResult<SpuBo> result = this.goodsClient.querySpuByPage(null, null, page, rows);
            //获取当前页的数据
            List<SpuBo> items = result.getItems();
            //处理
            List<Goods> goods = items.stream().map(spuBo -> {
                try {
                    return this.searchService.buildGoods(spuBo);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }).collect(Collectors.toList());

            this.goodsRepository.saveAll(goods);
            rows=items.size();
            page++;
        }while (rows==100);
    }
}
```



#### 异常报错

![](https://img-blog.csdnimg.cn/20200423232045827.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



这里一共出现了三个错误，上面的仅仅是其中一处

> 错误1：多个FeignClient的value值相同
>
> `@FeignClient(value="item-service")`
>
> 解决：加上 allow-bean-definition-overriding: true

```yaml
spring:
  application:
    name: serach-service
  data:
    elasticsearch:
      cluster-name: elasticsearch
      cluster-nodes: 192.168.1.1:9300
  main:
    allow-bean-definition-overriding: true
```



> 错误二：提示需要数据库的url
>
> 解决：直接禁掉自动配置类就可以了
>
> `@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})`

```java
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class LeyouSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouSearchApplication.class, args);
    }

}
```



> 错误三：响应超时，而造成异常报错
>
> 解决：修改ribbon的连接超时时间和请求处理的超时时间

```yaml
ribbon:
  ConnectTimeout: 50000 #请求连接的超时时间，默认时间为1秒
  ReadTimeout: 50000 #请求处理的超时时间
```





### 实现基本搜索

#### 页面分析

##### 页面跳转

在首页的顶部，有一个输入框：

![](https://img-blog.csdnimg.cn/20200424172048344.png)

当我们输入任何文本，`点击搜索`，就会跳转到搜索页`search.html`了：

并且将搜索关键字以请求参数携带过来：

![](https://img-blog.csdnimg.cn/20200424172124597.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



我们打开`search.html`，在最下面会有提前定义好的Vue实例：

```vue
<script type="text/javascript">
    var vm = new Vue({
        el: "#searchApp",
        data: {
        },
        components:{
            // 加载页面顶部组件
            lyTop: () => import("./js/pages/top.js")
        }
    });
</script>
```



这个Vue实例中，通过import导入的方式，加载了另外一个js：top.js并作为一个局部组件。top其实是页面顶部导航组件，我们暂时不管



##### 发起异步请求

要想在页面加载后，就展示出搜索结果。我们应该在页面加载时，获取地址栏请求参数，并发起异步请求，查询后台数据，然后在页面渲染。

我们在data中定义一个对象，记录请求的参数：

```vue
data: {
    search:{
        key:"", // 搜索页面的关键字
    }
}
```



我们通过钩子函数created，在页面加载时获取请求参数，并记录下来。

```vue
created(){
    // 判断是否有请求参数
    if(!location.search){
        return;
    }
    // 将请求参数转为对象 eg：location.search＝(?key=手机) 转为{key: "小米"}
    const search = ly.parse(location.search.substring(1));
    // 记录在data的search对象中
    this.search = search;

    // 发起请求，根据条件搜索
    this.loadData();
}
```

然后发起请求，搜索数据。

```vue
methods: {
    loadData(){
        ly.http.post("/search/page", this.search).then(resp=>{
            console.log(resp);
        });
    }
}
```



- 我们这里使用`ly`是common.js中定义的工具对象。
- 这里使用的是post请求，这样可以携带更多参数，并且以json格式发送

```vue
<script type="text/javascript">
    var vm = new Vue({
        el: "#searchApp",
        data: {
            search: {
                key: "", // 搜索页面的关键字
            },
            goodList: []
        },
        created(){
            // 判断是否有请求参数
            if(!location.search){
                return;
            }
            // 将请求参数转为对象 eg：location.search＝(?key=手机) 转为{key: "小米"}
            const search = ly.parse(location.search.substring(1));
            // 记录在data的search对象中
            this.search = search;

            // 发起请求，根据条件搜索
            this.loadData();
        },
        methods: {
            loadData(){
                alert("dsa");
                ly.http.post("/search/page",this.search).then(res=>{
                    alert("das");
                    console.log(res);
                }).catch(()=>{

                })
            }
        },
        components:{
            lyTop: () => import("./js/pages/top.js")
        }
    });
</script>
```



在leyou-gateway中的CORS配置类中，添加允许信任域名：

![](https://img-blog.csdnimg.cn/20200424172345754.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



并在leyou-gateway工程的Application.yml中添加网关映射：

![](https://img-blog.csdnimg.cn/20200424172409707.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



刷新页面试试：

![](https://img-blog.csdnimg.cn/20200424172441310.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



因为后台没有提供接口，所以无法访问。没关系，接下来我们实现后台接口





#### 后台代码

##### controller

![](https://img-blog.csdnimg.cn/20200424195818801.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

首先分析几个问题：

- 请求方式：Post
- 请求路径：/search/page，不过前面的/search应该是网关的映射路径，因此真实映射路径page，代表分页查询
- 请求参数：json格式，目前只有一个属性：key-搜索关键字，但是搜索结果页一定是带有分页查询的，所以将来肯定会有page属性，因此我们可以用一个对象来接收请求的json数据：

```java
package top.codekiller.leyou.search.pojo;

public class SearchRequest {
    private String key;// 搜索条件

    private Integer page;// 当前页

    private static final Integer DEFAULT_SIZE = 20;// 每页大小，不从页面接收，而是固定大小
    private static final Integer DEFAULT_PAGE = 1;// 默认页

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getPage() {
        if(page == null){
            return DEFAULT_PAGE;
        }
        // 获取页码时做一些校验，不能小于1
        return Math.max(DEFAULT_PAGE, page);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return DEFAULT_SIZE;
    }
}
```

- 返回结果：作为分页结果，一般都两个属性：当前页数据、总条数信息，我们可以使用之前定义的PageResult类

代码：

```java
@Controller
public class SearchController {

    @Autowired
    private ISearchService searchService;

    @PostMapping("page")
    public ResponseEntity<PageResult<Goods>> search(@RequestBody SearchRequest request){
        PageResult<Goods> result=this.searchService.search(request);
        if(result==null|| CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }
}
```





##### service

![](https://img-blog.csdnimg.cn/20200424200029507.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
@Override
public PageResult<Goods> search(SearchRequest request) {
    if(StringUtils.isBlank(request.getKey())) return null;

    //自定义查询构建器
    NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();
    //添加查询条件
    queryBuilder.withQuery(QueryBuilders.matchQuery("all",request.getKey()).operator(Operator.AND));
    //添加分页，页码从0开始
    queryBuilder.withPageable(PageRequest.of(request.getPage()-1,request.getSize()));
    //添加结果集过滤
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{"id","skus","subTitle"},null));

    //执行查询,获取结果集
    Page<Goods> goodsPage=this.goodsRepository.search(queryBuilder.build());
    return new PageResult<Goods>(goodsPage.getTotalElements(),goodsPage.getTotalPages(),goodsPage.getContent());

}
```

注意点：我们要设置SourceFilter，来选择要返回的结果，否则返回一堆没用的数据，影响查询效率。





#### 测试

![](https://img-blog.csdnimg.cn/20200424200304882.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

数据是查到了，但是因为我们只查询部分字段，所以结果json 数据中有很多null，这很不优雅。

解决办法很简单，在leyou-search的application.yml中添加一行配置，json处理时忽略空值：

```yaml
spring:
  jackson:
    default-property-inclusion: non_null # 配置json处理时忽略空值
```







### 页面渲染

页面已经拿到了结果，接下来就要渲染样式了。

#### 保存搜索结果

首先，在data中定义属性，保存搜索的结果：

![](https://img-blog.csdnimg.cn/2020042422161029.png)

在`loadData`的异步查询中，将结果赋值给`goodsList`：

![](https://img-blog.csdnimg.cn/20200424221635597.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 循环展示商品

在search.html的中部，有一个`div`，用来展示所有搜索到的商品：

![](https://img-blog.csdnimg.cn/2020042422170977.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以看到，`div`中有一个无序列表`ul`，内部的每一个`li`就是一个商品spu了。

我们删除多余的，只保留一个`li`，然后利用vue的循环来展示搜索到的结果：

![](https://img-blog.csdnimg.cn/20200424221729583.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







#### 多sku展示

接下来展示具体的商品信息，来看图：

![](https://img-blog.csdnimg.cn/20200424221815584.png)

这里我们可以发现，一个商品位置，是多个sku的信息集合。**当用户鼠标选择某个sku，对应的图片、价格、标题会随之改变！**

我们先来实现sku的选择，才能去展示不同sku的数据。

![](https://img-blog.csdnimg.cn/20200424221834725.png)

可以看到，在列表中默认第一个是被选中的，那我们就需要做两件事情：

- 在搜索到数据时，先默认把第一个sku作为被选中的，记录下来
- 记录当前被选中的是哪一个sku，记录在哪里比较合适呢？显然是遍历到的goods对象自己内部，因为每一个goods都会有自己的sku信息。





##### 初始化sku

查询出的结果集skus是一个json类型的字符串，不是js对象

![](https://img-blog.csdnimg.cn/20200424222102979.png)

我们在查询成功的回调函数中，对goods进行遍历，把skus转化成json对象集合，并添加一个selected属性保存被选中的sku：

![](https://img-blog.csdnimg.cn/20200424222126210.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



![](https://img-blog.csdnimg.cn/20200424222138537.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







##### 多sku图片展示

![](https://img-blog.csdnimg.cn/2020042422231193.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



看到又是一个无序列表，这里我们也一样删掉多余的，保留一个`li`，需要注意选中的项有一个样式类：selected

我们的代码：

```html
<!--多sku图片列表-->
<ul class="skus">
    <li :class="{selected: sku.id == goods.selected.id}" v-for="sku in goods.skus" :key="sku.id"
        @mouseOver="goods.selected=sku">
        <img :src="sku.image">
    </li>
</ul>
```

注意：

- class样式通过 goods.selected的id是否与当前sku的id一致来判断
- 绑定了鼠标事件，鼠标进入后把当前sku赋值到goods.selected





#### 展示sku其它属性

现在，我们已经可以通过`goods.selected获取`用户选中的sku，那么我们就可以在页面展示了：

![](https://img-blog.csdnimg.cn/20200424222429729.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

刷新页面：

![](https://img-blog.csdnimg.cn/20200424222452117.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



看起来很完美是吧！

但其实有一些瑕疵







#### 其它问题

##### sku点击不切换

还有一个错误比较隐蔽，不容易被发现。我们点击sku 的图片列表，发现没有任何变化。

这不科学啊，为什么？

这是因为Vue的自动渲染是基于对象的属性变化的。比如页面使用GoodsList进行渲染，如果GoodsList变化，或者其内部的任何子对象变化，都会Vue感知，从而从新渲染页面。

然而，这一切有一个前提，那就是当你第一次渲染时，对象中有哪些属性，Vue就只监视这些属性，后来添加的属性发生改变，是不会被监视到的。

而我们的goods对象中，本身是没有selected属性的，是我们后来才添加进去的：

![](https://img-blog.csdnimg.cn/20200424222935846.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这段代码稍微改造一下，即可：

![](https://img-blog.csdnimg.cn/20200424222953537.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

也就是说，我们先把selected属性初始化完毕，然后才把整个对象赋值给goodsList，这样，goodsList已初始化时就有selected属性，以后就会被正常监控了。

![](https://img-blog.csdnimg.cn/20200424223010176.png)







##### 标题过长

标题内容太长了，已经无法完全显示，怎么办？

截取一下：

![](https://img-blog.csdnimg.cn/20200424223056225.png)

最好在加个悬停展示所有内容的效果







##### 价格显示是分

首先价格显示就不正确，我们数据库中存放的是以分为单位，所以这里要格式化。

好在我们之前common.js中定义了工具类，可以帮我们转换。

改造：

![](https://img-blog.csdnimg.cn/2020042422315524.png)

结果报错：

![](https://img-blog.csdnimg.cn/20200424223214744.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



为啥？

因为在Vue范围内使用任何变量，都会默认去Vue实例中寻找，我们使用ly，但是Vue实例中没有这个变量。所以解决办法就是把ly记录到Vue实例：

![](https://img-blog.csdnimg.cn/2020042422323744.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



然后刷新页面：

![](https://img-blog.csdnimg.cn/20200424223335828.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)













### 页面分页效果

刚才的查询中，我们默认了查询的页码和每页大小，因此所有的分页功能都无法使用，接下来我们一起看看`分页功能条`该如何制作。

这里要分两步，

- 第一步：如何生成分页条
- 第二步：点击分页按钮，我们做什么

#### 如何分成分页条

先看下页面关于分页部分的代码：

![](https://img-blog.csdnimg.cn/20200424232132727.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







可以看到所有的分页栏内容都是写死的。

#### 需要的数据

分页数据应该是根据**总页数**、**当前页**、**总条数**等信息来计算得出。

- 当前页：肯定是由页面来决定的，点击按钮会切换到对应的页
- 总页数：需要后台传递给我们
- 总条数：需要后台传递给我们

我们首先在data中记录下这几个值：page-当前页，total-总条数，totalPage-总页数

```js
data: {
    ly,
    search:{
        key: "",
        page: 1 //当前页
    },
    goodsList:[], // 接收搜索得到的结果
    total: 0, // 总条数
    totalPage: 0 // 总页数
}
```

因为page是搜索条件之一，所以记录在search对象中。

要注意：我们在created钩子函数中，会读取url路径的参数，然后赋值给search。如果是第一次请求页面，page是不存在的。因此为了避免page被覆盖，我们应该这么做：

![](https://img-blog.csdnimg.cn/20200424232312308.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

不过，这个时候我们自己的search对象中的值就可有可无了



#### 页面计算分条

首先，把后台提供的数据保存在data中：

![](https://img-blog.csdnimg.cn/20200424232538958.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后看下我们要实现的效果：

![](https://img-blog.csdnimg.cn/20200424232611513.png)

这里最复杂的是中间的1~5的分页按钮，它需要动态变化。

思路分析：

- 最多有5个按钮，因此我们可以用`v-for`循环从1到5即可
- 但是分页条不一定是从1开始：
  - 如果当前页值小于等于3的时候，分页条位置从1开始到5结束
  - 如果总页数小于等于5的时候，分页条位置从1开始到总页数结束
  - 如果当前页码大于3，应该从page-3开始
  - 但是如果当前页码大于totalPage-3，应该从totalPage-5开始

所以，我们的页面这样来做：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200424233908702.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

标签中的分页数字通过`index`函数来计算，需要把`i`传递过去：

```js
index(i){
    if(this.search.currentPage<=3||this.totalPage<=5) {
        return i;
    }else if(this.search.currentPage>=this.totalPage-2){
        return this.totalPage-5+i;
    }else{
        return this.search.currentPage-3+i;
    }
},
```

需要注意的是，如果总页数不足5页，我们就不应该遍历1~~5，而是1~~总页数，稍作改进：



分页条的其它部分就比较简单了：

```vue
<div class="sui-pagination pagination-large">
    <ul style="width: 550px">
        <li :class="{prev:true,disabled:search.page === 1}">
            <a href="#">«上一页</a>
        </li>
        <li :class="{active: index(i) === search.page}" v-for="i in Math.min(5,totalPage)" :key="i">
            <a href="#">{{index(i)}}</a>
        </li>
        <li class="dotted" v-show="totalPage > 5"><span>...</span></li>
        <li :class="{next:true,disabled:search.page === totalPage}">
            <a href="#">下一页»</a>
        </li>
    </ul>
    <div>
        <span>共{{totalPage}}页&nbsp;</span>
        <span>
            到第
            <input type="text" class="page-num" :value="search.page">
            页 <button class="page-confirm" onclick="alert(1)">确定</button>
        </span>
    </div>
</div>
```







#### 点击分页做什么

点击分页按钮后，自然是要修改`page`的值

所以，我们在`上一页`、`下一页`按钮添加点击事件，对page进行修改，在数字按钮上绑定点击事件，点击直接修改page：

![](https://img-blog.csdnimg.cn/20200424233016110.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



翻页事件的方法：

```js
    prevPage(){
        if(this.search.page > 1){
            this.search.page--
        }
    },
    nextPage(){
        if(this.search.page < this.totalPage){
            this.search.page++
        }
    }
```

当`page`发生变化，我们应该去后台重新查询数据。

不过，如果我们直接发起ajax请求，那么浏览器的地址栏中是不会有变化的，没有记录下分页信息。如果用户刷新页面，那么就会回到第一页。

这样不太友好，我们应该把**搜索条件记录在地址栏的查询参数中**。

因此，我们监听search的变化，然后把search的过滤字段拼接在url路径后：

```js
watch:{
    search:{
        deep:true,
        handler(val){
            // 把search对象变成请求参数，拼接在url路径
            window.location.href = "http://www.leyou.com/search.html?" + ly.stringify(val);
        }
    }
},
```

刷新页面测试，然后就出现重大bug：页面无限刷新！为什么？

因为Vue实例初始化的钩子函数中，我们读取请求参数，赋值给search的时候，也触发了watch监视！也就是说，每次页面创建完成，都会触发watch，然后就会去修改window.location路径，然后页面被刷新，再次触发created钩子，又触发watch，周而复始，无限循环。

所以，我们需要在watch中进行监控，如果发现是第一次初始化，则不继续向下执行。

那么问题是，如何判断是不是第一次？

第一次初始化时，search中的key值肯定是空的，所以，我们这么做：

```js
watch:{
    search:{
        deep:true,
        handler(val,old){
            if(!old || !old.key){
                // 如果旧的search值为空，或者search中的key为空，证明是第一次
                return;
            }
            // 把search对象变成请求参数，拼接在url路径
            window.location.href = "http://www.leyou.com/search.html?" + ly.stringify(val);
        }
    }
}
```

再次刷新，OK了！



#### 页面顶部分页条

在页面商品列表的顶部，也有一个分页条：

![](https://img-blog.csdnimg.cn/20200425202201260.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们把这一部分，也加上点击事件：

```html
<div class="top-pagination">
    <span>共 <i style="color: #222;">{{totalPage}}+</i> 商品</span>
    <span><i style="color: red;">{{search.currentPage}}</i>/{{totalPage}}</span>
    <a class="btn-arrow" href="#" style="display: inline-block" @click="prev()">&lt;</a>
    <a class="btn-arrow" href="#" style="display: inline-block" @click="next()">&gt;</a>
</div>
```



#### 代码

```js
<!--上方页数跳转-->
    <div class="top-pagination">
        <span>共 <i style="color: #222;">{{totalPage}}+</i> 商品</span>
        <span><i style="color: red;">{{search.currentPage}}</i>/{{totalPage}}</span>
        <a class="btn-arrow" href="#" style="display: inline-block" @click="prev()">&lt;</a>
        <a class="btn-arrow" href="#" style="display: inline-block" @click="next()">&gt;</a>
     </div>
    ------------------------------------

<!--sku展示-->
<div class="list-wrap">
    <div class="p-img">
        <a href="item.html" target="_blank"><img :src="goods.selected.image" height="200"/></a>
        <ul class="skus">
    <li :class="{selected: goods.selected.id==sku.id}" v-for="(sku,j) in goods.skus" :key="j"        @mouseOver="goods.selected=sku"><img :src="sku.image"></li>
</ul>
</div>
<div class="clearfix"></div>
<div class="price">
    <strong>
    <em>¥</em>
<i>{{ly.formatPrice(goods.selected.price)}}</i>
</strong>
</div>
<div class="attr">
    <em>{{goods.selected.title.length>20 ?   goods.selected.title.substring(0,20):goods.selected.title}}</em>
</div>
<div class="cu">
    <em>{{goods.subTitle.length>17 ? goods.subTitle.substring(0,17):goods.subTitle}}</em>
</div>
<div class="commit">
    <i class="command">已有2000人评价</i>
</div>
<div class="operate">
    <a href="success-cart.html" target="_blank" class="sui-btn btn-bordered btn-danger">加入购物车</a>
    <a href="javascript:void(0);" class="sui-btn btn-bordered">对比</a>
    <a href="javascript:void(0);" class="sui-btn btn-bordered">关注</a>
</div>
</div>

------------------------------------------
<!--下方页面跳转-->
<ul>
    <li class="prev" :class="{disabled: search.currentPage==1}" @click="prev()">
        <a href="#">«上一页</a>
</li>
<li :class="{active: search.currentPage==index(i)}" v-for="i in Math.min(5,totalPage)" >
    <a href="#" @click="search.currentPage=index(i)">{{index(i)}}</a>
</li>
<li class="dotted"><span>...</span></li>
    <li class="next" :class="{disabled: search.currentPage==totalPage}" @click="next()">
        <a href="#">下一页»</a>
</li>
</ul>

   ---------------------------------------

            var vm = new Vue({
                el: "#searchApp",
                data: {
                    ly,
                    search: {
                        key: "", // 搜索页面的关键字
                        currentPage: 1
                    },
                    goodsList: [],
                    totalPage: 1,

                },
                created(){
                    // 判断是否有请求参数
                    if(!location.search){
                        return;
                    }
                    // 将请求参数转为对象 eg：location.search＝(?key=手机) 转为{key: "小米"}
                    const search = ly.parse(location.search.substring(1));
                    // 记录在data的search对象中
                    this.search = search;
                    this.search.currentPage=1;

                    // 发起请求，根据条件搜索
                    this.loadData();
                },
                methods: {
                    loadData(){
                        ly.http.post("/search/page",this.search).then(({data})=>{
                            this.totalPage=data.totalPage;
                            data.items.forEach(goods=>{
                                goods.skus=JSON.parse(goods.skus);
                                goods.selected=goods.skus[0];
                            })
                            this.goodsList=data.items;  //放在后面是为了是selected属性可以被监控
                        }).catch(()=>{

                        })
                    },
                    index(i){
                        if(this.search.currentPage<=3||this.totalPage<=5) {
                            return i;
                        }else if(this.search.currentPage>=this.totalPage-2){
                            return this.totalPage-5+i;
                        }else{
                            return this.search.currentPage-3+i;
                        }
                    },
                    prev(){
                        if(this.search.currentPage>1){
                            this.search.currentPage--;
                        }
                    },

                    next(){
                        if(this.search.currentPage!=this.totalPage){
                            this.search.currentPage++;
                        }
                    }
                },
                components:{
                    lyTop: () => import("./js/pages/top.js")
                }
            });
```







## 商品搜索过滤

### 过滤功能分析

首先看下页面要实现的效果：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1526725119663.png)





整个过滤部分有3块：

- 顶部的导航，已经选择的过滤条件展示：
  - 商品分类面包屑，根据用户选择的商品分类变化
  - 其它已选择过滤参数
- 过滤条件展示，又包含3部分
  - 商品分类展示
  - 品牌展示
  - 其它规格参数
- 展开或收起的过滤条件的按钮

顶部导航要展示的内容跟用户选择的过滤条件有关。

- 比如用户选择了某个商品分类，则面包屑中才会展示具体的分类
- 比如用户选择了某个品牌，列表中才会有品牌信息。

所以，这部分需要依赖第二部分：过滤条件的展示和选择。因此我们先不着急去做。

展开或收起的按钮是否显示，取决于过滤条件有多少，如果很少，那么就没必要展示。所以也是跟第二部分的过滤条件有关。

这样分析来看，我们必须先做第二部分：过滤条件展示。



### 生成分类和品牌过滤

先来看分类和品牌。在我们的数据库中已经有所有的分类和品牌信息。在这个位置，是不是把所有的分类和品牌信息都展示出来呢？

显然不是，用户搜索的条件会对商品进行过滤，而在搜索结果中，不一定包含所有的分类和品牌，直接展示出所有商品分类，让用户选择显然是不合适的。

无论是分类信息，还是品牌信息，都应该从搜索的结果商品中进行聚合得到。

###　扩展返回的结果

原来，我们返回的结果是PageResult对象，里面只有total、totalPage、items 3个属性。但是现在要对商品分类和品牌进行聚合，数据显然不够用，我们需要对返回的结果进行扩展，添加分类和品牌的数据。

那么问题来了：以什么格式返回呢？

看页面：

![](https://img-blog.csdnimg.cn/20200425223152692.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

分类：页面显示了分类名称，但背后肯定要保存id信息。所以至少要有id和name

品牌：页面展示的有logo，有文字，当然肯定有id，基本上是品牌的完整数据

我们新建一个类，继承PageResult，然后扩展两个新的属性：分类集合和品牌集合：

![](https://img-blog.csdnimg.cn/20200425223254384.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





```java
package top.codekiller.leyou.search.pojo;

import com.leyou.common.pojo.PageResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.codekiller.leyou.pojo.Brand;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class SearchResult extends PageResult<Goods> {

    /**
     * 3个分类的集合
     */
    private List<Map<String,Object>> category;

    /**
     * 品牌集合
     */
    private List<Brand> brands;



    public SearchResult(List<Map<String, Object>> category, List<Brand> brands) {
        this.category = category;
        this.brands = brands;
    }

    public SearchResult(Long total, Integer totalPage, List<Goods> items, List<Map<String, Object>> category, List<Brand> brands) {
        super(total, totalPage, items);
        this.category = category;
        this.brands = brands;
    }
}
```





#### 聚合商品分类和品牌

我们修改搜索的业务逻辑，对分类和品牌聚合。

因为索引库中只有id，所以我们根据id聚合，然后再根据id去查询完整数据。

所以，商品微服务需要提供一个接口：根据品牌id集合，批量查询品牌。

修改SearchService：



```java
@Override
public SearchResult search(SearchRequest request) {
    if(StringUtils.isBlank(request.getKey())) return null;

    //自定义查询构建器
    NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();

    //添加查询条件
    queryBuilder.withQuery(QueryBuilders.matchQuery("all",request.getKey()).operator(Operator.AND));
    //添加分页，页码从0开始
    queryBuilder.withPageable(PageRequest.of(request.getPage()-1,request.getSize()));
    //添加结果集过滤
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{"id","skus","subTitle"},null));

    //添加分类和品牌的聚合
    String categotyAggName="categories";
    String brandAggName="brands";
    queryBuilder.addAggregation(AggregationBuilders.terms(categotyAggName).field("cid3"));
    queryBuilder.addAggregation(AggregationBuilders.terms(brandAggName).field("brandId"));



    //执行查询,获取结果集
    AggregatedPage<Goods> goodsPage=(AggregatedPage<Goods>) this.goodsRepository.search(queryBuilder.build());
    
    //获取聚合结果集
    List<Map<String,Object>> categories=getCategotyAggResult(goodsPage.getAggregation(categotyAggName));
    List<Brand> brands=getBrandAggResult(goodsPage.getAggregation(brandAggName));
    
    return new SearchResult(goodsPage.getTotalElements(),goodsPage.getTotalPages(),goodsPage.getContent(),categories,brands);

}


/**
     * 解析分类的聚合结果集
     * @param aggregation
     * @return
     */
private List<Map<String,Object>> getCategotyAggResult(Aggregation aggregation){
    LongTerms terms = (LongTerms) aggregation;

    //获取桶的集合，转化为List<Map<String,Object>>
    return ((LongTerms) aggregation).getBuckets().stream().map(bucket -> {
        //转为为一个map
        Map<String,Object> map=new HashMap<>();
        //获取桶中的key（id）
        Long id=bucket.getKeyAsNumber().longValue();
        //根据分类id查询查询分类名称
        List<String> names=this.categoryClient.queryNameByIds(Arrays.asList(id));
        map.put("id",id);
        map.put("name",names.get(0));
        return map;
    }).collect(Collectors.toList());
}


/**
     * 解析品牌的聚合结果集
     * @param aggregation
     * @return
     */
private List<Brand> getBrandAggResult(Aggregation aggregation){
    LongTerms terms = (LongTerms) aggregation;

    //获取聚合的桶
    return ((LongTerms) aggregation).getBuckets().stream().map(bucket ->
                                                               this.brandClient.queryBrandById(bucket.getKeyAsNumber().longValue())
                                                              ).collect(Collectors.toList());

}
```



测试：

![](https://img-blog.csdnimg.cn/20200425224120709.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





###　页面渲染数据

#### 过滤参数数据结构

来看下页面的展示效果：

![](https://img-blog.csdnimg.cn/20200425224214460.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



虽然分类、品牌内容都不太一样，但是结构相似，都是key和value的结构。

而且页面结构也极为类似：

![](https://img-blog.csdnimg.cn/20200425224230201.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



所以，我们可以把所有的过滤条件放入一个`数组`中，然后在页面利用`v-for`遍历一次生成。

其基本结构是这样的：

```js
[
    {
        k:"过滤字段名",
        options:[{/*过滤字段值对象*/},{/*过滤字段值对象*/}]
    }
]
```

我们先在data中定义数组：filters，等待组装过滤参数：

```js
        data: {
            ly,
            search: {
                key: "", // 搜索页面的关键字
                currentPage: 1  //当前页数
            },
            goodsList: [],  //商品集
            totalPage: 1,  //总页数
            filters: []  //过滤条件集合

        },
```

然后在查询搜索结果的回调函数中，对过滤参数进行封装：

```vue
 ly.http.post("/search/page",this.search).then(({data})=>{
                    this.totalPage=data.totalPage;
                    data.items.forEach(goods=>{
                        goods.skus=JSON.parse(goods.skus);
                        goods.selected=goods.skus[0];
                    })
                    this.goodsList=data.items;  //放在后面是为了是selected属性可以被监控
					//初始化分类过滤项
                    this.filters.push({
                        k: "分类",
                        options: data.category
                    });
					//初始化品牌过滤项
                    this.filters.push({
                        k: "品牌",
                        options: data.brands
                    });
                }).catch(()=>{

                })
```



然后刷新页面，通过浏览器工具，查看封装的结果：

![](https://img-blog.csdnimg.cn/20200425224732726.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 页面渲染数据

首先看页面原来的代码

![](https://img-blog.csdnimg.cn/20200425224812193.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们注意到，虽然页面元素是一样的，但是品牌会比其它搜索条件多出一些样式，因为品牌是以图片展示。需要进行特殊处理。数据展示是一致的，我们采用v-for处理：

```html
    <!--循环渲染分类过滤项-->
    <div class="type-wrap" v-for="(filter,index) in filters" :key="index" v-if="filter.k!='品牌'">
        <div class="fl key">{{filter.k}}</div>
        <div class="fl value" >
            <ul class="type-list">
                <li v-for="option in filter.options" :key="option.id">
                    <a>{{option.name}}</a>
                </li>
            </ul>
        </div>
        <div class="fl ext"></div>
    </div>
    
    <!--循环渲染品牌过滤项-->
    <div class="type-wrap logo" v-else>
        <div class="fl key brand">{{filter.k}}</div>
        <div class="value logos">
            <ul class="logo-list">
                <li v-for="option in filter.options" :key="option.id">
                    <img :src="option.image" v-if="option.image"></img>
            <a v-else>{{option.name}}</a>
            </li>
        </ul>
		</div>
		<div class="fl ext">
    		<a href="javascript:void(0);" class="sui-btn">多选</a>
		</div>
	</div>
```

将头部样式表59-64行注释的css样式打开

结果：

![](https://img-blog.csdnimg.cn/20200425225243908.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







###　生成规格参数过滤

#### 谋而后动

有四个问题需要先思考清楚：

- 什么时候显示规格参数过滤？ （分类有多个的时候怎么办）
- 如何知道哪些规格需要过滤？
- 要过滤的参数，其可选值是如何获取的？
- 规格过滤的可选值，其数据格式怎样的？

> 什么情况下显示有关规格参数的过滤？

如果用户尚未选择商品分类，或者聚合得到的分类数大于1，那么就没必要进行规格参数的聚合。因为不同分类的商品，其规格是不同的。

因此，我们在后台**需要对聚合得到的商品分类数量进行判断，如果等于1，我们才继续进行规格参数的聚合**。

> 如何知道哪些规格需要过滤？

我们不能把数据库中的所有规格参数都拿来过滤。因为并不是所有的规格参数都可以用来过滤，参数的值是不确定的。

值的庆幸的是，我们在设计规格参数时，已经标记了某些规格可搜索，某些不可搜索。

因此，一旦商品分类确定，我们就可以根据商品分类查询到其对应的规格，从而知道哪些规格要进行搜索。

> 要过滤的参数，其可选值是如何获取的？

虽然数据库中有所有的规格参数，但是不能把一切数据都用来供用户选择。

与商品分类和品牌一样，应该是从用户搜索得到的结果中聚合，得到与结果品牌的规格参数可选值。

> 规格过滤的可选值，其数据格式怎样的？

我们直接看页面效果：

![](https://img-blog.csdnimg.cn/20200426212530316.png)

我们之前存储时已经将数据分段，恰好符合这里的需求



####　 实战

接下来，我们就用代码实现刚才的思路。

总结一下，应该是以下几步：

1. 用户搜索得到商品，并聚合出商品分类
2. 判断分类数量是否等于1，如果是则进行规格参数聚合
3. 先根据分类，查找可以用来搜索的规格
4. 对规格参数进行聚合
5. 将规格参数聚合结果整理后返回



####扩展返回结果

返回结果中需要增加新数据，用来保存规格参数过滤条件。这里与前面的品牌和分类过滤的json结构类似：

```json
[
    {
        "k":"规格参数名",
        "options":["规格参数值","规格参数值"]
    }
]
```

因此，在java中我们用List<Map<String, Object>>来表示。

```java
public class SearchResult extends PageResult<Goods> {
    private List<Map<String, Object>> specs;
}
```



#### 判断是否需要聚合

首先，在聚合得到商品分类后，判断分类的个数，如果是1个则进行规格聚合：

```java
//获取聚合结果
List<Map<String, Object>> categoryDatas = this.getCategoryAggregation(searchResult.getAggregation("categoryAgg"));
List<Brand> brands = this.getBrandAggregation(searchResult.getAggregation("brandAgg"));

//判断聚合出的分类是否是1个，如果是1个则进行该分类的规格参数聚合
if (!CollectionUtils.isEmpty(categoryDatas) && categoryDatas.size() == 1) {
    List<Map<String, Object>> specs = this.getSpecAggregation();
}
```

然后想一想要想聚合出规格参数需要哪些参数

- `分类id`，需要根据分类id查询出所有的可搜索规格参数
- `查询条件`

将开始的查询条件抽取出来

![](https://img-blog.csdnimg.cn/20200426212751864.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

修改`getSpecAggregation`方法添加`分类id`和查询条件两个参数

```java
//判断聚合出的分类是否是1个，如果是1个则进行该分类的规格参数聚合
if (!CollectionUtils.isEmpty(categoryDatas) && categoryDatas.size() == 1) {
    List<Map<String, Object>> specs = this.getSpecAggregation((Long) categoryDatas.get(0).get("id"), basicQuery);
}
```



```java
private List<Map<String, Object>> getSpecAggregation(Long cid, QueryBuilder basicQuery) {
    return null;
}
```



#### 获取需要聚合的规格参数

然后，我们需要根据商品分类，查询所有可用于搜索的规格参数：

![](https://img-blog.csdnimg.cn/20200426212951971.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



要注意的是，这里我们需要根据分类id查询规格，而规格参数接口需要从商品微服务提供



#### 聚合规格参数

因为规格参数保存时不做分词，因此其名称要带上一个.keyword后缀：

![](https://img-blog.csdnimg.cn/20200426213040620.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200426214242967.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 解析规格参数

![](https://img-blog.csdnimg.cn/20200426214338512.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 完整代码

```java
@Override
public SearchResult search(SearchRequest request) {
    if(StringUtils.isBlank(request.getKey())) return null;

    //自定义查询构建器
    NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();

    //添加查询条件
    MatchQueryBuilder baseBuilder=QueryBuilders.matchQuery("all",request.getKey()).operator(Operator.AND);
    queryBuilder.withQuery(baseBuilder);
    //添加分页，页码从0开始
    queryBuilder.withPageable(PageRequest.of(request.getPage()-1,request.getSize()));
    //添加结果集过滤
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{"id","skus","subTitle"},null));


    //添加分类和品牌的聚合
    String categotyAggName="categories";
    String brandAggName="brands";
    queryBuilder.addAggregation(AggregationBuilders.terms(categotyAggName).field("cid3"));
    queryBuilder.addAggregation(AggregationBuilders.terms(brandAggName).field("brandId"));




    //执行查询,获取结果集
    AggregatedPage<Goods> goodsPage=(AggregatedPage<Goods>) this.goodsRepository.search(queryBuilder.build());
    List<Map<String,Object>> categories=getCategotyAggResult(goodsPage.getAggregation(categotyAggName));
    List<Brand> brands=getBrandAggResult(goodsPage.getAggregation(brandAggName));

    //判断是否是一个分类，只有一个分类是才做规格参数的集合
    List<Map<String,Object>> specs=null;
    if(!CollectionUtils.isEmpty(categories)&&categories.size()==1){
        //对规格参数进行聚合
        specs=getParamAggResult((Long)categories.get(0).get("id"),baseBuilder);
    }


    return new SearchResult(goodsPage.getTotalElements(),goodsPage.getTotalPages(),goodsPage.getContent(),categories,brands,specs);

}



/**
     * 根据查询条件聚合参数结果集解析
     * @param cid
     * @param baseBuilder
     * @return
     */
private List<Map<String,Object>> getParamAggResult(Long cid,QueryBuilder baseBuilder){
    //自定义查询构建器
    NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();

    //添加基本查询条件
    queryBuilder.withQuery(baseBuilder);

    //查询要聚合的规格参数
    List<SpecParam> specParams = this.specificationClient.queryParams(null, cid, null, true);

    //添加规格参数的聚合
    specParams.forEach(param->{
        queryBuilder.addAggregation(AggregationBuilders.terms(param.getName()).field("specs."+param.getName()+".keyword"));
    });
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{},null));

    //执行查询
    AggregatedPage<Goods> aggregatedPage=(AggregatedPage<Goods>) this.goodsRepository.search(queryBuilder.build());

    List<Map<String,Object>> specs=new ArrayList<>();
    //解析聚合结果集,key-聚合名称(规格参数名) value=聚合对象
    Map<String, Aggregation> aggregationMap = aggregatedPage.getAggregations().asMap();
    for (Map.Entry<String, Aggregation> entry : aggregationMap.entrySet()) {
        //初始化一个map，k-规格参数名 options：聚合的规格参数值
        Map<String,Object> map=new HashMap<>();
        map.put("k",entry.getKey());
        StringTerms terms=(StringTerms)entry.getValue();
        List<StringTerms.Bucket> buckets = terms.getBuckets();
        map.put("options",buckets.stream().map(bucket-> bucket.getKey()).collect(Collectors.toList()));
        specs.add(map);
    }

    return specs;
}
```



由于这里需要处理的代码较多，可能耗时较长导致网关超时，在leyou-gateway配置超时时间

```yaml
hystrix:
  command:
    default:
      execution:
        isolation:
          thread:
            timeoutInMilliseconds: 5000 # 设置hystrix的超时时间5秒
```







#### 测试结果

![](https://img-blog.csdnimg.cn/20200426214426790.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 规格参数页面渲染

#### 渲染规格过滤条件

首先把后台传递过来的specs添加到filters数组：

要注意：分类、品牌的option选项是对象，里面有name属性，而specs中的option是简单的字符串，所以需要进行封装，变为相同的结构：

```vue
//初始化分类过滤项
this.filters.push({
    k: "分类",
    options: data.category
});  

//初始化品牌过滤项
this.filters.push({
    k: "品牌",
    options: data.brands
});

//初始化参数过滤项
data.specs.forEach(spec=>{
    spec.options=spec.options.map(o=>({name: o}));  //将每个o变为一个对象,可以通过name获取参数值
    this.filters.push(spec);
})
```



html渲染代码

```html
<!--循环渲染分类和参数过滤项-->
<div class="type-wrap" v-for="(filter,index) in filters" :key="index" v-if="filter.k!='品牌'">
    <div class="fl key">{{filter.k}}</div>
    <div class="fl value" >
        <ul class="type-list">
            <li v-for="option in filter.options" :key="option.id">
                <a>{{option.name}}</a>
            </li>
        </ul>
    </div>
    <div class="fl ext"></div>
</div>
```







#### 展示或收起过滤条件

是不是感觉显示的太多了，我们可以通过按钮点击来展开和隐藏部分内容：

![](https://img-blog.csdnimg.cn/20200427212130241.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们在data中定义变量，记录展开或隐藏的状态：

![](https://img-blog.csdnimg.cn/20200427212149893.png)

然后在按钮绑定点击事件，以改变show的取值：

```html
<div class="type-wrap" style="text-align: center">
    <v-btn small flat @click="show=true" v-show="!show">
        更多
        <v-icon>arrow_drop_down</v-icon>
    </v-btn>
    <v-btn small="" flat @click="show=false" v-show="show">
        收起
        <v-icon>arrow_drop_up</v-icon>
    </v-btn>
</div>
```

在展示规格时，对show进行判断：

![](https://img-blog.csdnimg.cn/20200427212248360.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







### 过滤条件搜索

当我们点击页面的过滤项，要做哪些事情？

- 把过滤条件保存在search对象中（watch监控到search变化后就会发送到后台）
- 在页面顶部展示已选择的过滤项
- 把商品分类展示到顶部面包屑



### 保存过滤项

#### 定义属性

我们把已选择的过滤项保存在search中：

![](https://img-blog.csdnimg.cn/20200427212428588.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

要注意，在created构造函数中会对search进行初始化，所以要在构造函数中对filter进行初始化：

![](https://img-blog.csdnimg.cn/20200427212447910.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



search.filter是一个对象，结构：

```js
{
    "过滤项名":"过滤项值"
}
```







#### 绑定点击事件

给所有的过滤项绑定点击事件：

![](https://img-blog.csdnimg.cn/20200427212539794.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70) 



要注意，点击事件传2个参数：

- k：过滤项的key
- option：当前过滤项对象

在点击事件中，保存过滤项到`selectedFilter`：

```js
selectFilter(k, option) {
    //由于新增加的元素不会被vue监测到，所以采用对filters进行重新赋值的方法
    const temp = {};
    Object.assign(temp, this.search.filters);
    if (k === '分类' || k === '品牌') {
        temp[k] = option.id;
    } else {
        temp[k] = option.name;
    }
    //再赋值给search的filters
    this.search.filters = temp;
}
```



另外，这里search对象中嵌套了filters对象，请求参数格式化时需要进行特殊处理，修改common.js中的一段代码

![](https://img-blog.csdnimg.cn/20200427212844869.png)

![](https://img-blog.csdnimg.cn/20200427212858149.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





我们刷新页面，点击后通过浏览器功能查看`search.filters`的属性变化：

并且，此时浏览器地址也发生了变化：

http://www.leyou.com/search.html?key=手机&page=1&filters.后置摄像头=1000-1500万&filters.CPU品牌=海思（Hisilicon）&filters.CPU核数=十核&filters.品牌=18374

网络请求也正常发出：





### 后台添加过滤条件

既然请求已经发送到了后台，那接下来我们就在后台去添加这些条件：



#### 扩展请求对象

我们需要在请求类：`SearchRequest`中添加属性，接收过滤属性。过滤属性都是键值对格式，但是key不确定而且还是中文，所以用一个map来接收即可。

```java
private Map<String, String> filters = new HashMap<>();
```



#### 添加过滤条件 

目前，我们的基本查询是这样的：

![](https://img-blog.csdnimg.cn/20200427213010789.png)

现在，我们要把页面传递的过滤条件也加入进去。

因此不能在使用普通的查询，而是要用到BooleanQuery，基本结构是这样的：

```json
GET goods/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "match": {
            "all": {
              "query": "手机",
              "operator": "and"
            }
          }
        }
      ],
      "filter": {
        "term": {
          "brandId": "18374"
        }
      }
    }
  }
}
```

所以，我们对原来的基本查询进行改造：（SearchService中的search方法）

![](https://img-blog.csdnimg.cn/20200427213304373.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200427213338998.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

因为比较复杂，我们将其封装到一个方法中了

```java
@Override
public SearchResult search(SearchRequest request) {
    if(StringUtils.isBlank(request.getKey())) return null;

    //自定义查询构建器
    NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();

    //添加基本查询条件
    //        MatchQueryBuilder baseBuilder=QueryBuilders.matchQuery("all",request.getKey()).operator(Operator.AND);
    //添加过滤查询条件
    BoolQueryBuilder baseBuilder=this.boolQueryBuilder(request);
    queryBuilder.withQuery(baseBuilder);



    //添加分页，页码从0开始
    queryBuilder.withPageable(PageRequest.of(request.getPage()-1,request.getSize()));
    //添加结果集过滤
    queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{"id","skus","subTitle"},null));


    //添加分类和品牌的聚合
    String categotyAggName="categories";
    String brandAggName="brands";
    queryBuilder.addAggregation(AggregationBuilders.terms(categotyAggName).field("cid3"));
    queryBuilder.addAggregation(AggregationBuilders.terms(brandAggName).field("brandId"));




    //执行查询,获取结果集
    AggregatedPage<Goods> goodsPage=(AggregatedPage<Goods>) this.goodsRepository.search(queryBuilder.build());
    List<Map<String,Object>> categories=getCategotyAggResult(goodsPage.getAggregation(categotyAggName));
    List<Brand> brands=getBrandAggResult(goodsPage.getAggregation(brandAggName));

    //判断是否是一个分类，只有一个分类是才做规格参数的集合
    List<Map<String,Object>> specs=null;
    if(!CollectionUtils.isEmpty(categories)&&categories.size()==1){
        //对规格参数进行聚合
        specs=getParamAggResult((Long)categories.get(0).get("id"),baseBuilder);
    }


    return new SearchResult(goodsPage.getTotalElements(),goodsPage.getTotalPages(),goodsPage.getContent(),categories,brands,specs);

}

/**
     * 构建布尔查询
     * @param request
     * @return
     */
private BoolQueryBuilder boolQueryBuilder(SearchRequest request) {
    //获取布尔查询构建器
    BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();

    //给布尔查询添加基本查询条件
    boolQueryBuilder.must(QueryBuilders.matchQuery("all",request.getKey()).operator(Operator.AND));

    // 添加过滤条件
    if (CollectionUtils.isEmpty(request.getFilter())) {
        return boolQueryBuilder;
    }

    //获取用户选择的过滤信息
    Map<String, Object> filter = request.getFilter();
    for (Map.Entry<String, Object> entry : filter.entrySet()) {
        String key=entry.getKey();
        if(StringUtils.equals("品牌",key)) {
            key="brandId";
        }else if(StringUtils.equals("分类",key)){
            key="cid3";
        }else{
            key="specs."+key+".keyword";
        }
        boolQueryBuilder.filter(QueryBuilders.termQuery(key,entry.getValue()));
    }

    return boolQueryBuilder;
}
```







### 页面展示选择的过滤项

#### 商品分类面包屑

当用户选择一个商品分类以后，我们应该在过滤模块的上方展示一个面包屑，把三级商品分类都显示出来。

![](https://img-blog.csdnimg.cn/20200427214448980.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

用户选择的商品分类就存放在search.filters中，但是里面只有第三级分类的id：cid3

我们需要根据它查询出1-3级分类的id及名称



#### 提供查询分类接口
我们在商品微服务中提供一个根据三级分类id查询1~3级分类集合的方法：

>Controller

```java
@GetMapping("all/level")
public ResponseEntity<List<Category>> queryAllByCid3(@RequestParam("id") Long id) {
    List<Category> list = this.categoryService.queryAllByCid3(id);
    if (CollectionUtils.isEmpty(list)) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(list);
}
```

> Service
```java

    @Override
    public List<Category> queryAllByCid3(Long id) {
        Category c3 = this.categoryMapper.selectByPrimaryKey(id);
        Category c2 = this.categoryMapper.selectByPrimaryKey(c3.getParentId());
        Category c1 = this.categoryMapper.selectByPrimaryKey(c2.getParentId());
        return Arrays.asList(c1, c2, c3);
    }
}
```
测试：
![](https://img-blog.csdnimg.cn/20200427214603287.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 页面展示面包屑

后台提供了接口，下面的问题是，我们在哪里去查询接口？

大家首先想到的肯定是当用户点击以后。

但是我们思考一下：用户点击以后，就会重新发起请求，页面刷新，那么你渲染的结果就没了。

因此，应该是在页面重新加载完毕后，此时因为过滤条件中加入了商品分类的条件，所以查询的结果中只有1个分类。

我们判断商品分类是否只有1个，如果是，则查询三级商品分类，添加到面包屑即可。
![](https://img-blog.csdnimg.cn/20200427214654230.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

渲染：
```html

<!--面包屑-->
<ul class="fl sui-breadcrumb">
    <li><span>全部结果:</span></li>
    <li v-for="(category,index) in breads" :key="index">
        <a href="#" v-if="index!=breads.length-1">{{category.name}}</a>
        <span v-else>{{category.name}}</span>
    </li>
</ul>
```
```vue
//判断分类是否只有一个，一个的情况下查询分类面包屑
if (data.categories.length == 1) {
    ly.http.get("/item/category/all/level", {params: {id: data.categories[0].id}}).then(resp => {
        this.breads = resp.data;
    });
}
```
刷新页面：
![](https://img-blog.csdnimg.cn/2020042721483380.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 其它过滤项

接下来，我们需要在页面展示用户已选择的过滤项，如图：
![](https://img-blog.csdnimg.cn/20200427214918503.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)
我们知道，所有已选择过滤项都保存在`search.filters`中，因此在页面遍历并展示即可。

但这里有个问题，filters中数据的格式：
![](https://img-blog.csdnimg.cn/20200427214940179.png)
基本有四类数据：

- 商品分类：这个不需要展示，分类展示在面包屑位置
- 品牌：这个要展示，但是其值不合适，我们不能显示一个id在页面。需要找到其name值
- 数值类型规格：这个展示的时候，需要把单位查询出来
- 非数值类型规格：这个直接展示其值即可

因此，我们在页面上这样处理：
```html
<!--已选择过滤项-->
<ul class="tags-choose">
    <li class="tag" v-for="(value,key) in search.filters" v-if="key!=='分类'">
        {{key}}:<span style="color: red">{{getFilterValue(key,value)}}</span>
        <i class="sui-icon icon-tb-close"></i>
    </li>
</ul>
```
判断如果` k === '分类'`说明是商品分类，直接忽略
判断`k === '品牌'`说明是品牌，但是值只有品牌id需要的是品牌名称
值的处理比较复杂，我们用一个方法`getFilterValue(k,v)`来处理，调用时把`k`和`v`都传递

方法内部：

```javascript
getFilterValue(k, v) {
    // 如果没有过滤参数，我们跳过展示
    if (!this.filters || this.filters.length === 0) {
        return null;
    }
    // 判断是否是品牌
    if (k === '品牌') {
        // 返回品牌名称
        return this.filters.find(f => f.k === '品牌').options[0].name;
    }
    return v;
}
```

然后刷新页面，即可看到效果：

![](https://img-blog.csdnimg.cn/20200427220342505.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 隐藏已经选择的过滤项

现在，我们已经实现了已选择过滤项的展示，但是你会发现一个问题：

已经选择的过滤项，在过滤列表中依然存在：

![](https://img-blog.csdnimg.cn/20200427220439825.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这些已经选择的过滤项，应该从列表中移除。

怎么做呢？

你必须先知道用户选择了什么。用户选择的项保存在`search.filters`中：

![](https://img-blog.csdnimg.cn/20200427220458466.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们可以编写一个计算属性，把filters中的 已经被选择的key过滤掉：

```javascript
computed: {
    remainFilters() {
        const keys = Object.keys(this.search.filters);
        //过滤掉在当前搜索筛选条件中的筛选条件组，比如选择了一个品牌，查询后就不应该再有关于品牌的筛选
        return this.filters.filter(f => !keys.includes(f.k));
    }
}
```

然后页面不再直接遍历`filters`，而是遍历`remainFilters`

![](https://img-blog.csdnimg.cn/20200427220701386.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

刷新页面：



![](https://img-blog.csdnimg.cn/20200427220717619.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

最后发现，还剩下一堆没选过的。但是都只有一个可选项，此时再过滤没有任何意义，应该隐藏，所以，在刚才的过滤条件中，还应该添加一条：如果只剩下一个可选项，不显示

![](https://img-blog.csdnimg.cn/20200427220740214.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200427220911132.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 取消过滤项

我们能够看到，每个过滤项后面都有一个小叉，当点击后，应该取消对应条件的过滤。

思路非常简单：

- 给小叉绑定点击事件
- 点击后把过滤项从`search.filters`中移除，页面会自动刷新，OK

> 绑定点击事件：

![](https://img-blog.csdnimg.cn/202004272214139.png)





### 可优化项

搜索系统需要优化的点：

- 查询规格参数部分可以添加缓存
- 聚合计算interval变化频率极低，所以可以设计为定时任务计算（周期为天），然后缓存起来。
- elasticsearch本身有查询缓存，可以不进行优化
- 商品图片应该采用缩略图，减少流量，提高页面加载速度
- 图片采用延迟加载
- 图片还可以采用CDN服务器
- sku信息应该在页面异步加载，而不是放到索引库





### 部分vue代码

```vue
<script type="text/javascript">
    var vm = new Vue({
        el: "#searchApp",
        data: {
            ly,
            search: {
                key: "", // 搜索页面的关键字
                page: 1,  //当前页数
                filter: {}  //过滤条件
            },
            goodsList: [],  //商品集
            totalPage: 1,  //总页数
            filters: [] , //过滤条件
            show: false  //是否暂时更多
        },
        created(){
            // 判断是否有请求参数
            if(!location.search){
                return ;
            }
            // 将请求参数转为对象 eg：location.search＝(?key=手机) 转为{key: "小米"}
            const search = ly.parse(location.search.substring(1));
            search.page=parseInt(search.page) || 1;
            search.filter=search.filter || {};
            // 记录在data的search对象中
            this.search = search;

            // 发起请求，根据条件搜索
            this.loadData();
        },
        methods: {
            loadData(){
                ly.http.post("/search/page",this.search).then(({data})=>{
                    this.totalPage=data.totalPage;
                    data.items.forEach(goods=>{
                        goods.skus=JSON.parse(goods.skus);
                        goods.selected=goods.skus[0];
                    })
                    this.goodsList=data.items;  //放在后面是为了是selected属性可以被监控

                    //初始化分类过滤项
                    this.filters.push({
                        k: "分类",
                        options: data.category
                    });

                    //初始化品牌过滤项
                    this.filters.push({
                        k: "品牌",
                        options: data.brands
                    });

                    //初始化参数过滤项
                    data.specs.forEach(spec=>{
                        spec.options=spec.options.map(o=>({name: o}));
                        this.filters.push(spec);
                    })
                }).catch(()=>{

                })
            },
            index(i){
                if(this.search.page<=3||this.totalPage<=5) {
                    return i;
                }else if(this.search.page>=this.totalPage-2){
                    return this.totalPage-5+i;
                }else{
                    return this.search.page-3+i;
                }
            },
            prev(){
                if(this.search.page>1){
                    this.search.page--;
                }
            },

            next(){
                if(this.search.page!=this.totalPage){
                    this.search.page++;
                }
            },
            selectFilter(k,o){
                //必须重新赋值，不然监控不到
                let obj={};
                Object.assign(obj,this.search);
                if(k=="品牌"||k=="分类") {
                    obj.filter[k] = o.id;
                }else {
                    obj.filter[k]=o.name;
                }
                this.search=obj;
            }
        },
        components:{
            lyTop: () => import("./js/pages/top.js")
        },
        watch: {
            search: {
                deep: true,
                handler(newVal,oldVal){
                    if(!oldVal||!oldVal.key){
                        return ;
                    }
                    window.location.href="http://www.leyou.com/search.html?"+ly.stringify(newVal);
                }
            }
        }
    });
</script>
```



## 商品详情页及页面静态化

当用户搜索到商品，肯定会点击查看，就会进入商品详情页，接下来我们完成商品详情页的展示，

### Thymeleaf

在商品详情页中，我们会使用到Thymeleaf来渲染页面，所以需要先了解Thymeleaf的语法。

[thymeleaf快速上手](https://codekiller.top/2020/04/28/leyou-mall-tools/#toc-heading-41)



###商品详情页服务

商品详情浏览量比较大，并发高，我们会独立开启一个微服务，用来展示商品详情。



####创建module

商品的详情页服务，命名为：`leyou-goods-web`



#### Pom依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>top.codekiller.leyou</groupId>
        <artifactId>leyou-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-goods-web</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>top.codekiller.leyou</groupId>
            <artifactId>leyou-item-interface</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>top.codekiller.leyou</groupId>
            <artifactId>leyou-common</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
</project>
```





#### application.yml

```yaml
server:
  port: 8084
spring:
  application:
    name: goods-web
  thymeleaf:
    cache: false
  main:
    allow-bean-definition-overriding: true
eureka:
  client:
    service-url:
      defaultZone: http://127.0.0.1:10086/eureka
    registry-fetch-interval-seconds: 5
  instance:
    lease-renewal-interval-in-seconds: 5 # 每隔5秒发送一次心跳
    lease-expiration-duration-in-seconds: 10 # 10秒不发送就过期
```





#### 页面模板

我们从`leyou-portal`中复制item.html模板到当前项目resource目录下的templates中：

![](https://img-blog.csdnimg.cn/20200428200926349.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



###  页面跳转

#### 修改页面跳转路径

首先我们需要修改搜索结果页的商品地址，目前所有商品的地址都是：http://www.leyou.com/item.html

我们应该跳转到对应的商品的详情页才对。

那么问题来了：商品详情页是一个SKU？还是多个SKU的集合？

![](https://img-blog.csdnimg.cn/20200428201017584.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

通过详情页的预览，我们知道它是多个SKU的集合，即SPU。

所以，页面跳转时，我们应该携带SPU的id信息。

例如：http://www.leyou.com/item/XXX.html

这里就采用了路径占位符的方式来传递spu的id，我们打开`search.html`，修改其中的商品路径：

```html
<div class="p-img">
    //修改商品详情页面请求路径
    <a :href="'item/'+goods.id+'.html'" target="_blank"><img :src="goods.selected.image"
                                                             height="200"/></a>
    <ul class="skus">
        <li v-for="sku in goods.skus" :class="{selected: sku.id==goods.selected.id}"
            @mouseOver="goods.selected=sku" style="cursor: pointer">
            <img :src="sku.image">
        </li>
    </ul>
```

刷新页面后再看：

![](https://img-blog.csdnimg.cn/20200428201101183.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### Nginx反向代理

接下来，我们要把这个地址指向我们刚刚创建的服务：`leyou-goods-web`，其端口为7004

我们在nginx.conf中添加一段逻辑：

```json
 server {
        listen       80;
        server_name  www.leyou.com;

        proxy_set_header X-Forwarded-Host $host;
		proxy_set_header X-Forwarded-Server $host;
		proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
		
		location /item {
			proxy_pass http://127.0.0.1:8084/item/;
			proxy_connect_timeout 600;
			proxy_read_timeout 600;
		}
		
		location / {
			#proxy_pass http://127.0.0.1:9002;
			proxy_pass http://127.0.0.1:8080;
			proxy_connect_timeout 600;
			proxy_read_timeout 600;
		}
    }
```

把以/item开头的请求，代理到我们的7004端口。

修改完成过刷新Nginx配置



#### 编写页面跳转

在`leyou-goods-web`中编写controller，接收请求，并跳转到商品详情页：

```java
@Controller
@RequestMapping("item")
public class GoodsController {

    /**
     * 跳转到页面详情页
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{id}.html")
    public String toItemPage(@PathVariable("id")Long id, Model model){

        return "item";
    }
}
```







### 封装模型数据

首先我们一起来分析一下，在这个页面中需要哪些数据

我们已知的条件是传递来的spu的id，我们需要根据spu的id查询到下面的数据：

- spu信息
- spu的详情
- spu下的所有sku
- 品牌
- 商品三级分类
- 商品规格参数、规格参数组

#### 商品微服务提供接口



##### <span style="font-size:20px">查询spu</span>

以上所需数据中，根据id查询spu的接口目前还没有，我们需要在商品微服务中提供这个接口：

> GoodController

```java
   /**
     * 通过id获取spu
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public ResponseEntity<Spu> querySpuById(@PathVariable("id") Long id){
        Spu spu=this.goodsService.querySpuById(id);
        if(spu==null){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(spu);
    }
```



> GoodsService

```java
  /**
     * 根据id获取spu
     * @param id
     * @return
     */
    @Override
    public Spu querySpuById(Long id) {
        return this.spuMapper.selectById(id);
    }
```



> GoodsApi

```java
/**
     * 通过id获取spu
     * @param id
     * @return
     */
    @GetMapping("{id}")
    Spu querySpuById(@PathVariable("id") Long id);
```



#####<span style="font-size: 20px">查询规格参数组和组下规格参数</span>

我们在页面展示规格时，需要按组展示：

![](https://img-blog.csdnimg.cn/20200428205204721.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

组内有多个参数，为了方便展示。我们在leyou-item-service中提供一个接口，查询规格组，同时查询规格组内的所有参数。

提供查询接口：

> SpecificationController

```java
    /**
     * 通过cid获取所有规格组和规格参数
     * @param cid
     * @return
     */
    @GetMapping("group/param/{cid}")
    public ResponseEntity<List<SpecGroup>> queryGroupsWithParamByCid(@PathVariable("cid") Long cid){
        List<SpecGroup> groups=this.specificationService.queryGroupsWithParamByCid(cid);
        if(CollectionUtils.isEmpty(groups)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(groups);
    }
```



> SpecificationService

```java
    /**
     * 通过cid获取所有规格组和规格参数
     * @param cid
     * @return
     */
    @Override
    public List<SpecGroup> queryGroupsWithParamByCid(Long cid) {
        List<SpecGroup> groups = this.queryGroupByCid(cid);
        groups.forEach(group->{
            List<SpecParam> params=this.queryParams(group.getId(),null,null,null);
            group.setParams(params);
        });
        return groups;
    }
```

在service中，我们调用之前编写过的方法，查询规格组，和规格参数，然后封装返回。



> GoodsApi

```java
/**
     * 通过cid获取所有规格组和规格参数
     * @param cid
     * @return
     */
    @GetMapping("group/param/{cid}")
    List<SpecGroup> queryGroupsWithParamByCid(@PathVariable("cid") Long cid);
```





#### 创建FeignClient

我们在`leyou-goods-web`服务中，创建FeignClient：

![](https://img-blog.csdnimg.cn/20200428210001173.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

将之前搜索服务中的复制过来



#### 封装数据模型

我们创建一个GoodsService，在里面来封装数据模型。

这里要查询的数据：

- SPU

- SpuDetail

- SKU集合

- 商品分类

  - 这里值需要分类的id和name就够了，因此我们查询到以后自己需要封装数据

- 品牌对象

- 规格组

  - 查询规格组的时候，把规格组下所有的参数也一并查出，上面提供的接口中已经实现该功能，我们直接调

- sku的特有规格参数

  有了规格组，为什么这里还要查询？

  因为在SpuDetail中的SpecialSpec中，是以id作为规格参数的key，如图：

![](https://img-blog.csdnimg.cn/20200429132318664.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

但是，在页面渲染时，需要知道参数的名称，如图：

![](https://img-blog.csdnimg.cn/20200429132335226.png)



- 我们就需要把id和name一一对应起来，因此需要额外查询sku的特有规格参数，然后变成一个id:name的键值对格式。也就是一个Map，方便将来根据id查找！

  

> Service代码

```java
/**
     * 跳转到页面详情页
     * @param spuId
     * @return
     */
    public Map<String,Object> loadData(Long spuId){
        //使用map存储页面所需要的所有数据
        Map<String,Object> model=new HashMap<>();

        //根据spuId查询spu
        Spu spu = this.goodsClient.querySpuById(spuId);

        //根据spuId查询spuDetail
        SpuDetail spuDetail = this.goodsClient.querySpuDetailBySpuId(spuId);

        //根据spuId查询分类信息,Map<String,Object>
        List<Long> cids=Arrays.asList(spu.getCid1(), spu.getCid2(), spu.getCid3());
        List<String> names = this.categoryClient.queryNameByIds(cids);
          //初始化一个分类map
        List<Map<String,Object>> categories=new ArrayList<>();
        for (int i=0;i<cids.size();i++) {
            Map<String,Object> category=new HashMap<>();
            category.put("id",cids.get(i));
            category.put("name",names.get(i));
            categories.add(category);
        }

        //根据brandId查询品牌
        Brand brand = this.brandClient.queryBrandById(spu.getBrandId());


        //根据spuId查询所有的sku
        List<Sku> skus = this.goodsClient.querySkuBySpuId(spuId);


        //根据cid3查询所有的规格参数组合规格参数
        List<SpecGroup> groups = this.specificationClient.queryGroupsWithParamByCid(spu.getCid3());

        //根据spuId查询所有的特殊规格参数
        List<SpecParam> params = this.specificationClient.queryParams(null, spu.getCid3(), false, null);
          //初始化特殊规格参数的map
        Map<Long,String> paramMap=new HashMap<>();
        params.forEach(param->{
            paramMap.put(param.getId(),param.getName());
        });

        model.put("spu",spu);
        model.put("spuDetail",spuDetail);
        model.put("categories",categories);
        model.put("brand",brand);
        model.put("skus",skus);
        model.put("groups",groups);
        model.put("paramMap",paramMap);

        return model;
    }
```

然后在controller中把数据放入model：



> GoodsController

```java
    @GetMapping("/{id}.html")
    public String toItemPage(Model model,@PathVariable("id")Long id){
        Map<String, Object> map = goodsService.loadData(id);
        model.addAllAttributes(map);
        return "item";
    }
```





### 渲染面包屑

在商品展示页的顶部，有一个商品分类、品牌、标题的面包屑

![](https://img-blog.csdnimg.cn/2020042913265469.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

其数据有3部分：

- 商品分类
- 商品品牌
- spu标题

我们的模型中都有，所以直接渲染即可（页面101行开始）：

```html
<ul class="sui-breadcrumb">
    <!--分类-->
    <li th:each="category: ${categories}">
        <a href="#" th:text="${category.name}">分类</a>
    </li>
    <!--品牌-->
    <li>
        <a href="#"  th:text="${brand.name}">品牌</a>
    </li>
    <!--商品标题-->
    <li class="active" th:text="${spu.title}">商品标题</li>
</ul>
```





### 渲染商品列表

先看下整体效果：

![](https://img-blog.csdnimg.cn/2020042913291933.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这个部分需要渲染的数据有5块：

- sku图片
- sku标题
- 副标题
- sku价格
- 特有规格属性列表

其中，sku 的图片、标题、价格，都必须在用户选中一个具体sku后，才能渲染。而特有规格属性列表可以在spuDetail中查询到。而副标题则是在spu中，直接可以在页面渲染

因此，我们先对特有规格属性列表进行渲染。等用户选择一个sku，再通过js对其它sku属性渲染





#### 副标题

副标题是在spu中，所以我们直接通过Thymeleaf渲染：

```html
<div class="news"><span th:utext="${spu.subTitle}"></span></div>
```

副标题中可能会有超链接，因此这里也用`th:utext`来展示，效果：

![](https://img-blog.csdnimg.cn/20200429133003192.png)





#### 渲染规格属性列表

规格属性列表将来会有事件和动态效果。我们需要有js代码参与，不能使用Thymeleaf来渲染了。

因此，这里我们用vue，不过需要先把数据放到js对象中，方便vue使用



##### 初始化数据

我们在页面的`head`中，定义一个js标签，然后在里面定义变量，保存与sku相关的一些数据：

```js
<script th:inline="javascript">
    // sku集合
    const skus = /*[[${skus}]]*/ [];
	//获取特殊规格参数并转化为json格式
	const specialSpec=JSON.parse(/*[[${spuDetail.specialSpec}]]*/ "");
	//获取参数的id和name
	const paramMap=/*[[${paramMap}]]*/ [];
</script>
```

- specialSpec：这是SpuDetail中唯一与Sku相关的数据

  因此我们并没有保存整个spuDetail，而是只保留了这个属性，而且需要手动转为js对象。

- paramMap：规格参数的id和name键值对，方便页面根据id获取参数名

- skus：sku集合

我们来看下页面获取的数据：

![](https://img-blog.csdnimg.cn/20200429135605285.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





##### 通过Vue渲染

我们把刚才获得的几个变量保存在Vue实例中：

![](https://img-blog.csdnimg.cn/20200429135737581.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后在页面中渲染：

```html
<div id="specification" class="summary-wrap clearfix">
    <dl v-for="(spec,key) in specialSpec" :key="key">
        <dt>
            <div class="fl title">
                <i>{{paramMap[key]}}</i>
            </div>
        </dt>
        <dd v-for="(val,index) in spec" :key="index">
            <a href="javascript:;" class="selected">
                {{val}}
                <span title="点击取消选择">&nbsp;</span>
            </a>
        </dd>
    </dl>
</div>
```

然后刷新页面查看：

![](https://img-blog.csdnimg.cn/20200429135915407.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

数据成功渲染了。不过我们发现所有的规格都被勾选了。这是因为现在，每一个规格都有样式：`selected`，我们应该只选中一个，让它的class样式为selected才对！

那么问题来了，我们该如何确定用户选择了哪一个？



####规格属性的筛选

#####分析

规格参数的格式是这样的：

![](https://img-blog.csdnimg.cn/20200429140001285.png)

每一个规格项是数组中的一个元素，因此我们只要保存被选择的规格项的索引，就能判断哪个是用户选择的了！

我们需要一个对象来保存用户选择的索引，格式如下：

```js
{
    "4":0,
    "12":0,
    "13":0
}
```

但问题是，第一次进入页面时，用户并未选择任何参数。因此索引应该有一个默认值，我们将默认值设置为0。

我们在`head`的script标签中，对索引对象进行初始化：

![](https://img-blog.csdnimg.cn/20200429140123975.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后在vue中保存：

![](https://img-blog.csdnimg.cn/20200429140217633.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#####页面改造

我们在页面中，通过判断indexes的值来判断当前规格是否被选中，并且给规格绑定点击事件，点击规格项后，修改indexes中的对应值：

```html
<div id="specification" class="summary-wrap clearfix">
    <dl v-for="(spec,key) in specialSpec" :key="key">
        <dt>
            <div class="fl title">
                <i>{{paramMap[key]}}</i>
            </div>
        </dt>
        <dd v-for="(val,index) in spec" :key="index">
            <a href="javascript:;" :class="{selected: index===indexes[key]}"
               @click="indexes[key]=index">
                {{val}}
                <span title="点击取消选择">&nbsp;</span>
            </a>
        </dd>
    </dl>
</div>
```

效果：



![](https://img-blog.csdnimg.cn/20200429140247491.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 确定sku

在我们设计sku数据的时候，就已经添加了一个字段：indexes：

![](https://img-blog.csdnimg.cn/20200429140316499.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这其实就是规格参数的索引组合。

而我们在页面中，用户点击选择规格后，就会把对应的索引保存起来：

![](https://img-blog.csdnimg.cn/20200429140354601.png)

因此，我们可以根据这个indexes来确定用户要选择的sku

我们在vue中定义一个**计算属性**，来计算与索引匹配的sku：

```js
computed:{
    sku(){
        const index = Object.values(this.indexes).join("_");
        return this.skus.find(s => s.indexes == index);
    }
}
```

在浏览器工具中查看：

![](https://img-blog.csdnimg.cn/20200429140414509.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







####  渲染sku列表

既然已经拿到了用户选中的sku，接下来，就可以在页面渲染数据了



##### 标题价格渲染

```vue
computed: {
    sku(){
        const index = Object.values(this.indexes).join("_");
        return this.skus.find(s=>s.indexes==index);
    }
},
```



![](https://img-blog.csdnimg.cn/20200429163309517.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



##### 图片列表

商品图片是一个字符串，以`,`分割，页面展示比较麻烦，所以我们编写一个**计算属性：**images()，将图片字符串变成数组：

```vue
computed: {
    sku(){
        const index = Object.values(this.indexes).join("_");
        return this.skus.find(s=>s.indexes==index);
    },
    images(){
        return this.sku.images ? this.sku.images.split(",") : [''];
    }
},
```



页面改造

```html
<!--放大镜效果-->
<div class="zoom">
    <!--默认第一个预览-->
    <div id="preview" class="spec-preview">
        <span class="jqzoom">
            <img :jqimg="images[0]" :src="images[0]" width="400px" height="400px"/>
        </span>
    </div>
    <!--下方的缩略图-->
    <div class="spec-scroll">
        <a class="prev">&lt;</a>
        <!--左右按钮-->
        <div class="items">
            <ul>
                <li v-for="(image,index) in images" :key="index">
                    <img :src="image" :bimg="image"  onmousemove="preview(this)"/>
                </li>
            </ul>
        </div>
        <a class="next">&gt;</a>
    </div>
</div>
```





效果:

![](https://img-blog.csdnimg.cn/20200429140525217.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







### 商品详情

商品详情页面如下图所示：

![](https://img-blog.csdnimg.cn/20200429182435823.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

分成上下两部分：

- 上部：展示的是规格属性列表
- 下部：展示的是商品详情



#### 属性列表



#### 商品详情

商品详情是HTML代码，我们不能使用 `th:text`，应该使用`th:utext`

在页面的第444行左右：

```html
<!--商品详情-->
<div class="intro-detail" th:utext="${spuDetail.description}">
</div>
```

最终展示效果：

![](https://img-blog.csdnimg.cn/20200429182545542.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



### 规格包装

规格包装分成两部分：

- 规格参数
- 包装列表

而且规格参数需要按照组来显示



#### 规格参数

最终的效果：

![](https://img-blog.csdnimg.cn/20200429182718755.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们模型中有一个groups，跟这个数据结果很像：

![](https://img-blog.csdnimg.cn/20200429182752173.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

分成8个组，组内都有params，里面是所有的参数。不过，这些参数都没有值！

规格参数的值分为两部分：

- 通用规格参数：保存在SpuDetail中的genericSpec中
- 特有规格参数：保存在sku的ownSpec中

我们需要把这两部分值取出来，放到groups中。

从spuDetail中取出genericSpec并取出groups：

![](https://img-blog.csdnimg.cn/20200429182828476.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

把genericSpec引入到Vue实例：

![](https://img-blog.csdnimg.cn/20200429182932845.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们编写一个**计算属性**，来进行值的组合：

```vue
groups(){
        groups.forEach(group=>{
		  group.params.forEach(param=>{
				if(param.generic){
					// 通用属性，去spu的genericSpec中获取
					param.value=genericSpec[param.id];
				}else{
					// 特有属性值，去SKU中获取
					param.value=JSON.parse(this.sku.ownSpec)[param.id];
				}
			})
		})
		return groups;
}
```

然后在页面渲染：

```html
<div class="Ptable">
    <div class="Ptable-item" v-for="group in groups" :key="group.id">
        <h3>{{group.name}}</h3>
        <dl>
            <div v-for="p in group.params">
                <dt>{{p.name}}</dt>
                <dd>{{p.value + (p.unit || '')}}</dd>
            </div>
        </dl>
    </div>
</div>
```



#### 包装列表

包装列表在商品详情中，我们一开始并没有赋值到Vue实例中，但是可以通过Thymeleaf来渲染

```html
<div class="package-list">
    <h3>包装清单</h3>
    <p th:text="${spuDetail.packingList}"></p>
</div>
```

最终效果：

![](https://img-blog.csdnimg.cn/20200429183715723.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 售后服务

售后服务也可以通过Thymeleaf进行渲染：

```html
<div id="three" class="tab-pane">
    <p>售后保障</p>
    <p th:text="${spuDetail.afterService}"></p>
</div>
```

效果：

![](https://img-blog.csdnimg.cn/2020042918374589.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)









### 页面静态化

#### 问题分析

现在，我们的页面是通过Thymeleaf模板引擎渲染后返回到客户端。在后台需要大量的数据查询，而后渲染得到HTML页面。会对数据库造成压力，并且请求的响应时间过长，并发能力不高。

大家能想到什么办法来解决这个问题？

首先我们能想到的就是缓存技术，比如之前学习过的Redis。不过Redis适合数据规模比较小的情况。假如数据量比较大，例如我们的商品详情页。每个页面如果10kb，100万商品，就是10GB空间，对内存占用比较大。此时就给缓存系统带来极大压力，如果缓存崩溃，接下来倒霉的就是数据库了。

所以缓存并不是万能的，某些场景需要其它技术来解决，比如静态化。



#### 什么是静态化

静态化是指把动态生成的HTML页面变为静态内容保存，以后用户的请求到来，直接访问静态页面，不再经过服务的渲染。

而静态的HTML页面可以部署在nginx中，从而大大提高并发能力，减小tomcat压力。



#### 如何实现静态化

目前，静态化页面都是通过模板引擎来生成，而后保存到nginx服务器来部署。常用的模板引擎比如：

- Freemarker
- Velocity
- Thymeleaf

我们之前就使用的Thymeleaf，来渲染html返回给用户。Thymeleaf除了可以把渲染结果写入Response，也可以写到本地文件，从而实现静态化。



### Thymeleaf实现静态化

####概念

先说下Thymeleaf中的几个概念：

- Context：运行上下文
- TemplateResolver：模板解析器
- TemplateEngine：模板引擎

> Context

上下文： 用来保存模型数据，当模板引擎渲染时，可以从Context上下文中获取数据用于渲染。

当与SpringBoot结合使用时，我们放入Model的数据就会被处理到Context，作为模板渲染的数据使用。

> TemplateResolver

模板解析器：用来读取模板相关的配置，例如：模板存放的位置信息，模板文件名称，模板文件的类型等等。

当与SpringBoot结合时，TemplateResolver已经由其创建完成，并且各种配置也都有默认值，比如模板存放位置，其默认值就是：templates。比如模板文件类型，其默认值就是html。

> TemplateEngine

模板引擎：用来解析模板的引擎，需要使用到上下文、模板解析器。分别从两者中获取模板中需要的数据，模板文件。然后利用内置的语法规则解析，从而输出解析后的文件。来看下模板引擎进行处理的函数：

```java
templateEngine.process("模板名", context, writer);
```

三个参数：

- 模板名称
- 上下文：里面包含模型数据
- writer：输出目的地的流

在输出时，我们可以指定输出的目的地，如果目的地是Response的流，那就是网络响应。如果目的地是本地文件，那就实现静态化了。

而在SpringBoot中已经自动配置了模板引擎，因此我们不需要关心这个。现在我们做静态化，就是把输出的目的地改成本地文件即可！



#### 具体实现

Service代码：

```java
@Service
@Slf4j
public class GoodsHtmlService implements IGoodsHtmlService {

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private GoodsService goodsService;

    @Value("${file.path}")
    String filePath;

    /**
     *页面静态化
     * @param model
     */
    @Override
    public void createHtml(Map<String,Object> model) {
        //初始化运行上下文
        Context context=new Context();
        //设置数据模型
        context.setVariables(model);
        //获取spu
        Spu spu = (Spu)model.get("spu");
        Writer writer=null;

        try {
            File file = new File(filePath + spu.getId() + ".html");
            writer=new PrintWriter(file);
            this.templateEngine.process("item",context,writer);
        } catch (FileNotFoundException e) {
            log.error("页面静态化失败：{}"+e,model);
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }
}
```







#### 什么时候静态文件

我们编写好了创建静态文件的service，那么问题来了：什么时候去调用它呢

想想这样的场景：

假如大部分的商品都有了静态页面。那么用户的请求都会被nginx拦截下来，根本不会到达我们的`leyou-goods-web`服务。只有那些还没有页面的请求，才可能会到达这里。

因此，如果请求到达了这里，我们除了返回页面视图外，还应该创建一个静态页面，那么下次就不会再来麻烦我们了。

所以，我们在GoodsController中添加逻辑，去生成静态html文件：

```java
/**
     * 跳转到页面详情页
     * @param id
     * @param model
     * @return
     */
@GetMapping("/{id}.html")
public String toItemPage(Model model,@PathVariable("id")Long id){
    Map<String, Object> map = goodsService.loadData(id);
    model.addAllAttributes(map);

    this.goodsHtmlService.createHtml(map);
    return "item";
}
```





###  Nginx代理静态页面

接下来，我们修改nginx，让它对商品请求进行监听，指向本地静态页面，如果本地没找到，才进行反向代理：

```ngi
    server {
        listen       80;
        server_name  www.leyou.com;

        proxy_set_header X-Forwarded-Host $host;
		proxy_set_header X-Forwarded-Server $host;
		proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
		
		location /item {
			//先找本地
			 root html;
			//请求的文件不存在，就反向代理
			if (!-f $request_filename){
				proxy_pass http://127.0.0.1:8084 ;
				break;
			}
			
			proxy_connect_timeout 600;
			proxy_read_timeout 600;
		}
		
		location / {
			#proxy_pass http://127.0.0.1:9002;
			proxy_pass http://127.0.0.1:8080;
			proxy_connect_timeout 600;
			proxy_read_timeout 600;
		}
    }
```



> 注意`if`和后面的括号之间要有一个空格

重启测试：

发现请求速度得到了极大提升：

![](https://pics.images.ac.cn/image/5ea9a07f724fa.html)









## RabbitMQ和数据同步

### 搜索与商品服务的问题

目前我们已经完成了商品详情和搜索系统的开发。我们思考一下，是否存在问题？

- 商品的原始数据保存在数据库中，增删改查都在数据库中完成。
- 搜索服务数据来源是索引库，如果数据库商品发生变化，索引库数据不能及时更新。
- 商品详情做了页面静态化，静态页面数据也不会随着数据库商品发生变化。

如果我们在后台修改了商品的价格，搜索页面和商品详情页显示的依然是旧的价格，这样显然不对。该如何解决？

这里有两种解决方案：

- 方案1：每当后台对商品做增删改操作，同时要修改索引库数据及静态页面
- 方案2：搜索服务和商品页面服务对外提供操作接口，后台在商品增删改后，调用接口

以上两种方式都有同一个严重问题：就是代码耦合，后台服务中需要嵌入搜索和商品页面服务，违背了微服务的`独立`原则。

所以，我们会通过另外一种方式来解决这个问题：消息队列



### 消息队列(MQ)

#### 什么是消息队列

消息队列，即MQ，Message Queue。

![](https://img-blog.csdnimg.cn/2020043019125160.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

消息队列是典型的：生产者、消费者模型。生产者不断向消息队列中生产消息，消费者不断的从队列中获取消息。因为消息的生产和消费都是异步的，而且只关心消息的发送和接收，没有业务逻辑的侵入，这样就实现了生产者和消费者的解耦。

结合前面所说的问题：

- 商品服务对商品增删改以后，无需去操作索引库或静态页面，只是发送一条消息，也不关心消息被谁接收。
- 搜索服务和静态页面服务接收消息，分别去处理索引库和静态页面。

如果以后有其它系统也依赖商品服务的数据，同样监听消息即可，商品服务无需任何代码修改。



#### AMQP和JMS

MQ是消息通信的模型，并不是具体实现。现在实现MQ的有两种主流方式：AMQP、JMS。

![](https://img-blog.csdnimg.cn/20200430191426659.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200430191437405.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

两者间的区别和联系：

- JMS是定义了统一的接口，来对消息操作进行统一；AMQP是通过规定协议来统一数据交互的格式
- JMS限定了必须使用Java语言；AMQP只是协议，不规定实现方式，因此是跨语言的。
- JMS规定了两种消息模型；而AMQP的消息模型更加丰富





#### 创建MQ产品

![](https://img-blog.csdnimg.cn/20200430191519923.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



- ActiveMQ：基于JMS
- RabbitMQ：基于AMQP协议，erlang语言开发，稳定性好
- RocketMQ：基于JMS，阿里巴巴产品，目前交由Apache基金会
- Kafka：分布式消息系统，高吞吐量









### RabbitMQ使用

#### 介绍

RabbitMQ是基于AMQP的一款消息管理系统

官网： http://www.rabbitmq.com/

官方教程：http://www.rabbitmq.com/getstarted.html

![](https://img-blog.csdnimg.cn/2020043019160693.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200430191617536.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







打开demo-rabbitmq项目，学习RabbitMQ



#### 连接工具类

在cn.demo.rabbitmq.util包下我们抽取一个建立RabbitMQ连接的工具类，方便其他程序获取连接：

把这里的服务地址改为自己安装RabbitMQ的地址，vhost，用户名以及密码都改为自己开始设置的

```java
public class ConnectionUtil {
    /**
     * 建立与RabbitMQ的连接
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("172.16.145.141");
        //端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
        factory.setVirtualHost("/leyou");
        factory.setUsername("leyou");
        factory.setPassword("123456");
        // 通过工程获取连接
        Connection connection = factory.newConnection();
        return connection;
    }
}
```





### 基本消息模型

官方介绍：

![](https://img-blog.csdnimg.cn/20200430192922446.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

RabbitMQ是一个消息代理：它接受和转发消息。 你可以把它想象成一个邮局：当你把邮件放在邮箱里时，你可以确定邮差先生最终会把邮件发送给你的收件人。 在这个比喻中，RabbitMQ是邮政信箱，邮局和邮递员。

RabbitMQ与邮局的主要区别是它不处理纸张，而是`接受，存储和转发数据消息的二进制数据块`。

![](https://img-blog.csdnimg.cn/20200430192948932.png)

P（producer/ publisher）：生产者，一个发送消息的用户应用程序。

C（consumer）：消费者，消费和接收有类似的意思，消费者是一个主要用来等待接收消息的用户应用程序

队列（红色区域）：rabbitmq内部类似于邮箱的一个概念。虽然消息流经rabbitmq和你的应用程序，但是它们只能存储在队列中。队列只受主机的内存和磁盘限制，实质上是一个大的消息缓冲区。许多生产者可以发送消息到一个队列，许多消费者可以尝试从一个队列接收数据。

总之：

生产者将消息发送到队列，消费者从队列中获取消息，队列是存储消息的缓冲区。

我们将用Java编写两个程序;发送单个消息的生产者，以及接收消息并将其打印出来的消费者。我们将详细介绍Java API中的一些细节，这是一个消息传递的“Hello World”。

我们将调用我们的消息发布者（发送者）Send和我们的消息消费者（接收者）Recv。发布者将连接到RabbitMQ，发送一条消息，然后退出。



#### 生产者发送消息

运行`cn.demo.rabbitmq.simple.Send`类的main方法

```java
public class Send {

    private final static String QUEUE_NAME = "simple_queue";

    public static void main(String[] argv) throws Exception {
        // 获取到连接以及mq通道
        Connection connection = ConnectionUtil.getConnection();
        // 从连接中创建通道，这是完成大部分API的地方。
        Channel channel = connection.createChannel();

        // 声明（创建）队列，必须声明队列才能够发送消息，我们可以把消息发送到队列中。
        // 声明一个队列是幂等的 - 只有当它不存在时才会被创建
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 消息内容
        String message = "Hello World!";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");

        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
```

控制台：

![](https://img-blog.csdnimg.cn/20200430224138821.png)





#### 管理工具查看消息

进入队列页面，可以看到新建了一个队列：simple_queue

![](https://img-blog.csdnimg.cn/20200430224216401.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

点击队列名称，进入详情页，可以查看消息：

![](https://img-blog.csdnimg.cn/20200430224228699.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



在控制台查看消息并不会将消息消费，所以消息还在。



#### 消费者获取消息

```java
public class Recv {
    private final static String QUEUE_NAME = "simple_queue";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!");
            }
        };
        // 监听队列，第二个参数：是否自动进行消息确认。
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
```

控制台：

![](https://img-blog.csdnimg.cn/20200430224338296.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这个时候，队列中的消息就没了：

![](https://img-blog.csdnimg.cn/2020043022435363.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们发现，消费者已经获取了消息，但是程序没有停止，一直在监听队列中是否有新的消息。一旦有新的消息进入队列，就会立即打印。不信那你就在运行一次服务send喽



#### 消息确认机制ACK

通过刚才的案例可以看出，消息一旦被消费者接收，队列中的消息就会被删除。

那么问题来了：RabbitMQ怎么知道消息被接收了呢？

如果消费者领取消息后，还没执行操作就挂掉了呢？或者抛出了异常？消息消费失败，但是RabbitMQ无从得知，这样消息就丢失了！

因此，RabbitMQ有一个ACK机制。当消费者获取消息后，会向RabbitMQ发送回执ACK，告知消息已经被接收。不过这种回执ACK分两种情况：

- 自动ACK：消息一旦被接收，消费者自动发送ACK
- 手动ACK：消息接收后，不会发送ACK，需要手动调用

大家觉得哪种更好呢？

这需要看消息的重要性：

- 如果消息不太重要，丢失也没有影响，那么自动ACK会比较方便
- 如果消息非常重要，不容丢失。那么最好在消费完成后手动ACK，否则接收消息后就自动ACK，RabbitMQ就会把消息从队列中删除。如果此时消费者宕机，那么消息就丢失了。

我们之前的测试都是自动ACK的，如果要手动ACK，需要改动我们的代码：

`cn.demo.rabbitmq.simple.Recv2`

```java
public class Recv2 {
    private final static String QUEUE_NAME = "simple_queue";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        final Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!");
                // 手动进行ACK
                channel.basicAck(envelope.getDeliveryTag(), false);
            }
        };
        // 监听队列，第二个参数false，手动进行ACK
        channel.basicConsume(QUEUE_NAME, false, consumer);
    }
}
```

注意到最后一行代码：

```java
channel.basicConsume(QUEUE_NAME, false, consumer);Copy to clipboardErrorCopied
```

如果第二个参数为true，则会自动进行ACK；如果为false，则需要手动ACK。方法的声明：

![](https://img-blog.csdnimg.cn/20200430224452597.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





##### <span style="font-size:20px">自动ACK存在的问题</span>

修改消费者，添加异常，如下：

![](https://img-blog.csdnimg.cn/20200430224608169.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

生产者不做任何修改，直接运行，消息发送成功：

![](https://img-blog.csdnimg.cn/2020043022462165.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

运行消费者，程序抛出异常。但是消息依然被消费：

![](https://img-blog.csdnimg.cn/20200430224634826.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

管理界面：

![](https://img-blog.csdnimg.cn/20200430224648148.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





##### <span style="font-size:20px">演示手动ACK</span>

修改消费者，把自动改成手动（去掉之前制造的异常）

![](https://img-blog.csdnimg.cn/20200430224735651.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

生产者不变，再次运行：

![](https://img-blog.csdnimg.cn/20200430224752436.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

运行消费者

![](https://img-blog.csdnimg.cn/20200430224805213.png)

但是，查看管理界面，发现：

![](https://img-blog.csdnimg.cn/20200430224819353.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

停掉消费者的程序，发现：

![](https://img-blog.csdnimg.cn/20200430224832890.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这是因为虽然我们设置了手动ACK，但是代码中并没有进行消息确认！所以消息并未被真正消费掉。

当我们关掉这个消费者，消息的状态再次称为Ready

修改代码手动ACK：

![](https://img-blog.csdnimg.cn/20200430225034109.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

执行：

![](https://img-blog.csdnimg.cn/20200430225048337.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

消息消费成功！





### Work下次模型

`cn.demo.rabbitmq.work`包下测试类

工作队列或者竞争消费者模式

![](https://img-blog.csdnimg.cn/20200430225120577.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

在第一篇教程中，我们编写了一个程序，从一个命名队列中发送并接受消息。在这里，我们将创建一个工作队列，在多个工作者之间分配耗时任务。

工作队列，又称任务队列。主要思想就是避免执行资源密集型任务时，必须等待它执行完成。相反我们稍后完成任务，我们将任务封装为消息并将其发送到队列。 在后台运行的工作进程将获取任务并最终执行作业。当你运行许多消费者时，任务将在他们之间共享，但是**一个消息只能被一个消费者获取**。

这个概念在Web应用程序中特别有用，因为在短的HTTP请求窗口中无法处理复杂的任务。

接下来我们来模拟这个流程：

>P：生产者：任务的发布者
>
>C1：消费者，领取任务并且完成任务，假设完成速度较快
>
>C2：消费者2：领取任务并完成任务，假设完成速度慢

面试题：避免消息堆积？

- 采用workqueue，多个消费者监听同一队列。
- 接收到消息以后，而是通过线程池，异步消费。



#### 生产者

生产者与案例1中的几乎一样：

```java
public class Send {
    private final static String QUEUE_NAME = "test_work_queue";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 循环发布任务
        for (int i = 0; i < 50; i++) {
            // 消息内容
            String message = "task .. " + i;
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");

            Thread.sleep(i * 2);
        }
        // 关闭通道和连接
        channel.close();
        connection.close();
    }
}Copy to clipboardErrorCopied
```

不过这里我们是循环发送50条消息。





#### 消费者1

![](https://img-blog.csdnimg.cn/20200430225226673.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 消费者2

![](https://img-blog.csdnimg.cn/20200430225237467.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

与消费者1基本类似，就是没有设置消费耗时时间。

这里是模拟有些消费者快，有些比较慢。

接下来，两个消费者一同启动，然后发送50条消息：

![](https://img-blog.csdnimg.cn/20200430225258480.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以发现，两个消费者各自消费了25条消息，而且各不相同，这就实现了任务的分发。





#### 能者多劳

刚才的实现有问题吗？

- 消费者1比消费者2的效率要低，一次任务的耗时较长
- 然而两人最终消费的消息数量是一样的
- 消费者2大量时间处于空闲状态，消费者1一直忙碌

现在的状态属于是把任务平均分配，正确的做法应该是消费越快的人，消费的越多。

怎么实现呢？

我们可以使用basicQos方法和prefetchCount = 1设置。 这告诉RabbitMQ一次不要向工作人员发送多于一条消息。 或者换句话说，不要向工作人员发送新消息，直到它处理并确认了前一个消息。 相反，它会将其分派给不是仍然忙碌的下一个工作人员。

![](https://img-blog.csdnimg.cn/20200430225324924.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

再次测试：

![](https://img-blog.csdnimg.cn/20200430225351574.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 订阅模型分类

在之前的模式中，我们创建了一个工作队列。 工作队列背后的假设是：每个任务只被传递给一个工作人员。

在这一部分，我们将做一些完全不同的事情 - 我们将会传递一个信息给多个消费者。 这种模式被称为“发布/订阅”。

订阅模型示意图：

![](https://img-blog.csdnimg.cn/20200430225421323.png)

解读：

1、1个生产者，多个消费者

2、每一个消费者都有自己的一个队列

3、生产者没有将消息直接发送到队列，而是发送到了交换机

4、每个队列都要绑定到交换机

5、生产者发送的消息，经过交换机到达队列，实现一个消息被多个消费者获取的目的

X（Exchanges）：交换机，一方面：接收生产者发送的消息。另一方面：知道如何处理消息，例如递交给某个特别队列、递交给所有队列、或是将消息丢弃。到底如何操作，取决于Exchange的类型。

Exchange类型有以下几种：

- `Fanout`：广播，将消息交给所有绑定到交换机的队列
- `Direct`：定向，把消息交给符合指定routing key 的队列
- `Topic`：通配符，把消息交给符合routing pattern（路由模式） 的队列

我们这里先学习

`Fanout`：即广播模式

**Exchange（交换机）只负责转发消息，不具备存储消息的能力**，因此如果没有任何队列与Exchange绑定，或者没有符合路由规则的队列，那么消息会丢失！



### 订阅模型-Fanout

Fanout，也称为广播。

流程图：

![](https://img-blog.csdnimg.cn/20200430225452542.png)

在广播模式下，消息发送流程是这样的：

- 可以有多个消费者
- 每个**消费者有自己的queue**（队列）
- 每个**队列都要绑定到Exchange**（交换机）
- **生产者发送的消息，只能发送到交换机**，交换机来决定要发给哪个队列，生产者无法决定。
- 交换机把消息发送给绑定过的所有队列
- 队列的消费者都能拿到消息。实现一条消息被多个消费者消费



#### 生产者

两个变化：

- 声明Exchange，不再声明Queue
- 发送消息到Exchange，不再发送到Queue

```java
public class Send {

    private final static String EXCHANGE_NAME = "fanout_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();

        // 声明exchange，指定类型为fanout
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

        // 消息内容
        String message = "Hello everyone";
        // 发布消息到Exchange
        channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
        System.out.println(" [生产者] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}Copy to clipboardErrorCopied
```





#### 消费者1

```java
public class Recv {
    private final static String QUEUE_NAME = "fanout_exchange_queue_1";

    private final static String EXCHANGE_NAME = "fanout_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 绑定队列到交换机
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "");

        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者1] received : " + msg + "!");
            }
        };
        // 监听队列，自动返回完成
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}Copy to clipboardErrorCopied
```

要注意代码中：**队列需要和交换机绑定**





#### 消费者2

```java
public class Recv2 {
    private final static String QUEUE_NAME = "fanout_exchange_queue_2";

    private final static String EXCHANGE_NAME = "fanout_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 绑定队列到交换机
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "");

        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者2] received : " + msg + "!");
            }
        };
        // 监听队列，手动返回完成
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}Copy to clipboardErrorCopied
```

可以看出两个消费者都有自己的队列，而绑定到的是同一个交换机





#### 测试

首先运行消息生产者，要先声明交换机，即使这一条消息会被丢弃

然后运行两个消费者，然后发送1条消息：

![](https://img-blog.csdnimg.cn/20200430225547649.png)

![](https://img-blog.csdnimg.cn/20200430225557889.png)







### 订阅模型-Direct

有选择性的接收消息

在订阅模式中，生产者发布消息，所有消费者都可以获取所有消息。

在路由模式中，我们将添加一个功能 - 我们将只能订阅一部分消息。 例如，我们只能将重要的错误消息引导到日志文件（以节省磁盘空间），同时仍然能够在控制台上打印所有日志消息。

但是，在某些场景下，我们希望不同的消息被不同的队列消费。这时就要用到Direct类型的Exchange。

在Direct模型下，队列与交换机的绑定，不能是任意绑定了，而是要指定一个RoutingKey（路由key）

消息的发送方在向Exchange发送消息时，也必须指定消息的routing key。

![](https://img-blog.csdnimg.cn/20200430225630827.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

P：生产者，向Exchange发送消息，发送消息时，会指定一个routing key。

X：Exchange（交换机），接收生产者的消息，然后把消息递交给 与routing key完全匹配的队列

C1：消费者，其所在队列指定了需要routing key 为 error 的消息

C2：消费者，其所在队列指定了需要routing key 为 info、error、warning 的消息



#### 生产者

此处我们模拟商品的增删改，发送消息的RoutingKey分别是：insert、update、delete

```java
public class Send {
    private final static String EXCHANGE_NAME = "direct_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明exchange，指定类型为direct
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        // 消息内容
        String message = "商品新增了， id = 1001";
        // 发送消息，并且指定routing key 为：insert ,代表新增商品
        channel.basicPublish(EXCHANGE_NAME, "insert", null, message.getBytes());
        System.out.println(" [商品服务：] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}Copy to clipboardErrorCopied
```



#### 消费者1

我们此处假设消费者1只接收两种类型的消息：更新商品和删除商品。

```java
public class Recv {
    private final static String QUEUE_NAME = "direct_exchange_queue_1";
    private final static String EXCHANGE_NAME = "direct_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 绑定队列到交换机，同时指定需要订阅的routing key。假设此处需要update和delete消息
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "update");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "delete");

        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者1] received : " + msg + "!");
            }
        };
        // 监听队列，自动ACK
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}Copy to clipboardErrorCopied
```





#### 消费者2

我们此处假设消费者2接收所有类型的消息：新增商品，更新商品和删除商品。

```java
public class Recv2 {
    private final static String QUEUE_NAME = "direct_exchange_queue_2";
    private final static String EXCHANGE_NAME = "direct_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 绑定队列到交换机，同时指定需要订阅的routing key。订阅 insert、update、delete
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "insert");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "update");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "delete");

        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者2] received : " + msg + "!");
            }
        };
        // 监听队列，自动ACK
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}Copy to clipboardErrorCopied
```





#### 测试

我们分别发送增、删、改的RoutingKey，发现结果：

![](https://img-blog.csdnimg.cn/20200430225741764.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 订阅模式-Topic

`Topic`类型的`Exchange`与`Direct`相比，都是可以根据`RoutingKey`把消息路由到不同的队列。只不过`Topic`类型`Exchange`可以让队列在绑定`Routing key` 的时候使用通配符！

`Routingkey` 一般都是有一个或多个单词组成，多个单词之间以”.”分割，例如： `item.insert

通配符规则：

>`#`：匹配一个或多个词
>
>`*`：匹配不多不少恰好1个词

举例：

>`audit.#`：能够匹配`audit.irs.corporate` 或者 `audit.irs`
>
>`audit.*`：只能匹配`audit.irs`

![](https://img-blog.csdnimg.cn/20200430230013527.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







在这个例子中，我们将发送所有描述动物的消息。消息将使用由三个字（两个点）组成的routing key发送。路由关键字中的第一个单词将描述速度，第二个颜色和第三个种类：`速度.颜色.种类`。

我们创建了三个绑定：Q1绑定了`* .orange.*`，Q2绑定了`*.*.rabbit`和`lazy.＃`。

Q1匹配所有的橙色动物。

Q2匹配关于兔子以及懒惰动物的消息。

练习，生产者发送如下消息，会进入那个队列：

quick.orange.rabbit Q1 Q2

lazy.orange.elephant Q1 Q2

quick.orange.fox Q1

lazy.pink.rabbit Q2

quick.brown.fox

quick.orange.male.rabbit

orange



#### 生产者

使用topic类型的Exchange，发送消息的routing key有3种： `item.isnert`、`item.update`、`item.delete`：

```java
public class Send {
    private final static String EXCHANGE_NAME = "topic_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明exchange，指定类型为topic
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        // 消息内容
        String message = "新增商品 : id = 1001";
        // 发送消息，并且指定routing key 为：insert ,代表新增商品
        channel.basicPublish(EXCHANGE_NAME, "item.insert", null, message.getBytes());
        System.out.println(" [商品服务：] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}Copy to clipboardErrorCopied
```



####消费者

我们此处假设消费者1只接收两种类型的消息：更新商品和删除商品

```java
public class Recv {
    private final static String QUEUE_NAME = "topic_exchange_queue_1";
    private final static String EXCHANGE_NAME = "topic_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 绑定队列到交换机，同时指定需要订阅的routing key。需要 update、delete
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "item.update");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "item.delete");

        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者1] received : " + msg + "!");
            }
        };
        // 监听队列，自动ACK
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}Copy to clipboardErrorCopied
```





####消费者2

我们此处假设消费者2接收所有类型的消息：新增商品，更新商品和删除商品。

```java
/**
 * 消费者2
 */
public class Recv2 {
    private final static String QUEUE_NAME = "topic_exchange_queue_2";
    private final static String EXCHANGE_NAME = "topic_exchange_test";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 绑定队列到交换机，同时指定需要订阅的routing key。订阅 insert、update、delete
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "item.*");

        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                    byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者2] received : " + msg + "!");
            }
        };
        // 监听队列，自动ACK
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}Copy to clipboardErrorCopied
```





### 持久化

如何避免消息丢失？

1. 消费者的ACK机制。可以防止消费者丢失消息。
2. 但是，如果在消费者消费之前，MQ就宕机了，消息就没了。

是可以将消息进行持久化呢？

要将消息持久化，前提是：队列、Exchange都持久化





#### 交换机持久化

![](https://img-blog.csdnimg.cn/20200430230130327.png)



#### 队列持久化

![](https://img-blog.csdnimg.cn/20200430230140334.png)





#### 消息持久化

![](https://img-blog.csdnimg.cn/20200430230156996.png)





### Spring AMQP

#### 简介

Sprin有很多不同的项目，其中就有对AMQP的支持：

![](https://img-blog.csdnimg.cn/20200501125305551.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

Spring AMQP的页面：http://spring.io/projects/spring-amqp

![](https://img-blog.csdnimg.cn/20200501125324822.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

注意这里一段描述：

![](https://img-blog.csdnimg.cn/20200501125353911.png)





> Spring-amqp是对AMQP协议的抽象实现，而spring-rabbit 是对协议的具体实现，也是目前的唯一实现。底层使用的就是RabbitMQ。



#### 依赖和配置

添加AMQP的启动器：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>Copy to clipboardErrorCopied
```

在`application.yml`中添加RabbitMQ地址：

```yaml
spring:
  rabbitmq:
    host: 172.16.145.141
    username: leyou
    password: 123456
    virtual-host: /leyouCopy to clipboardErrorCopied
```



#### 监听者

在SpringAmqp中，对消息的消费者进行了封装和抽象，一个普通的JavaBean中的普通方法，只要通过简单的注解，就可以成为一个消费者。

```java
@Component
public class Listener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "spring.test.queue", durable = "true"),
            exchange = @Exchange(
                    value = "spring.test.exchange",
                    ignoreDeclarationExceptions = "true",
                    type = ExchangeTypes.TOPIC
            ),
            key = {"#.#"}))
    public void listen(String msg){
        System.out.println("接收到消息：" + msg);
    }
}Copy to clipboardErrorCopied
```

- `@Componet`：类上的注解，注册到Spring容器
- &emsp;` @RabbitListener`：方法上的注解，声明这个方法是一个消费者方法，需要指定下面的属性：
  - `bindings`：指定绑定关系，可以有多个。值是`@QueueBinding`的数组。`@QueueBinding`包含下面属性：
    - `value`：这个消费者关联的队列。值是`@Queue`，代表一个队列
    - `exchange`：队列所绑定的交换机，值是`@Exchange`类型
    - `key`：队列和交换机绑定的`RoutingKey`

类似listen这样的方法在一个类中可以写多个，就代表多个消费者。



#### AmqpTemplate

Spring最擅长的事情就是封装，把他人的框架进行封装和整合。

Spring为AMQP提供了统一的消息处理模板：AmqpTemplate，非常方便的发送消息，其发送方法：

![](https://img-blog.csdnimg.cn/20200501125657799.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

红框圈起来的是比较常用的3个方法，分别是：

- 指定交换机、RoutingKey和消息体
- 指定消息
- 指定RoutingKey和消息，会向默认的交换机发送消息



#### 测试代码

```java
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MqDemo {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void testSend() throws InterruptedException {
        String msg = "hello, Spring boot amqp";
        this.amqpTemplate.convertAndSend("spring.test.exchange","a.b", msg);
        // 等待10秒后再结束
        Thread.sleep(10000);
    }
}Copy to clipboardErrorCopied
```

运行后查看日志：

![](https://img-blog.csdnimg.cn/20200501125724583.png)





### 项目改造

接下来，我们就改造项目，实现搜索服务、商品静态页的数据同步。

#### 思路分析

> 发送方：商品微服务

- 什么时候发？

  当商品服务对商品进行写操作：增、删、改的时候，需要发送一条消息，通知其它服务。

- 发送什么内容？

  对商品的增删改时其它服务可能需要新的商品数据，但是如果消息内容中包含全部商品信息，数据量太大，而且并不是每个服务都需要全部的信息。因此我们**只发送商品id**，其它服务可以根据id查询自己需要的信息。

> 接收方：搜索微服务、静态页微服务

接收消息后如何处理？

- 搜索微服务：
  - 增/改：添加新的数据到索引库
  - 删：删除索引库数据
- 静态页微服务：
  - 增/改：创建新的静态页
  - 删：删除原来的静态页



#### 商品服务发送消息

我们先在商品微服务`leyou-item-service`中实现发送消息。

##### 引入依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>Copy to clipboardErrorCopied
```

##### 配置文件

我们在application.yml中添加一些有关RabbitMQ的配置：

```yaml
spring:
  rabbitmq:
    host: 172.16.145.141
    username: leyou
    password: 123456
    virtual-host: /leyou
    template:
      exchange: leyou.item.exchange
    publisher-confirms: trueCopy to clipboardErrorCopied
```

- template：有关`AmqpTemplate`的配置
  - exchange：缺省的交换机名称，此处配置后，发送消息如果不指定交换机就会使用这个
- publisher-confirms：生产者确认机制，确保消息会正确发送，如果发送失败会有错误回执，从而触发重试



##### 改造GoodsService

在GoodsService中封装一个发送消息到mq的方法：**（需要注入AmqpTemplate模板）**

```java
private void sendMessage(Long id, String type) {
    try {
        amqpTemplate.convertAndSend("item." + type, id);
    } catch (AmqpException e) {
        LOGGER.error("发送消息失败，消息类型：{}，商品id：{}", "item." + type, id);
    }
}Copy to clipboardErrorCopied
```

这里没有指定交换机，因此默认发送到了配置中的：`leyou.item.exchange`

**注意：这里要把所有异常都try起来，不能让消息的发送影响到正常的业务逻辑**

然后在新增的时候调用：

![](https://img-blog.csdnimg.cn/20200501125924416.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

修改的时候调用：

![](https://img-blog.csdnimg.cn/20200501125939719.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 搜索服务接受消息

搜索服务接收到消息后要做的事情：

- 增：添加新的数据到索引库
- 删：删除索引库数据
- 改：修改索引库数据

因为索引库的新增和修改方法是合二为一的，因此我们可以将这两类消息一同处理，删除另外处理。

#####引入依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>Copy to clipboardErrorCopied
```


#####  添加配置

```yaml
spring:
  rabbitmq:
    host: 172.16.145.141
    virtual-host: /leyou
    username: leyou
    password: 123456Copy to clipboardErrorCopied
```

这里只是接收消息而不发送，所以不用配置template相关内容。



##### 编写监听器

![](https://img-blog.csdnimg.cn/20200501130043249.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





代码：

```java
@Component
public class GoodsListener {

    @Autowired
    private SearchService searchService;

    /**
     * 处理insert和update消息
     *
     * @param id
     */
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "LEYOU.CREATE.INDEX.QUEUE", durable = "true"),
                    exchange = @Exchange(value = "LEYOU.ITEM.EXCHANGE", ignoreDeclarationExceptions = "true", type = ExchangeTypes.TOPIC),
                    key = {"item.insert", "item.update"}
            )
    )
    public void listenCreate(Long id) throws IOException {
        if (id == null) {
            return;
        }
        // 创建或更新索引
        this.searchService.createIndex(id);
    }

    /**
     * 处理delete消息
     *
     * @param id
     * @throws IOException
     */
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "LEYOU.DELETE.INDEX.QUEUE", durable = "true"),
                    exchange = @Exchange(value = "LEYOU.ITEM.EXCHANGE", ignoreDeclarationExceptions = "true", type = ExchangeTypes.TOPIC),
                    key = {"item.delete"}
            )
    )
    public void listenDelete(Long id) throws IOException {
        if (id == null) {
            return;
        }
        // 创建或更新索引
        this.searchService.deleteIndex(id);
    }
}Copy to clipboardErrorCopied
```



##### 编写创建和删除索引方法

这里因为要创建和删除索引，我们需要在SearchService中拓展两个方法，创建和删除索引：

```java
@Override
public void createIndex(Long id) throws IOException {
    //查询spu
    Spu spu = this.goodsClient.querySpuById(id);
    Goods goods = this.buildGoods(spu);
    //保存
    this.goodsRepository.save(goods);
}

@Override
public void deleteIndex(Long id) {
    this.goodsRepository.deleteById(id);
}Copy to clipboardErrorCopied
```

创建索引的方法可以从之前导入数据的测试类中拷贝和改造。



#### 静态也服务接受消息

商品静态页服务接收到消息后的处理：

- 增：创建新的静态页
- 删：删除原来的静态页
- 改：创建新的静态页并覆盖原来的

不过，我们编写的创建静态页的方法也具备覆盖以前页面的功能，因此：增和改的消息可以放在一个方法中处理，删除消息放在另一个方法处理。



##### 引入依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>Copy to clipboardErrorCopied
```



##### 添加配置

```yaml
spring:
  rabbitmq:
    host: 172.16.145.141
    username: leyou
    password: 123456
    virtual-host: /leyouCopy to clipboardErrorCopied
```

这里只是接收消息而不发送，所以不用配置template相关内容。



##### 编写监听器

![](https://img-blog.csdnimg.cn/20200501130233591.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

代码：

```java
@Component
public class GoodsListener {

    @Autowired
    private GoodsHtmlService goodsHtmlService;

    @Autowired
    private GoodsService goodsService;

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "LEYOU.CREATE.WEB.QUEUE", durable = "true"),
                    exchange = @Exchange(value = "LEYOU.ITEM.EXCHANGE", ignoreDeclarationExceptions = "true", type = ExchangeTypes.TOPIC),
                    key = {"item.insert", "item.update"}
            )
    )
    public void listenCreate(Long id) throws Exception {
        if (id == null) {
            return;
        }

        //获取数据
        Map<String, Object> data = goodsService.loadData(id);
        // 创建页面
        goodsHtmlService.createHtml(data);
    }

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "LEYOU.DELETE.WEB.QUEUE", durable = "true"),
                    exchange = @Exchange(value = "LEYOU.ITEM.EXCHANGE", ignoreDeclarationExceptions = "true", type = ExchangeTypes.TOPIC),
                    key = {"item.delete"}
            )
    )
    public void listenDelete(Long id) {
        if (id == null) {
            return;
        }
        // 删除页面
        goodsHtmlService.deleteHtml(id);
    }
}Copy to clipboardErrorCopied
```



#####添加删除页面方法

```java
@Override
public void deleteHtml(Long id) {
    File file = new File("/home/cloudlandboy/Project/leyou/html/item/", id + ".html");
    file.deleteOnExit();
}Copy to clipboardErrorCopied
```



#### 测试

重新启动项目，并且登录RabbitMQ管理界面

可以看到，交换机已经创建出来了：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576379783664.png)

队列也已经创建完毕：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576379822464.png)

并且队列都已经绑定到交换机：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576379878542.png)

在后台修改商品数据的价格，分别在搜索及商品详情页查看是否统一。






##用户注册

### 创建用户中心

用户搜索到自己心仪的商品，接下来就要去购买，但是购买必须先登录。所以接下来我们编写用户中心，实现用户的登录和注册功能。

用户中心的提供的服务：

- 用户的注册
- 用户登录
- 用户个人信息管理
- 用户地址管理
- 用户收藏管理
- 我的订单
- 优惠券管理

这里我们暂时先实现基本的：`注册和登录`功能

因为用户中心的服务其它微服务也会调用，因此这里我们做聚合。

leyou-user：父工程，包含2个子工程：

- leyou-user-interface：实体及接口
- leyou-user-service：业务和服务



### 创建父Mudule

打包方式为`pom`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>leyou-parent</artifactId>
        <groupId>com.leyou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.leyou.user</groupId>
    <artifactId>leyou-user</artifactId>
    <packaging>pom</packaging>
    <modules>
        <module>leyou-user-interface</module>
        <module>leyou-user-service</module>
    </modules>
</project>
```





### 创建leyou-user-interfaec

在leyou-user下，创建module：

```xml
<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
    </dependency>
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```





### 创建leyou-user-service



```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
    </dependency>

    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid-spring-boot-starter</artifactId>
        <version>1.1.20</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
        <exclusions>
            <exclusion>
                <groupId>org.junit.vintage</groupId>
                <artifactId>junit-vintage-engine</artifactId>
            </exclusion>
        </exclusions>
    </dependency>
    <dependency>
        <groupId>top.codekiller.leyou</groupId>
        <artifactId>leyou-user-interface</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```



启动类

```java
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouUserApplication.class);
    }
}
```



### 配置文件

```yaml
server:
  port: 8085
spring:
  application:
    name: user-service
  datasource:
    username: root
    password: root
    url: jdbc:mysql://localhost:3306/leyou?characterEncoding=UTF-8&serverTimezone=UTC
    type: com.alibaba.druid.pool.DruidDataSource
    # 下面为连接池的补充设置，应用到上面所有数据源中
    # 初始化大小，最小，最大
    initialSize: 5   #初始化创建的连接数
    minIdle: 5  #最小空闲连接数
    maxActive: 20 #最大活跃连接数，不宜设置过多
    # 配置获取连接等待超时的时间
    maxWait: 60000
    # 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
    timeBetweenEvictionRunsMillis: 60000
    # 配置一个连接在池中最小生存的时间，单位是毫秒
    minEvictableIdleTimeMillis: 30000
    #用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。
    validationQuery: select 'x';
    #建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，
    testWhileIdle: true
    #申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
    testOnBorrow: false
    #归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
    testOnReturn: false
    # 打开PSCache，并且指定每个连接上PSCache的大小
    #是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
    poolPreparedStatements: true
    #要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。
    #在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100
    maxPoolPreparedStatementPerConnectionSize: 20
    # 配置监控统计拦截的filters，去掉后监控界面sql无法统计，stat用于监控统计，'wall'用于防火墙，防御sql注入，slf4j用于日志
    filters: stat,wall,slf4j
    # 通过connectProperties属性来打开mergeSql功能；慢SQL记录
    connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000
    # 合并多个DruidDataSource的监控数据
    useGlobalDataSourceStat: true

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    register-with-eureka: true
  instance:
    lease-renewal-interval-in-seconds: 5
    lease-expiration-duration-in-seconds: 15

mybatis-plus:
  type-aliases-package: top.codekiller.leyou.pojo
  global-config:
    db-config:
      table-prefix: tb_
      id-type: auto

logging:
  level:
    top.codekiller.leyou: debug
```







### 添加网关路由

我们修改`leyou-gateway`，添加路由规则，对`leyou-user-service`进行路由:

```yaml
zuul:
  prefix: /api
  routes:
    item-service: /item/**
    search-service: /search/**
    user-service: /user/**
```



### 测试

访问：http://localhost:10010/api/user/actuator/info



### 接口文档

整个用户中心的开发，我们将模拟公司内面向接口的开发。

现在假设项目经理已经设计好了接口文档，详见：[用户接口说明](https://codekiller.top/2020/04/28/leyou-mall-tools/#toc-heading-57)

![](https://img-blog.csdnimg.cn/20200501133519748.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们将根据文档直接编写后台功能，不关心页面实现。





### 数据结构

```mysql
CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
  `phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
  `created` datetime NOT NULL COMMENT '创建时间',
  `salt` varchar(32) NOT NULL COMMENT '密码加密的salt值',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='用户表';
```

数据结构比较简单，因为根据用户名查询的频率较高，所以我们给用户名创建了索引





### 基本代码

![](https://img-blog.csdnimg.cn/20200501133745639.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 实体类

放在`user-interface`中

```java
@Data
public class User {
    @TableId
    private Long id;

    private String username;// 用户名

    @JsonIgnore
    private String password;// 密码

    private String phone;// 电话

    private Date created;// 创建时间

    @JsonIgnore
    private String salt;// 密码的盐值
}
```

> 注意：为了安全考虑。这里对password和salt添加了注解@JsonIgnore，这样在json序列化时，就不会把password和salt返回。



需要添加jpa和jackson的依赖

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
</dependency>
```





#### Mapper

```java
public interface UserMapper extends BaseMapper<User> {
}
```



### 数据功能校验

####接口说明

实现用户数据的校验，主要包括对：手机号、用户名的唯一性校验。

**接口路径：**

> GET /check/{data}/{type}

**参数说明：**

| 参数 | 说明                                   | 是否必须 | 数据类型 | 默认值 |
| ---- | -------------------------------------- | -------- | -------- | ------ |
| data | 要校验的数据                           | 是       | String   | 无     |
| type | 要校验的数据类型：1，用户名；2，手机； | 否       | Integer  | 1      |

**返回结果：**

返回布尔类型结果：

- true：可用
- false：不可用

状态码：

- 200：校验成功
- 400：参数有误
- 500：服务器内部异常

#### Controller

因为有了接口，我们可以不关心页面，所有需要的东西都一清二楚：

- 请求方式：GET
- 请求路径：/check/{param}/{type}
- 请求参数：param,type
- 返回结果：true或false

```java
@Controller
public class UserController {

    @Autowired
    private IUserService userService;


    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    @GetMapping("/check/{data}/{type}")
    public ResponseEntity<Boolean>  checkUser(@PathVariable("data") String data,@PathVariable("type") Integer type){
        Boolean flag=this.userService.checkUser(data,type);
        if(flag==null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(flag);
    }

}
```





#### Service

```java
public interface IUserService {

    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    Boolean checkUser(String data, Integer type);
}
```

```java
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;


    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    @Override
    public Boolean checkUser(String data, Integer type) {
        //用户名验证
        if(type==1) {
            return this.userMapper.selectCount(new QueryWrapper<User>().lambda()
                    .eq(User::getUsername,data))==0;
        }//短信验证
        else if(type==2){
           return  this.userMapper.selectCount(new QueryWrapper<User>().lambda()
                    .eq(User::getPhone,data))==0;
        }

        return null;
    }
}
```





### 阿里云短信服务

注册页面上有短信发送的按钮，当用户点击发送短信，我们需要生成验证码，发送给用户。我们将使用阿里提供的阿里大于来实现短信发送。

> 开通短信服务

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576407943002.png)

> 快速学习，点击马上添加签名

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576408021201.png)

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576408090801.png)

> 添加短信模板

注意验证码模版只支持一个变量

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576409455295.png)



> 欢迎您注册乐优商城，验证码为：${code}，该验证码5分钟内有效，请妥善保管！

稍等片刻即可审核通过

然后就可以查看开发文档了

发送短信验证码文档：https://help.aliyun.com/document_detail/141484.html



#### 测试

需要先充值再测试

1. 创建maven项目，引入依赖

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
   
       <groupId>org.example</groupId>
       <artifactId>demo-aliyunSms</artifactId>
       <version>1.0-SNAPSHOT</version>
       <dependencies>
           <!-- https://mvnrepository.com/artifact/com.aliyun/aliyun-java-sdk-core -->
           <dependency>
               <groupId>com.aliyun</groupId>
               <artifactId>aliyun-java-sdk-core</artifactId>
               <version>4.4.3</version>
           </dependency>
       </dependencies>
   
   </project>
   ```

2. 测试类

   ```java
   package com.demo.sms;
   
   import com.aliyuncs.CommonRequest;
   import com.aliyuncs.CommonResponse;
   import com.aliyuncs.DefaultAcsClient;
   import com.aliyuncs.IAcsClient;
   import com.aliyuncs.exceptions.ClientException;
   import com.aliyuncs.profile.DefaultProfile;
   import com.google.gson.Gson;
   
   import java.time.LocalDate;
   import java.time.format.DateTimeFormatter;
   import java.util.HashMap;
   import java.util.Map;
   
   /**
    * 发送短信
    */
   public class SendSmsDemo {
   
       /**
        * 设置鉴权参数，初始化客户端
        * （地域ID，您的AccessKey ID，您的AccessKey Secret）
        */
       private DefaultProfile profile = DefaultProfile.getProfile(
           "cn-hangzhou",
           "修改为您的AccessKey",
           "修改为您的AccessKey Secret");
       private IAcsClient client = new DefaultAcsClient(profile);
   
       private static void log_print(String functionName, Object result) {
           Gson gson = new Gson();
           System.out.println("-------------------------------" + functionName + "-------------------------------");
           System.out.println(gson.toJson(result));
       }
   
       /**
        * 添加短信模板（不用看这里，已经在控制台创建好了）
        */
       private String addSmsTemplate() throws ClientException {
           CommonRequest addSmsTemplateRequest = new CommonRequest();
           addSmsTemplateRequest.setSysDomain("dysmsapi.aliyuncs.com");
           addSmsTemplateRequest.setSysAction("AddSmsTemplate");
           addSmsTemplateRequest.setSysVersion("2017-05-25");
           // 短信类型。0：验证码；1：短信通知；2：推广短信；3：国际/港澳台消息
           addSmsTemplateRequest.putQueryParameter("TemplateType", "0");
           // 模板名称，长度为1~30个字符
           addSmsTemplateRequest.putQueryParameter("TemplateName", "测试短信模板");
           // 模板内容，长度为1~500个字符
           addSmsTemplateRequest.putQueryParameter("TemplateContent", "您正在申请手机注册，验证码为：${code}，5分钟内有效！");
           // 短信模板申请说明
           addSmsTemplateRequest.putQueryParameter("Remark", "测试");
           CommonResponse addSmsTemplateResponse = client.getCommonResponse(addSmsTemplateRequest);
           String data = addSmsTemplateResponse.getData();
           // 消除返回文本中的反转义字符
           String sData = data.replaceAll("'\'", "");
           log_print("addSmsTemplate", sData);
           Gson gson = new Gson();
           // 将字符串转换为Map类型，取TemplateCode字段值
           Map map = gson.fromJson(sData, Map.class);
           Object templateCode = map.get("TemplateCode");
           return templateCode.toString();
       }
   
       /**
        * 发送短信
        */
       private String sendSms(String telephone, String param) throws ClientException {
           CommonRequest request = new CommonRequest();
           request.setSysDomain("dysmsapi.aliyuncs.com");
           request.setSysVersion("2017-05-25");
           request.setSysAction("SendSms");
           // 接收短信的手机号码
           request.putQueryParameter("PhoneNumbers", telephone);
           // 短信签名名称。请在控制台签名管理页面签名名称一列查看（必须是已添加、并通过审核的短信签名）。
           request.putQueryParameter("SignName", "换成您的短信签名");
           // 短信模板ID
           request.putQueryParameter("TemplateCode", "换成您的短信模板ID");
           // 短信模板变量对应的实际值，JSON格式。
           request.putQueryParameter("TemplateParam", param);
           CommonResponse commonResponse = client.getCommonResponse(request);
           String data = commonResponse.getData();
           String sData = data.replaceAll("'\'", "");
           log_print("sendSms", sData);
           Gson gson = new Gson();
           Map map = gson.fromJson(sData, Map.class);
           Object bizId = map.get("BizId");
           return bizId.toString();
       }
   
       /**
        * 查询发送详情
        */
       private void querySendDetails(String bizId, String telephone) throws ClientException {
           CommonRequest request = new CommonRequest();
           request.setSysDomain("dysmsapi.aliyuncs.com");
           request.setSysVersion("2017-05-25");
           request.setSysAction("QuerySendDetails");
           // 接收短信的手机号码
           request.putQueryParameter("PhoneNumber", telephone);
           // 短信发送日期，支持查询最近30天的记录。格式为yyyyMMdd，例如20191010。
           String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
           request.putQueryParameter("SendDate", today);
           // 分页记录数量
           request.putQueryParameter("PageSize", "10");
           // 分页当前页码
           request.putQueryParameter("CurrentPage", "1");
           // 发送回执ID，即发送流水号。
           request.putQueryParameter("BizId", bizId);
           CommonResponse response = client.getCommonResponse(request);
           log_print("querySendDetails", response.getData());
       }
   
       public static void main(String[] args) {
           SendSmsDemo sendSmsDemo = new SendSmsDemo();
           try {
   
               Map<String, String> map = new HashMap(1);
               //验证码信息
               map.put("code", "123456");
               Gson gson = new Gson();
               // 发送短信
               String bizId = sendSmsDemo.sendSms("换成接收短信的手机号", gson.toJson(map));
               // 根据短信发送流水号查询短信发送情况
               sendSmsDemo.querySendDetails(bizId, "换成接收短信的手机号");
           } catch (ClientException e) {
               e.printStackTrace();
           }
       }
   }
   ```





### 创建短信微服务

因为系统中不止注册一个地方需要短信发送，因此我们将短信发送抽取为微服务：`leyou-sms-service`，凡是需要的地方都可以使用。

另外，因为短信发送API调用时长的不确定性，为了提高程序的响应速度，短信发送我们都将采用异步发送方式，即：

- 短信服务监听MQ消息，收到消息后发送短信。
- 其它服务要发送短信时，通过MQ通知短信微服务。





#### 引入依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>leyou-parent</artifactId>
        <groupId>top.codekiller.leyou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-aliyunSms</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.aliyun</groupId>
            <artifactId>aliyun-java-sdk-core</artifactId>
            <version>4.4.3</version>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.10</version>
        </dependency>
    </dependencies>

</project>
```



#### 编写启动类类

```java
@SpringBootApplication
public class LeyouSmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouSmsApplication.class, args);
    }
}
```





#### 编写配置文件

```java
server:
  port: 8086
spring:
  application:
    name: sms-service
  rabbitmq:
    host: 172.168.154.141
    virtual-host: leyou
    username: leyou
    password: leyou

leyou:
  sms:
    accessKeyId: JWffwFJIwada  # 你自己的accessKeyId
    accessKeySecret: aySRliswq8fe7rF9gQyy1Izz4MQ  # 你自己的AccessKeySecret
    signName: leyouMall # 签名名称
    verifyCodeTemplate: SMS_189522458 # 模板名称
```



#### 属性抽取

```java
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "leyou.sms")
@Data
public class SmsProperties {
    String accessKeyId;
    String accessKeySecret;
    String signName;
    String verifyCodeTemplate;
}
```



```yaml
leyou:
  sms:
    accessKeyId: JWffwFJIwada  # 你自己的accessKeyId
    accessKeySecret: aySRliswq8fe7rF9gQyy1Izz4MQ  # 你自己的AccessKeySecret
    signName: leyouMall # 签名名称
    verifyCodeTemplate: SMS_189522458 # 模板名称
```



#### 编写短信工具类

```java
package top.codekiller.aliyunSms.util;


import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import top.codekiller.aliyunSms.properties.SmsProperties;

@Component
@EnableConfigurationProperties(SmsProperties.class)
@Slf4j
public class SendSmsUtils {

    private SmsProperties smsProperties;

    private IAcsClient client=null;

    /**
     * 通过构造方法注入
     *
     * @param smsProperties
     */
    public SendSmsUtils(SmsProperties smsProperties) {
        this.smsProperties = smsProperties;

        /**
         * 设置鉴权参数，初始化客户端
         * （地域ID，您的AccessKey ID，您的AccessKey Secret）
         */
        DefaultProfile profile = DefaultProfile.getProfile(
                "cn-hangzhou",
                smsProperties.getAccessKeyId(),
                smsProperties.getAccessKeySecret());
        client = new DefaultAcsClient(profile);
    }


    /**
     * 发送短信
     */
    public CommonResponse sendSms(String telephone, String param, String signName, String templateId) throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        // 接收短信的手机号码
        request.putQueryParameter("PhoneNumbers", telephone);
        // 短信签名名称。请在控制台签名管理页面签名名称一列查看（必须是已添加、并通过审核的短信签名）。
        request.putQueryParameter("SignName", signName);
        // 短信模板ID
        request.putQueryParameter("TemplateCode", templateId);
        // 短信模板变量对应的实际值，JSON格式。
        request.putQueryParameter("TemplateParam", param);
        CommonResponse commonResponse = client.getCommonResponse(request);
        log.info("发送短信结果：{}", commonResponse.getData());

        return commonResponse;
    }

}
```





#### 编写消息监听类

接下来，编写消息监听器，当接收到消息后，我们发送短信。

> 注意：引入common-lang3的依赖(依赖见下方),使用StringUtils

```java
package top.codekiller.aliyunSms.listener;

import com.aliyuncs.exceptions.ClientException;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import top.codekiller.aliyunSms.properties.SmsProperties;
import top.codekiller.aliyunSms.util.SendSmsUtils;
import java.util.Map;

@Component
public class SmsListener {

    @Autowired
    private SmsProperties smsProperties;

    @Autowired
    private SendSmsUtils sendSmsUtils;


    @RabbitListener(bindings = @QueueBinding(
        value=@Queue(value="LEYOU.SMS.QUEUE",durable = "true"),
        exchange = @Exchange(value="LEYOU.SMS.EXCHANGE",ignoreDeclarationExceptions = "true",type= ExchangeTypes.TOPIC),
        key={"verifycode_sms"}
    ))
    public void sendSms(Map<String,String> msg) throws ClientException {
        if(msg==null||CollectionUtils.isEmpty(msg)){
            //放弃处理
            return ;
        }
        String phoneNum=msg.get("phone");
        String code=msg.get("code");

        if(StringUtils.isAllBlank(phoneNum,code)){
            //放弃处理
            return ;
        }


        if(!StringUtils.isEmpty(phoneNum)&&!StringUtils.isEmpty(code)){
            JsonObject jsonObject=new JsonObject();
            jsonObject.addProperty("code",code);
            sendSmsUtils.sendSms(phoneNum,jsonObject.toString(),smsProperties.getSignName(),smsProperties.getVerifyCodeTemplate());
        }
    }
}
```

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.10</version>
</dependency>
```





我们注意到，消息体是一个Map，里面有两个属性：

- phone：电话号码
- code：短信验证码

然后启动项目，查看rabbitmq后台页面是否存在交换机，消息队列等





### 发送短信功能

短信微服务已经准备好，我们就可以继续编写用户中心接口了。



#### 接口说明

![](https://img-blog.csdnimg.cn/20200501165543607.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这里的业务逻辑是这样的：

1. 我们接收页面发送来的手机号码
2. 生成一个随机验证码
3. 将验证码保存在服务端
4. 发送短信，将验证码发送到用户手机

那么问题来了：验证码保存在哪里呢？

验证码有一定有效期，一般是5分钟，我们可以利用Redis的过期机制来保存。





### Spring Data Redis

官网：http://projects.spring.io/spring-data-redis/

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1527250056698.png)

Spring Data Redis，是Spring Data 家族的一部分。 对Jedis客户端进行了封装，与spring进行了整合。可以非常方便的来实现redis的配置和操作。



#### RedisTemplate基本操作

Spring Data Redis 提供了一个工具类：RedisTemplate。里面封装了对于Redis的五种数据结构的各种操作，包括：

- redisTemplate.opsForValue() ：操作字符串
- redisTemplate.opsForHash() ：操作hash
- redisTemplate.opsForList()：操作list
- redisTemplate.opsForSet()：操作set
- redisTemplate.opsForZSet()：操作zset

其它一些通用命令，如expire，可以通过redisTemplate.xx()来直接调用

5种结构：

- String：等同于java中的，`Map`
- list：等同于java中的`Map>`
- set：等同于java中的`Map>`
- sort_set：可排序的set
- hash：等同于java中的：`Map>`



#### StringRedisTemplcate

RedisTemplate在创建时，可以指定其泛型类型：

- K：代表key 的数据类型
- V: 代表value的数据类型

注意：这里的类型不是Redis中存储的数据类型，而是Java中的数据类型，RedisTemplate会自动将Java类型转为Redis支持的数据类型：字符串、字节、二进制等等。

![](https://img-blog.csdnimg.cn/20200501165703419.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

不过RedisTemplate默认会采用JDK自带的序列化（Serialize）来对对象进行转换。生成的数据十分庞大，因此一般我们都会指定key和value为String类型，这样就由我们自己把对象序列化为json字符串来存储即可。

因为大部分情况下，我们都会使用key和value都为String的RedisTemplate，因此Spring就默认提供了这样一个实现：

![](https://img-blog.csdnimg.cn/20200501165734840.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 测试

![](https://img-blog.csdnimg.cn/20200501165746294.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
package com.leyou.user.test;

import com.leyou.user.LeyouUserServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeyouUserServiceApplication.class)
public class RedisTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testRedis() {
        // 存储数据
        this.redisTemplate.opsForValue().set("key1", "value1");
        // 获取数据
        String val = this.redisTemplate.opsForValue().get("key1");
        System.out.println("val = " + val);
    }

    @Test
    public void testRedis2() {
        // 存储数据，并指定剩余生命时间,5分钟
        this.redisTemplate.opsForValue().set("key2", "value2",
                5, TimeUnit.MINUTES);;
    }

    @Test
    public void testHash() {
        BoundHashOperations<String, Object, Object> hashOps =
                this.redisTemplate.boundHashOps("user");
        // 操作hash数据
        hashOps.put("name", "jack");
        hashOps.put("age", "21");

        // 获取单个数据
        Object name = hashOps.get("name");
        System.out.println("name = " + name);

        // 获取所有数据
        Map<Object, Object> map = hashOps.entries();
        for (Map.Entry<Object, Object> me : map.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
```

需要在项目中引入Redis启动器：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

然后在配置文件中指定Redis地址：

```yaml
spring:
  redis:
    host: 172.16.145.141
    password: redis
```







### 在项目中实现

需要三个步骤：

- 生成随机验证码
- 将验证码保存到Redis中，用来在注册的时候验证
- 发送验证码到`leyou-sms-service`服务，发送短信

因此，我们需要引入Redis和AMQP：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>Copy to clipboardErrorCopied
```

添加RabbitMQ和Redis配置：

```yaml
spring:
  redis:
    host: 172.16.145.141
  rabbitmq:
    host: 172.16.145.141
    username: leyou
    password: 123456
    virtual-host: /leyouCopy to clipboardErrorCopied
```

另外还要用到工具类，生成6位随机码，这个我们封装到了`leyou-common`中，因此需要引入依赖：

```xml
<dependency>
    <groupId>com.leyou.common</groupId>
    <artifactId>leyou-common</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>Copy to clipboardErrorCopied
```

NumberUtils中有生成随机码的工具方法：

```java
/**
 * 生成指定位数的随机数字
 * @param len 随机数的位数
 * @return 生成的随机数
 */
public static String generateCode(int len){
    len = Math.min(len, 8);
    int min = Double.valueOf(Math.pow(10, len - 1)).intValue();
    int num = new Random().nextInt(
        Double.valueOf(Math.pow(10, len + 1)).intValue() - 1) + min;
    return String.valueOf(num).substring(0,len);
}Copy to clipboardErrorCopied
```





#### UserController

在leyou-user-service工程中的UserController添加方法：

```java
/**
     * 发送验证码
     * @param phone
     * @return
     */
@PostMapping("code")
public ResponseEntity<Void> sendVerifyCode(@RequestParam("phone")String phone){
    Boolean flag = this.userService.sendVerifyCode(phone);
    if(flag==null){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }else if(!flag){
        return ResponseEntity.badRequest().build();
    }
    return ResponseEntity.noContent().build();
}
```



#### UserService

在Service中添加代码：

```java
package top.cokiller.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leyou.common.utils.NumberUtils;
import com.mysql.jdbc.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.omg.CORBA.TIMEOUT;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import top.codekiller.user.pojo.User;
import top.cokiller.user.mapper.UserMapper;
import top.cokiller.user.service.IUserService;
import top.cokiller.user.utils.CodecUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final String KEY_PREFIX="user:verify";


    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    @Override
    public Boolean checkUser(String data, Integer type) {
        //用户名验证
        if(type==1) {
            return this.userMapper.selectCount(new QueryWrapper<User>().lambda()
                    .eq(User::getUsername,data))==0;
        }//短信验证
        else if(type==2){
           return  this.userMapper.selectCount(new QueryWrapper<User>().lambda()
                    .eq(User::getPhone,data))==0;
        }

        return null;
    }


    /**
     * 发送验证码
     * @param phone
     */
    @Override
    public Boolean sendVerifyCode(String phone) {
        //校验手机号格式是否正确
        if (!phone.matches("^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$")) {
            return false;
        }

        if(StringUtils.isBlank(phone)){
            return false;
        }
        //生成验证码
        String code= NumberUtils.generateCode(6);
        System.out.println("验证码："+code);

        //获取数据
        Map<String,String> map=new HashMap<>();
        map.put("phone",phone);
        map.put("code",code);
        try {
            //发送消息到RabbitMQ
            amqpTemplate.convertAndSend("LEYOU.SMS.EXCHANGE","verifycode.sms",map);

            //把验证码保存到redis中,并且设置5min的有效时间
            this.redisTemplate.opsForValue().set(KEY_PREFIX+phone,code,5, TimeUnit.MINUTES);
        } catch (AmqpException e) {
            log.error("给{}发送验证码失败", phone, e);
            e.printStackTrace();
            return null;
        }
        return true;
    }
```

注意：要设置短信验证码在Redis的缓存时间为5分钟





#### 测试

通过Postman工具发送请求试试：

![1576469102358](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576469102358.png)

查看Redis中的数据：

![1576469139443](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576469139443.png)

查看是否收到短信



### 注册功能

#### 接口说明

![1527240855176](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1527240855176.png)

基本逻辑：

1. 校验短信验证码
2. 生成盐
3. 对密码加密
4. 写入数据库
5. 删除Redis中的验证码



#### UserController

```java
@PostMapping("/register")
public ResponseEntity<Void> register(User user, @RequestParam("code") String code) {
    Boolean boo = this.userService.register(user, code);
    if (!boo) {
        return ResponseEntity.badRequest().build();
    }
    return ResponseEntity.created(null).build();
}Copy to clipboardErrorCopied
```



#### UserService

```java
@Override
public Boolean register(User user, String code) {
    //校验验证码是否正确
    String realCode = this.redisTemplate.opsForValue().get(KEY_PREFIX + user.getPhone());
    if (!StringUtils.equals(realCode, code)) {
        return false;
    }

    //生成盐
    String salt = CodecUtils.generateSalt();
    //设置盐
    user.setSalt(salt);
    //密码加密
    user.setPassword(CodecUtils.md5Hex(user.getPassword(), salt));

    // 强制设置不能指定的参数为null
    user.setId(null);
    user.setCreated(new Date());

    //保存到数据库
    boolean boo = this.userMapper.insertSelective(user) == 1;

    //注册成功删除redis中的验证码
    if (boo) {
        this.redisTemplate.delete(KEY_PREFIX + user.getPhone());
    }

    return boo;
}Copy to clipboardErrorCopied
```

此处使用了资料中的CodeUtils：

该工具类需要apache加密工具包：

```xml
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
</dependency>Copy to clipboardErrorCopied
```



#### 测试

我们通过RestClient测试：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1533024221725.png)

查看数据库：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1533024241233.png)

查看redis中的信息也被删除







### Hibernate-validate

刚才虽然实现了注册，但是服务端并没有进行数据校验，而前端的校验是很容易被有心人绕过的。所以我们必须在后台添加数据校验功能：

我们这里会使用Hibernate-Validator框架完成数据校验：

而SpringBoot的web启动器中已经集成了相关依赖：

![](https://img-blog.csdnimg.cn/20200501213636830.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 什么是Hibernate Validator

Hibernate Validator是Hibernate提供的一个开源框架，使用注解方式非常方便的实现服务端的数据校验。

官网：http://hibernate.org/validator/

![](https://img-blog.csdnimg.cn/20200501213746336.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

**hibernate Validator** 是 Bean Validation 的参考实现 。

Hibernate Validator 提供了 JSR 303 规范中所有内置 constraint（约束） 的实现，除此之外还有一些附加的 constraint。

在日常开发中，Hibernate Validator经常用来验证bean的字段，基于注解，方便快捷高效。



#### Bean校验的注解

常用注解如下：

| **Constraint**                                   | **详细信息**                                                 |
| ------------------------------------------------ | ------------------------------------------------------------ |
| **@Valid**                                       | 被注释的元素是一个对象，需要检查此对象的所有字段值           |
| **@Null**                                        | 被注释的元素必须为 null                                      |
| **@NotNull**                                     | 被注释的元素必须不为 null                                    |
| **@AssertTrue**                                  | 被注释的元素必须为 true                                      |
| **@AssertFalse**                                 | 被注释的元素必须为 false                                     |
| **@Min(value)**                                  | 被注释的元素必须是一个数字，其值必须大于等于指定的最小值     |
| **@Max(value)**                                  | 被注释的元素必须是一个数字，其值必须小于等于指定的最大值     |
| **@DecimalMin(value)**                           | 被注释的元素必须是一个数字，其值必须大于等于指定的最小值     |
| **@DecimalMax(value)**                           | 被注释的元素必须是一个数字，其值必须小于等于指定的最大值     |
| **@Size(max, min)**                              | 被注释的元素的大小必须在指定的范围内                         |
| **@Digits (integer, fraction)**                  | 被注释的元素必须是一个数字，其值必须在可接受的范围内         |
| **@Past**                                        | 被注释的元素必须是一个过去的日期                             |
| **@Future**                                      | 被注释的元素必须是一个将来的日期                             |
| **@Pattern(value)**                              | 被注释的元素必须符合指定的正则表达式                         |
| **@Email**                                       | 被注释的元素必须是电子邮箱地址                               |
| **@Length**                                      | 被注释的字符串的大小必须在指定的范围内                       |
| **@NotEmpty**                                    | 被注释的字符串的必须非空                                     |
| **@Range**                                       | 被注释的元素必须在合适的范围内                               |
| **@NotBlank**                                    | 被注释的字符串的必须非空                                     |
| **@URL(protocol=,host=, port=,regexp=, flags=)** | 被注释的字符串必须是一个有效的url                            |
| **@CreditCardNumber**                            | 被注释的字符串必须通过Luhn校验算法，银行卡，信用卡等号码一般都用Luhn计算合法性 |



#### 给User添加校验

我们在`leyou-user-interface`中添加Hibernate-Validator依赖：

```xml
<dependency>
    <groupId>org.hibernate.validator</groupId>
    <artifactId>hibernate-validator</artifactId>
</dependency>Copy to clipboardErrorCopied
```

我们在User对象的部分属性上添加注解：

```java
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 4, max = 30, message = "用户名只能在4~30位之间")
    private String username;// 用户名

    @JsonIgnore
    @Length(min = 4, max = 30, message = "密码只能在4~30位之间")
    private String password;// 密码

    @Pattern(regexp = "^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$", message = "手机号码格式不正确")
    private String phone;// 电话

    private Date created;// 创建时间

    @JsonIgnore
    private String salt;// 密码的盐值
}Copy to clipboardErrorCopied
```



#### 在controller上进行控制

在controller中改造register方法，只需要给User添加 `@Valid`注解即可。

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1533030001081.png)





#### 测试

我们故意填错：

![](https://img-blog.csdnimg.cn/20200501214246234.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后SpringMVC会自动返回错误信息：

![](https://img-blog.csdnimg.cn/20200501214306421.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







### 根据用户名和密码查询用户

**功能说明**

查询功能，根据参数中的用户名和密码查询指定用户

**接口路径**

```
GET /queryCopy to clipboardErrorCopied
```

**参数说明**

| 参数     | 说明                                     | 是否必须 | 数据类型 | 默认值 |
| -------- | ---------------------------------------- | -------- | -------- | ------ |
| username | 用户名，格式为4~30位字母、数字、下划线   | 是       | String   | 无     |
| password | 用户密码，格式为4~30位字母、数字、下划线 | 是       | String   | 无     |

**返回结果**

用户的json格式数据

```json
{
    "id": 6572312,
    "username":"test",
    "phone":"13688886666",
    "created": 1342432424
}Copy to clipboardErrorCopied
```

**状态码**

- 200：返回查询数据
- 400：用户名或密码错误
- 500：服务器内部异常，查询失败



####  Controller

```java
@GetMapping("/query")
public ResponseEntity<User> queryUser(@RequestParam("username") String username, @RequestParam("password") String password) {

    User user = this.userService.queryUser(username, password);
    if (user == null) {
        return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(user);
}Copy to clipboardErrorCopied
```



#### Service

```java
    @Override
    public User queryUser(String username, String password) {
        //根据用户名查询用户
        User user=this.userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUsername,username));
        //没有此用户直接返回
        if(user==null) return null;

        //获取盐
        String salt=user.getSalt();

        //对需要验证的password进行加盐加密
        password=CodecUtils.md5Hex(password,salt);

        //校验密码是否一致
        if(StringUtils.equals(password,user.getPassword())){
            return user;
        }else{
            return null;
        }
    }
```

要注意，查询时也要对密码进行加密后判断是否一致。



#### 测试

![](https://img-blog.csdnimg.cn/20200501214642341.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 在注册页进行测试

http://www.leyou.com/register.html

在注册页填写信息：

![](https://img-blog.csdnimg.cn/20200501214752109.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







## 用户登录

![](https://img-blog.csdnimg.cn/20200501223351335.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 什么是有状态？

有状态服务，即服务端需要记录每次会话的客户端信息，从而识别客户端身份，根据用户身份进行请求的处理，典型的设计如tomcat中的session。

例如登录：用户登录后，我们把登录者的信息保存在服务端session中，并且给用户一个cookie值，记录对应的session。然后下次请求，用户携带cookie值来，我们就能识别到对应session，从而找到用户的信息。

缺点是什么？

- 服务端保存大量数据，增加服务端压力
- 服务端保存用户状态，无法进行水平扩展
- 客户端请求依赖服务端，多次请求必须访问同一台服务器



### 什么是无状态

微服务集群中的每个服务，对外提供的都是Rest风格的接口。而Rest风格的一个最重要的规范就是：服务的无状态性，即：

- 服务端不保存任何客户端请求者信息
- 客户端的每次请求必须具备自描述信息，通过这些信息识别客户端身份

带来的好处是什么呢？

- 客户端请求不依赖服务端的信息，任何多次请求不需要必须访问到同一台服务
- 服务端的集群和状态对客户端透明
- 服务端可以任意的迁移和伸缩
- 减小服务端存储压力



### 如何实现无状态

无状态登录的流程：

- 当客户端第一次请求服务时，服务端对用户进行信息认证（登录）
- 认证通过，将用户信息进行加密形成token，返回给客户端，作为登录凭证
- 以后每次请求，客户端都携带认证的token
- 服务的对token进行解密，判断是否有效。

流程图：

![](https://img-blog.csdnimg.cn/20200501223530832.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

整个登录过程中，最关键的点是什么？

**token的安全性**

token是识别客户端身份的唯一标示，如果加密不够严密，被人伪造那就完蛋了。

采用何种方式加密才是安全可靠的呢？

我们将采用`JWT + RSA非对称加密`



### JWT

#### 简介

JWT，全称是Json Web Token， 是JSON风格轻量级的授权和身份认证规范，可实现无状态、分布式的Web应用授权；官网：[https://jwt.io](https://jwt.io/)

![](https://img-blog.csdnimg.cn/20200501223629430.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

GitHub上jwt的java客户端：https://github.com/jwtk/jjwt



#### 数据格式

JWT包含三部分数据：

- Header：头部，通常头部有两部分信息：

  - 声明类型，这里是JWT

  我们会对头部进行base64编码，得到第一部分数据

- Payload：载荷，就是有效数据，一般包含下面信息：

  - 用户身份信息（注意，这里因为采用base64编码，可解码，因此不要存放敏感信息）
  - 注册声明：如token的签发时间，过期时间，签发人等

  这部分也会采用base64编码，得到第二部分数据

- Signature：签名，是整个数据的认证信息。一般根据前两步的数据，再加上服务的的密钥（secret）（不要泄漏，最好周期性更换），通过加密算法生成。用于验证整个数据完整和可靠性

![](https://img-blog.csdnimg.cn/20200501223656770.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

可以看到分为3段，每段就是上面的一部分数据



#### JWT交互流程

流程图：

![](https://img-blog.csdnimg.cn/20200501223800295.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

步骤翻译：

1. 用户登录
2. 服务的认证，通过后根据secret生成token
3. 将生成的token返回给浏览器
4. 用户每次请求携带token
5. 服务端利用公钥解读jwt签名，判断签名有效后，从Payload中获取用户信息
6. 处理请求，返回响应结果

因为JWT签发的token中已经包含了用户的身份信息，并且每次请求都会携带，这样服务的就无需保存用户信息，甚至无需去数据库查询，完全符合了Rest的无状态规范。



### 加密类型

加密技术是对信息进行编码和解码的技术，编码是把原来可读信息（又称明文）译成代码形式（又称密文），其逆过程就是解码（解密），加密技术的要点是加密算法，加密算法可以分为三类：

#### 对称加密，如AES

- 基本原理：将明文分成N个组，然后使用密钥对各个组进行加密，形成各自的密文，最后把所有的分组密文进行合并，形成最终的密文。
- 优势：算法公开、计算量小、加密速度快、加密效率高
- 缺陷：双方都使用同样密钥，安全性得不到保证



#### 非对称加密，如RSA

- 基本原理：同时生成两把密钥：私钥和公钥，私钥隐秘保存，公钥可以下发给信任客户端
  - `私钥加密，持有私钥或公钥才可以解密`
  - `公钥加密，持有私钥才可解密`
- 优点：安全，难以破解
- 缺点：算法比较耗时



#### 不可逆加密，如MD5，SHA

- 基本原理：加密过程中不需要使用[密钥](https://baike.baidu.com/item/密钥)，输入明文后由系统直接经过加密算法处理成密文，这种加密后的数据是无法被解密的，无法根据密文推算出明文。

RSA算法历史：

1977年，三位数学家Rivest、Shamir 和 Adleman 设计了一种算法，可以实现非对称加密。这种算法用他们三个人的名字缩写：RSA



### RSA和AES加密技术的对比

#### RSA和AES的区别：

总结于：http://www.360doc.com/content/16/0606/15/12385684_565529546.shtml#



##### RSA

是公开密钥系统的代表；

安全性：建立在具有大素数因子的合数，其因子分解困难这一法则之上；

处理速度慢；

密钥管理：加解密过程中不必网络传输保密的密钥；密钥管理优于AES算法；

RSA加解密速度慢，不适合大量数据文件加密；



##### AES

Rijndael算法是新一代的高级加密标准，运行时不需计算机有非常高的处理能力和大的内存；

操作可以很容易的抵御时间和空间的攻击，在不同的运行环境下始终保持良好的性能；

AES密钥长度：最长只有256bit，可用软件和硬件实现高速处理；

aes密钥：aes支持三种密钥长度：128位，192位，256位，大家经常说的AES128, AES256就是指不同的密钥长度；

不同的密钥长长度意味着aes加密的轮数不同，128位加密10轮，192加密12轮，256加密14轮，从安全性角度来讲，256位安全性最高，但是128位因为加密轮数少，所以性能更好一些。

密钥管理：要求在通信前对密钥进行秘密分配，解密的私钥必须通过网络传送至加密数据接收方；

AES加密速度很快；



##### AES+RSA：

使用AES对称密码体制对传输数据加密，同时使用RSA不对称密码体制来传送AES的密钥，就可以综合发挥AES和RSA的优点同时

避免它们缺点来实现一种新的数据加密方案



#### RSA签名和验签的流程图：

特点：只需交换公钥；公/秘钥机制，公钥加密，私钥解密；（或者私钥加密，公钥解密）；公钥负责加密，私钥负责解密；私钥负责签名，公钥负责验证。

缺点：加解密速度慢，特别是解密


![](https://img-blog.csdnimg.cn/20200501224117554.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### AES框图

特点：加解密用同一秘钥

优点：速度快，效率高；

存在的问题：秘钥交换问题

摘自：http://www.360doc.com/content/16/0606/15/12385684_565529546.shtml#

![](https://img-blog.csdnimg.cn/20200501224319706.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### AES+RSA=数据加密方案：

摘自：http://www.360doc.com/content/16/0606/15/12385684_565529546.shtml#

![](https://img-blog.csdnimg.cn/20200501224221211.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

流程：

接收方创建RSA秘钥对，

发送RSA公钥给发送方，自己保留RSA私钥

发送方创建AES密钥，加密待传送的明文，之后用RSA公钥加密该密钥，

RSA公钥加密AES的密钥+AES密钥加密明文的密文----通过Internet发给---->接收方

接收方用RSA私钥解密加密的密钥，之后再用解密后的AES密钥解密数据密文，得到明文。




### 结合Zuul的鉴权流程

我们逐步演进系统架构设计。需要注意的是：secret是签名的关键，因此一定要保密，我们放到鉴权中心保存，其它任何服务中都不能获取secret。



#### 没有RSA加密时

在微服务架构中，我们可以把服务的鉴权操作放到网关中，将未通过鉴权的请求直接拦截，如图：

![](https://img-blog.csdnimg.cn/20200501232011732.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



1. 用户请求登录
2. Zuul将请求转发到授权中心，请求授权
3. 授权中心校验完成，颁发JWT凭证
4. 客户端请求其它功能，携带JWT
5. Zuul将jwt交给授权中心校验，通过后放行
6. 用户请求到达微服务
7. 微服务将jwt交给鉴权中心，鉴权同时解析用户信息
8. 鉴权中心返回用户数据给微服务
9. 微服务处理请求，返回响应

发现什么问题了？

每次鉴权都需要访问鉴权中心，系统间的网络请求频率过高，效率略差，鉴权中心的压力较大。



#### 集合RSA的鉴权

直接看图：

![](https://img-blog.csdnimg.cn/20200501232136264.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

- 我们首先利用RSA生成公钥和私钥。私钥保存在授权中心，公钥保存在Zuul和各个信任的微服务
- 用户请求登录
- 授权中心校验，通过后用私钥对JWT进行签名加密
- 返回jwt给用户
- 用户携带JWT访问
- Zuul直接通过公钥解密JWT，进行验证，验证通过则放行
- 请求到达微服务，微服务直接用公钥解析JWT，获取用户信息，无需访问授权中心







###  授权中心

#### 创建授权中心

授权中心的主要职责：

- 用户鉴权：
  - 接收用户的登录请求，通过用户中心的接口进行校验，通过后生成JWT
  - 使用私钥生成JWT并返回
- 服务鉴权：微服务间的调用不经过Zuul，会有风险，需要鉴权中心进行认证
  - 原理与用户鉴权类似，但逻辑稍微复杂一些（此处我们不做实现）

因为生成jwt，解析jwt这样的行为以后在其它微服务中也会用到，因此我们会抽取成工具。我们把鉴权中心进行聚合，一个工具module，一个提供服务的module

#### 创建父mudule

我们先创建父module，名称为：`leyou-auth`

将pom打包方式改为`pom`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>leyou-parent</artifactId>
        <groupId>top.codekiller.leyou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-auth</artifactId>
    <version>1.0-SNAPSHOT</version>
    <modules>
        <module>leyou-auth-common</module>
        <module>leyou-auth-service</module>
    </modules>
    <packaging>pom</packaging>
</project>
```



#### 通用Module

然后是授权服务的通用模块：`leyou-auth-common`：

pom.xml：

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt</artifactId>
        <version>0.9.0</version>
    </dependency>
    <dependency>
        <groupId>joda-time</groupId>
        <artifactId>joda-time</artifactId>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

结构：

![](https://img-blog.csdnimg.cn/20200502140634681.png)





#### 授权服务

`leyou-auth-service`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>leyou-auth</artifactId>
        <groupId>top.codekiller.leyou</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-auth-service</artifactId>

    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>top.codekiller.leyou</groupId>
            <artifactId>leyou-user-interface</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>top.codekiller.leyou</groupId>
            <artifactId>leyou-auth-common</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
    </dependencies>
</project>
```





引导类：

```java
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LeyouAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouAuthServiceApplication.class, args);
    }
}Copy to clipboardErrorCopied
```

application.yml

```java
server:
  port: 8087
spring:
  application:
    name: auth-service

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    registry-fetch-interval-seconds: 10
  instance:
    lease-renewal-interval-in-seconds: 5
    lease-expiration-duration-in-seconds: 15
```



leyou-gateway工程的application.yml中，修改路由：

```yaml
zuul:
  prefix: /api # 路由路径前缀
  routes:
    item-service: /item/** # 商品微服务的映射路径
    search-service: /search/** # 搜索微服务
    user-service: /user/** # 用户微服务
    auth-service: /auth/** # 授权中心微服务Copy to clipboardErrorCopied
```





### JWT工具类

在`leyou-auth-common`中导入资料中的工具类：

[jwtUtils](https://cloudlandboy.github.io/myNote/project/leyoumall/assets/jwtUtils.tar.gz)

![](https://img-blog.csdnimg.cn/20200502144632898.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 测试工具类

在`leyou-auth-common`中编写测试类：

```java
package com.leyou.auth.test;

import com.leyou.auth.pojo.UserInfo;
import com.leyou.auth.util.JwtUtils;
import com.leyou.auth.util.RsaUtils;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;

public class JwtTest {

    /**
     * 存放公钥(yuè)的路径
     */
    private static final String pubKeyPath = "/home/cloudlandboy/Project/leyou/rsa/rsa.pub";

    /**
     * 存放私钥(yuè)的路径
     */
    private static final String priKeyPath = "/home/cloudlandboy/Project/leyou/rsa/rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        //（公钥路径，私钥路径，服务密钥）
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
    }

//    @Before
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        // 生成token
        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTUzMzI4MjQ3N30.EPo35Vyg1IwZAtXvAx2TCWuOPnRwPclRNAM4ody5CHk8RF55wdfKKJxjeGh4H3zgruRed9mEOQzWy79iF1nGAnvbkraGlD6iM-9zDW8M1G9if4MX579Mv1x57lFewzEo-zKnPdFJgGlAPtNWDPv4iKvbKOk1-U7NUtRmMsF1Wcg";

        // 解析token
        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + user.getId());
        System.out.println("userName: " + user.getUsername());
    }
}
```

测试生成公钥和私钥，我们运行这段代码：**注意需要把@Before方法注释掉**

![](https://img-blog.csdnimg.cn/20200502144721992.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

运行之后，查看目标目录：

![](https://img-blog.csdnimg.cn/2020050214473819.png)

公钥和私钥已经生成了！

测试生成token，**先把@Before的注释去掉**：

![](https://img-blog.csdnimg.cn/20200502144752424.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/2020050214481736.png)

测试解析token：

![](https://img-blog.csdnimg.cn/20200502144829477.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

任意改动token，发现报错了：

![](https://img-blog.csdnimg.cn/20200502144841635.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





###  编写登录授权接口

接下来，我们需要在`leyou-auth-servcice`编写一个接口，对外提供登录授权服务。基本流程如下：

- 客户端携带用户名和密码请求登录
- 授权中心调用用户中心接口，根据用户名和密码查询用户信息
- 如果用户名密码正确，能获取用户，否则为空，则登录失败
- 如果校验成功，则生成JWT并返回



#### 生成公钥和私钥

我们需要在授权中心生成真正的公钥和私钥。我们必须有一个生成公钥和私钥的secret，这个可以配置到`application.yml`中：

```yml
leyou:
  jwt:
    secret: ea61b46dse2@leyou@9ds966@leyou@33da # 登录校验的密钥
    pubKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 公钥地址
    priKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pri # 私钥地址
    expire: 30 # 过期时间,单位分钟
    cookieName: LY_TOKEN
```

然后编写属性类，加载这些数据：

```java
package top.codekiller.auth.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import top.codekiller.auth.util.RsaUtils;
import javax.annotation.PostConstruct;
import java.io.File;
import java.security.PrivateKey;
import java.security.PublicKey;


/**application.yml配置
 * leyou:
 *   jwt:
 *     secret: ea61b46dse2@leyou@9ds966@leyou@33da # 登录校验的密钥
 *     pubKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 公钥地址
 *     priKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 私钥地址
 *     expire: 30 # 过期时间,单位分钟
 *     cookieName: LY_TOKEN
 */


@ConfigurationProperties(prefix = "leyou.jwt")
@Slf4j
@Data
public class JwtProperties {

    private String secret; // 密钥

    private String pubKeyPath;// 公钥保存路径

    private String priKeyPath;// 私钥保存路径

    private int expire;// token过期时间

    private PublicKey publicKey; // 公钥

    private PrivateKey privateKey; // 私钥

    private String cookieName;  //cookie的名字

    /**
     * @PostContruct：在构造方法执行之后执行该方法
     */
    @PostConstruct
    public void init(){
        try {
            File pubKey = new File(pubKeyPath);
            File priKey = new File(priKeyPath);
            if (!pubKey.exists() || !priKey.exists()) {
                // 生成公钥和私钥
                RsaUtils.generateKey(pubKeyPath, priKeyPath, secret);
            }
            // 获取公钥和私钥
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
            this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
        } catch (Exception e) {
            log.error("初始化公钥和私钥失败！", e);
            throw new RuntimeException();
        }
        }
}
```





#### Controller

编写授权接口，我们接收用户名和密码，校验成功后，写入cookie中。

- 请求方式：post
- 请求路径：/accredit
- 请求参数：username和password
- 返回结果：无

代码：

```java
package top.codekiller.auth.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.codekiller.auth.properties.JwtProperties;
import top.codekiller.auth.service.IAuthService;
import top.codekiller.auth.service.impl.AuthServiceImpl;
import top.codekiller.auth.util.CookieUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AuthController {

    @Autowired
    private AuthServiceImpl authService;

    @Autowired
    private JwtProperties jwtProperties;

    /**
     * 授权
     * @param username
     * @param password
     * @param request
     * @param response
     * @return
     */
    @PostMapping("accredit")
    public ResponseEntity<Void> accredit(@RequestParam("username") String username, @RequestParam("password") String password
                                         , HttpServletRequest request, HttpServletResponse response){
        String token=this.authService.accredit(username,password);
        if(StringUtils.isBlank(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        // 将token写入cookie,并指定httpOnly为true，防止通过JS获取和修改
        CookieUtils.setCookie(request,response,jwtProperties.getCookieName(),token,jwtProperties.getExpire()*60,null,true);

        return ResponseEntity.ok(null);

    }
}
```

> 如果cookie中设置了HttpOnly属性，那么通过js脚本将无法读取到cookie信息，这样能有效的防止XSS攻击，窃取cookie内容，这样就增加了cookie的安全性，即便是这样，也不要将重要信息存入cookie。XSS全称Cross SiteScript，跨站脚本攻击，是Web程序中常见的漏洞，XSS属于被动式且用于客户端的攻击方式，所以容易被忽略其危害性。其原理是攻击者向有XSS漏洞的网站中输入(传入)恶意的HTML代码，当其它用户浏览该网站时，这段HTML代码会自动执行，从而达到攻击的目的。如，盗取用户Cookie、破坏页面结构、重定向到其它网站等。



#### CookieUtils

要注意，这里使用了一个工具类，CookieUtils，我们把它添加到`leyou-common`

见项目资料

![](https://img-blog.csdnimg.cn/20200502195811621.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### UserClient

接下来我们肯定要对用户密码进行校验，所以我们需要通过FeignClient去访问 user-service微服务：

在leyou-auth中引入user-service-interface依赖：

```xml
<dependency>
    <groupId>top.codekiller.user</groupId>
    <artifactId>leyou-user-interface</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>Copy to clipboardErrorCopied
```

参照leyou-search或者leyou-goods-web，在leyou-auth-service中编写FeignClient：

```java
@FeignClient(value = "user-service")
public interface UserClient extends UserApi {
}Copy to clipboardErrorCopied
```

在leyou-user-interface工程中添加api接口：

![](https://img-blog.csdnimg.cn/20200502195922966.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

内容：

```java
public interface UserApi {

    @GetMapping("/query")
    User queryUser(@RequestParam("username") String username, @RequestParam("password") String password);
}
```







#### AuthService

```java
package top.codekiller.auth.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import top.codekiller.auth.client.UserClient;
import top.codekiller.auth.pojo.UserInfo;
import top.codekiller.auth.properties.JwtProperties;
import top.codekiller.auth.service.IAuthService;
import top.codekiller.auth.util.JwtUtils;
import top.codekiller.user.pojo.User;



@Slf4j
@Service
@EnableConfigurationProperties(JwtProperties.class)
public class AuthServiceImpl implements IAuthService {

    private JwtProperties jwtProperties;

    @Autowired
    private UserClient userClient;

    public AuthServiceImpl(JwtProperties jwtProperties){
        this.jwtProperties=jwtProperties;
    }


    /**
     * 授权
     * @param username
     * @param password
     * @return
     */
    @Override
    public String accredit(String username, String password) {
        //根据用户名和密码查询
        User user = userClient.queryUser(username, password);
        System.out.println(user);
        //判断user
        if(user==null){
            return null;
        }
        try {
            //JwtUtils生成jwt的类型的token
            UserInfo userInfo=new UserInfo();
            userInfo.setId(user.getId());
            userInfo.setUsername(username);
            return JwtUtils.generateToken(userInfo,this.jwtProperties.getPrivateKey(),this.jwtProperties.getExpire());
        } catch (Exception e) {
            log.error("生成token出错",e);
        }
        return null;

    }
}
```





#### 项目完整结构

![](https://img-blog.csdnimg.cn/20200502200055761.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 登录页面测试

接下来，我们看看登录页面，是否能够正确的发出请求。

http://www.leyou.com/login.html

我们在页面输入登录信息，然后点击登录：

![](https://img-blog.csdnimg.cn/20200502200155560.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

发现没得cookie

![](https://img-blog.csdnimg.cn/20200502200228952.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 解决Cookie写入问题

cookie里面什么信息都没有

![](https://img-blog.csdnimg.cn/20200502200228952.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



为什么没有呢?

![](https://img-blog.csdnimg.cn/20200502200751599.png)



#### 解决办法汇总(具体看下方)

1. 跨域问题。允许跨域的域名不能是`*`，而应该是具体的。并且要允许cookie

2. 前台代码没有允许使用cookie

3. nginx转发时头信息没有加上域名信息，导致转发后域名变为了本地的域名

   ![](https://img-blog.csdnimg.cn/20200502201003481.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

   

4. Zuul转发时没有在头信息添加域名信息

5. Zuul敏感头过滤

```yaml
zuul:
  prefix: /api
  routes:
    item-service: /item/**
    search-service: /search/**
    user-service: /user/**
    auth-service: /auth/**
  add-host-header: true  #在头信息增加host信息
  sensitive-headers:   # 覆盖默认敏感头信息
```





#### 问题分析

我们在之前测试时，清晰的看到了响应头中，有Set-Cookie属性，为什么在这里却什么都没有？

我们之前在讲cors跨域时，讲到过跨域请求cookie生效的条件：

- 服务的响应头中需要携带Access-Control-Allow-Credentials并且为true。
- 响应头中的Access-Control-Allow-Origin一定不能为*，必须是指定的域名
- 浏览器发起ajax需要指定withCredentials 为true

看看我们的服务端cors配置：

![](https://img-blog.csdnimg.cn/20200502200817389.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

没有任何问题。

再看客户端浏览器的ajax配置，我们在`js/common.js`中对axios进行了统一配置：



![](https://img-blog.csdnimg.cn/20200502200831199.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

一切OK。



#### 跟踪CookieUtils

我们去Debug跟踪CookieUtils，看看到底是怎么回事：

我们发现内部有一个方法，用来获取Domain：

![](https://img-blog.csdnimg.cn/20200502200856472.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

它获取domain是通过服务器的host来计算的，然而我们的地址竟然是：127.0.0.1:7007，因此后续的运算，最终得到的domain就变成了：

![](https://img-blog.csdnimg.cn/20200502200912954.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

问题找到了：我们请求时的serverName明明是：api.leyou.com，现在却被变成了：127.0.0.1，因此计算domain是错误的，从而导致cookie设置失败！



#### 解决host地址的变化

那么问题来了：为什么我们这里的请求serverName变成了：127.0.0.1:7007我配置的呢？

这里的server name其实就是请求的时的主机名：Host，之所以改变，有两个原因：

- 我们使用了nginx反向代理，当监听到api.leyou.com的时候，会自动将请求转发至127.0.0.1:20001，即Zuul网关。
- 而后请求到达我们的网关Zuul，Zuul就会根据路径匹配，我们的请求是/api/auth，根据规则被转发到了 127.0.0.1:7007 ，即我们的授权中心。

我们首先去更改nginx配置，让它不要修改我们的host：`proxy_set_header Host $host;`

![](https://img-blog.csdnimg.cn/20200502201003481.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

把nginx进行reload：

```nginx
nginx -s reloadCopy to clipboardErrorCopied
```

这样就解决了nginx这里的问题。但是Zuul还会有一次转发，所以要去修改网关的配置（leyou-gateway工程）：

![](https://img-blog.csdnimg.cn/20200502201030832.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

重启后，我们再次测试。

![](https://img-blog.csdnimg.cn/20200502201047573.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

最后计算得到的domain：

![](https://img-blog.csdnimg.cn/20200502201059868.png)

完美！



#### 再次测试

我们再次登录，发现依然没有cookie！！

![](http://ww1.sinaimg.cn/large/9150e4e5ly1fw8iypgowgg207i07i74g.gif)

怎么回事呢？

我们通过RestClient访问下看看：

![](https://img-blog.csdnimg.cn/20200502201210881.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

发现，响应头中还是没有`set-cookie`。

这是怎么回事？？



#### Zuul敏感头过滤

Zuul内部有默认的过滤器，会对请求和响应头信息进行重组，过滤掉敏感的头信息：

![](https://img-blog.csdnimg.cn/20200502201237370.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

会发现，这里会通过一个属性为`SensitiveHeaders`的属性，来获取敏感头列表，然后添加到`IgnoredHeaders`中，这些头信息就会被忽略。

而这个`SensitiveHeaders`的默认值就包含了`set-cookie`：

![](https://img-blog.csdnimg.cn/2020050220130315.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

解决方案有两种：

全局设置：

- `zuul.sensitive-headers=`

指定路由设置：

- `zuul.routes..sensitive-headers=`
- `zuul.routes..custom-sensitive-headers=true`

思路都是把敏感头设置为null

![](https://img-blog.csdnimg.cn/20200502201319990.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 最后测试

再次重启后测试：

![](https://img-blog.csdnimg.cn/20200502201345139.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 首页判断登录状态

#### 页面js代码

页面的顶部已经被我们封装为一个独立的Vue组件，在`/js/pages/shortcut.js`中

![](https://img-blog.csdnimg.cn/20200502231759543.png)

打开js，发现里面已经定义好了Vue组件，并且在created函数中，查询用户信息：

![](https://img-blog.csdnimg.cn/20200502231816314.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

查看网络控制台，发现发起了请求：

![](https://img-blog.csdnimg.cn/20200502231842904.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







因为token在cookie中，因此本次请求肯定会携带token信息在头中。



####  后台实现校验用户接口

我们在`leyou-auth-service`中定义用户的校验接口，通过cookie获取token，然后校验通过返回用户信息。

- 请求方式：GET
- 请求路径：/verify
- 请求参数：无，不过我们需要从cookie中获取token信息
- 返回结果：UserInfo，校验成功返回用户信息；校验失败，则返回401

<span id="code">代码：</span>

```java
@GetMapping("verify")
public ResponseEntity<UserInfo> verify(@CookieValue("LY_TOKEN")String token,HttpServletRequest request,HttpServletResponse response){
    try {
        //通过jwt工具类使用公钥解析jwt
        UserInfo user= JwtUtils.getInfoFromToken(token,this.jwtProperties.getPublicKey());
        if(user==null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        //刷新jwt中有效时间
        token = JwtUtils.generateToken(user, this.jwtProperties.getPrivateKey(), this.jwtProperties.getExpire());
        //刷新cookie中的有效时间
        CookieUtils.setCookie(request,response,this.jwtProperties.getCookieName(),token,this.jwtProperties.getExpire()*60);
        return ResponseEntity.ok(user);
    } catch (Exception e) {
        log.error("身份认证失败",e);
    }
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
}
```



#### 刷新Token

每当用户在页面进行新的操作，都应该刷新token的过期时间，否则30分钟后用户的登录信息就无效了。而刷新其实就是重新生成一份token，然后写入cookie即可。

那么问题来了：我们怎么知道用户有操作呢？

事实上，每当用户来查询其个人信息，就证明他正在浏览网页，此时刷新cookie是比较合适的时机。因此我们可以对刚刚的校验用户登录状态的接口进行改进，加入刷新token的逻辑。

[代码](#code)



### 网关的登录拦截器

接下来，我们在Zuul编写拦截器，对用户的token进行校验，如果发现未登录，则进行拦截。



#### 引入JWT相关依赖x	

既然是登录拦截，一定是前置拦截器，我们在`leyou-gateway`中定义。

首先在pom.xml中，引入所需要的依赖：

```xml
<dependency>
    <groupId>top.codekiller.auth</groupId>
    <artifactId>leyou-auth-common</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>Copy to clipboardErrorCopied
```

然后编写application.yml属性文件，添加如下内容：

```yaml
leyou:
  jwt:
    pubKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 公钥地址
    cookieName: LY_TOKEN  
```

编写属性类，读取公钥：

![](https://img-blog.csdnimg.cn/2020050223244859.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
package top.codekiller.leyouGateway.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import top.codekiller.auth.util.RsaUtils;
import javax.annotation.PostConstruct;
import java.security.PublicKey;
import java.util.List;


@ConfigurationProperties(prefix = "leyou.jwt")
@Slf4j
@Data
public class JwtProperties {

    private String pubKeyPath;// 公钥保存路径

    private PublicKey publicKey; // 公钥


    private String cookieName;  //cookie的名字



    /**
     * @PostContruct：在构造方法执行之后执行该方法
     */
    @PostConstruct
    public void init() {
        // 获取公钥和私钥
        try {
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        } catch (Exception e) {
            log.error("Zuul获取公钥异常",e);
        }
    }
}
```





#### 编写过滤器逻辑

基本逻辑：

- 获取cookie中的token
- 通过JWT对token进行校验
- 通过：则放行；不通过：则重定向到登录页

```java
package top.codekiller.leyouGateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import top.codekiller.auth.util.CookieUtils;
import top.codekiller.auth.util.JwtUtils;
import top.codekiller.leyouGateway.properties.FilterProperties;
import top.codekiller.leyouGateway.properties.JwtProperties;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@EnableConfigurationProperties({JwtProperties.class})
@Component
public class LoginFilter extends ZuulFilter {

    private JwtProperties jwtProperties;


    public LoginFilter(JwtProperties jwtProperties){
        this.jwtProperties=jwtProperties;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 3;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //初始化运行上下文
        RequestContext context=RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest request = context.getRequest();
        //获取token
        String token = CookieUtils.getCookieValue(request, this.jwtProperties.getCookieName());

        if(StringUtils.isBlank(token)){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        try {
            JwtUtils.getInfoFromToken(token,this.jwtProperties.getPublicKey());
        } catch (Exception e) {
            e.printStackTrace();
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        return null;

    }
}
```

重启，刷新页面，发现请求校验的接口也被拦截了：

![](https://img-blog.csdnimg.cn/20200502232709373.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

证明我们的拦截器生效了，但是，似乎有什么不对的。这个路径似乎不应该被拦截啊！





#### 白名单

要注意，并不是所有的路径我们都需要拦截，例如：

- 登录校验接口：`/auth/**`
- 注册接口：`/user/register`
- 数据校验接口：`/user/check/**`
- 发送验证码接口：`/user/code`
- 搜索接口：`/search/**`

另外，跟后台管理相关的接口，因为我们没有做登录和权限，因此暂时都放行，但是生产环境中要做登录校验：

- 后台商品服务：`/item/**`

所以，我们需要在拦截时，配置一个白名单，如果在名单内，则不进行拦截。

在`application.yaml`中添加规则：

```yaml
leyou:
  jwt:
    pubKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 公钥地址
    cookieName: LY_TOKEN
  filter:
    allowPaths:
      - /api/auth
      - /api/search
      - /api/user/register
      - /api/user/code
      - /api/item
```

然后读取这些属性：

```java
package top.codekiller.leyouGateway.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "leyou.filter")
@Data
public class FilterProperties {

    /**
     * 允许不经过filter的路经集合
     */
    private List<String> allowPaths;

}
```

在过滤器中的`shouldFilter`方法中添加判断逻辑

代码：

```java
package top.codekiller.leyouGateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import top.codekiller.auth.util.CookieUtils;
import top.codekiller.auth.util.JwtUtils;
import top.codekiller.leyouGateway.properties.FilterProperties;
import top.codekiller.leyouGateway.properties.JwtProperties;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@EnableConfigurationProperties({JwtProperties.class, FilterProperties.class})
@Component
public class LoginFilter extends ZuulFilter {

    private JwtProperties jwtProperties;

    private FilterProperties filterProperties;

    public LoginFilter(JwtProperties jwtProperties, FilterProperties filterProperties){
        this.jwtProperties=jwtProperties;
        this.filterProperties=filterProperties;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 3;
    }

    @Override
    public boolean shouldFilter() {
        //获取白名单路径
        List<String> allowPaths = filterProperties.getAllowPaths();
        if(CollectionUtils.isEmpty(allowPaths)){
            return true;
        }
        //初始化上山文对象
        RequestContext context = RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest request = context.getRequest();
        //获取请求的url
        String url=request.getRequestURI();

        for (String path : allowPaths) {
            if(url.contains(path)){
                return false;
            }
        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //初始化运行上下文
        RequestContext context=RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest request = context.getRequest();
        //获取token
        String token = CookieUtils.getCookieValue(request, this.jwtProperties.getCookieName());

        if(StringUtils.isBlank(token)){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        try {
            JwtUtils.getInfoFromToken(token,this.jwtProperties.getPublicKey());
        } catch (Exception e) {
            e.printStackTrace();
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        return null;

    }
}
```


## 购物车服务

### 搭建购物车服务

> leyou-cart

### Pom依赖

```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.12</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>
    </dependencies>
</project>
```



### 配置文件

```yaml
server:
  port: 8088
spring:
  application:
    name: cart-service
  redis:
    host: 172.168.1.1
    password: jcl5412415845

eureka:
  client:
    service-url:
      defaultZone: http://localhost:10086/eureka
    registry-fetch-interval-seconds: 10
  instance:
    lease-expiration-duration-in-seconds: 15
    lease-renewal-interval-in-seconds: 5
```





### 启动类

```java
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LeyouCartServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouCartServiceApplication.class, args);
    }
}
```





### 购物车功能分析

#### 需求

需求描述：

- 用户可以在登录状态下将商品添加到购物车
  - 放入数据库
  - mongodb（推荐）
  - 放入redis（采用）
- 用户可以在未登录状态下将商品添加到购物车
  - 放入localstorage
  - cookie
  - webSQL
- 用户可以使用购物车一起结算下单
- 用户可以查询自己的购物车
- 用户可以在购物车中修改购买商品的数量。
- 用户可以在购物车中删除商品。
- 在购物车中展示商品优惠信息
- 提示购物车商品价格变化





#### 流程图

![](https://img-blog.csdnimg.cn/2020050316065383.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这幅图主要描述了两个功能：新增商品到购物车、查询购物车。

新增商品：

- 判断是否登录
  - 是：则添加商品到后台Redis中
  - 否：则添加商品到本地的Localstorage

无论哪种新增，完成后都需要查询购物车列表：

- 判断是否登录
  - 否：直接查询localstorage中数据并展示
  - 是：已登录，则需要先看本地是否有数据，
    - 有：需要提交到后台添加到redis，合并数据，而后查询
    - 否：直接去后台查询redis，而后返回



### 未登录时购物车实现

####  准备

#### 购物车的数据结构

首先分析一下未登录购物车的数据结构。

我们看下页面展示需要什么数据：

![](https://img-blog.csdnimg.cn/20200503160819980.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

因此每一个购物车信息，都是一个对象，包含：

```js
{
    skuId:2131241,
    title:"小米6",
    image:"",
    price:190000,
    num:1,
    ownSpec:"{"机身颜色":"陶瓷黑尊享版","内存":"6GB","机身存储":"128GB"}"
}
```

另外，购物车中不止一条数据，因此最终会是对象的数组。即：

```js
[
    {...},{...},{...}
]
```



#### web本地存储

知道了数据结构，下一个问题，就是如何保存购物车数据。前面我们分析过，可以使用Localstorage来实现。Localstorage是web本地存储的一种，那么，什么是web本地存储呢？

##### 什么是web本地存储

![](https://img-blog.csdnimg.cn/20200503160916655.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

web本地存储主要有两种方式：

- LocalStorage：localStorage 方法存储的数据没有时间限制。第二天、第二周或下一年之后，数据依然可用。
- SessionStorage：sessionStorage 方法针对一个 session 进行数据存储。当用户关闭浏览器窗口后，数据会被删除。



##### LocalStorage的用法

语法非常简单：

![](https://img-blog.csdnimg.cn/20200503160951679.png)

```js
localStorage.setItem("key","value"); // 存储数据
localStorage.getItem("key"); // 获取数据
localStorage.removeItem("key"); // 删除数据
```

注意：**localStorage和SessionStorage都只能保存字符串**。

不过，在我们的common.js中，已经对localStorage进行了简单的封装：

![](https://img-blog.csdnimg.cn/20200503161049830.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

示例：

![](https://img-blog.csdnimg.cn/20200503161103410.png)



#### 获取num

添加购物车需要知道购物的数量，所以我们需要获取数量大小。我们在Vue中定义num，保存数量：

![](https://img-blog.csdnimg.cn/20200503161127181.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

然后将num与页面的input框绑定，同时给`+`和`-`的按钮绑定事件：

![](https://img-blog.csdnimg.cn/20200503161229855.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

编写方法：

![](https://img-blog.csdnimg.cn/20200503161245526.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







#### 添加购物车

##### 点击事件

我们看下商品详情页：

![](https://img-blog.csdnimg.cn/2020050316132987.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

现在点击加入购物车会跳转到购物车成功页面。

不过我们不这么做，我们绑定点击事件，然后实现添加购物车功能。![](https://img-blog.csdnimg.cn/20200503161401672.png)



```vue
		addCart(){
				//验证是否登录
				ly.verify().then(res=>{
					//登录

				}).catch(()=>{
					//未登录，保存到localstorage中
					let carts=ly.store.get("LY_CART")|| [];
					let cart = carts.find(cart=>cart.skuId==this.sku.id);
					if(cart){
						//如果购物车中有商品记录，更新数量
						cart.num+=this.num;
					}else{
						//如果购物车中没有商品记录，新增购物车记录
						carts.push({
							skuId: this.sku.id,
							image: this.images[0],
							title: this.sku.title,
							ownSpec: this.sku.ownSpec,
							price: this.sku.price,
							num: this.num
						});


					}
					 // 把carts写回localstorage
					ly.store.set("LY_CART",carts);
					window.location="http://www.leyou.com/cart.html";
				});
			}
```



>将nginx中详情页静态化的配置暂时注释掉，否则每次修改页面都要先手动删除生成静态的静态页面，需要改

结果：

![](https://img-blog.csdnimg.cn/20200503161806274.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



添加完成后，页面会跳转到购物车结算页面：cart.html



#### 查询购物车

##### 校验用户登录

因为会多次校验用户登录状态，因此我们封装一个校验的方法：

在common.js中：

![](https://img-blog.csdnimg.cn/20200503161843427.png)

```javascript
verifyUser() {
    return this.http.get("/auth/verify");
},
```

在页面item.html中使用该方法：

![](https://img-blog.csdnimg.cn/20200503161858232.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





##### 查询购物车

页面加载时，就应该去查询购物车。

```vue
var cartVm = new Vue({
    el: "#cartApp",
    data: {
        ly,
        carts: [],// 购物车数据
        selected: [], //勾选的商品
    },
    created() {
        this.loadCarts();
    },
    methods: {
        loadCarts() {
            // 先判断登录状态
            ly.verifyUser().then(() => {
                    // 已登录

                }).catch(() => {
                    // 未登录
                    this.carts = ly.store.get("carts") || [];
                    this.selected = this.carts;
                })
           }
    }
    components: {
        shortcut: () => import("/js/pages/shortcut.js")
    }
})
```

刷新页面，查看控制台Vue实例：

![](https://img-blog.csdnimg.cn/20200503162220836.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



##### 渲染到页面

接下来，我们在页面中展示carts的数据：

![](https://img-blog.csdnimg.cn/20200503162254267.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```html
<ul class="goods-list yui3-g" v-for="(cart,index) in carts" :key="index">
    <li class="yui3-u-1-24">
        <input type="checkbox" v-model="selected" name="selected" />
    </li>
    <li class="yui3-u-11-24">
        <div class="good-item">
            <div class="item-img"><img :src="cart.image" width="80px" height="80px" />
            </div>
            <div class="item-msg">
                <span style="line-height:70px ">{{cart.title}}</span>
                <br>
                <span style="padding: 0 10px" v-for="(v,k) in cart.ownSpec" :key="k">{{k}}：{{v}}</span>
            </div>
        </div>
    </li>

    <li class="yui3-u-1-8"><span style="line-height:70px " class="price">{{ly.formatPrice(cart.price)}}</span>
    </li>
    <li class="yui3-u-1-8" style="padding-top: 20px">
        <a href="javascript:void(0)" class="increment mins">-</a>
        <input autocomplete="off" type="text" disabled v-model="cart.num" minnum="1" class="itxt" />
        <a href="javascript:void(0)" class="increment plus">+</a>
    </li>
    <li class="yui3-u-1-8"><span style="line-height:70px " class="sum">{{ly.formatPrice(cart.price*cart.num)}}</span>
    </li>
    <li class="yui3-u-1-8">
        <a href="#none">删除</a><br />
        <a href="#none">移到我的关注</a>
    </li>
</ul>
```

要注意，价格的展示需要进行格式化，这里使用的是我们在common.js中定义的formatPrice方法

效果：

![](https://img-blog.csdnimg.cn/20200503162328951.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 修改数量

我们给页面的 `+` 和 `-`绑定点击事件，修改num 的值：

![](https://img-blog.csdnimg.cn/20200503162358627.png)

两个事件：

```js
incrment(cart){
    cart.num++;
    ly.verify().then(resp=>{

    }).catch(()=> {
        //未登录购物车的查询
        ly.store.set("LY_CART", this.carts);
    })
},
    decrment(cart){
        if(cart.num>1) {
            cart.num--;
        }
        ly.verify().then(resp=>{

        }).catch(()=>{
            //未登录购物车的查询
            ly.store.set("LY_CART",this.carts);
        });
    },
```





#### 删除商品

给删除按钮绑定事件：

```html
<li class="yui3-u-1-8">
    <a href="javascript:;" @click="deleteCart(index)">删除</a><br/>
    <a href="javascript:;">移到我的关注</a>
</li>
```

点击事件中删除商品：

```js
deleteCart(index){
    ly.verify().then(resp=>{

    }).catch(()=>{
        //未登录购物车删除商品
        this.carts.splice(index,1);
        ly.store.set("LY_CART",this.carts);
    });
}
```



#### 选中商品

在页面中，每个购物车商品左侧，都有一个复选框，用户可以选择部分商品进行下单，而不一定是全部：

![](https://img-blog.csdnimg.cn/20200503162656404.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们定义一个变量，记录所有被选中的商品：

![](https://img-blog.csdnimg.cn/20200503162713935.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



##### 选中一个

我们给商品前面的复选框与selected绑定，并且指定其值为当前购物车商品：

```html
<li class="yui3-u-1-24">
    <input type="checkbox" v-model="selected" name="selected" :value="cart"/>
</li>
```



##### 初始全选

我们在加载完成购物车查询后，初始化全选：

![](https://img-blog.csdnimg.cn/20200503162826576.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#####全选和取消全选

定义变量，并监听

```js
data: {
    carts: [],  //购物车数据
        ly,
        selected: [],  //勾选的商品
            check: true
},
    watch: {
        check:{
            deep: true,
                handler(newVal){
                if(newVal){
                    this.selected=this.carts;
                }else{
                    this.selected=[];
                }
            }
        }
    }
```





#### 总价格和总个数

然后编写一个计算属性，计算出选中商品总价格：

```
computed:{
  total(){
      return this.selected.reduce((c1,c2)=>c1+c2.num,0);
  },
  totalPrice(){
      return ly.formatPrice(this.selected.reduce((c1,c2)=>c1+c2.price*c2.num,0));
  }
},
```

![](https://img-blog.csdnimg.cn/20200503163314460.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



效果：

![](https://img-blog.csdnimg.cn/20200503163328229.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 删除选中商品

```html
<a href="javascript:;" @click="deleteSelected()">删除选中的商品</a>
```



```js
deleteSelected() {
    this.selected.forEach(value => {
        this.deleteCart(this.carts.indexOf(value));
    })
}
```





###  已登录购物车

接下来，我们完成已登录购物车。

在刚才的未登录购物车编写时，我们已经预留好了编写代码的位置，逻辑也基本一致。



####  添加登录校验

购物车系统只负责登录状态的购物车处理，因此需要添加登录校验，我们通过JWT鉴权即可实现。



#### 引入JWT相关依赖

我们引入之前写的鉴权工具：`leyou-auth-common`

```xml
<dependency>
    <groupId>top.codekiller.leyou</groupId>
    <artifactId>leyou-auth-common</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```



#### 配置公钥

```yaml
leyou:
  jwt:
    pubKeyPath: /home/cloudlandboy/Project/leyou/rsa/rsa.pub # 公钥地址
    cookieName: LEYOU_TOKEN # cookie的名称
```





![](https://img-blog.csdnimg.cn/20200503224741401.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

**配置类代码可从网关模块中copy**

```java
@ConfigurationProperties(prefix = "leyou.jwt")
@Slf4j
@Data
public class JwtProperties {

    private String pubKeyPath;// 公钥保存路径

    private PublicKey publicKey; // 公钥

    private String cookieName;  //cookie的名字


    /**
     * @PostContruct：在构造方法执行之后执行该方法
     */
    @PostConstruct
    public void init() {
        // 获取公钥和私钥
        try {
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        } catch (Exception e) {
            log.error("Zuul获取公钥异常",e);
        }
    }
}
```





#### 编写拦截器

因为很多接口都需要进行登录，我们直接编写SpringMVC拦截器，进行统一登录校验。同时，我们还要把解析得到的用户信息保存起来，以便后续的接口可以使用。

![](https://img-blog.csdnimg.cn/20200503224929648.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



代码：

```java
package top.codekiller.leyou.interceptor;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import top.codekiller.auth.pojo.UserInfo;
import top.codekiller.auth.util.CookieUtils;
import top.codekiller.auth.util.JwtUtils;
import top.codekiller.leyou.properties.JwtProperties;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@EnableConfigurationProperties(JwtProperties.class)
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static final ThreadLocal<UserInfo> THREAD_LOCAL=new ThreadLocal<>();

    private JwtProperties jwtProperties;

    public LoginInterceptor(JwtProperties jwtProperties){
        this.jwtProperties=jwtProperties;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取cookie中的cookie
        String token = CookieUtils.getCookieValue(request, this.jwtProperties.getCookieName());

        //解析token，获取用户信息
        UserInfo userInfo = JwtUtils.getInfoFromToken(token, this.jwtProperties.getPublicKey());
        if(userInfo==null){
            return false;
        }

        //把userInfo放入线程局部变量中
        THREAD_LOCAL.set(userInfo);

        return true;
    }

    public static UserInfo getUserInfo(){
        return THREAD_LOCAL.get();
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //清空线程的局部变量.因为使用的是tomcat的线程池，线程不会结束，也就不会释放线程的局部变量
        THREAD_LOCAL.remove();

    }
}
```





注意：

- 这里我们使用了`ThreadLocal`来存储查询到的用户信息，线程内共享，因此请求到达`Controller`后可以共享User
- 并且对外提供了静态的方法：`getLoginUser()`来获取User信息





#### 配置拦截器

配置SpringMVC，使过滤器生效：

![](https://img-blog.csdnimg.cn/20200503225450802.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
    }
}
```





#### 后台购物车设计

当用户登录时，我们需要把购物车数据保存到后台，可以选择保存在数据库。但是购物车是一个读写频率很高的数据。因此我们这里选择读写效率比较高的Redis作为购物车存储。

Redis有5种不同数据结构，这里选择哪一种比较合适呢？Map<String, List>

- 首先不同用户应该有独立的购物车，因此购物车应该以用户的作为key来存储，Value是用户的所有购物车信息。这样看来基本的`k-v`结构就可以了。
- 但是，我们对购物车中的商品进行增、删、改操作，基本都需要根据商品id进行判断，为了方便后期处理，我们的购物车也应该是`k-v`结构，key是商品id，value才是这个商品的购物车信息。

综上所述，我们的购物车结构是一个双层Map：Map<String,Map<String,String>>

- 第一层Map，Key是用户id
- 第二层Map，Key是购物车中商品id（skuId），值是购物车数据

实体类：

```java
@Data
public class Cart {
    private Long userId;// 用户id
    private Long skuId;// 商品id
    private String title;// 标题
    private String image;// 图片
    private Long price;// 加入购物车时的价格
    private Integer num;// 购买数量
    private Map<String, String> ownSpec;// 商品规格参数
}
```





####  添加商品到购物车

##### 页面发起请求

已登录情况下，向后台添加购物车：

```
// 已登录发送信息到后台，保存到redis中
ly.http.post("/cart", {skuId: this.sku.id, num: this.num}).then(res => {
    location.href = "http://www.leyou.com/cart.html";
})
```

这里发起的是Json请求。那么我们后台也要以json接收。

这里只需要向后台提交商品的id和商品的数量，商品的具体信息后台需要调用商品服务的接口根据skuId查询sku。

> 为什么不不直接从页面传递？

1. 网络传输携带太多数据占用带宽
2. 不安全，通过页面可以修改商品的价格



##### <span style="font-size: 20px">CardController</span>

先分析一下：

- 请求方式：新增，肯定是Post
- 请求路径：/cart ，这个其实是Zuul路由的路径，我们可以不管（**别忘了在网关中配置**）
- 请求参数：Json对象，包含skuId和num属性
- 返回结果：无

```java
@Controller
public class CartController {

    @Autowired
    private ICartService cartService;

    /**
     * 添加购物车信息
     * @param cart
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> addCart(@RequestBody Cart cart){
        this.cartService.addCart(cart);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
```

在leyou-gateway中添加路由配置：

![](https://img-blog.csdnimg.cn/20200503225938897.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





##### <span style="font-size: 20px">CartService</span>

这里我们不访问数据库，而是直接操作Redis。基本思路：

- 先查询之前的购物车数据
- 判断要添加的商品是否存在
  - 存在：则直接修改数量后写回Redis
  - 不存在：新建一条数据，然后写入Redis

代码：

```java
@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static  final String KEY_PREFIX="user:card";

    @Autowired
    private GoodsClient goodsClient;


    /**
     * 添加购物车信息
     * @param cart
     */
    @Override
    public void addCart(Cart cart) {
        //获取用户信息
        UserInfo userInfo = LoginInterceptor.getUserInfo();

        //查询购物车记录
        BoundHashOperations<String, Object, Object> hashOperations = redisTemplate.boundHashOps(KEY_PREFIX + userInfo.getId());

        String key=String.valueOf(cart.getSkuId());
        Integer num=cart.getNum();
        //判断当前的商品是否在购物车中
        if(hashOperations.hasKey(key)){
            //在，更新数量
            String cartJson=hashOperations.get(key).toString();
            cart=JsonUtils.parse(cartJson,Cart.class);
            cart.setNum(cart.getNum()+num);
            hashOperations.put(key,JsonUtils.serialize(cart));
        }else{
            //不在，新增购物车
            Sku sku = this.goodsClient.querySkuBySkuId(cart.getSkuId());
            cart.setUserId(userInfo.getId());
            cart.setImage(sku.getImages());
            cart.setTitle(sku.getTitle());
            cart.setImage(StringUtils.isBlank(sku.getImages())?"":StringUtils.split(sku.getImages(),",")[0]);
            cart.setPrice(sku.getPrice());
            hashOperations.put(key,JsonUtils.serialize(cart));
        }
    }
}
```





##### <span style="font-size: 20px">GoodsClient</span>

参照搜索工程，添加GoodClient，提供根据id查询sku的接口：

![](https://img-blog.csdnimg.cn/20200503231135503.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

```java
@FeignClient(value="item-service")
public interface GoodsClient extends GoodsApi {
}
```

在leyou-item-service中的GoodsController添加根据sku的id查询sku的方法：

```java
@GetMapping("sku/{id}")
public ResponseEntity<Sku> querySkuById(@PathVariable("id")Long id){
    Sku sku = this.goodsService.querySkuById(id);
    if (sku == null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return ResponseEntity.ok(sku);
}
```

在leyou-item-service中的GoodsService添加方法：

```java
public Sku querySkuById(Long id) {
    return this.skuMapper.selectByPrimaryKey(id);
}
```





####  查询购物车

##### 页面发起请求

购物车页面：cart.html

![](https://img-blog.csdnimg.cn/20200503231402648.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





##### <span style="font-size: 20px">CardController</span>

```java
/**
     * 获取购物车信息
     * @return
     */
@GetMapping
public ResponseEntity<List<Cart>> queryCards(){
    List<Cart> carts=this.cartService.queryCards();
    if(CollectionUtils.isEmpty(carts)){
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(carts);
}
```





##### <span style="font-size: 20px">CardService</span>

```java
/**
     * 获取购物车信息
     * @return
     */
@Override
public List<Cart> queryCards() {
    UserInfo userInfo=LoginInterceptor.getUserInfo();

    //判断是否存在购物车记录
    if(this.redisTemplate.hasKey(KEY_PREFIX+userInfo.getId())) {
        //获取购物车记录
        BoundHashOperations<String, Object, Object> hashOperation = this.redisTemplate.boundHashOps(KEY_PREFIX + userInfo.getId());

        List<Object> cartsJson=hashOperation.values();

        //如果购物车集合为空，直接返回null
        if(CollectionUtils.isEmpty(cartsJson)){
            return null;
        }

        //把List<Object>集合转化为List<Cart>集合
        return cartsJson.stream().map((value) -> JsonUtils.parse(value.toString(), Cart.class)).collect(Collectors.toList());
    }

    return null;
}
```



##### 测试

![](https://img-blog.csdnimg.cn/20200503231545431.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 修改商品数量

##### 页面发起请求

![](https://img-blog.csdnimg.cn/20200503231630939.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





##### <span style="font-size: 20px">CartController</span>

```java
/**
     * 更新sku的数量
     * @param cart
     * @return
     */
@PutMapping
public ResponseEntity<Void> updateNum(@RequestBody Cart cart){
    this.cartService.updateCart(cart);
    return ResponseEntity.noContent().build();
}
```



##### <span style="font-size: 20px">CartService</span>

```java
/**
     * 更新sku的数量
     * @param cart
     */
@Override
public void updateCart(Cart cart) {
    UserInfo userInfo=LoginInterceptor.getUserInfo();

    //判断用户是否有购物车信息
    if(!this.redisTemplate.hasKey(KEY_PREFIX+userInfo.getId())){
        return ;
    }

    //获取用户的购物车信息
    BoundHashOperations<String, Object, Object> hashOperation = this.redisTemplate.boundHashOps(KEY_PREFIX + userInfo.getId());
    String key=String.valueOf(cart.getSkuId());
    Integer num=cart.getNum();
    if(!hashOperation.hasKey(key)){
        return ;
    }
    //重新设置购物车信息
    String cartsJson=String.valueOf(hashOperation.get(key));
    cart = JsonUtils.parse(cartsJson, Cart.class);
    cart.setNum(num);
    hashOperation.put(key, JsonUtils.serialize(cart));
}
```





#### 删除购物车商品

```java
clearCart(index) {
    // 删除选中的
    if (index.length == 1) {
        //只删除一件，可能点击的不是删除选中的商品按钮,由于是地址引用需要copy
        //防止-1，删除的不是选中的那个
        let index2 = this.selected.indexOf(this.carts[index[0]]);
        if (index2 >= 0) {
            let temp = [];
            Object.assign(temp, this.selected);
            temp.splice(index2, 1);
            this.selected = temp;
        }
    } else {
        //点击的是删除选中的商品按钮，选中的已经被删除，直接清空
        this.selected = [];
    }
    //删除购物车
    index.forEach((item, i) => {
        //每次删除一个后下标会往前移一位,前面删除了几个就往前几位，已经排过序
        item -= i;
        this.carts.splice(item, 1);
    });
},
deleteCart(index) {
    index = Array.isArray(index) ? index.sort() : [index];
    ly.verifyUser().then(res => {
        // 已登录购物车,根据选择的下标获取选择的sku的id集合
        let skuIds = index.map(i => this.carts[i].skuId);
        ly.http.delete("/cart/" + skuIds.join(',')).then(() => {
            this.clearCart(index);
        });
    }).catch(() => {
        this.clearCart(index);
        ly.store.set("carts", this.carts);
    })
        },
deleteSelected() {
    if (this.selected.length == 0) {
        //没有选择不处理
        return;
    }
    let indexs = [];
    this.selected.forEach(item => {
        indexs.push(this.carts.indexOf(item));
    });
    this.deleteCart(indexs);
}
```

注意：后台成功响应后，要把页面的购物车中数据也删除





##### <span style="font-size: 20px">CartController</span>

```java
@DeleteMapping("/{skuId}")
public ResponseEntity<Void> deleteCart(@PathVariable("skuId") String... skuId) {
    this.cartService.deleteCart(skuId);
    return ResponseEntity.ok().build();
}

```





##### <span style="font-size: 20px">CartService</span>

```java
@Override
public void deleteCart(String... skuId) {
    // 判断是否存在购物车
    String key = KEY_PREFIX + LoginInterceptor.getLoginUser().getId();
    if (redisTemplate.hasKey(key)) {
        BoundHashOperations<String, Object, Object> boundHashOps = redisTemplate.boundHashOps(key);
        boundHashOps.delete(skuId);
    }
}
```





#### 登录后购物车的合并

当跳转到购物车页面，查询购物车列表前，需要判断用户登录状态，

- 如果登录：
  - 首先检查用户的LocalStorage中是否有购物车信息，
  - 如果有，则提交到后台保存，
  - 清空LocalStorage
- 如果未登录，直接查询即可

```js
loadCarts() {
    ly.verifyUser().then((res) => {
        //已经登录
        //先判断localStorange中有没有数据，有的话先进行合并
        let temp = ly.store.get("carts");
        if (temp && temp.length) {
            temp = temp.map(({skuId, num}) => {
                return {skuId: skuId, num: num}
            });
            ly.http.post("/cart/merge", temp).then(() => {
                ly.http.get("/cart").then(({data}) => {
                    this.carts = data;
                    //默认全部选中
                    this.selected = this.carts;
                });
                //将本地的购物车干掉
                ly.store.del("carts");
            }).catch(() => {
                alert('出错了');
            });
        } else {
            //没有直接请求
            ly.http.get("/cart").then(({data}) => {
                this.carts = data;
                //默认全部选中
                this.selected = this.carts;
            })
        }
    }).catch(() => {
        //未登录
        this.carts = ly.store.get("carts") || [];
        //默认全部选中
        this.selected = this.carts;
    })
}
```





##### <span style="font-size: 20px">CartController</span>

```java
@PostMapping("/merge")
public ResponseEntity<Void> mergeCart(@RequestBody List<Cart> carts) {
    this.cartService.mergeCart(carts);
    return ResponseEntity.ok().build();
}
```





##### <span style="font-size: 20px">CartService</span>

```java
@Override
public void mergeCart(List<Cart> carts) {
    for (Cart cart : carts) {
        this.addCart(cart);
    }
}
```

效果

![](https://img-blog.csdnimg.cn/20200503232107927.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)









##  订单系统接口

### 导入订单服务

把项目资料中提供的`leyou-order`复制到当前项目父工程`leyou-parent`目录下

然后就会在IDEA中显示出来(没有显示尝试刷新或者重启IDEA，还不显示就使用导入模块)



![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576718326644.png)

修改`leyou-order`的pom文件，查看配置是否与自己的项目一致，我的就需要修改

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576719020991.png)

修改`leyou-parent`添加`leyou-order模块` ![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576719501314.png)

> 修改配置文件，改为自己的配置



### Swagger-UI

丝袜哥

#### 什么是OpenAPI

随着互联网技术的发展，现在的网站架构基本都由原来的后端渲染，变成了：前端渲染、前后端分离的形态，而且前端技术和后端技术在各自的道路上越走越远。 前端和后端的唯一联系，变成了API接口；API文档变成了前后端开发人员联系的纽带，变得越来越重要。

没有API文档工具之前，大家都是手写API文档的，在什么地方书写的都有，而且API文档没有统一规范和格式，每个公司都不一样。这无疑给开发带来了灾难。

OpenAPI规范（OpenAPI Specification 简称OAS）是Linux基金会的一个项目，试图通过定义一种用来描述API格式或API定义的语言，来规范RESTful服务开发过程。目前V3.0版本的OpenAPI规范已经发布并开源在github上 。

官网：https://github.com/OAI/OpenAPI-Specification



#### 什么是Swagger-UI

OpenAPI是一个编写API文档的规范，然而如果手动去编写OpenAPI规范的文档，是非常麻烦的。而Swagger就是一个实现了OpenAPI规范的工具集。

官网：https://swagger.io/

看官方的说明：

![1528724925709](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528724925709.png)

Swagger包含的工具集：

- **Swagger编辑器：** Swagger Editor允许您在浏览器中编辑YAML中的OpenAPI规范并实时预览文档。
- **Swagger UI：** Swagger UI是HTML，Javascript和CSS资产的集合，可以从符合OAS标准的API动态生成漂亮的文档。
- **Swagger Codegen：**允许根据OpenAPI规范自动生成API客户端库（SDK生成），服务器存根和文档。
- **Swagger Parser：**用于解析来自Java的OpenAPI定义的独立库
- **Swagger Core：**与Java相关的库，用于创建，使用和使用OpenAPI定义
- **Swagger Inspector（免费）：** API测试工具，可让您验证您的API并从现有API生成OpenAPI定义
- **SwaggerHub（免费和商业）：** API设计和文档，为使用OpenAPI的团队构建。



#### 快速入门

SpringBoot已经集成了Swagger，使用简单注解即可生成swagger的API文档。



#### 引入依赖

```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.8.0</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.8.0</version>
</dependency>
```



#### 编写配置

```java
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host("localhost:7009")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.leyou.order.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("乐优商城订单系统")
                .description("乐优商城订单系统接口文档")
                .version("1.0")
                .build();
    }
}
```



#### 接口声明

在controller的每个handler上添加接口说明注解：

```java
@RestController
@RequestMapping("order")
@Api("订单服务接口")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayHelper payHelper;

    /**
     * 创建订单
     *
     * @param order 订单对象
     * @return 订单编号
     */
    @PostMapping
    @ApiOperation(value = "创建订单接口，返回订单编号", notes = "创建订单")
    @ApiImplicitParam(name = "order", required = true, value = "订单的json对象,包含订单条目和物流信息")
    public ResponseEntity<Long> createOrder(@RequestBody @Valid Order order) {
        Long id = this.orderService.createOrder(order);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

    /**
     * 分页查询当前用户订单
     *
     * @param status 订单状态
     * @return 分页订单数据
     */
    @GetMapping("list")
    @ApiOperation(value = "分页查询当前用户订单，并且可以根据订单状态过滤", 
                  notes = "分页查询当前用户订单")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "当前页", 
                          defaultValue = "1", type = "Integer"),
        @ApiImplicitParam(name = "rows", value = "每页大小", 
                          defaultValue = "5", type = "Integer"),
        @ApiImplicitParam(
            name = "status", 
            value = "订单状态：1未付款，2已付款未发货，3已发货未确认，4已确认未评价，5交易关闭，6交易成功，已评价", type = "Integer"),
    })
    public ResponseEntity<PageResult<Order>> queryUserOrderList(
        @RequestParam(value = "page", defaultValue = "1") Integer page,
        @RequestParam(value = "rows", defaultValue = "5") Integer rows,
        @RequestParam(value = "status", required = false) Integer status) {
        PageResult<Order> result = this.orderService.queryUserOrderList(page, rows, status);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
}
```



#### 常用注解

| 注解               | 说明                                 |
| ------------------ | ------------------------------------ |
| @Api               | 修饰整个类，描述Controller的作用     |
| @ApiOperation      | 描述一个类的一个方法，或者说一个接口 |
| @ApiParam          | 单个参数描述                         |
| @ApiModel          | 用对象来接收参数                     |
| @ApiProperty       | 用对象接收参数时，描述对象的一个字段 |
| @ApiResponse       | HTTP响应其中1个描述                  |
| @ApiResponses      | HTTP响应整体描述                     |
| @ApiIgnore         | 使用该注解忽略这个API                |
| @ApiError          | 发生错误返回的信息                   |
| @ApiImplicitParam  | 一个请求参数                         |
| @ApiImplicitParams | 多个请求参数                         |





#### 启动测试

启动服务，然后访问：http://localhost:7009/swagger-ui.html

![1576722440212](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576722440212.png)

点击order-controller，查看接口信息：

![1534050501639](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534050501639.png)

点击任意一个接口，即可看到详细信息：

![1534050571547](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534050571547.png)



### 测试接口

#### 创建订单接口

可以通过页面看到接口信息：

- 请求方式：POST
- 请求路径：/order
- 请求参数：包含订单、订单详情等数据的json对象。
- 返回结果：订单编号

点击`Try It Out`来测试：

![1528726383029](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528726383029.png)

输入数据：

```json
{
  "totalPay": 236800,
  "postFee": 0,
  "paymentType": 2,
  "actualPay": 236800,
  "buyerMessage": null,
  "buyerNick": "huge",
  "orderDetails": [
    {
      "skuId": 3893493,
      "num": 1,
      "title": "苹果（Apple）iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机3",
      "price": 236800,
      "ownSpec": "{\"机身颜色\":\"钻雕蓝\",\"内存\":\"4GB\",\"机身存储\":\"64GB\"}",
      "image": "http://image.leyou.com/images/9/4/1524297342728.jpg"
    }
  ],
  "receiver": "张三",
  "receiverMobile": "15800000000",
  "receiverState": "河南",
  "receiverCity": "无名市",
  "receiverDistrict": "无名县",
  "receiverAddress": "无名镇无名路888号",
  "receiverZip": "210000",
  "invoiceType": 0,
  "sourceType":2
}
```

然后点击execute：

![1534050960735](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534050960735.png)

结果：

![1576723724930](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576723724930.png)

下单需要登录，通过登录生成token：

```nginx
http://api.leyou.com/api/auth/accredit
```

![1576724057186](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576724057186.png)

把token的值手动加入到浏览器的cookie中：

![1576722944341](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576722944341.png)

添加成功，响应订单编号。但是和数据库保存的订单编号不太一样（后几位不一样，浏览器展示长整型会出现精度损失）

![1576724345958](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576724345958.png)



#### 生成id的方式

> 订单id的特殊性

订单数据非常庞大，将来一定会做分库分表。那么这种情况下， 要保证id的唯一，就不能靠数据库自增，而是自己来实现算法，生成唯一id。

> 雪花算法

这里的订单id是通过一个工具类生成的：

![1534057752285](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534057752285.png)

而工具类所采用的生成id算法，是由Twitter公司开源的snowflake（雪花）算法。

> 简单原理

雪花算法会生成一个64位的二进制数据，为一个Long型。(转换成字符串后长度最多19) ，其基本结构：

![1528729105237](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528729105237.png)

第一位：为未使用

第二部分：41位为毫秒级时间(41位的长度可以使用69年)

第三部分：5位datacenterId和5位workerId(10位的长度最多支持部署1024个节点）

第四部分：最后12位是毫秒内的计数（12位的计数顺序号支持每个节点每毫秒产生4096个ID序号）

snowflake生成的ID整体上按照时间自增排序，并且整个分布式系统内不会产生ID碰撞（由datacenter和workerId作区分），并且效率较高。经测试snowflake每秒能够产生26万个ID。

> 配置

为了保证不重复，我们给每个部署的节点都配置机器id：

```yaml
leyou:
  worker:
    workerId: 1
    datacenterId: 1
```

加载属性：

```java
@ConfigurationProperties(prefix = "leyou.worker")
public class IdWorkerProperties {

    private long workerId;// 当前机器id

    private long datacenterId;// 序列号

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public long getDatacenterId() {
        return datacenterId;
    }

    public void setDatacenterId(long datacenterId) {
        this.datacenterId = datacenterId;
    }
}
```

编写配置类：

```java
@Configuration
@EnableConfigurationProperties(IdWorkerProperties.class)
public class IdWorkerConfig {

    @Bean
    public IdWorker idWorker(IdWorkerProperties prop) {
        return new IdWorker(prop.getWorkerId(), prop.getDatacenterId());
    }
}
```

> 使用：

![1534057869509](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534057869509.png)



#### 查询订单接口

接口说明：

- 请求方式：GET
- 请求路径：/order/{id}
- 请求参数：id，订单编号
- 返回结果：Order，订单的json对象

测试：

![1534058725566](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534058725566.png)

结果：

![1534058696076](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534058696076.png)



####  更新订单状态

接口说明：

- 请求参数：PUT
- 请求路径：/order/{id}/{status}
- 请求参数：
  - id：订单编号，String类型，不能为空
  - status：订单状态，不能为空
- 返回结果：null

测试：

![1534059150417](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534059150417.png)

结果：

![1534059488506](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534059488506.png)

数据库中也发生了改变：

![1534059550338](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534059550338.png)





#### 分页订单查询

接口说明：

- 请求方式：Get
- 请求路径：/order/list
- 请求参数：
  - page：当前页，Integer类型，默认为1
  - rows：每页大小，Integer类型，默认为5
  - status：订单状态，String类型，默认查询全部状态订单
- 返回结果：PageResult 对象，包含下面属性：
  - total：总条数
  - items：当前页订单数组
    - 订单对象

测试：

![1534059762431](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534059762431.png)

结果：

![1534059802562](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534059802562.png)





####  生成微信订单链接

接口说明：

- 请求方式：Get
- 请求路径：/order/url/{id}
- 请求参数：id，订单编号
- 返回结果：String类型，生成的微信支付链接

测试：

![1534059974834](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534059974834.png)

结果：

![1534060051812](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534060051812.png)





#### 微信支付工具

> PayHelper

```java
@Component
public class PayHelper {

    private WXPay wxPay;

    private static final Logger logger = LoggerFactory.getLogger(PayHelper.class);

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private OrderService orderService;

    public PayHelper(PayConfig payConfig) {
        // 真实开发时
        wxPay = new WXPay(payConfig);
        // 测试时
        // wxPay = new WXPay(payConfig, WXPayConstants.SignType.MD5, true);
    }

    public String createPayUrl(Long orderId) {
        String key = "ly.pay.url." + orderId;
        try {
            String url = this.redisTemplate.opsForValue().get(key);
            if (StringUtils.isNotBlank(url)) {
                return url;
            }
        } catch (Exception e) {
            logger.error("查询缓存付款链接异常,订单编号：{}", orderId, e);
        }

        try {
            Map<String, String> data = new HashMap<>();
            // 商品描述
            data.put("body", "乐优商城测试");
            // 订单号
            data.put("out_trade_no", orderId.toString());
            //货币
            data.put("fee_type", "CNY");
            //金额，单位是分
            data.put("total_fee", "1");
            //调用微信支付的终端IP（estore商城的IP）
            data.put("spbill_create_ip", "127.0.0.1");
            //回调地址
            data.put("notify_url", "http://test.leyou.com/wxpay/notify");
            // 交易类型为扫码支付
            data.put("trade_type", "NATIVE");
            //商品id,使用假数据
            data.put("product_id", "1234567");

            Map<String, String> result = this.wxPay.unifiedOrder(data);

            if ("SUCCESS".equals(result.get("return_code"))) {
                String url = result.get("code_url");
                // 将付款地址缓存，时间为10分钟
                try {
                    this.redisTemplate.opsForValue().set(key, url, 10, TimeUnit.MINUTES);
                } catch (Exception e) {
                    logger.error("缓存付款链接异常,订单编号：{}", orderId, e);
                }
                return url;
            } else {
                logger.error("创建预交易订单失败，错误信息：{}", result.get("return_msg"));
                return null;
            }
        } catch (Exception e) {
            logger.error("创建预交易订单异常", e);
            return null;
        }
    }

    /**
     * 查询订单状态
     *
     * @param orderId
     * @return
     */
    public PayState queryOrder(Long orderId) {
        Map<String, String> data = new HashMap<>();
        // 订单号
        data.put("out_trade_no", orderId.toString());
        try {
            Map<String, String> result = this.wxPay.orderQuery(data);
            if (result == null) {
                // 未查询到结果，认为是未付款
                return PayState.NOT_PAY;
            }
            String state = result.get("trade_state");
            if ("SUCCESS".equals(state)) {
                // success，则认为付款成功

                // 修改订单状态
                this.orderService.updateStatus(orderId, 2);
                return PayState.SUCCESS;
            } else if (StringUtils.equals("USERPAYING", state)
                       || StringUtils.equals("NOTPAY", state)) {
                // 未付款或正在付款，都认为是未付款
                return PayState.NOT_PAY;
            } else {
                // 其它状态认为是付款失败
                return PayState.FAIL;
            }
        } catch (Exception e) {
            logger.error("查询订单状态异常", e);
            return PayState.NOT_PAY;
        }
    }
}
```

跟支付相关的其它几个类：

![1528796883071](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528796883071.png)





#### 查询支付状态

接口说明：

- 请求方式： Get
- 请求路径： /state/{id}
- 请求参数： id，订单编号
- 返回结果：0, 未查询到支付信息 1,支付成功 2,支付失败（查询失败，或者订单过期）



#####  未付款

未付款时查询，测试：

![1534060875467](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534060875467.png)

结果：

![1576740831961](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576740831961.png)

因为尚未付款，所以查询返回0。



##### 付款

<iframe src="https://cloudlandboy.github.io/myNote/html/qrcode.html" height="380" style="-webkit-font-smoothing: antialiased; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); text-size-adjust: none; box-sizing: border-box; font-size: inherit; border: 1px solid rgb(238, 238, 238); width: 1px; min-width: 100%; margin: 1em 0px;"></iframe>

注意这微信收款账号是某机构的，花个一分钱试一下行了



##### 已付款

扫码支付，然后再次查询：

![1576740691971](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576740691971.png)

状态码为1，代表支付成功了！



###  订单结算页

#### 页面跳转

在购物车页面的最下方，有一个去结算按钮：

![1527990452791](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1527990452791.png)

当点击结算，我们应该跳转到订单结算页，即：`getOrderInfo.html`

![1534062458952](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534062458952.png)

查看购物车的`结算`按钮：

![1534063127883](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534063127883.png)

可以看到，地址是正确的。但是只有登录用户才可以去结算付款，因此我们不能直接跳转，而是在跳转前校验用户的登录状态，如果发现是未登录，应该重定向到登录页！

我们给这个按钮绑定点击事件：

![1534063368728](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534063368728.png)

事件中判断登录状态，进行页面跳转：

```html
<div class="sumbtn">
    <a class="sum-btn" href="javascript:;" @click="toOrderInfo()">结算</a>
</div>
toOrderInfo() {
    // 判断是否登录
    ly.verifyUser().then(() => {
        // 已登录
        window.location.href = "/getOrderInfo.html"
    }).catch(() => {
        // 未登录
        window.location.href = "/login.html?returnUrl=" + window.location.href;
    })
}
```





#### 为什么登录后会回到初始页面

可以看到在登录后页面就自动跳转到了购物车页面，原因是在跳转到登录页面时携带了`returnUrl`参数，

在登录成功后，页面就会跳转到`returnUrl`指定的页面

![1576745984237](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576745984237.png)

登录后测试：

![1534068627040](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576741765384.png)

此处页面需要渲染的内容主要包含3部分：

- 收货人信息
- 支付方式
- 商品信息





###  收货人信息

![1576742006078](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576742006078.png)

这里的收货人信息肯定是当前登录用户的收货地址。所以需要根据当前登录用户去查询，目前页面是写的假数据：

![1576742051166](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576742051166.png)

可以在在后台提供地址的增删改查接口，然后页面加载时根据当前登录用户查询，而后赋值给addresses即可。



###  支付方式

支付方式有2种：

- 微信支付
- 货到付款

与我们订单数据中的`paymentType`关联：

![1528012065388](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528012065388.png)

所以我们可以在Vue实例中定义一个属性来记录支付方式：

![1534070467947](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534070467947.png)

然后在页面渲染时与这个变量关联：

![1534070743780](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534070743780.png)





### 商品列表

效果图：

![1528012881735](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528012881735.png)

这里的送货清单，其实就是购物车中用户选择的要付款的商品



#### 购物车信息获取

我们修改`cart.html`中的页面跳转逻辑，把用户选中的购物车信息传递过来：

![1534071010391](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534071010391.png)

然后在`created`钩子函数中获取购物车数据，保存到本地属性，要注意的是，我们应该在获取数据前校验用户登录状态，如果发现未登录，则直接重定向到登录页：

![1534071493245](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534071493245.png)

然后重新加载页面，查看控制台：

![1534071647717](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534071647717.png)



#### 页面渲染

要修改的页面位置：每一个li就是一件商品

![1534071794146](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534071794146.png)

我们修改为：

```html
<ul class="send-detail">
    <li v-for="(cart,index) in carts" :key="index">
        <div class="sendGoods">
            <ul class="yui3-g">
                <li class="yui3-u-1-6">
                    <span><img width="70px" height="70px" :src="cart.image"/></span>
                </li>
                <li class="yui3-u-7-12">
                    <div class="desc">{{cart.title}}</div>
                    <div>
                        <span style="padding: 0 10px" v-for="(v,k) in cart.ownSpec" :key="k">{{k}}：{{v}}</span>
                    </div>
                    <div class="seven">7天无理由退货</div>
                </li>
                <li class="yui3-u-1-12">
                    <div class="price">￥{{ly.formatPrice(cart.price)}}</div>
                </li>
                <li class="yui3-u-1-12">
                    <div class="num">X{{cart.num}}</div>
                </li>
                <li class="yui3-u-1-12">
                    <div class="exit">有货</div>
                </li>
            </ul>
        </div>
    </li>
</ul>
```





### 总金额

另外在商品列表下面，还有一个总金额的计算：

![1576743106189](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576743106189.png)

可以看出这里主要有4个数据：

- 总金额：totalPay
- 优惠返现：discount
- 运费：postFee
- 实付金额：actualPay

不过我们没有做优惠活动，另外运费需要结合物流系统来计算，暂时我们都设置为0，在order属性中写死：

![1534072753146](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534072753146.png)

```json
order: {
    paymentType: 1, //付款方式，默认微信支付
    postFee: 0, //邮费，单位分
    discount: 0, //优惠
},
```

我们通过计算属性来得到`totalPay`和`actualPay`值：

```js
computed: {
    totalNum(){
        return this.carts.reduce((c1, c2) => c1 + c2.num, 0)
    },
    totalPay(){
        return this.carts.reduce((c1, c2) => c1 + c2.price * c2.num, 0);
    },
    actualPay(){
        return this.totalPay + this.order.postFee - this.order.discount;
    }
},
```

然后在页面渲染：

![1534073678931](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534073678931.png)

```html
<div class="order-summary">
    <div class="static fr">
        <div class="list">
            <span><i class="number">{{totalNum}}</i>件商品，总商品金额</span>
            <em class="allprice">¥ {{ly.formatPrice(totalPay)}}</em>
        </div>
        <div class="list">
            <span>返现：</span>
            <em class="money">{{ly.formatPrice(order.discount)}}</em>
        </div>
        <div class="list">
            <span>运费：</span>
            <em class="transport">{{ly.formatPrice(order.postFee)}}</em>
        </div>
    </div>
</div>
```

效果：

![1576743741970](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576743741970.png)





###  提交订单

#### 页面提交

来看下订单接口所需要的数据：

![1576749353702](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576749353702.png)

分为3部分，分别是

- 订单本身的基本信息

  - 总金额
  - 实付金额
  - 付款类型
  - 买家信息就是当前用户

- 订单详情

  - 就是购物车中的商品，不过购物车数据会多出一个userId，我们去除即可：

  ![1534074293296](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534074293296.png)

- 物流信息

  - 当前用户选中的物流地址信息

给提交按钮绑定事件：

![1534074374101](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534074374101.png)

然后编写方法，组织数据并提交：

提交订单之前也应该检查用户是否登录状态，因为有可能长时间未操作cookie过期

```javascript
submit() {
    if (this.carts.length == 0) {
        //没有下单商品，禁止提交
        return;
    }
    ly.verifyUser().then(() => {
        // 把购物车数据处理成订单详情
        const orderDetails = this.carts.map(({userId, ...rest}) => {
            //将ownSpec转为string，因为我把后台的Cart对象的ownSpec改为map结构，传到页面就是json，这里需要转为string
            rest.ownSpec = JSON.stringify(rest.ownSpec);
            return rest;
        });
        // 处理物流信息
        const addr = this.addresses[this.selectedAddress];
        const obj = {
            receiver: addr.name,
            receiverState: addr.state,
            receiverCity: addr.city,
            receiverAddress: addr.address,
            receiverDistrict: addr.district,
            receiverMobile: addr.phone,
            receiverZip: addr.zipCode
        };
        // 复制到订单对象
        Object.assign(this.order, obj, {
            orderDetails,
            totalPay: this.totalPay,
            actualPay: this.actualPay,
        });
        // 提交订单
        ly.http.post("/order", this.order, {
            transformResponse: [
                function (data) {
                    //不进行转换，依然当做字符串来使用,避免精度丢失
                    return data;
                }
            ]
        }).then(({data}) => {
            //删除掉下单的购物车
            ly.store.del("selectedCarts");
            // 在线支付，需要到付款页
            window.location = "pay.html?orderId=" + data + "&actualPay=" + this.actualPay;
        }).catch((resp) => {
            alert("订单提交失败，可能是缺货!")
        })
    }).catch(() => {
        alert("登录失效!")
        window.location.href = "/login.html?returnUrl=" + window.location.href;
    });
}
```

注意在网关服务中配置订单服务，然后将orderController上的@RequestMapping("order")注解删除(删除后swagger就不能访问了，请求会走orderController，可选择修改页面请求地址)

```properties
zuul:
  prefix: /api # 路由路径前缀
  routes:
    item-service: /item/** # 商品微服务的映射路径
    search-service: /search/** # 商品搜索微服务映射路径
    user-service: /user/** # 用户信息微服务映射路径
    auth-service: /auth/** #授权中心微服务
    cart-service: /cart/** #购物车微服务
    order-service: /order/** #订单服务
```





#### 精度损失问题

在页面点击提交测试：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528340102503.png)

成功生成订单！

然后看页面跳转：

![1528340136603](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528340136603.png)

好像有什么不对？订单号的最后2位不正确啊！

这其实是因为JS的长整数精度有限，java的Long类型数据超出了范围，所以出现了精度损失。

我们后台返回的是Json的字符串，在axios内部会自动调用 JSON.parse()方法把json字符串转为JS数据，就会出现进度损失。如果不进行转换，依然当做字符串来使用，就不会有问题了。

因此，我们重写axios对响应的处理回调函数：

![1528340413139](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528340413139.png)

```javascript
{
    transformResponse: [
        function(data){
            return data;
        }
    ]
}
```



#### 删除下单商品

在订单生成后跳转到支付页面之前，应该把下单的商品从localstorage中删除，同样也要删除redis购物中的下单商品

```javascript
submit() {
    if (this.carts.length == 0) {
        //没有下单商品，禁止提交
        return;
    }
    ly.verifyUser().then(() => {
        // 把购物车数据处理成订单详情
        const orderDetails = this.carts.map(({userId, ...rest}) => {
            //将ownSpec转为string，因为我把后台的Cart对象的ownSpec改为map结构，传到页面就是json，这里需要转为string
            rest.ownSpec = JSON.stringify(rest.ownSpec);
            return rest;
        });
        // 处理物流信息
        const addr = this.addresses[this.selectedAddress];
        const obj = {
            receiver: addr.name,
            receiverState: addr.state,
            receiverCity: addr.city,
            receiverAddress: addr.address,
            receiverDistrict: addr.district,
            receiverMobile: addr.phone,
            receiverZip: addr.zipCode
        };
        // 复制到订单对象
        Object.assign(this.order, obj, {
            orderDetails,
            totalPay: this.totalPay,
            actualPay: this.actualPay,
        });
        // 提交订单
        ly.http.post("/order", this.order, {
            transformResponse: [
                function (data) {
                    //不进行转换，依然当做字符串来使用,避免精度丢失
                    return data;
                }
            ]
        }).then(({data}) => {
            //删除掉下单的购物车
            ly.store.del("selectedCarts");
            //把redis购物车中下单的商品删除掉
            let skuIds = this.carts.map((item) => item.skuId).join(',');
            ly.http.delete("/cart/" + skuIds).then(() => {
                // 在线支付，需要到付款页
                window.location = "pay.html?orderId=" + data + "&actualPay=" + this.actualPay;
            });
        }).catch((resp) => {
            alert("订单提交失败，可能是缺货!")
        })
    }).catch(() => {
        alert("登录失效!")
        window.location.href = "/login.html?returnUrl=" + window.location.href;
    });
}
```





#### 浏览器回退问题

订单生成后，使用浏览器的回退按钮，退到结算页没有问题，但是退到购物车页面发现已经创建订单的购物车项还是存在，明明回退浏览器刷新会重新向后台请求购物车数据，而我们在创建订单之后就已经把那些购物车项删除了啊，为什么还是存在，其实是这样的，请求购物车数据发送的是get请求，而浏览器默认会缓存get请求，要想不让浏览器从缓存中拿数据，那就把每次请求的路径都变得不一样

```javascript
ly.http.get("/cart?t=" + new Date().getTime()).then(({data}) => {
    this.carts = data;
    //默认全部选中
    this.selected = this.carts;
});
```



## 微信支付

### 介绍

微信支付官方文档：https://pay.weixin.qq.com/index.php/core/home/login?return_url=%2F

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1527848350188.png)

我们选择开发文档，而后进入选择页面：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1527848358128.png)

选择扫码支付：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1527848368179.png)

此处我们使用模式二来开发：



### 开发流程

模式二与模式一相比，流程更为简单，不依赖设置的回调支付URL。

商户后台系统先调用微信支付的统一下单接口，微信后台系统返回链接参数code_url；

商户后台系统将code_url值生成二维码图片，用户使用微信客户端扫码后发起支付。

注意：code_url有效期为2小时，过期后扫码不能再发起支付。

流程图：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/chapter6_5_1.png)

这里我们把商户（我们）要做的事情总结一下：

- 1、商户生成订单
- 2、商户调用微信下单接口，获取预交易的链接
- 3、商户将链接生成二维码图片，展示给用户；
- 4、用户支付并确认
- 5、支付结果通知：
  - 微信异步通知商户支付结果，商户告知微信支付接收情况
  - 商户如果没有收到通知，可以调用接口，查询支付状态
- 6、如果支付成功，发货，修改订单状态

在前面的业务中，我们已经完成了：

- 1、生成订单

接下来，我们需要做的是：

- 2、调用微信接口，生成链接。
- 3、并且生成二维码图片



### 引入依赖

```xml
<dependency>
    <groupId>com.github.wxpay</groupId>
    <artifactId>wxpay-sdk</artifactId>
    <version>0.0.3</version>
</dependency>
```



### 配置参数

```java
package com.leyou.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "leyou.pay")
@Data
public class PayProperties {

    private String appId; // 公众账号ID

    private String mchId; // 商户号

    private String key; // 生成签名的密钥

    private int connectTimeoutMs; // 连接超时时间

    private int readTimeoutMs;// 读取超时时间


}
```



application.yml

```yaml
leyou:
  worker:
    workerId: 1
    datacenterId: 1
  jwt:
    pubKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 公钥地址
    cookieName: LY_TOKEN
  pay:
    appId: wx8397f8696b538317
    mchId: 1473426802
    key: T6m9iK73b0kn9g5v426MKfHQH7X8rKwb
    connectTimeoutMs: 5000
    readTimeoutMs: 10000
```





### 支付逻辑

```java
package com.leyou.utils;

import com.github.wxpay.sdk.WXPay;
import com.leyou.config.PayConfig;
import com.leyou.order.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
public class PayHelper {

    private WXPay wxPay;

    private static final Logger logger = LoggerFactory.getLogger(PayHelper.class);

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private OrderService orderService;

    public PayHelper(PayConfig payConfig) {
        // 真实开发时
        wxPay = new WXPay(payConfig);
        // 测试时
        // wxPay = new WXPay(payConfig, WXPayConstants.SignType.MD5, true);
    }

    public String createPayUrl(Long orderId) {
        String key = "ly.pay.url." + orderId;
        try {
            String url = this.redisTemplate.opsForValue().get(key);
            if (StringUtils.isNotBlank(url)) {
                return url;
            }
        } catch (Exception e) {
            logger.error("查询缓存付款链接异常,订单编号：{}", orderId, e);
        }

        try {
            Map<String, String> data = new HashMap<>();
            // 商品描述
            data.put("body", "乐优商城测试");
            // 订单号
            data.put("out_trade_no", orderId.toString());
            //货币
            data.put("fee_type", "CNY");
            //金额，单位是分
            data.put("total_fee", "1");
            //调用微信支付的终端IP（乐优商城的IP）
            data.put("spbill_create_ip", "127.0.0.1");
            //回调地址，付款成功后的接口
            data.put("notify_url", "http://test.leyou.com/wxpay/notify");
            // 交易类型为扫码支付
            data.put("trade_type", "NATIVE");
            //商品id,使用假数据
            data.put("product_id", "1234567");

            Map<String, String> result = this.wxPay.unifiedOrder(data);

            if ("SUCCESS".equals(result.get("return_code"))) {
                String url = result.get("code_url");
                // 将付款地址缓存，时间为10分钟
                try {
                    this.redisTemplate.opsForValue().set(key, url, 10, TimeUnit.MINUTES);
                } catch (Exception e) {
                    logger.error("缓存付款链接异常,订单编号：{}", orderId, e);
                }
                return url;
            } else {
                logger.error("创建预交易订单失败，错误信息：{}", result.get("return_msg"));
                return null;
            }
        } catch (Exception e) {
            logger.error("创建预交易订单异常", e);
            return null;
        }
    }

    /**
     * 查询订单状态
     *
     * @param orderId
     * @return
     */
    public PayState queryOrder(Long orderId) {
        Map<String, String> data = new HashMap<>();
        // 订单号
        data.put("out_trade_no", orderId.toString());
        try {
            Map<String, String> result = this.wxPay.orderQuery(data);
            if (result == null) {
                // 未查询到结果，认为是未付款
                return PayState.NOT_PAY;
            }
            String state = result.get("trade_state");
            if ("SUCCESS".equals(state)) {
                // success，则认为付款成功

                // 修改订单状态
                this.orderService.updateStatus(orderId, 2);
                return PayState.SUCCESS;
            } else if (StringUtils.equals("USERPAYING", state) || StringUtils.equals("NOTPAY", state)) {
                // 未付款或正在付款，都认为是未付款
                return PayState.NOT_PAY;
            } else {
                // 其它状态认为是付款失败
                return PayState.FAIL;
            }
        } catch (Exception e) {
            logger.error("查询订单状态异常", e);
            return PayState.NOT_PAY;
        }
    }
}
```



### 状态枚举类

```java
public enum PayState {
    NOT_PAY(0),SUCCESS(1),FAIL(2);

    PayState(int value) {
        this.value = value;
    }

    int value;

    public int getValue() {
        return value;
    }
}
```





### 生成二维码

#### 生成预交易链接

我们先根据订单的编号，调用后台服务，生成交易链接，而后才能根据链接生成二维码。

在页面发起请求：

```javascript
<script src="./js/vue/vue.js"></script>
<script src="./js/axios.min.js"></script>
<script src="./js/common.js"></script>
<script>
    var payVm = new Vue({
        el: "#payApp",
        data: {
            ly,
            orderId: 0,// 订单编号
        },
        created() {
            // 判断登录状态
            ly.http.get("/auth/verify").then(() => {
                // 获取订单编号
                this.orderId = ly.getUrlParam("orderId");
                // 获取请求链接
                ly.http.get("/order/url/" + this.orderId)
                    .then(resp => {
                        console.log(resp.data);
                    })
            }).catch(() => {
                // 未登录，跳转至登录页
                location.href = "/login.html?returnUrl=" + location.href;
            })
        },
        components: {
            shortcut: () => import("./js/pages/shortcut.js")
        }
    });
</script>
```

后台已经定义好生成付款地址的接口。

![1528362159620](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528362159620.png)

刷新页面查看：

![1528362220886](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528362220886.png)



#### 生成二维码

这里我们使用一个生成二维码的JS插件：qrcode，官网：https://github.com/davidshimjs/qrcodejs

[qrcode.min.js](https://raw.githubusercontent.com/davidshimjs/qrcodejs/master/qrcode.min.js) (右键另存为)

我们把课这个js脚本引入到项目中：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528362348399.png)

官方使用案例：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1534313925398.png)

然后在页面引用：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528362377494.png)

页面定义一个div，用于展示二维码：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528362023061.png)

```javascript
created() {
    // 判断登录状态
    ly.http.get("/auth/verify").then(() => {
        // 获取订单编号
        this.orderId = ly.getUrlParam("orderId");
        this.actualPay = Number(ly.getUrlParam("actualPay"));
        // 获取请求链接
        ly.http.get("/order/url/" + this.orderId)
            .then(resp => {
                //生成二维码
                var qrImage = new QRCode(document.getElementById("qrImage"), {
                    text: resp.data,
                    width: 300,
                    height: 300,
                    colorDark: "#000000",
                    colorLight: "#ffffff",
                    correctLevel: QRCode.CorrectLevel.H
                });
            })
    }).catch(() => {
        // 未登录，跳转至登录页
        location.href = "/login.html?returnUrl=" + location.href;
    })
},
```

刷新页面，查看效果：

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528362464276.png)

此时，客户用手机扫描二维码，可以看到付款页面。



### 付款状态查询

跳转到支付页面后，我们等待用户付款，付款完成则跳转到付款成功页面。

#### 页面循环查询页面状态

不过，因为不清楚用户何时会付款，因此这里采用循环的方式，不断请求判断是否支付成功。

```js
// 开启定时任务，查询付款状态
const taskId = setInterval(() => {
    ly.http.get("/order/state/" + this.orderId)
        .then(resp => {
        let i = resp.data;
        if (i === 1) {
            // 付款成功
            clearInterval(taskId);
            // 跳转到付款成功页
            location.href = "/paysuccess.html?orderId=" + this.orderId;
        } else if (i === 2) {
            // 付款失败
            clearInterval(taskId);
            // 跳转到付款失败页
            location.href = "/payfail.html";
        }
    })
}, 3000);
```



#### 付款成功界面

当付款成功后，自动跳转到付款成功页面：

![1528376883924](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1528376883924.png)







##  支付宝支付

### 注册

首先要去[支付宝开放平台](https://open.alipay.com/)注册账号，然后登录

### 创建应用

登录后选择开发者中心->研发中心

![1576975701986](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576975701986.png)

由于使用的是沙箱环境，已经创建好了沙箱测试应用，接下来只需要设置RSA2密钥即可，具体参考[官方文档](https://docs.open.alipay.com/200/105311)，官方有提供生成密钥的[工具](https://docs.open.alipay.com/291/105971)

密钥生成后将公钥(yuè)配置到沙箱，然后保存生成的支付宝公钥(yuè)

![1576919593220](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576919593220.png)





### 电脑网站支付接入

具体参考官方[文档](https://docs.open.alipay.com/270/)，官方有提供[demo](https://docs.open.alipay.com/270/106291/)，但却是jsp版的，需要对其进行更改



### 项目介入

#### 添加依赖

```xml
<!--支付宝支付-->
<dependency>
    <groupId>com.alipay.sdk</groupId>
    <artifactId>alipay-sdk-java</artifactId>
    <version>4.8.73.ALL</version>
</dependency>
```



#### 配置文件

在`resources`目录下创建`alipay.properties`配置文件

```
#应用ID,您的APPID
alipay.appId=2016093000629372
#商户私钥，您的PKCS8格式RSA2私钥
alipay.privateKey=MIIEvQIB......
#支付宝公钥
alipay.alipayPublicKey=MIIBIjANBgkqhkiG9w0BAQEFA......
#服务器异步通知页面路径  需http=//格式的完整路径，不能加参数，必须外网可以正常访问
alipay.notifyUrl=http://leyou.free.idcfengye.com/akipayNotify
#页面跳转同步通知页面路径 需http=//格式的完整路径，不能加参数，必须外网可以正常访问
alipay.returnUrl=http://www.leyou.com/paysuccess.html
#签名方式
alipay.signType=RSA2
#字符编码格式
alipay.charset=utf-8
#支付宝网关(这里配置的是沙箱环境的网关)
alipay.gatewayUrl=https://openapi.alipaydev.com/gateway.do
#日志文件路径
alipay.logPath=/home/cloudlandboy/Project/leyou/aliPayLog
```



#### 配置类

```
package com.leyou.order.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
@PropertySource({"classpath:alipay.properties"})
@ConfigurationProperties(prefix = "alipay")
public class AlipayProperties {

    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */
    private String appId = "";

    /**
     * 商户私钥，您的PKCS8格式RSA2私钥
     */
    private String privateKey = "";

    /**
     * 支付宝公钥
     */
    private String alipayPublicKey = "";

    /**
     * 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    private String notifyUrl = "";

    /**
     * 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    private String returnUrl = "";

    /**
     * 签名方式
     */
    private String signType = "RSA2";

    /**
     * 字符编码格式
     */
    private String charset = "utf-8";

    /**
     * 支付宝网关
     */
    private String gatewayUrl = "https://openapi.alipay.com/gateway.do";

    /**
     * 支付宝网关
     */
    private String logPath = "/home/cloudlandboy/Project/leyou/aliPayLog";

    //getter,setter略

    /**
     * 记录日志
     *
     * @param sWord
     */
    private void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(logPath + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```



#### 工具类

```java
package com.leyou.order.utils;

@Component
public class AliPayHelper {

    @Autowired
    private AlipayProperties properties;

    /**
     * @param orderId
     * @param actualPay
     * @return
     * @throws
     */
    public String pay(String orderId, String actualPay) throws Exception {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(properties.getGatewayUrl(), properties.getAppId(), properties.getPrivateKey(),
                "json", properties.getCharset(), properties.getAlipayPublicKey(), properties.getSignType());

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(properties.getReturnUrl());
        alipayRequest.setNotifyUrl(properties.getNotifyUrl());

        //请求参数
        Map<String, String> data = new HashMap<>(5);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        data.put("out_trade_no", orderId);
        //付款金额，必填
        data.put("total_amount", actualPay);
        //订单名称，必填
        data.put("subject", "乐优商城测试订单");
        //商品描述，可空
        data.put("body", "乐优商城的订单");
        //该数据不要修改
        data.put("product_code", "FAST_INSTANT_TRADE_PAY");
        alipayRequest.setBizContent(JsonUtils.serialize(data));
        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();

        //返回的是一个html源码，里面是个表单然后用js提交的
        return result;
    }


    /**
     * 调用SDK验证签名
     *
     * @param params
     * @return
     * @throws AlipayApiException
     */
    public boolean rsaCheckV1(Map<String, String> params) throws AlipayApiException {
        boolean signVerified = AlipaySignature.rsaCheckV1(params, properties.getAlipayPublicKey(), properties.getCharset(), properties.getSignType());
        return signVerified;
    }

    /**
     * 交易状态
     */
    public static class TradeStatus {
        /**
         * 交易关闭 0
         */
        public static final String TRADE_CLOSED = "TRADE_CLOSED";
        /**
         * 交易完结 0
         */
        public static final String TRADE_FINISHED = "TRADE_FINISHED";
        /**
         * 支付成功    1
         */
        public static final String TRADE_SUCCESS = "TRADE_SUCCESS";
        /**
         * 交易创建    0
         */
        public static final String WAIT_BUYER_PAY = "WAIT_BUYER_PAY";
    }
}
```



#### 关于异步和同步通知

> 异步通知

参数中的异步通知是在用户付款成功之后支付宝会发送一个post请求给你的服务器，该请求中包含一些数据，由于是支付宝发的请求，所以这个请求地址要能被支付宝访问到，而我们是本机测试没有外网ip，所写的controlelr外网是不能访问到的，这里需要使用内网穿透工具，我这里使用的是 [Ngrok](http://www.ngrok.cc/)

> 同步通知

同步通知是用户付款成功后，支付宝将用户客户端重定向到配置的同步Url，同样会在url后添加一些参数



#### Ngrok

注册后登录隧道管理>开通隧道，选择免费服务器

![1576920387603](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576920387603.png)

填写需要转发到的本机端口地址，我的订单服务端口是`7009`

![1576920563097](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576920563097.png)

记下生成的隧道id和域名，然后[下载客户端](http://www.ngrok.cc/download.html)

![1576920661551](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576920661551.png)

下载后解压，进入解压后的目录运行，windows是`sunny.exe`

```shell
./sunny clientid 隧道id
```

![1576921124660](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576921124660.png)

启动完成后访问域名测试能否成功访问 ，以debug启动应用，然后在登录拦截器中打上断店，访问域名看看能不能进入断点

免费的产品速度可能不理想，耐心等待即可



#### Controller

修改`OrderController`添加支付宝支付接口

```
/**
 * 支付宝支付
 *
 * @param orderId
 * @return
 */
@GetMapping("alipay/{id}")
@ApiOperation(value = "支付宝支付，跳转到支付页面", notes = "支付宝支付")
@ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "订单编号", type = "Long"),
        @ApiImplicitParam(name = "actualPay", value = "应付金额", type = "Integer")
})
@ApiResponses({
        @ApiResponse(code = 200, message = "写出支付页面"),
        @ApiResponse(code = 404, message = "生成支付页面失败"),
        @ApiResponse(code = 500, message = "服务器异常")
})
public String alipay(@PathVariable("id") String orderId, Integer actualPay, HttpServletResponse response) throws Exception {
    DecimalFormat df = new DecimalFormat("0.00");
    String money = df.format(actualPay / 100.00);
    String form = this.aliPayHelper.pay(orderId, money);

    if (StringUtils.isBlank(form)) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND).toString();
    }
    response.setContentType("text/html;charset=utf-8");
    response.getWriter().write(form);
    response.getWriter().flush();
    response.getWriter().close();
    return null;
}
```

> 支付宝回调方法

```
/**
 * 获取支付宝POST过来反馈信息
 */
@PostMapping("/akipayNotify")
public void akipayNotify(HttpServletRequest request) throws AlipayApiException {
    Map<String, String[]> parameterMap = request.getParameterMap();
    Map<String, String> params = new HashMap<String, String>(parameterMap.size());
    for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
        params.put(entry.getKey(), StringUtils.join(entry.getValue(), ","));
    }
    System.out.println(params);
    boolean signVerified = this.aliPayHelper.rsaCheckV1(params);
    //验证成功
    if (signVerified) {
        //商户订单号orderId
        String out_trade_no = params.get("out_trade_no");

        //支付宝交易号
        String trade_no = params.get("trade_no");

        //交易状态
        String trade_status = params.get("trade_status");

        if (TradeStatus.TRADE_FINISHED.equals(trade_status)) {
            //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
        } else if (TradeStatus.TRADE_SUCCESS.equals(trade_status)) {
            //付款完成后，支付宝系统发送该交易状态通知
            //更改订单状态
            this.orderService.updateStatus(Long.valueOf(out_trade_no), 2);
        }

    } else {
        //验证失败
        //调试用，写文本函数记录程序运行情况是否正常
        //String sWord = AlipaySignature.getSignCheckContentV1(params);
        //AlipayConfig.logResult(sWord);
    }

}
```



#### 修改页面

> 修改getOrderInfo.html，添加支付宝支付

```html
<ul class="payType">
    <li :class="{selected: order.paymentType==1}" @click="order.paymentType=1">微信付款<span
            title="点击取消选择"></span></li>
    <li :class="{selected: order.paymentType==3}" @click="order.paymentType=3">支付宝付款<span
            title="点击取消选择"></span></li>
    <li :class="{selected: order.paymentType==2}" @click="order.paymentType=2">货到付款<span
            title="点击取消选择"></span></li>
</ul>
submit() {


        //.....


        // 提交订单
        ly.http.post("/order", this.order, {
            transformResponse: [
                function (data) {
                    //不进行转换，依然当做字符串来使用,避免精度丢失
                    return data;
                }
            ]
        }).then(({data}) => {
            //删除掉下单的购物车
            ly.store.del("selectedCarts");
            //把redis购物车中下单的商品删除掉
            let skuIds = this.carts.map((item) => item.skuId).join(',');
            ly.http.delete("/cart/" + skuIds).then(() => {
                // 在线支付，需要到付款页
                switch (this.order.paymentType) {
                    case 1:
                        //微信支付
                        window.location = "pay.html?orderId=" + data + "&actualPay=" + this.actualPay;
                        break;
                    case 3:
                        //支付宝支付
                        window.location = ly.http.defaults.baseURL + "/order/alipay/" + data + "?actualPay=" + this.actualPay;
                        break;
                }
            });
        }).catch((resp) => {
            alert("订单提交失败，可能是缺货!")
        })
    }).catch(() => {
        alert("登录失效!");
        window.location.href = "/login.html?returnUrl=" + window.location.href;
    });
}
```

> 启动项目测试

交易成功后支付宝会将客户端重定向到配置的同步url，后面会添加上参数，其中有交易金额，修改支付成功页面更改支付金额显示

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/1576974677100.png)

```html
<div class="paysuccess" id="paysuccess">
    <div class="success">
        <h3><img src="img/_/right.png" width="48" height="48">　恭喜您，支付成功啦！</h3>
        <div class="paydetail">
            <p>支付方式：微信支付</p>
            <p>支付金额：￥{{total_amount}}元</p>
            <p class="button"><a href="home-index.html" class="sui-btn btn-xlarge btn-danger">查看订单</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
                    href="index.html" class="sui-btn btn-xlarge ">继续购物</a></p>
        </div>
    </div>

</div>
<script src="./js/vue/vue.js"></script>
<script src="./js/axios.min.js"></script>
<script src="./js/common.js"></script>
<script>
    const paysuccessVm = new Vue({
        el: "#paysuccess",
        data: {
            total_amount: 0,
        },
        created() {
            this.total_amount = ly.getUrlParam("total_amount") || 0;
        }
    })
</script>
```

同样修改微信的支付页面，成功后也给地址后面加上交易金额参数

> pay.html

```javascript
// 开启定时任务，查询付款状态
const taskId = setInterval(() => {
    ly.http.get("/order/state/" + this.orderId)
        .then(resp => {
            let i = resp.data;
            if (i === 1) {
                // 付款成功
                clearInterval(taskId);
                // 跳转到付款成功页
                location.href = "/paysuccess.html?orderId=" + this.orderId + "&total_amount=" + ly.formatPrice(this.actualPay);
            } else if (i === 2) {
                // 付款失败
                clearInterval(taskId);
                // 跳转到付款失败页
                location.href = "/payfail.html";
            }
        })
}, 3000);
```





## 演示


<iframe 
    width="800" 
    height="450" 
    src="https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/20191222110734.mp4"
    frameborder="0" 
    allowfullscreen>
</iframe>

















