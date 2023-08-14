# Code极速开发平台
本系统采用微服务架构设计，在分布式环境下利用SpringCloud框架，通过业务划分，设计独立模块的微服务，拆分为代码生成服务，订单服务，支付服务，用户管理服务。

## 技术栈
SpringCloudAlibaba ，SpringBoot，Mybatis，Redis，SpringSecruity

### 项目亮点
( 1 ) 基于FreeMaker模板实现代码生成服务，根据数据库内容生成指定框架增删查改的后端代码；

( 2 ) 使用OAuth进行Gitee第三方登录，使用SpringSecruity进行基本登录的认证和授权；

( 3 ) 调用支付宝提供的SDK并进行对应的处理来实现支付服务；

( 4 ) 使用Gateway进行微服务的网关配置，并进行微服务的JWT鉴权和处理跨域请求；

( 5 ) 使用Nacos实现微服务的 注册中心和配置中心，让微服务的发现、管理、共享、组合更加容易；

( 6 ) 使用统一全局异常处理及统一结果返回，易于代码维护；

( 7 ) 使用Sentinel实现微服务的服务熔断、降级，使用OpenFeign进行微服务调用，使用Ribbon实现微服务的负载均衡。

### 项目结构
```
├─autoNewCode
│  ├─.mvn
│  │  └─wrapper
│  ├─properties
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─autonewcode
│  │  │  │              ├─pojo
│  │  │  │              ├─test
│  │  │  │              └─utils
│  │  │  └─resources
│  │  │      ├─static
│  │  │      ├─templates
│  │  │      ├─工具包
│  │  │      │  └─utils
│  │  │      ├─模板
│  │  │      │  └─${path1}
│  │  │      │      └─${path2}
│  │  │      │          └─${path3}
│  │  │      │              ├─${controllerName}
│  │  │      │              ├─${daoName}
│  │  │      │              ├─${pojoName}
│  │  │      │              └─${serviceName}
│  │  │      │                  └─${serviceImplName}
│  │  │      ├─模板（无统一全局异常处理）
│  │  │      │  └─${path1}
│  │  │      │      └─${path2}
│  │  │      │          └─${path3}
│  │  │      │              ├─${controllerName}
│  │  │      │              ├─${daoName}
│  │  │      │              ├─${pojoName}
│  │  │      │              └─${serviceName}
│  │  │      │                  └─${serviceImplName}
│  │  │      └─模板（未处理完）
│  │  │          └─${path1}
│  │  │              └─${path2}
│  │  │                  └─${path3}
│  │  │                      ├─${controllerName}
│  │  │                      ├─${daoName}
│  │  │                      ├─${pojoName}
│  │  │                      └─${serviceName}
│  │  │                          └─${serviceImplName}
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─autonewcode
│  └─target
│      ├─classes
│      │  ├─com
│      │  │  └─example
│      │  │      └─autonewcode
│      │  │          ├─pojo
│      │  │          ├─test
│      │  │          └─utils
│      │  ├─工具包
│      │  │  └─utils
│      │  ├─模板
│      │  │  └─${path1}
│      │  │      └─${path2}
│      │  │          └─${path3}
│      │  │              └─${controllerName}
│      │  ├─模板（无统一全局异常处理）
│      │  │  └─${path1}
│      │  │      └─${path2}
│      │  │          └─${path3}
│      │  │              ├─${controllerName}
│      │  │              ├─${daoName}
│      │  │              ├─${pojoName}
│      │  │              └─${serviceName}
│      │  │                  └─${serviceImplName}
│      │  └─模板（未处理完）
│      │      └─${path1}
│      │          └─${path2}
│      │              └─${path3}
│      │                  ├─${controllerName}
│      │                  ├─${daoName}
│      │                  ├─${pojoName}
│      │                  └─${serviceName}
│      │                      └─${serviceImplName}
│      ├─com
│      │  └─example
│      │      └─mycloudmember
│      │          └─controller
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      └─test-classes
│          ├─com
│          │  └─example
│          │      └─autonewcode
│          └─模板
│              └─${path1}
│                  └─${path2}
│                      └─${path3}
│                          ├─${controllerName}
│                          ├─${daoName}
│                          ├─${pojoName}
│                          └─${serviceName}
│                              └─${serviceImplName}
├─mycloud-auth
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudauth
│  │  │  │              ├─controller
│  │  │  │              ├─dao
│  │  │  │              ├─exception
│  │  │  │              ├─pojo
│  │  │  │              └─service
│  │  │  │                  └─serviceImpl
│  │  │  └─resources
│  │  │      ├─META-INF
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudauth
│  └─target
│      ├─classes
│      │  ├─com
│      │  │  └─example
│      │  │      └─mycloudauth
│      │  │          ├─controller
│      │  │          ├─dao
│      │  │          ├─exception
│      │  │          ├─pojo
│      │  │          └─service
│      │  │              └─serviceImpl
│      │  └─META-INF
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      ├─maven-archiver
│      ├─maven-status
│      │  └─maven-compiler-plugin
│      │      ├─compile
│      │      │  └─default-compile
│      │      └─testCompile
│      │          └─default-testCompile
│      ├─mycloud-auth-0.0.1-SNAPSHOT
│      │  ├─META-INF
│      │  └─WEB-INF
│      │      ├─classes
│      │      │  └─com
│      │      │      └─example
│      │      │          └─mycloudauth
│      │      │              ├─controller
│      │      │              ├─dao
│      │      │              ├─pojo
│      │      │              └─service
│      │      │                  └─serviceImpl
│      │      └─lib
│      └─test-classes
│          └─com
│              └─example
│                  └─mycloudauth
├─mycloud-common
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─mycloudcommon
│  │  │  │      ├─exception
│  │  │  │      └─utils
│  │  │  └─resources
│  │  └─test
│  │      └─java
│  └─target
│      ├─generated-sources
│      │  └─annotations
│      ├─maven-archiver
│      └─maven-status
│          └─maven-compiler-plugin
│              ├─compile
│              │  └─default-compile
│              └─testCompile
│                  └─default-testCompile
├─mycloud-coupon
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudcoupon
│  │  │  │              ├─controller
│  │  │  │              ├─dao
│  │  │  │              ├─exception
│  │  │  │              ├─pojo
│  │  │  │              ├─service
│  │  │  │              │  └─serviceImpl
│  │  │  │              └─test
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudcoupon
│  └─target
│      ├─classes
│      │  └─com
│      │      └─example
│      │          └─mycloudcoupon
│      │              ├─controller
│      │              ├─dao
│      │              ├─exception
│      │              ├─pojo
│      │              ├─service
│      │              │  └─serviceImpl
│      │              └─test
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      └─test-classes
│          └─com
│              └─example
│                  └─mycloudcoupon
├─mycloud-gateway
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudgateway
│  │  │  │              ├─config
│  │  │  │              └─filter
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudgateway
│  └─target
│      ├─classes
│      │  └─com
│      │      └─example
│      │          └─mycloudgateway
│      │              ├─config
│      │              └─filter
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      └─test-classes
│          └─com
│              └─example
│                  └─mycloudgateway
├─mycloud-menber
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudmember
│  │  │  │              ├─controller
│  │  │  │              ├─dao
│  │  │  │              ├─feign
│  │  │  │              ├─pojo
│  │  │  │              └─service
│  │  │  │                  └─serviceImpl
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudmember
│  └─target
│      ├─classes
│      │  └─com
│      │      └─example
│      │          └─mycloudmember
│      │              ├─controller
│      │              ├─dao
│      │              ├─feign
│      │              ├─pojo
│      │              └─service
│      │                  └─serviceImpl
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      └─test-classes
│          └─com
│              └─example
│                  └─mycloudmember
├─mycloud-order
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudorder
│  │  │  │              ├─config
│  │  │  │              ├─controller
│  │  │  │              ├─dao
│  │  │  │              ├─pojo
│  │  │  │              └─service
│  │  │  │                  └─serviceImpl
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudorder
│  └─target
│      └─classes
├─mycloud-seckill
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudseckill
│  │  │  │              ├─schedule
│  │  │  │              └─service
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudseckill
│  └─target
│      ├─classes
│      │  └─com
│      │      └─example
│      │          └─mycloudseckill
│      │              └─schedule
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      └─test-classes
│          └─com
│              └─example
│                  └─mycloudseckill
├─mycloud-sso-clientA
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudssoclienta
│  │  │  │              └─controller
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudssoclienta
│  └─target
│      └─classes
├─mycloud-sso-clientB
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudssoclientb
│  │  │  │              └─controller
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudssoclientb
│  └─target
│      └─classes
├─mycloud-sso-server
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudssoserver
│  │  │  │              └─controller
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudssoserver
│  └─target
│      └─classes
├─mycloud-third-party
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─mycloudthirdparty
│  │  │  │              ├─component
│  │  │  │              └─controller
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─mycloudthirdparty
│  └─target
│      └─classes
├─payment
│  ├─.mvn
│  │  └─wrapper
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─example
│  │  │  │          └─payment
│  │  │  └─resources
│  │  │      ├─static
│  │  │      └─templates
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─example
│  │                  └─payment
│  └─target
│      └─classes
├─src
│  └─main
│      ├─java
│      │  └─com
│      │      └─example
│      │          └─mycloud
│      │              └─controller
│      └─resources
│          ├─static
│          └─templates
└─target
    ├─classes
    │  ├─com
    │  │  └─example
    │  │      └─mycloud
    │  │          └─controller
    │  └─mycloudcommon
    │      ├─exception
    │      └─utils
    └─generated-sources
        └─annotations

```




