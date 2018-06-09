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

2018-06-09 13:01:39.441  INFO 2820 --- [  restartedMain] m.b.project.Day06.Day06Controller        : Starting Day06Controller on DESKTOP-M9H337G with PID 2820 (C:\Users\bactoria\Desktop\spring-boot-2.0-reference-coding\project\target\classes started by bactoria in C:\Users\bactoria\Desktop\spring-boot-2.0-reference-coding\project)
2018-06-09 13:01:39.443  INFO 2820 --- [  restartedMain] m.b.project.Day06.Day06Controller        : No active profile set, falling back to default profiles: default
2018-06-09 13:01:39.613  INFO 2820 --- [  restartedMain] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6ea4e09: startup date [Sat Jun 09 13:01:39 KST 2018]; root of context hierarchy
2018-06-09 13:01:44.869  INFO 2820 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-06-09 13:01:44.939  INFO 2820 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-06-09 13:01:44.939  INFO 2820 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.31
2018-06-09 13:01:44.956  INFO 2820 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_162\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Docker\Docker\Resources\bin;C:\ProgramData\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Git\cmd;C:\Program Files\jad\bin;C:\Program Files\Geth;C:\ProgramData\chocolatey\bin;C:\Program Files\nodejs\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\Java\jdk1.8.0_162\bin;C:\Program Files\apache-maven-3.5.3\bin;C:\ProgramData\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Git\cmd;C:\Program Files\jad\bin;C:\Program Files\Geth;C:\Users\bactoria\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Bandizip\;C:\Users\bactoria\AppData\Local\atom\bin;C:\Program Files\Java\jdk1.8.0_162\bin;C:\ProgramData\chocolatey\bin;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\apache-maven-3.5.3\bin;C:\Users\bactoria\AppData\Roaming\npm;%USERPROFILE%\AppData\Local\Microsoft\WindowsApps;;.]
2018-06-09 13:01:45.149  INFO 2820 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-06-09 13:01:45.149  INFO 2820 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 5542 ms
2018-06-09 13:01:45.448  INFO 2820 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-06-09 13:01:45.454  INFO 2820 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-06-09 13:01:45.455  INFO 2820 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-06-09 13:01:45.455  INFO 2820 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-06-09 13:01:45.455  INFO 2820 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-06-09 13:01:45.708  INFO 2820 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-06-09 13:01:46.262  INFO 2820 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6ea4e09: startup date [Sat Jun 09 13:01:39 KST 2018]; root of context hierarchy
2018-06-09 13:01:46.467  INFO 2820 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-06-09 13:01:46.471  INFO 2820 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-06-09 13:01:46.831  INFO 2820 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-06-09 13:01:46.831  INFO 2820 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
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

**결과**
```
13:26:52.523 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
13:26:52.534 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/, /spring-boot/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter/target/classes/]
13:26:52.536 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/bactoria/Desktop/spring-boot-2.0-reference-coding/project/target/classes/]
2018-06-09 13:26:53.221 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'configurationProperties' with highest search precedence

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.2.RELEASE)

2018-06-09 13:26:53.337 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'servletConfigInitParams' with lowest search precedence
2018-06-09 13:26:53.337 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'servletContextInitParams' with lowest search precedence
2018-06-09 13:26:53.338 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'systemProperties' with lowest search precedence
2018-06-09 13:26:53.338 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'systemEnvironment' with lowest search precedence
2018-06-09 13:26:53.338 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [StubPropertySource {name='servletConfigInitParams'}, StubPropertySource {name='servletContextInitParams'}, MapPropertySource {name='systemProperties'}, SystemEnvironmentPropertySource {name='systemEnvironment'}]
2018-06-09 13:26:57.830 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Removing PropertySource 'defaultProperties'
2018-06-09 13:26:57.830 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'defaultProperties' with lowest search precedence
2018-06-09 13:26:59.636 DEBUG 7316 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
2018-06-09 13:26:59.636  INFO 7316 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 5951 ms
2018-06-09 13:26:59.959 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Replacing PropertySource 'servletContextInitParams' with 'servletContextInitParams'
2018-06-09 13:27:00.163  INFO 7316 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-06-09 13:27:00.610  INFO 7316 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2f81da1f: startup date [Sat Jun 09 13:26:53 KST 2018]; root of context hierarchy
2018-06-09 13:27:00.775 DEBUG 7316 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Looking for request mappings in application context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2f81da1f: startup date [Sat Jun 09 13:26:53 KST 2018]; root of context hierarchy
2018-06-09 13:27:00.804 DEBUG 7316 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : 2 request handler methods found on class org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController: {public org.springframework.http.ResponseEntity org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)={[/error]}, public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)={[/error],produces=[text/html]}}
2018-06-09 13:27:00.805  INFO 7316 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-06-09 13:27:00.807  INFO 7316 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-06-09 13:27:00.885 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Looking for URL mappings in application context: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2f81da1f: startup date [Sat Jun 09 13:26:53 KST 2018]; root of context hierarchy
2018-06-09 13:27:00.886 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor': no URL paths identified
2018-06-09 13:27:00.886 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor': no URL paths identified
2018-06-09 13:27:00.886 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalRequiredAnnotationProcessor': no URL paths identified
2018-06-09 13:27:00.886 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalCommonAnnotationProcessor': no URL paths identified
2018-06-09 13:27:00.886 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.event.internalEventListenerProcessor': no URL paths identified
2018-06-09 13:27:00.886 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.event.internalEventListenerFactory': no URL paths identified
2018-06-09 13:27:00.887 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'day06Controller': no URL paths identified
2018-06-09 13:27:00.887 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory': no URL paths identified
2018-06-09 13:27:00.887 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.AutoConfigurationPackages': no URL paths identified
2018-06-09 13:27:00.887 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.887 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.condition.BeanTypeRegistry': no URL paths identified
2018-06-09 13:27:00.887 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'propertySourcesPlaceholderConfigurer': no URL paths identified
2018-06-09 13:27:00.887 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration': no URL paths identified
2018-06-09 13:27:00.890 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'websocketContainerCustomizer': no URL paths identified
2018-06-09 13:27:00.890 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.890 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat': no URL paths identified
2018-06-09 13:27:00.890 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'tomcatServletWebServerFactory': no URL paths identified
2018-06-09 13:27:00.890 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.891 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servletWebServerFactoryCustomizer': no URL paths identified
2018-06-09 13:27:00.891 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'tomcatServletWebServerFactoryCustomizer': no URL paths identified
2018-06-09 13:27:00.891 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'server-org.springframework.boot.autoconfigure.web.ServerProperties': no URL paths identified
2018-06-09 13:27:00.891 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor': no URL paths identified
2018-06-09 13:27:00.891 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.context.properties.ConfigurationBeanFactoryMetadata': no URL paths identified
2018-06-09 13:27:00.892 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'webServerFactoryCustomizerBeanPostProcessor': no URL paths identified
2018-06-09 13:27:00.892 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'errorPageRegistrarBeanPostProcessor': no URL paths identified
2018-06-09 13:27:00.892 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration': no URL paths identified
2018-06-09 13:27:00.892 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'dispatcherServlet': no URL paths identified
2018-06-09 13:27:00.892 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mainDispatcherServletPathProvider': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'dispatcherServletRegistration': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'defaultValidator': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'methodValidationPostProcessor': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'error': no URL paths identified
2018-06-09 13:27:00.893 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'beanNameViewResolver': no URL paths identified
2018-06-09 13:27:00.894 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration': no URL paths identified
2018-06-09 13:27:00.894 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'conventionErrorViewResolver': no URL paths identified
2018-06-09 13:27:00.894 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.894 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'errorAttributes': no URL paths identified
2018-06-09 13:27:00.894 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'basicErrorController': no URL paths identified
2018-06-09 13:27:00.894 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'errorPageCustomizer': no URL paths identified
2018-06-09 13:27:00.894 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'preserveErrorControllerTargetClassPostProcessor': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter$FaviconConfiguration': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'faviconHandlerMapping': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'faviconRequestHandler': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'requestMappingHandlerAdapter': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'requestMappingHandlerMapping': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcConversionService': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcValidator': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcContentNegotiationManager': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcPathMatcher': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcUrlPathHelper': no URL paths identified
2018-06-09 13:27:00.895 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'viewControllerHandlerMapping': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'beanNameHandlerMapping': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'resourceHandlerMapping': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcResourceUrlProvider': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'defaultServletHandlerMapping': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcUriComponentsContributor': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'httpRequestHandlerAdapter': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'simpleControllerHandlerAdapter': no URL paths identified
2018-06-09 13:27:00.896 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'handlerExceptionResolver': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcViewResolver': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcHandlerMappingIntrospector': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'defaultViewResolver': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'viewResolver': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'welcomePageHandlerMapping': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'requestContextFilter': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hiddenHttpMethodFilter': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'httpPutFormContentFilter': no URL paths identified
2018-06-09 13:27:00.897 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mbeanExporter': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'objectNamingStrategy': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mbeanServer': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'standardJacksonObjectMapperBuilderCustomizer': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'jacksonObjectMapperBuilder': no URL paths identified
2018-06-09 13:27:00.898 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration': no URL paths identified
2018-06-09 13:27:00.899 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'parameterNamesModule': no URL paths identified
2018-06-09 13:27:00.899 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration': no URL paths identified
2018-06-09 13:27:00.899 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'jacksonObjectMapper': no URL paths identified
2018-06-09 13:27:00.899 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'jsonComponentModule': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'stringHttpMessageConverter': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.http.encoding-org.springframework.boot.autoconfigure.http.HttpEncodingProperties': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mappingJackson2HttpMessageConverter': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'messageConverters': no URL paths identified
2018-06-09 13:27:00.900 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration$JacksonCodecConfiguration': no URL paths identified
2018-06-09 13:27:00.901 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'jacksonCodecCustomizer': no URL paths identified
2018-06-09 13:27:00.901 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.901 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.901 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties': no URL paths identified
2018-06-09 13:27:00.901 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.901 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.security-org.springframework.boot.autoconfigure.security.SecurityProperties': no URL paths identified
2018-06-09 13:27:00.901 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'restTemplateBuilder': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'tomcatWebServerFactoryCustomizer': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'characterEncodingFilter': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'localeCharsetMappingsCustomizer': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'multipartConfigElement': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'multipartResolver': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.devtools.autoconfigure.LocalDevToolsAutoConfiguration$RestartConfiguration': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'classPathFileSystemWatcher': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'classPathRestartStrategy': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hateoasObjenesisCacheDisabler': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'fileSystemWatcherFactory': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'conditionEvaluationDeltaLoggingListener': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.devtools.autoconfigure.LocalDevToolsAutoConfiguration$LiveReloadConfiguration': no URL paths identified
2018-06-09 13:27:00.902 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'liveReloadServer': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'optionalLiveReloadServer': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'liveReloadServerEventListener': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.devtools.autoconfigure.LocalDevToolsAutoConfiguration': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.devtools-org.springframework.boot.devtools.autoconfigure.DevToolsProperties': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'autoConfigurationReport': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'springApplicationArguments': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'springBootBanner': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'springBootLoggingSystem': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'environment': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'systemProperties': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'systemEnvironment': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importRegistry': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'messageSource': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'applicationEventMulticaster': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servletContext': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'contextParameters': no URL paths identified
2018-06-09 13:27:00.903 DEBUG 7316 --- [  restartedMain] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'contextAttributes': no URL paths identified
2018-06-09 13:27:00.917  INFO 7316 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-06-09 13:27:00.917  INFO 7316 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-06-09 13:27:00.942 DEBUG 7316 --- [  restartedMain] .m.m.a.ExceptionHandlerExceptionResolver : Looking for exception mappings: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2f81da1f: startup date [Sat Jun 09 13:26:53 KST 2018]; root of context hierarchy
2018-06-09 13:27:01.687 DEBUG 7316 --- [  restartedMain] o.s.w.s.resource.ResourceUrlProvider     : Looking for resource handler mappings
2018-06-09 13:27:01.688 DEBUG 7316 --- [  restartedMain] o.s.w.s.resource.ResourceUrlProvider     : Found resource handler mapping: URL pattern="/**/favicon.ico", locations=[class path resource [META-INF/resources/], class path resource [resources/], class path resource [static/], class path resource [public/], ServletContext resource [/], class path resource []], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@6a942814]
2018-06-09 13:27:01.689 DEBUG 7316 --- [  restartedMain] o.s.w.s.resource.ResourceUrlProvider     : Found resource handler mapping: URL pattern="/webjars/**", locations=[class path resource [META-INF/resources/webjars/]], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@4001db65]
2018-06-09 13:27:01.691 DEBUG 7316 --- [  restartedMain] o.s.w.s.resource.ResourceUrlProvider     : Found resource handler mapping: URL pattern="/**", locations=[class path resource [META-INF/resources/], class path resource [resources/], class path resource [static/], class path resource [public/], ServletContext resource [/]], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@7b8bf6c3]
2018-06-09 13:27:01.760 DEBUG 7316 --- [  restartedMain] o.s.w.c.s.StandardServletEnvironment     : Adding PropertySource 'server.ports' with highest search precedence
```

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

&nbsp;

#### 리스너를 @bean 으로 등록할 수 없다.

모든 빈들은 APplicationContext 에서 관리가 된다.

허나, 이벤트는 `ApplicationContext` 가 생성되기 전에 트리거 되기 때문에 리스너는 빈이 될 수 없다.

애플리케이션을 만들기 전에도 동작하는 이벤트가 있을 수 있기 때문.

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
