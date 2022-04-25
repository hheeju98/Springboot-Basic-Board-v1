# 스프링부트 게시판 만들기

### 의존성
```txt
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-mustache'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'
	annotationProcessor 'org.projectlombok:lombok'
```

###핵심
- JPA 라이브러리를 사용 하지만 그 기능을 사용하지는 않을 예정 (DB 연결의 용도로만 사용)
- 직접 Query를 작성해서 게시판을 만들 예정
- 직접 테이블도 생성할 예정
- ORM을 사용안하겠다는 뜻
- 서비스 안만들 예정