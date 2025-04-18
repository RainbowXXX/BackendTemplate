项目结构大致如下：
```text
rainblog
├── build.gradle                  # Gradle 构建脚本，定义项目的依赖、插件和构建任务
├── settings.gradle               # Gradle 项目设置文件，配置项目名称和子项目
├── gradle/
│   ├── wrapper/
│   │   ├── gradle-wrapper.jar   # Gradle Wrapper JAR 文件
│   │   └── gradle-wrapper.properties  # Gradle Wrapper 配置文件
│   ├── gradlew                  # Unix 系统下的 Gradle Wrapper 脚本
│   └── gradlew.bat              # Windows 系统下的 Gradle Wrapper 脚本
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── site/
│   │   │       └── rainbowx/
│   │   │           └── rainblog/
│   │   │               ├── config/                   # 配置类，如 Spring Security 配置、Session 配置等
│   │   │               ├── controller/               # 控制器层，处理 HTTP 请求
│   │   │               ├── service/                  # 业务逻辑层
│   │   │               │   ├── impl/                 # 业务逻辑实现
│   │   │               │   └── interfaces/           # 业务逻辑接口
│   │   │               ├── repository/               # 数据访问层，使用 Spring Data JPA 的 Repository 接口
│   │   │               ├── entity/                   # 实体类，与数据库表进行映射
│   │   │               ├── dto/                      # 数据传输对象，用于服务层与前端之间的数据传输
│   │   │               ├── exception/                # 异常处理类
│   │   │               ├── util/                     # 工具类
│   │   │               └── RainblogApplication.java  # 项目启动类
│   │   └── resources/
│   │       ├── application.properties    # 应用配置文件
│   │       ├── static/                   # 静态资源，如 JS、CSS、图片等
│   │       └── templates/                # 模板文件，如 Thymeleaf 模板
│   └── test/
│       └── java/
│           └── site/
│               └── rainbowx/
│                   └── RainblogApplicationTests.java  # 测试类
└── gradle-wrapper.jar            # Gradle Wrapper JAR 文件
└── gradle-wrapper.properties     # Gradle Wrapper 配置文件
└── gradlew                       # Unix 系统下的 Gradle Wrapper 脚本
└── gradlew.bat                   # Windows 系统下的 Gradle Wrapper 脚本
└── build.gradle                  # Gradle 构建脚本
└── settings.gradle               # Gradle 项目设置文件
└── README.md

```
