# Day 05. spring-boot-devtools 그리고 릴로딩

**`Spring Boot Reference v2.0.2 ( 20.1 ~ 22 )`**

&nbsp;

## Developer tools

### 기본 Property

캐싱 기능은 프로덕션에서는 장점이 많지만, 개발을 할 때는 생산성을 저하시키기 때문에

application.properties에서 캐싱을 사용하지 않도록 설정하곤 하는데,

`spring-boot-devtools` 를 추가하기만 하면 자동으로 적용해준다.

상세는 [DevToolsPropertyDefaultsPostProcessor](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-project/spring-boot-devtools/src/main/java/org/springframework/boot/devtools/env/DevToolsPropertyDefaultsPostProcessor.java)

&nbsp;

### 자동 재시작

`spring-boot-devtools`를 이용하면 classpath가 바뀔 때 자동으로 restart 된다.

(static 자원, view template 들과 같은 resource들은 restart 할 필요가 없다.)
-> 데브툴 없어도 Ctrl+F9 누르면 적용됨

`spring-boot`, `spring-boot-devtools`, `spring-boot-autoconfigure`, `spring-boot-actuator`, `spring-boot-starter` 로 시작하는 것들은 변경되어도 restart 되지 않는다.

&nbsp;

#### restart 하기

이클립스 : `Save` (Ctrl + S) 시 restart

인텔리J  : `Build Project` (Ctrl + F9) 시 restart

&nbsp;

```java
@Service
public class UserService {

    public String resHelloWorld() {
        return "Hello world~~~~~~~~~~~~~~~~!!!!!";
    }
}
```

위와 같은 코드를 아래와 같이 바꾸었다고 하자.

```java
@Service
public class UserService {

    public String resHelloWorld() {
        return "안녕하세요~~~~~~~~~~!!!!!";
    }
}
```

`spring-boot-devtoops` 를 사용한다면.

`ctrl + F9` (인텔리제이 기준) 를 누르면 빠른시간에 restart가 된다!!

&nbsp;

#### cold start / restart / reload

#### `cold-start`

완전히 껐다가 재시작

&nbsp;

#### `Restart`

2개의 classloader를 이용.

1st : 변하지 않는 Class들(가령, third-party jars)을 `base classloader` 에 적재

2nd : 개발중인 Class들을 `restart classloader` 에 적재

어플리케이션을 재시작할 때 restart classloader만 새로 읽어들인다.

고로, 당연히 cold start 보다 빠름.

&nbsp;

#### `Reload`

여전히 느리다거나, classloader에 이슈가 발생한다면 reload를 이용할 수 있다.

`JRebel`이 제공해줄것임.

&nbsp;

#### log 끄기

```
spring.devtools.restart.log-condition-evaluation-delta=false
```

#### 특정 파일 변경되더라도 재시작 비활성화

```
spring.devtools.restart.exclude=static/**,public/**
```

&nbsp;

#### (기본 설정은 유지하면서)

```
spring.devtools.restart.additional-exclude=static/**,public/**
```

&nbsp;

#### classpath에 없어도 재시작 활성화

```
spring.devtools.restart.additional-paths
```

&nbsp;

#### 재시작 비활성화

```
public static void main(String[] args) {
	System.setProperty("spring.devtools.restart.enabled", "false");
	SpringApplication.run(MyApp.class, args);
}
```

&nbsp;

#### 특정파일이 바뀔 때 restart 하기

이클립스에서는 저장할때마다 restart하는 겪일 테니까.. 이클립스를 위한것??

인텔리제이는 ctrl + F9 안누르면 됨.

```
spring.devtools.restart.trigger-file
```

&nbsp;

#### 외부모듈 변경시킬 때 restart 하고싶다면..

user를 모듈화시켜서 .jar 파일로 이용할 수도 있다.
이 때, user가 변경될 때 restart 를 이용하고 싶다면

&nbsp;

**META-INF/spring-devtools.properties**
```properties
# base classloader 로 보내기
restart.exclude.companycommonlibs=/mycorp-common-[\\w-]+\.jar

# restart classloader 로 보내기
restart.include.projectcommon=/mycorp-myproj-[\\w-]+\.jar
```

&nbsp;

#### ObjectInputStream과 호환x

ObjectInputStream을 쓰는 객체와는 문제가 생길 수 있다.

&nbsp;
&nbsp;

### LiveReload

리소스가 바뀔 때 웹을 자동으로 새로고침 해준다.

플러그인 깔아야함. 10딸라~...

??

크롬에 웹스토어에 [LiveReload](https://chrome.google.com/webstore/search/liveReload) 공짜임. 근데난왜안되지

&nbsp;
&nbsp;

### 전역설정

.gitignore 처럼 home루트에 `.spring-boot-devtools.properties`를 추가

**~/.spring-boot-devtools.properties**

```
spring.devtools.reload.trigger-file=.reloadtrigger
```

&nbsp;
&nbsp;

### 원격 개발시 devtools 사용하기

&nbsp;

#### 서버 환경에서 설정

```
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
			<configuration>
				<excludeDevtools>false</excludeDevtools>
			</configuration>
		</plugin>
	</plugins>
</build>
```

```properties
spring.devtools.remote.secret=mysecret
```

원격 개발시에만 쓰고 production 환경에는 쓰지말아라.

&nbsp;

#### <s>클라이언트 환경에서 설정<s>

모르겠다.. Pass...

&nbsp;
&nbsp;


### 참고자료

[Spring Boot Reference Guide - 2.0.2.Release](https://docs.spring.io/spring-boot/docs/2.0.2.RELEASE/reference/htmlsingle/#using-boot-maven)

[스프링 부트 2.0 Day 5. spring-boot-devtools 그리고 릴로딩 - by 백기선 님](https://youtu.be/5BhWpx7RW-w)
