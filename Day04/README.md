# Day 04. @SpringBootApplication과 XML 빈 설정 파일 사용하기

**`Spring Boot Reference v2.0.2 ( 15.2 ~ 20.0 )`**

&nbsp;

### XML로 빈 등록 하는법

**resource/Day04Application.xml**

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->
    <bean id="userService" class="me.bactoria.project.day04.user.UserService" />
</beans>
```

[Spring Reference](https://docs.spring.io/spring/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html) 에 XML 스키마 있다.

&nbsp;

xml 명세를 했으니, 이걸 등록시켜줘야한다.

`@ComponentScan` 는 xml을 읽어들이지 않는다.

애초에 패키지부터 다르다.

`@Component` 클래스에 `@ImportResource` 를 추가하여 xml 파일을 적재시키자.

`@ImportResource("/Day04Application.xml")`

&nbsp;
&nbsp;

## 16. autoConfiguration

### autoConfiguration 등록하는법


`@Configuration` 를 사용하는 클래스에

**`@EnableAutoConfiguration`** 또는 **`@SpringBootApplcation`** 를 추가.

&nbsp;

`@SpringBootApplication` 안에는

`@Configuration`, `@EnableAutoConfiguration`, `@ComponentScan` 이 있다.

근데 `@EnableAutoConfiguration` 이 `@Configuration` 없이 그냥 써도 작동은하던데.. 뭐지...

&nbsp;
&nbsp;

Auto-configuration 은 반드시 해야하는 것은 아니다.

설정이 필요한 것이 있는데, 개발자가 명시를 안했을 경우에  autoConfiguration 된다.

&nbsp;

### autoConfiguration 확인하기

아래와 같이 args에 `--debug` 를 추가하기만 하면 된다.

무엇을 사용하는지와, 왜 사용하는지가 로깅된다.

```java
public static void main (String[] args) {
    SpringApplication.run(Day04Controller.class, "--debug");
}
```

&nbsp;

### 특정 autoConfiguration 사용하지 않고싶을 경우

#### 1. 메인클래스에서 설정

#### 1-1. @EnableAutoConfiguration
```java
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Day04Controller {
  // ...
}
```

#### 1-2. @SpringBootApplcation
```java
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}){DataSourceAutoConfiguration.class})
public class Day04Controller {
  // ...
}
```

#### 2. yml / properties 에서 설정

#### 2-1. application.yml
```yml
spring:
  autoconfigure:
    exclude:
```

#### 2-2. application.properties

```
spring.autoconfigure.exclude
```

&nbsp;

## Spring Beans / DI

#### Test
```java
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Day04Controller.class)
public class ExampleTest {

    @Autowired
    UserService userService;

    @Test
    public void 오토와이어_테스트() {
        Assert.assertNotNull(userService);
        Assert.assertNotNull(userService.getUserRepository());
        Assert.assertNotNull(userService.getARepository());
    }

}
```

&nbsp;

#### 1.
```java
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ARepository aRepository;


    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
```

#### Test Passed

&nbsp;

#### 2.

```java
@Service
public class UserService {

    private UserRepository userRepository;
    private ARepository aRepository;

    @Autowird
    public UserService(UserRepository userRepository, ARepository aRepository) {
            this.userRepository = userRepository;
            this.aRepository = aRepository;
    }


    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
```

#### Test Passed

&nbsp;

#### 3.

```java
@Service
public class UserService {

    private UserRepository userRepository;
    private ARepository aRepository;

    public UserService(UserRepository userRepository, ARepository aRepository) {
            this.userRepository = userRepository;
            this.aRepository = aRepository;
    }


    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
```

#### Test Passed 

class가 컴포넌트이고, 생성자가 하나일 때

파라미터가 빈이라면

그 빈을 스프링이 알아서 주입해준다.

&nbsp;

#### 4.

```java
@Service
@AllArgsConstructor //Lombok Annotation
public class UserService {

    private UserRepository userRepository;
    private ARepository aRepository;


    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
```

#### Test Passed

&nbsp;

#### 5.

```java
@Service
public class UserService {

    private UserRepository userRepository;
    private ARepository aRepository;

    @Autowird
    public UserService(UserRepository userRepository, ARepository aRepository) {
            this.userRepository = userRepository;
            this.aRepository = aRepository;
    }

    public UserService() {

    }    

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
```

#### Test Passed

&nbsp;

#### 6.

```java
@Service
public class UserService {

    private UserRepository userRepository;
    private ARepository aRepository;

    public UserService(UserRepository userRepository, ARepository aRepository) {
            this.userRepository = userRepository;
            this.aRepository = aRepository;
    }

    public UserService() {

    }         

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
```

#### Test Failed

&nbsp;

#### 7.

```java
@Service
public class UserService {

    private UserRepository userRepository;
    private ARepository aRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
    }

    @Autowired
    public UserService(ARepository aRepository) {
            this.aRepository = aRepository;
    }


    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
```

#### Test Failed

&nbsp;
&nbsp;


### @SpringApplication 사용하기

= `@Configuration` + `@EnableAutoConfiguration` + `@ComponentScan` + 알파

&nbsp;
&nbsp;

## 19. Application 실행하기

### jar 로 패키징하는 이유

* 다른사람이 실행하는것과 똑같이 실행할 수 있다.
* 디버깅이 쉽다.
* 특별한 IDE plugin이 필요하지 않다.

-> 톰캣이 내장되어있으므로

&nbsp;

### IDE에서 실행하기

run

&nbsp;

### 패키징한 어플리케이션 실행하기

Maven / Gradle

```
java -jar target/myApplication-0.0.1-SNAPSHOT.jar
```

&nbsp;

### Maven 플러그인

```
mvn spring-boot:run
```

&nbsp;

### Gradle 플러그인

```
gradle bootRun
```

&nbsp;
&nbsp;

## 20. spring-boot-devtools

#### Maven

```xml
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-devtools</artifactId>
		<optional>true</optional>
	</dependency>
</dependencies>
```

`<optional>` : production application 때는 비활성화, 모듈로 다른프로젝트에 사용되었을 때 비활성화

(Gradle 에서는 위의 기능을 이용하려면 propdeps-plugin 깔아야함)

&nbsp;

#### Gradle

```gradle
dependencies {
	compile("org.springframework.boot:spring-boot-devtools")
}
```

&nbsp;
&nbsp;

### 참고자료

[Spring Boot Reference Guide - 2.0.2.Release](https://docs.spring.io/spring-boot/docs/2.0.2.RELEASE/reference/htmlsingle/#using-boot-maven)

[스프링 부트 2.0 Day 4. @SpringBootApplication과 XML 빈 설정 파일 사용하기 - by 백기선 님](https://youtu.be/jftcS1BQ_0g)
