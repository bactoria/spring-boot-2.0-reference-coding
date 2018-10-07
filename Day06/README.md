# Day 06. 배너 그리고 SpringApplication

**`Spring Boot Reference v2.0.2 ( 23 ~ 23.5 )`**

&nbsp;

## 23. SpringApplication

```java
@SpringBootApplication
public class Day06Controller {
  public static void main(String[] args) {
  	SpringApplication.run(MySpringConfiguration.class, args);
  }
}

```

&nbsp;

기본적으로 **INFO** 레벨의 로그 메시지가 출력된다.

```bash
13:19:19.381 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
13:19:19.388 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/, /spring-boot/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter/target/classes/]
13:19:19.388 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/bactoria/Desktop/spring-boot-2.0-reference-coding/project/target/classes/]
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.2.RELEASE)


...생략

2018-06-09 13:01:47.777  INFO 2820 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2018-06-09 13:01:47.874  INFO 2820 --- [  restartedMain] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-06-09 13:01:48.097  INFO 2820 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-06-09 13:01:48.107  INFO 2820 --- [  restartedMain] m.b.project.Day06.Day06Controller        : Started Day06Controller in 9.788 seconds (JVM running for 13.45)
```

&nbsp;

### (26.4 Log Levels)

* TRACE
* DEBUG
* INFO
* WARN
* ERROR
* FATAL
* OFF

#### Log Level 변경하기

`application.properties`를 사용한다면

`logging.level.<logger-name> = <level>` 라고 적으면 된다.

&nbsp;

**application.properties**

```properties
logging.level.root=warn
```

&nbsp;

**Day06Controller.java**

```java
@SpringBootApplication
public class Day06Controller {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Day06Controller.class)
                .properties("spring.config.location=classpath:day06Application.properties")
                .run();
    }
}
```

&nbsp;

**실행**

```
13:19:19.381 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
13:19:19.388 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/, /spring-boot/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter/target/classes/]
13:19:19.388 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/bactoria/Desktop/spring-boot-2.0-reference-coding/project/target/classes/]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.2.RELEASE)

```

로깅 레벨을 **WARN** 로 했기 때문에 위에서 뜨던 **INFO** 메시지는 뜨지 않는다.

배너 위의 메시지는 devtools의 로깅메시지다.

&nbsp;
&nbsp;

#### 응용

기본으로 WARN 메시지만 출력하지만,
org.springframework.web 과 관련된 것은 디버깅모드로 로깅하고 싶다면

&nbsp;

**application.properties**

```properties
logging.level.root=WARN
logging.level.org.springframework.web=DEBUG
```

&nbsp;

**결과 생략**

&nbsp;
&nbsp;

### FailureAnalyzers

application 실행이 잘못된다면 **FailureAnalyzers** 가 특정한 에러메시지와, 해결책을 제시해줄 것이다.

**8080 포트를 쓰는 웹App을 두개 켜보자.**

**결과**

```
***************************
APPLICATION FAILED TO START
***************************

Description:

The Tomcat connector configured to listen on port 8080 failed to start. The port may already be in use or the connector may be misconfigured.

Action:

Verify the connector's configuration, identify and stop any process that's listening on port 8080, or configure this application to listen on another port.


Process finished with exit code 0
```

&nbsp;

스프링부트는 여러가지 FailureAnalyzer를 제공해주는데, **직접 추가** 할 수도 있다. (reference 73.1)

FailureAnalyzer 가 제공해주지 않는다면 args에 `--debug` 주어서 도움을 받아라

```
java -jar myproject-0.0.1-SNAPSHOT.jar --debug
```

&nbsp;
&nbsp;

### 배너

```
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::        (v2.0.2.RELEASE)
```

배너는 내가 바꿀 수도 있다.

&nbsp;

**텍스트**

파일명 : `banner.txt`
경로설정 : `spring.banner.location`
인코딩 : `spring.banner.charset`

&nbsp;

**이미지**
파일명 :  `banner.gif`
경로설정 : `spring.banner.image.location`

&nbsp;

banner.txt 에 다음과같은 placeholder들을 사용할 수 있다.

| Variable | Description     |
| :------------- | :------------- |
| ${application.version}       | MANIFEST.MF 에 있는 Application version 을 갖고온다. `1.0`|
| ${application.formatted-version}  | `(v1.0)`  |
| ${spring-boot.version}   | `2.0.2.RELEASE`  |
| ${spring-boot.formatted-version}   | `(v2.0.2.RELEASE)`  |
| \${Ansi.NAME}, \${AnsiBackground.NAME}, \${AnsiStyle.Name} |  Ansi 사용 |
| ${application.title}   |MANIFEST.MF 에 있는 Application title을 갖고온다. |

&nbsp;

[배너 제작해주는 사이트](http://patorjk.com/software/taag)

&nbsp;

#### 배너 등록1

**banner.txt**
```

 ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄   ▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄
▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░▌       ▐░▌ ▐░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌
▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█░█▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀▀█░█▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀  ▀▀▀▀█░█▀▀▀▀
▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌▐░▌    ▐░▌▐░▌               ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌      ▐░▌    ▐░▌          ▐░▌               ▐░▌
▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄▄▄      ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌      ▐░▌    ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌               ▐░▌
▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌      ▐░▌    ▐░░░░░░░░░░░▌▐░▌               ▐░▌
▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌      ▐░▌    ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌               ▐░▌
▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌    ▐░▌▐░▌▐░▌       ▐░▌     ▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌      ▐░▌    ▐░▌          ▐░▌               ▐░▌
▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌     ▐░▌     ▐░█▄▄▄▄▄█░█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌          ▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌ ▄▄▄▄▄█░▌    ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄      ▐░▌
▐░░░░░░░░░░▌ ▐░▌       ▐░▌     ▐░▌      ▐░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░▌          ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░▌    ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌
 ▀▀▀▀▀▀▀▀▀▀   ▀         ▀       ▀        ▀▀▀▀▀▀▀▀▀   ▀▀▀▀▀▀▀▀▀▀▀       ▀            ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀      ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀
 Spring Boot Version: ${spring-boot.formatted-version}
 Application Version: ${application.formatted-version}

```

&nbsp;

**결과**

```
14:08:20.498 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
14:08:20.505 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/, /spring-boot/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter/target/classes/]
14:08:20.505 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/bactoria/Desktop/spring-boot-2.0-reference-coding/project/target/classes/]
2018-06-09 14:08:21.051 DEBUG 2192 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'configurationProperties' with highest search precedence

 ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄   ▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄
▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░▌       ▐░▌ ▐░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌
▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█░█▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀▀█░█▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀  ▀▀▀▀█░█▀▀▀▀
▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌▐░▌    ▐░▌▐░▌               ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌      ▐░▌    ▐░▌          ▐░▌               ▐░▌
▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄▄▄      ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌      ▐░▌    ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌               ▐░▌
▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌      ▐░▌    ▐░░░░░░░░░░░▌▐░▌               ▐░▌
▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀ ▐░▌       ▐░▌      ▐░▌    ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌               ▐░▌
▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌    ▐░▌▐░▌▐░▌       ▐░▌     ▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌      ▐░▌    ▐░▌          ▐░▌               ▐░▌
▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌     ▐░▌     ▐░█▄▄▄▄▄█░█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌          ▐░▌      ▐░▌ ▐░█▄▄▄▄▄▄▄█░▌ ▄▄▄▄▄█░▌    ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄      ▐░▌
▐░░░░░░░░░░▌ ▐░▌       ▐░▌     ▐░▌      ▐░░░░░░░░░▌ ▐░░░░░░░░░░░▌     ▐░▌          ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░▌    ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌
 ▀▀▀▀▀▀▀▀▀▀   ▀         ▀       ▀        ▀▀▀▀▀▀▀▀▀   ▀▀▀▀▀▀▀▀▀▀▀       ▀            ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀      ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀
 Spring Boot Version:  (v2.0.2.RELEASE)
 Application Version:

2018-06-09 14:08:21.201 DEBUG 2192 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'servletConfigInitParams' with lowest search precedence
2018-06-09 14:08:21.202 DEBUG 2192 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'servletContextInitParams' with lowest search precedence

... 생략
```

Application Version 이 안찍힌다.

MANIFEST.MF 에서 가지고 오는데,

패키징을 해야하기 때문.

프로덕션에서는 제대로 출력될것임.

version과 title은 `pom.xml` 에서 설정할 수 있다.

&nbsp;

#### 배너 등록2

**myBanner.class**

```java
public class myBanner implements Banner {

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println("This is my project banner");
    }
}
```

&nbsp;

**Day06Controller.java**

```java
@SpringBootApplication
public class Day06Controller {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Day06Controller.class)
                .banner(new myBanner())
                .run();
    }
}
```

&nbsp;

**결과**

```
14:59:14.539 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
14:59:14.548 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/, /spring-boot/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter/target/classes/]
14:59:14.549 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/bactoria/Desktop/spring-boot-2.0-reference-coding/project/target/classes/]
This is my project banner
2018-06-09 14:59:15.644  INFO 1220 --- [  restartedMain] m.b.project.day06.Day06Controller        : Starting Day06Controller on DESKTOP-M9H337G with PID 1220 (C:\Users\bactoria\Desktop\spring-boot-2.0-reference-coding\project\target\classes started by bactoria in C:\Users\bactoria\Desktop\spring-boot-2.0-reference-coding\project)
2018-06-09 14:59:15.647  INFO 1220 --- [  restartedMain] m.b.project.day06.Day06Controller        : No active profile set, falling back to default profiles: default
2018-06-09 14:59:15.856  INFO 1220 --- [  restartedMain] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@48d9369e: startup date [Sat Jun 09 14:59:15 KST 2018]; root of context hierarchy

...생략
```

&nbsp;

`banner.txt` 와 `myBanner` 둘 다 사용하면 무엇이 출력될까 ?

`banner.txt` 가 출력된다..



&nbsp;

#### 배너모드

* System.out(console)
* logger(log)
* off

```properties
spring.main.banner-mode
```

&nbsp;

#### 배너도 싱글톤 빈으로!

배너는 **springBootBanner** 라는 이름으로 빈으로 등록된다고 하는데..

무슨소리지?

일단 내가만든 MyBanner 자체는 컴포넌트로 등록도 안했고,

new MyBanner() 로 만들어서 썼는데...

&nbsp;
&nbsp;

### SpringApplication 커스텀하기

&nbsp;

#### 배너 비활성화

```
public static void main(String[] args) {
	SpringApplication app = new SpringApplication(MySpringConfiguration.class);
	app.setBannerMode(Banner.Mode.OFF);
	app.run(args);
}
```

&nbsp;

#### application.properties 사용하기

application.properties 를 사용하여 Application을 커스텀 할 수 있다. (자세한건 chapter 24)

&nbsp;

### 계층구조 만들기

ApplicationContext : 빈 팩토리

빈 팩토리를 계층구조로 만들어서 하고싶다면 다음과 같이 하면된다.

```java
new SpringApplicationBuilder()
		.sources(Parent.class)
		.child(Application.class)
		.bannerMode(Banner.Mode.OFF)
		.run(args);
```

&nbsp;

#### 제약사항

Web 컴포넌트는 child에 들어가야함.

child와 parent는 동일한 Environment를 사용

&nbsp;

**백기선님: "쓸일이 별로없을것 같아요"**

&nbsp;
&nbsp;

### Application 이벤트, 리스너

**Event**

`ApplicationStartingEvent`

`ApplicationEnvironmentPreparedEvent`

`ApplicationPreparedEvent`

`ApplicationStartedEvent`

`ApplicationReadyEvent`

`ApplicationFailedEvent`

&nbsp;
&nbsp;

```java
@Component
public class MyStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("APPLICATION IS STARTING");
    }
}
```

**위 리스너는 bean으로 등록되지 않는다.**

왜냐?

모든 bean들은 **ApplicationContext** 에서 관리가 된다.

허나, `ApplicationStartingEvent` 는 **ApplicationContext** 가 생성되기 전에 트리거 되기 때문에 리스너는 빈으로 등록되지 않는다.

따라서 다른 방법으로 등록해야 한다.

&nbsp;

#### 리스너 등록하는 방법들

1. `SpringApplication.addListeners(…​)`

2. `SpringApplicationBuilder.listeners(…​)`

3. `META-INF/spring.factories` 에 `org.springframework.context.ApplicationListener=com.example.project.MyListener` 추가

&nbsp;

#### 사용하기

**MyReadyListener.class**

```java
public class MyReadyListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("APPLICATION IS READY");
    }
}
```

&nbsp;

**MyStartedListener.class**

```java
public class MyStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("APPLICATION IS STARTED");
    }
}
```

&nbsp;

**Day06Application.class**

```java
@SpringBootApplication
public class Day06Controller {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Day06Controller.class)
                .properties("spring.config.location=classpath:day06Application.properties")
                .banner(new MyBanner())
                .listeners(new MyReadyListener())
                .listeners(new MyStartedListener())
                .run("--debug");
    }
}
```

&nbsp;

**결과**

```

...생략

2018-06-09 15:56:16.555  INFO 17148 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
APPLICATION IS STARTED
2018-06-09 15:56:16.573 DEBUG 17148 --- [  restartedMain] o.s.boot.devtools.restart.Restarter      : Creating new Restarter for thread Thread[main,5,main]
2018-06-09 15:56:16.573 DEBUG 17148 --- [  restartedMain] o.s.boot.devtools.restart.Restarter      : Immediately restarting application
2018-06-09 15:56:16.573 DEBUG 17148 --- [  restartedMain] o.s.boot.devtools.restart.Restarter      : Created RestartClassLoader org.springframework.boot.devtools.restart.classloader.RestartClassLoader@7a7f91ad
2018-06-09 15:56:16.573 DEBUG 17148 --- [  restartedMain] o.s.boot.devtools.restart.Restarter      : Starting application me.bactoria.project.day06.Day06Controller with URLs [file:/C:/Users/bactoria/Desktop/spring-boot-2.0-reference-coding/project/target/classes/]
APPLICATION IS READY

```

&nbsp;
&nbsp;

### 참고자료

[Spring Boot Reference Guide - 2.0.2.Release](https://docs.spring.io/spring-boot/docs/2.0.2.RELEASE/reference/htmlsingle/#using-boot-maven)

[스프링 부트 2.0 Day 6. 배너 그리고 SpringApplication - by 백기선 님](https://youtu.be/38UK7BRJf1o)
