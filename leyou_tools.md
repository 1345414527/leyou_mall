## 自定义主键使用指南

### 树组件的用法

#### 示例

```html
<v-tree url="/item/category/list"
        :isEdit="true"
        @handleAdd="handleAdd"
        @handleEdit="handleEdit"
        @handleDelete="handleDelete"
        @handleClick="handleClick"
/>
```

效果：

![](https://img-blog.csdnimg.cn/20200418150043176.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 属性列表

| 属性名称 | 说明                             | 数据类型 | 默认值 |
| -------- | -------------------------------- | -------- | ------ |
| url      | 用来加载数据的地址，即延迟加载   | String   | -      |
| isEdit   | 是否开启树的编辑功能             | boolean  | false  |
| treeData | 整颗树数据，这样就不用远程加载了 | Array    | -      |

这里推荐使用url进行延迟加载，**每当点击父节点时，就会发起请求，根据父节点id查询子节点信息**。

当有treeData属性时，就不会触发url加载

远程请求返回的结果格式：

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



#### 事件

| 事件名称     | 说明                                       | 回调参数                                         |
| ------------ | ------------------------------------------ | ------------------------------------------------ |
| handleAdd    | 新增节点时触发，isEdit为true时有效         | 新增节点node对象，包含属性：name、parentId和sort |
| handleEdit   | 当某个节点被编辑后触发，isEdit为true时有效 | 被编辑节点的id和name                             |
| handleDelete | 当删除节点时触发，isEdit为true时有效       | 被删除节点的id                                   |
| handleClick  | 点击某节点时触发                           | 被点击节点的node对象,包含全部信息                |



#### 完整node的信息

回调函数中返回完整的node节点会包含以下数据：

```json
{
    "id": 76, // 节点id
    "name": "手机", // 节点名称
    "parentId": 75, // 父节点id
    "isParent": false, // 是否是父节点
    "sort": 1, // 顺序
    "path": ["手机", "手机通讯", "手机"] // 所有父节点的名称数组
}
```



###  级联选择组件

#### 示例

```html
    <v-cascader 
      url="/item/category/list" 
      multiple required    
      v-model="brand.categories" 
      label="请选择商品分类"/>
```



#### 效果

![](https://img-blog.csdnimg.cn/2020041815011168.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 结果值

`v-model`绑定的数据结果：

![](https://img-blog.csdnimg.cn/20200418150129118.png)



#### 属性列表

| 属性名称      | 说明                                                         | 数据类型 | 默认值   |
| ------------- | ------------------------------------------------------------ | -------- | -------- |
| url           | 延迟加载数据的地址 [{id,name},{}]                            | String   | 无       |
| itemText      | 每个选项中用来显示的字段名称                                 | String   | name     |
| itemValue     | 每个选项中用来作为值的字段名称                               | String   | id       |
| children      | 子选项数组在父选项中的字段名称                               | String   | children |
| multiple      | 是否允许多选                                                 | boolean  | false    |
| showAllLevels | 是否将级联的每级选项都作为结果展示。当multiple值为true时，这个值无效，即只会显示最后一级选项的结果 | boolean  | false    |
| required      | 是否是必填项，如果是，会在文本提示后加*                      | boolean  | false    |
| rules         | 自定义校验规则                                               | Array    | 无       |
| value         | 选择框的结果，可以通过v-model进行双向绑定                    | Array    | 无       |
| label         | 提示用户的文字说明                                           | String   | 无       |



#### 说明

无论是单选还是多选，value的结果格式始终是一个数组。单选时数组的长度始终为1。

数组中的对象结构为：

```json
{
    {itemValue}:'', // 属性名取决于itemValue的值，默认是id
    {itemText}:''// 属性名取决于itemText的值，默认是name
}
```



### 文件上传组件

#### 示例

##### 单图片上传

```html
        <v-upload
          v-model="brand.image" 
          url="/item/upload" 
          :multiple="false" 
          :pic-width="150" 
          :pic-height="150"
        />
```

上传前：

![](https://img-blog.csdnimg.cn/20200418150154198.png)

上传后

![](https://img-blog.csdnimg.cn/20200418150214198.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



##### 多图片上传

示例：

```html
<v-upload
          v-model="brand.image" 
          url="/item/upload"
          />
```

效果：

![](https://img-blog.csdnimg.cn/20200418150227601.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





####  属性列表

| 属性名    | 说明                   | 数据类型                                   | 默认值 |
| --------- | ---------------------- | ------------------------------------------ | ------ |
| url       | 上传文件的目标路径     | String                                     | 无     |
| value     | 上传成功的返回结果     | 单图片上传是String。多图片上传是String数组 | 无     |
| multiple  | 是否运行多图片上传     | Boolean                                    | true   |
| picWidth  | 单图片上传后的预览宽度 | Number                                     | 150    |
| picHeight | 单图片上传后的预览高度 | Number                                     | 150    |



#####说明

可以通过v-model双向绑定，来获取图片上传的结果：

- 单图片上传时，value值是一个图片地址
- 多图片上传时，value值是一个图片地址数组
- 文件上传的参数名是：file
- 文件上传的返回值，就是图片的url路径



### 自定义富文本编辑器

#### 示例

```html
<v-editor v-model="goods.spuDetail.description" upload-url="/upload/image" fileName="file"/>
```



#### 效果

![](https://img-blog.csdnimg.cn/20200418150249388.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





#### 属性说明

属性列表：

| 属性名        | 说明                                                  | 数据类型 | 默认值 |
| ------------- | ----------------------------------------------------- | -------- | ------ |
| value         | 编辑器的输出结果，可以用v-model双向绑定               | String   | 无     |
| upload-url    | 上传按钮对应的图片上传地址，以项目全局的url配置为前缀 | String   | 无     |
| file-name     | 上传文件的参数名                                      | String   | file   |
| maxUploadSize | 上传文件的大小限制，单位byte                          | Number   | 500kb  |

备注：

默认支持的图片类型：jpg/png/jpeg/gif





## Linux下使用FastDFS

### 安装环境

- vmware
- CentOS-7
- [fastdfs-6.03.tar.gz](https://github.com/happyfish100/fastdfs/archive/V6.03.tar.gz)
- [fastdfs-nginx-module-1.22.tar.gz](https://github.com/happyfish100/fastdfs-nginx-module/archive/V1.22.tar.gz)
- [libfastcommon-1.0.42.tar.gz](https://github.com/happyfish100/libfastcommon/archive/V1.0.42.tar.gz)
- [nginx-1.17.6](http://nginx.org/download/nginx-1.17.6.tar.gz)

系统镜像安装后之后记得先做一份快照

1. 在/usr/local下新建leyou目录
2. 然后把下载的安装包上传到leyou目录下

![](https://img-blog.csdnimg.cn/20200418151031297.png)

![](https://img-blog.csdnimg.cn/20200418151044311.png)



### 单节点FastDFS

整个安装过程非常复杂，很容易出错，建议进行多次备份。

我们这里不打算安装多台虚拟机，因此会把tracker和storage都安装在一起。



#### 安装gcc

GCC用来对C语言代码进行编译运行，使用yum命令安装：

```shell
yum -y install gcc
```

后面会用到解压命令（unzip），所以这里可以用yum把unzip 也装一下

```shell
yum install -y unzip zip
```



####  安装libevent

```shell
yum -y install libevent
```



#### 安装libfastcommon

```shell
解压
tar -xvf libfastcommon-1.0.42.tar.gz

进入解压完成的目录
cd libfastcommon-1.0.42

编译并且安装：
./make.sh 
./make.sh install
```



#### 安装fastdfs

```shell
tar -xvf fastdfs-6.03.tar.gz
cd  fastdfs-6.03/
./make.sh 
./make.sh install
```

如果安装成功，会看到/etc/init.d/下看到提供的脚本文件：

```shell
ll /etc/init.d/ | grep fdfs
```

![](https://img-blog.csdnimg.cn/20200418151104122.png)

- `fdfs_trackerd` 是tracker启动脚本
- `fdfs_storaged` 是storage启动脚本

能够在 /etc/fdfs/ 目录下看到默认的配置文件模板：

```shell
ll /etc/fdfs/
```

![](https://img-blog.csdnimg.cn/20200418151120789.png)

- `tarcker.conf.sample` 是tracker的配置文件模板
- `storage.conf.sample` 是storage的配置文件模板
- `client.conf.sample` 是客户端的配置文件模板



#### 配置并且启动tracker服务

FastDFS的tracker和storage在刚刚的安装过程中，都已经被安装了，因此我们安装这两种角色的方式是一样的。不同的是，两种需要不同的配置文件。

我们要启动tracker，就修改刚刚看到的`tarcker.conf`，并且启动`fdfs_trackerd`脚本即可。

1. 首先将模板文件复制

   ```shell
   cp /etc/fdfs/tracker.conf.sample /etc/fdfs/tracker.conf
   ```

2. 修改复制后的配置文件：

   ```shell
   vim /etc/fdfs/tracker.conf 
   ```

   修改的内容如下：

   ```properties
   # 存储日志和数据的根目录
   base_path=/leyou/tracker
   ```

![](https://img-blog.csdnimg.cn/2020041815114153.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



1. 新建目录：

   ```shell
   mkdir -p /leyou/tracker
   ```

2. 注意：关闭防火墙：

   ```shell
   # 关闭
   service firewalld stop
   # 禁止开机自启
   systemctl disable firewalld.service
   #查看状态
   service firewalld status
   ```

**启动和停止**

启动tracker服务器: `/etc/init.d/fdfs_trackerd start`

停止tracker服务器: `/etc/init.d/fdfs_trackerd stop`

不过安装过程中，fdfs已经被设置为系统服务，我们可以采用熟悉的服务启动方式：

```shell
service fdfs_trackerd start # 启动fdfs_trackerd服务，停止用stop
```

检查FastDFS Tracker Server是否启动成功：

```shell
service fdfs_trackerd status
ps -ef | grep fdfs_trackerd
```

设置tracker服务开机启动:

```shell
chkconfig fdfs_trackerd on
```



#### 配置并启动storage服务

1. 首先将模板文件复制

   ```shell
   cp /etc/fdfs/storage.conf.sample /etc/fdfs/storage.conf
   ```

2. 修改复制后的配置文件：

   ```shell
   vim /etc/fdfs/storage.conf
   ```

   修改的内容如下:

   ```properties
   # 数据和日志文件存储根目录 
   base_path=/leyou/storage
   
   # 第一个存储目录 
   store_path0=/leyou/storage
   
   # tracker服务器(这里是安装在本机，是本机ip)IP和端口 
   tracker_server=172.16.145.141:22122
   ```

3. 新建目录：

   ```shell
   mkdir -p /leyou/storage
   ```

**启动和停止**

启动storage服务器：`/etc/init.d/fdfs_storaged start`

停止storage服务器：`/etc/init.d/fdfs_storaged stop`

推荐使用：

```shell
service fdfs_storaged start  # 启动fdfs_storaged服务，停止用stop
```

设置storage服务开机启动：

```
chkconfig fdfs_storaged on
```

查看状态

```shell
service fdfs_storaged status
```



###  使用nginx访问FastDFS

####  为什么需要用nginx访问FastDFS

FastDFS通过Tracker服务器,将文件放在Storage服务器存储，但是同组存储服务器之间需要进入文件复制，有同步延迟的问题。

假设Tracker服务器将文件上传到了192.168.4.125，上传成功后文件ID已经返回给客户端。此时FastDFS存储集群机制会将这个文件同步到同组存储192.168.4.126，在文件还没有复制完成的情况下，客户端如果用这个文件ID在192.168.4.126上取文件,就会出现文件无法访问的错误。

而fastdfs-nginx-module可以重定向文件连接到文件上传时的源服务器取文件,避免客户端由于复制延迟导致的文件无法访问错误

#### 安装fastdfs-nguinx-module

> 解压

```shell
tar -xvf fastdfs-nginx-module-1.22.tar.gz
```

> 修改config

1. 进入src目录

   ```shell
   cd fastdfs-nginx-module-1.22/src/
   ```

2. 编辑config

   ```shell
   vim config
   ```

3. 使用以下替换命令：

   ```shell
   :%s+/usr/local/+/usr/+g
   ```

   将所有的/usr/local替换为 /usr，这个才是正确的目录



#### 配置nginx与FastDFS关联配置文件

复制 fastdfs-nginx-module 源码中的配置文件到/etc/fdfs 目录， 并修改

```shell
cp /usr/local/leyou/fastdfs-nginx-module-1.22/src/mod_fastdfs.conf /etc/fdfs/

vi /etc/fdfs/mod_fastdfs.conf
```

修改以下配置：

```shell
# 客户端访问文件连接超时时长（单位：秒）
connect_timeout=10

# tracker服务IP和端口
tracker_server172.16.145.141:22122

# 访问链接前缀加上组名
url_have_group_name=true

# 文件存储路径
store_path0=/leyou/storage
```

复制 FastDFS 的部分配置文件到/etc/fdfs 目录

```shell
cd /usr/local/leyou/fastdfs-6.03/conf/
cp http.conf mime.types /etc/fdfs/
```



### 安装Nginx插件

#### 如果没有安装过nginx

- 安装nginx的依赖库

```shell
yum -y install gcc pcre pcre-devel zlib zlib-devel openssl openssl-devel
```

- 解压安装包

```shell
tar -xvf nginx-1.17.6.tar.gz
```

- 配置nginx安装包，并指定fastdfs-nginx-model

```shell
cd nginx-1.17.6/

./configure --prefix=/opt/nginx --sbin-path=/usr/bin/nginx --add-module=/usr/local/leyou/fastdfs-nginx-module-1.22/src/
```

**注意**：在执行./configure配置nginx参数的时候，需要将fastdfs-nginx-moudle源码作为模块编译进去。

- 编译并安装

```shell
make && make install
```



#### 如果已经安装过nginx

进入nginx目录：

```shell
cd /usr/local/leyou/nginx-1.17.6/
```

配置FastDFS 模块

```shell
./configure --prefix=/opt/nginx --sbin-path=/usr/bin/nginx --add-module=/usr/local/leyou/fastdfs-nginx-module-1.22/src/
```

注意：这次配置时，要添加fastdfs-nginx-moudle模块

编译，注意，这次不要安装（install）

```shell
make
```

替换nginx二进制文件:

备份：

```shell
mv /usr/bin/nginx /usr/bin/nginx-bak
```

用新编译的nginx启动文件替代原来的：

```shell
cp objs/nginx /usr/bin/
```



#### 启动nginx

配置nginx整合fastdfs-module模块

我们需要修改nginx配置文件，在/opt/nginx/conf/nginx.conf文件中：

```shell
vim  /opt/nginx/conf/nginx.conf
```

将文件中，原来的`server 80{ ...}` 部分代码替换为如下代码：

```nginx
    server {
        listen       80;
        server_name  image.leyou.com;

        # 监听域名中带有group的，交给FastDFS模块处理
        location ~/group([0-9])/ {
            ngx_fastdfs_module;
        }

        location / {
            root   html;
            index  index.html index.htm;
        }

        error_page   500 502 503 504  /50x.html;
        location = /50x.html {
            root   html;
        }
    }
```

启动nginx：

```shell
nginx    # 启动nginx

nginx -s stop    # 停止nginx

nginx -s reload    # 重新载入配置文件
```

可通过ps -ef | grep nginx查看nginx是否已启动成功



#### 启动nginx开机自启

创建一个开机启动的脚本：

```shell
vim /usr/lib/systemd/system/nginx.service
```

添加以下内容：

```sh
[Unit]
Description=nginx
After=network.target

[Service]
Type=forking
ExecStart=/usr/bin/nginx
ExecReload=/usr/bin/nginx -s reload
ExecStop=/usr/bin/nginx -s quit
PrivateTmp=true

[Install]
WantedBy=multi-user.target
```

粘贴后注意检查一遍头尾

设置开机启动

```shell
systemctl enable nginx
```

如果提示`Failed to execute operation: Access denied`，执行下面后再重新执行上面

```
systemctl daemon-reexec
```

然后重启系统后，查看是否是运行状态

```shell
service nginx status
```



## Docker安装FastDFS



### 拉取镜像

```linux
docker run -d --restart=always --privileged=true --net=host --name=fastdfs -e IP=47.95.234.255 -e WEB_PORT=80 -v ${HOME}/fastdfs:/var/local/fdfs registry.cn-beijing.aliyuncs.com/tianzuo/fastdfs

```

其中-v ${HOME}/fastdfs:/var/local/fdfs是指：将${HOME}/fastdfs这个目录挂载到容器里的/var/local/fdfs这个目录里。所以上传的文件将被持久化到${HOME}/fastdfs/storage/data里，IP 后面是自己的服务器公网ip或者虚拟机ip，-e WEB_PORT=80 指定nginx端口



### 测试

```linux
docker exec -it fastdfs /bin/bash

echo "Hello FastDFS!">index.html

fdfs_test /etc/fdfs/client.conf upload index.html
```

![](https://img-blog.csdnimg.cn/20200418002424929.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







## Thymeleaf快速上手

简单使用:[https://codekiller.top/2020/03/20/springboot/#toc-heading-47](https://codekiller.top/2020/03/20/springboot/#toc-heading-47)

springboot已经集成了thymeleaf，用到时只需要引入thymeleaf的start即可

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.leyou.demo</groupId>
    <artifactId>thymeleaf-demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>

    <name>thymeleaf-demo</name>
    <description>Demo project for Spring Boot</description>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.0.6.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
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



### 默认配置

不需要做任何配置，启动器已经帮我们把Thymeleaf的视图器配置完成：

![](https://img-blog.csdnimg.cn/20200428191253195.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

而且，还配置了模板文件（html）的位置，与jsp类似的前缀+ 视图名 + 后缀风格：

![](https://img-blog.csdnimg.cn/20200428191316989.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

- 默认前缀：`classpath:/templates/`
- 默认后缀：`.html`

所以如果我们返回视图：`users`，会指向到 `classpath:/templates/users.html`

Thymeleaf默认会开启页面缓存，提高页面并发能力。但会导致我们修改页面不会立即被展现，因此我们关闭缓存：

```properties
# 关闭Thymeleaf的缓存
spring.thymeleaf.cache=false
```

另外，修改完毕页面，需要使用快捷键：`Ctrl + Shift + F9`来刷新工程。



###  快速开始

我们准备一个controller，控制视图跳转：

```java
@Controller
public class HelloController {

    @GetMapping("show1")
    public String show1(Model model){
        model.addAttribute("msg", "Hello, Thymeleaf!");
        return "hello";
    }
}
```

新建一个html模板：

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>hello</title>
</head>
<body>
    <h1 th:text="${msg}">大家好</h1>
</body>
</html>
```

**注意**，把html 的名称空间，改成：`xmlns:th="http://www.thymeleaf.org"` 会有语法提示

启动项目，访问页面：http://localhost:8080/show1

Thymeleaf的主要作用是把model中的数据渲染到html中，因此其语法主要是如何解析model中的数据。从以下方面来学习：

- 变量
- 方法
- 条件判断
- 循环
- 运算
  - 逻辑运算
  - 布尔运算
  - 比较运算
  - 条件运算
- 其它



### 变量

我们先新建一个实体类：User

```java
public class User {
    String name;
    int age;
    User friend;// 对象类型属性
}
```

然后在模型中添加数据

```java
@GetMapping("show2")
public String show2(Model model){
    User user = new User();
    user.setAge(21);
    user.setName("Jack Chen");
    user.setFriend(new User("李小龙", 30));

    model.addAttribute("user", user);
    return "show2";
}
```

> 语法说明：

Thymeleaf通过`${}`来获取model中的变量，注意这不是el表达式，而是ognl表达式，但是语法非常像。

> 示例：

我们在页面获取user数据：

```html
<h1>
    欢迎您：<span th:text="${user.name}">请登录</span>
</h1>
```

效果：

![](https://img-blog.csdnimg.cn/20200428191446552.png)

感觉跟el表达式几乎是一样的。不过区别在于，我们的表达式写在一个名为：`th:text`的标签属性中，这个叫做`指令`



### 动静结合

> 指令：

Thymeleaf崇尚`自然模板`，意思就是模板是纯正的html代码，脱离模板引擎，在纯静态环境也可以直接运行。现在如果我们直接在html中编写 `${}`这样的表达式，显然在静态环境下就会出错，这不符合Thymeleaf的理念。

Thymeleaf中所有的表达式都需要写在`指令`中，指令是HTML5中的自定义属性，在Thymeleaf中所有指令都是以`th:`开头。因为表达式`${user.name}`是写在自定义属性中，因此在静态环境下，表达式的内容会被当做是普通字符串，浏览器会自动忽略这些指令，这样就不会报错了！

现在，我们不经过SpringMVC，而是直接用浏览器打开页面看看：

![](https://img-blog.csdnimg.cn/20200428191510191.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

- 静态页面中，`th`指令不被识别，但是浏览器也不会报错，把它当做一个普通属性处理。这样`span`的默认值`请登录`就会展现在页面
- 如果是在Thymeleaf环境下，`th`指令就会被识别和解析，而`th:text`的含义就是替**换所在标签中的文本内容**，于是`user.name`的值就替代了 `span`中默认的请登录

指令的设计，正是Thymeleaf的高明之处，也是它优于其它模板引擎的原因。动静结合的设计，使得无论是前端开发人员还是后端开发人员可以完美契合。

> 向下兼容

但是要注意，如果浏览器不支持Html5怎么办？

如果不支持这种`th:`的命名空间写法，那么可以把`th:text`换成 `data-th-text`，Thymeleaf也可以兼容。

> escape

另外，`th:text`指令出于安全考虑，会把表达式读取到的值进行处理，防止html的注入。

例如，`你好`将会被格式化输出为`$lt;p$gt;你好$lt;/p$lt;`。

**如果想要不进行格式化输出，而是要输出原始内容，则使用`th:utext`来代替.**



### ongl表达式的语法糖

刚才获取变量值，我们使用的是经典的`对象.属性名`方式。但有些情况下，我们的属性名可能本身也是变量，怎么办？

ognl提供了类似js的语法方式：

例如：`${user.name}` 可以写作`${user['name']}`



### 自定义变量

> 场景

看下面的案例：

```html
<h2>
    <p>Name: <span th:text="${user.name}">Jack</span>.</p>
    <p>Age: <span th:text="${user.age}">21</span>.</p>
    <p>friend: <span th:text="${user.friend.name}">Rose</span>.</p>
</h2>
```

我们获取用户的所有信息，分别展示。

当数据量比较多的时候，频繁的写`user.`就会非常麻烦。

因此，Thymeleaf提供了自定义变量来解决：

> 示例：

```html
<h2 th:object="${user}">
    <p>Name: <span th:text="*{name}">Jack</span>.</p>
    <p>Age: <span th:text="*{age}">21</span>.</p>
    <p>friend: <span th:text="*{friend.name}">Rose</span>.</p>
</h2>
```

- 首先在 `h2`上 用 `th:object="${user}"`获取user的值，并且保存
- 然后，在`h2`内部的任意元素上，可以通过 `*{属性名}`的方式，来获取user中的属性，这样就省去了大量的`user.`前缀了



### 方法

> ognl表达式中的方法调用

ognl表达式本身就支持方法调用，例如：

```html
<h2 th:object="${user}">
    <p>FirstName: <span th:text="*{name.split(' ')[0]}">Jack</span>.</p>
    <p>LastName: <span th:text="*{name.split(' ')[1]}">Li</span>.</p>
</h2>
```

- 这里我们调用了name（是一个字符串）的split方法。



### Thymeleaf的内置对象

Thymeleaf中提供了一些内置对象，并且在这些对象中提供了一些方法，方便我们来调用。获取这些对象，需要使用`#对象名`来引用。

- 一些环境相关对象

| 对象              | 作用                                          |
| ----------------- | --------------------------------------------- |
| `#ctx`            | 获取Thymeleaf自己的Context对象                |
| `#requset`        | 如果是web程序，可以获取HttpServletRequest对象 |
| `#response`       | 如果是web程序，可以获取HttpServletReponse对象 |
| `#session`        | 如果是web程序，可以获取HttpSession对象        |
| `#servletContext` | 如果是web程序，可以获取HttpServletContext对象 |
|                   |                                               |

- Thymeleaf提供的全局对象：

| 对象         | 作用                             |
| ------------ | -------------------------------- |
| `#dates`     | 处理java.util.date的工具对象     |
| `#calendars` | 处理java.util.calendar的工具对象 |
| `#numbers`   | 用来对数字格式化的方法           |
| `#strings`   | 用来处理字符串的方法             |
| `#bools`     | 用来判断布尔值的方法             |
| `#arrays`    | 用来护理数组的方法               |
| `#lists`     | 用来处理List集合的方法           |
| `#sets`      | 用来处理set集合的方法            |
| `#maps`      | 用来处理map集合的方法            |

- 举例

我们在环境变量中添加日期类型对象

```java
@GetMapping("show3")
public String show3(Model model){
    model.addAttribute("today", new Date());
    return "show3";
}
```

在页面中处理

```html
<p>
  今天是: <span th:text="${#dates.format(today,'yyyy-MM-dd')}">2018-04-25</span>
</p>
```

效果：

![](https://img-blog.csdnimg.cn/20200428191701861.png)



### 字面量

有的时候，我们需要在指令中填写基本类型如：字符串、数值、布尔等，并不希望被Thymeleaf解析为变量，这个时候称为字面值。

- 字符串字面值

  使用一对`'`引用的内容就是字符串字面值了：

  ```html
  <p>
    你正在观看 <span th:text="'thymeleaf'">template</span> 的字符串常量值.
  </p>
  ```

  `th:text`中的thymeleaf并不会被认为是变量，而是一个字符串

![](https://img-blog.csdnimg.cn/20200428191738746.png)

数字字面值

数字不需要任何特殊语法， 写的什么就是什么，而且可以直接进行算术运算

```html
<p>今年是 <span th:text="2018">1900</span>.</p>
<p>两年后将会是 <span th:text="2018 + 2">1902</span>.</p>
```

![](https://img-blog.csdnimg.cn/20200428191756587.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

- 布尔字面值

  布尔类型的字面值是true或false：

  ```html
  <div th:if="true">
      你填的是true
  </div>
  ```

  这里引用了一个`th:if`指令，跟vue中的`v-if`类似

### [拼接](https://cloudlandboy.github.io/myNote/#/project/leyoumall/Introduction/thymeleaf-quick-start?id=拼接)

我们经常会用到普通字符串与表达式拼接的情况：

```html
<span th:text="'欢迎您:' + ${user.name} + '!'"></span>
```

字符串字面值需要用`''`，拼接起来非常麻烦，Thymeleaf对此进行了简化，使用一对`|`即可：

```html
<span th:text="|欢迎您:${user.name}|"></span>
```

与上面是完全等效的，这样就省去了字符串字面值的书写。

![](https://img-blog.csdnimg.cn/20200428191814680.png)



### 运算

需要注意：`${}`内部的是通过OGNL表达式引擎解析的，外部的才是通过Thymeleaf的引擎解析，因此运算符尽量放在`${}`外进行。

- 算术运算

  支持的算术运算符：`+ - * / %`

  ```html
  <span th:text="${user.age}"></span>
  <span th:text="${user.age}%2 == 0"></span>
  ```

![](https://img-blog.csdnimg.cn/20200428191842436.png)

- 比较运算

  支持的比较运算：`>`, `<`, `>=` and `<=` ，但是`>`, `<`不能直接使用，因为xml会解析为标签，要使用别名。

  注意 `==` and `!=`不仅可以比较数值，类似于equals的功能。

  可以使用的别名：`gt (>), lt (<), ge (>=), le (<=), not (!). Also eq (==), neq/ne (!=).`

- 条件运算

  - 三元运算

  ```html
  <span th:text="${user.sex} ? '男':'女'"></span>
  ```

  三元运算符的三个部分：conditon ? then : else

  ```
  condition：条件
  
  then：条件成立的结果
  
  else：不成立的结果
  ```

  其中的每一个部分都可以是Thymeleaf中的任意表达式。

![](https://img-blog.csdnimg.cn/20200428191858192.png)

- 默认值

  有的时候，我们取一个值可能为空，这个时候需要做非空判断，可以使用 `表达式 ?: 默认值`简写：

```html
<span th:text="${user.name} ?: '二狗'"></span>
```

当前面的表达式值为null时，就会使用后面的默认值。

注意：`?:`之间没有空格。

![](https://img-blog.csdnimg.cn/20200428191914149.png)





### 循环

循环也是非常频繁使用的需求，我们使用`th:each`指令来完成：

假如有用户的集合：users在Context中。

```html
<tr th:each="user : ${users}"> 
    <td th:text="${user.name}">Onions</td>
    <td th:text="${user.age}">2.41</td>
</tr>
```

- ${users} 是要遍历的集合，可以是以下类型：
  - Iterable，实现了Iterable接口的类
  - Enumeration，枚举
  - Interator，迭代器
  - Map，遍历得到的是Map.Entry
  - Array，数组及其它一切符合数组结果的对象

在迭代的同时，我们也可以获取迭代的状态对象：

```html
<tr th:each="user,stat : ${users}">
    <td th:text="${user.name}">Onions</td>
    <td th:text="${user.age}">2.41</td>
</tr>
```

stat对象包含以下属性：

- index，从0开始的角标
- count，元素的个数，从1开始
- size，总元素个数
- current，当前遍历到的元素
- even/odd，返回是否为奇偶，boolean值
- first/last，返回是否为第一或最后，boolean值



### 逻辑判断

有了`if和else`，我们能实现一切功能^_^。

Thymeleaf中使用`th:if` 或者 `th:unless` ，两者的意思恰好相反。

```html
<span th:if="${user.age} < 24">小鲜肉</span>
```

如果表达式的值为true，则标签会渲染到页面，否则不进行渲染。

以下情况被认定为true：

- 表达式值为true
- 表达式值为非0数值
- 表达式值为非0字符
- 表达式值为字符串，但不是`"false"`,`"no"`,`"off"`
- 表达式不是布尔、字符串、数字、字符中的任何一种

其它情况包括null都被认定为false

![](https://img-blog.csdnimg.cn/20200428191946911.png)



### 分支控制switch

这里要使用两个指令：`th:switch` 和 `th:case`

```html
<div th:switch="${user.role}">
  <p th:case="'admin'">用户是管理员</p>
  <p th:case="'manager'">用户是经理</p>
  <p th:case="*">用户是别的玩意</p>
</div>
```

需要注意的是，一旦有一个th:case成立，其它的则不再判断。与java中的switch是一样的。

另外`th:case="*"`表示默认，放最后。

![](https://img-blog.csdnimg.cn/20200428192016187.png)

页面：

![](https://img-blog.csdnimg.cn/20200428192033567.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### JS模板

模板引擎不仅可以渲染html，也可以对JS中的进行预处理。而且为了在纯静态环境下可以运行，其Thymeleaf代码可以被注释起来：

```html
<script th:inline="javascript">
    const user = /*[[${user}]]*/ {};
    const age = /*[[${user.age}]]*/ 20;
    console.log(user);
    console.log(age)
</script>
```

- 在script标签中通过`th:inline="javascript"`来声明这是要特殊处理的js脚本

- 语法结构：

  ```js
  const user = /*[[Thymeleaf表达式]]*/ "静态环境下的默认值";
  ```

  因为Thymeleaf被注释起来，因此即便是静态环境下， js代码也不会报错，而是采用表达式后面跟着的默认值。

看看页面的源码：

![](https://img-blog.csdnimg.cn/20200428192058752.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

我们的User对象被直接处理为json格式了，非常方便。

控制台：

![](https://img-blog.csdnimg.cn/20200428192114938.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





## RabbitMQ的安装

### Windows下安装

没有实操，未知是否可行

#### 安装Erlang

下载：http://www.erlang.org/download/otp_win64_17.3.exe

安装：

![](https://img-blog.csdnimg.cn/20200430174505180.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200430174553303.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/202004301746045.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/2020043017461853.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

安装完成。

如果出现：

![](https://img-blog.csdnimg.cn/20200430174638926.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

请选择忽略。

#### RabbitMQ安装

![](https://img-blog.csdnimg.cn/20200430174712436.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



![](https://img-blog.csdnimg.cn/20200430174721959.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200430174731673.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



安装完成。

启动、停止、重新安装等。

按下win + R 然后运行命令：services.msc

![](https://img-blog.csdnimg.cn/20200430174750325.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





查看RabbitMQ服务有没有启动：

![](https://img-blog.csdnimg.cn/20200430174805395.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 安装的注意事项

**1）推荐使用默认的安装路径**

**2）系统用户名必须是英文**

可以查看下用户目录：

![](https://img-blog.csdnimg.cn/20200430174836111.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

也可以在桌面打开cmd查看路径：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200430174856706.png)



3）计算机名必须是英文

![](https://img-blog.csdnimg.cn/20200430175002617.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

**4）系统的用户必须是管理员**



#### 启动管理工具

![](https://img-blog.csdnimg.cn/20200430175038363.png)

1、 点击![img](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/rabbitmq/clip_image016.png)

2、 输入命令：



![](https://img-blog.csdnimg.cn/20200430175104150.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

3、 在浏览器中输入地址查看：http://127.0.0.1:15672/

![img](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/rabbitmq/clip_image018.png)

4、 使用默认账号登录：guest/ guest



#### 安装失败解决方案

如果安装失败的同学应该如何解决：

l **重装系统**

-- 不推荐

l **将RabbitMQ安装到linux虚拟机中**

-- 推荐

l **使用别人安装好的RabbitMQ服务**

a) 只要给你开通一个账户即可。

b) 使用公用的RabbitMQ服务，在192.168.50.22

-- 推荐



### Linux下安装

首先创建一个文件夹，我这里放在`/usr/local/leyou/rabbitmq`

```
cd /usr/local/leyou/
mkdir rabbitmq
```



#### 安装erlang

下载地址：https://github.com/rabbitmq/erlang-rpm/releases（RabbitMQ团队精简的软件包）

我这是下载的是：https://github.com/rabbitmq/erlang-rpm/releases/download/v22.2/erlang-22.2-1.el7.x86_64.rpm（安装环境centos7）

关于rabbitmq版本策略参考：https://www.rabbitmq.com/which-erlang.html

下载完成后上传到开始创建的文件夹下

> 安装

```shell
rpm -ivh erlang-22.2-1.el7.x86_64.rpm
```

![](https://img-blog.csdnimg.cn/20200430175224302.png)



#### 安装RabbitMQ

RabbitMQ：[rabbitmq-server-3.8.1-1.el7.noarch.rpm](https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.1/rabbitmq-server-3.8.1-1.el7.noarch.rpm)

上传后安装：

```
rpm -ivh rabbitmq-server-3.8.1-1.el7.noarch.rpm
```

提示缺少依赖

![](https://img-blog.csdnimg.cn/20200430175336920.png)

```shell
yum install socat
```

然后再安装

![](https://img-blog.csdnimg.cn/20200430175355952.png)



#### 启动，停止

```
service rabbitmq-server start

service rabbitmq-server stop

service rabbitmq-server restart
```



#### 开启web界面管理工具

```
rabbitmq-plugins enable rabbitmq_management

service rabbitmq-server restart
```

![](https://img-blog.csdnimg.cn/20200430175442111.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 设置开机启动

```
chkconfig rabbitmq-server on
```



#### 防火墙开放15672端口

查看防火墙状态（直接关闭防火墙方便一点）

```shell
service firewalld status

# 如果没有关闭则关闭防火墙
systemctl stop firewalld.service
#设置开机不启动防火墙
systemctl disable firewalld.service
```





### Docker下安装

#### 查看镜像

进入docker hub镜像仓库地址：https://registry.hub.docker.com/_/rabbitmq/\

可以看到以下几种类型的镜像；我们选择带有“mangement”的版本（**包含web管理页面**）；

![](https://img-blog.csdnimg.cn/20200430182530197.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



#### 拉取镜像

```she
docker pull rabbitmq:3.8.3-management
```

使用：docker images 查看所有镜像

![](https://img-blog.csdnimg.cn/2020043018293317.png)



#### 根据下载的镜像创建和启动容器

```shell
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 -v `pwd`/data:/var/lib/rabbitmq --hostname myRabbit -e RABBITMQ_DEFAULT_VHOST=my_vhost  -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=admin fa535c4b51fe 
```

说明：

-d 后台运行容器；

--name 指定容器名；

-p 指定服务运行的端口（5672：应用访问端口；15672：控制台Web端口号）；

-v 映射目录或文件；

--hostname  主机名（RabbitMQ的一个重要注意事项是它根据所谓的 “节点名称” 存储数据，默认为主机名）；

-e 指定环境变量；（RABBITMQ_DEFAULT_VHOST：默认虚拟机名；RABBITMQ_DEFAULT_USER：默认的用户名；RABBITMQ_DEFAULT_PASS：默认用户名的密码）



#### 使用命令：docker ps 查看正在运行容器

![](https://img-blog.csdnimg.cn/20200430183629355.png)



#### 开启防火墙15672端口

```shell
firewall-cmd --zone=public --add-port=15672/tcp --permanent
```

其他命令：

```shell
firewall-cmd --reload  #重新加载
firewall-cmd --zone=public --query-port=22/tcp #查询是否生效
firewall-cmd --zone=public --remove-port=22/tcp --permanent  #限制端口
firewall-cmd --zone=public --list-ports #查看端口
```





### 管理界面

访问：http://虚拟机ip:15672

登录用户名和密码都是`guest`

提示只能本地连接，那我们就开启远程连接

####配置文件

启动RabbitMQ后，会在 /var/log/rabbitmq 目录下生成运行日志，在日志的最上方，我们可以看到配置文件的信息：

```shell
cat  /var/log/rabbitmq/rabbit@localhost.log 
```

![](https://img-blog.csdnimg.cn/20200430175612417.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

这里显示没有配置文件

我们手动创建配置文件

```shell
vim /etc/rabbitmq/rabbitmq.conf
```

开启远程访问

```
loopback_users = none
```

然后重启rabbitmq

其他配置参考：https://www.rabbitmq.com/configure.html#config-file-formats

![](https://img-blog.csdnimg.cn/20200430175634134.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://cdn.static.note.zzrfdsn.cn/images/project/leyoumall/rabbitmq/clip_image010-1533941272259.png)

connections：无论生产者还是消费者，都需要与RabbitMQ建立连接后才可以完成消息的生产和消费，在这里可以查看连接情况

channels：通道，建立连接后，会形成通道，消息的投递获取依赖通道。

Exchanges：交换机，用来实现消息的路由

Queues：队列，即消息队列，消息存放在队列中，等待消费，消费后被移除队列。

端口：

5672: rabbitMq的编程语言客户端连接端口

15672：rabbitMq管理界面端口

25672：rabbitMq集群的端口



### 添加用户

如果不使用guest，我们也可以自己创建一个用户：

![](https://img-blog.csdnimg.cn/20200430175733918.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

1、 超级管理员(administrator)

可登陆管理控制台，可查看所有的信息，并且可以对用户，策略(policy)进行操作。

2、 监控者(monitoring)

可登陆管理控制台，同时可以查看rabbitmq节点的相关信息(进程数，内存使用情况，磁盘使用情况等)

3、 策略制定者(policymaker)

可登陆管理控制台, 同时可以对policy进行管理。但无法查看节点的相关信息(上图红框标识的部分)。

4、 普通管理者(management)

仅可登陆管理控制台，无法看到节点信息，也无法对策略进行管理。

5、 其他

无法登陆管理控制台，通常就是普通的生产者和消费者。



### 创建Virtual Hosts

虚拟主机：类似于mysql中的database。他们都是以“/”开头

![](https://img-blog.csdnimg.cn/20200430175822227.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)





### 设置权限

![](https://img-blog.csdnimg.cn/2020043017583884.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20200430175904971.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)



> .*代表所有权限



![](https://img-blog.csdnimg.cn/20200430175920768.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ0NzY2ODgz,size_16,color_FFFFFF,t_70)







## 用户中心接口说明

### 数据校验

####功能说明

实现用户数据的校验，主要包括对：手机号、用户名的唯一性校验。



#### 接口路径

```
GET /check/{data}/{type}
```



#### 参数说明

| 参数 | 说明                                   | 是否必须 | 数据类型 | 默认值 |
| ---- | -------------------------------------- | -------- | -------- | ------ |
| data | 要校验的数据                           | 是       | String   | 无     |
| type | 要校验的数据类型：1，用户名；2，手机； | 否       | Integer  | 无     |



####返回结果

返回布尔类型结果：

- true：可用
- false：不可用

状态码：

- 200：校验成功
- 400：参数有误
- 500：服务器内部异常



###生成短信验证码

#### 功能说明

根据用户输入的手机号，生成随机验证码，长度为6位，纯数字。并且调用短信服务，发送验证码到用户手机。



#### 接口路径

```
POST /code
```



#### 参数说明

| 参数  | 说明           | 是否必须 | 数据类型 | 默认值 |
| ----- | -------------- | -------- | -------- | ------ |
| phone | 用户的手机号码 | 是       | String   | 无     |



#### 返回结果

无

状态码：

- 204：请求已接收
- 400：参数有误
- 500：服务器内部异常



### 用户注册

#### 功能说明

实现用户注册功能，需要对用户密码进行加密存储，使用MD5加密，加密过程中使用随机码作为salt加盐。另外还需要对用户输入的短信验证码进行校验。



####接口路径

```
POST /register
```



#### 参数说明

form表单格式

| 参数     | 说明                                     | 是否必须 | 数据类型 | 默认值 |
| -------- | ---------------------------------------- | -------- | -------- | ------ |
| username | 用户名，格式为4~30位字母、数字、下划线   | 是       | String   | 无     |
| password | 用户密码，格式为4~30位字母、数字、下划线 | 是       | String   | 无     |
| phone    | 手机号码                                 | 是       | String   | 无     |
| code     | 短信验证码                               | 是       | String   | 无     |



#### 返回结果

无返回值。

状态码：

- 201：注册成功
- 400：参数有误，注册失败
- 500：服务器内部异常，注册失败



### 根据用户名和密码查询用户

#### 功能说明

查询功能，根据参数中的用户名和密码查询指定用户



#### 接口路径

```
GET /query
```



#### 参数说明

form表单格式

| 参数     | 说明                                     | 是否必须 | 数据类型 | 默认值 |
| -------- | ---------------------------------------- | -------- | -------- | ------ |
| username | 用户名，格式为4~30位字母、数字、下划线   | 是       | String   | 无     |
| password | 用户密码，格式为4~30位字母、数字、下划线 | 是       | String   | 无     |



####返回结果

用户的json格式数据

```json
{
    "id": 6572312,
    "username":"test",
    "phone":"13688886666",
    "created": 1342432424
}
```

状态码：

- 200：返回查询数据
- 400：用户名或密码错误
- 500：服务器内部异常，查询失败



###查询用户物流地址

待开发

### 新增用户物流系统

待开发

### 修改用户物流系统

待开发

###删除用户物流系统

待开发

### 修改地址为默认地址