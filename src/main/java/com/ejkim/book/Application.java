package com.ejkim.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication : 스프링 부트의 자동설정. 스프링 Bean 읽기와 생성을 모두 자동으로 설정됨.
// 해당 어노테이션이 있는 위치부터 설정을 읽어가기때문에 이 클래스는 항상 프로젝트의 최상단에 위치
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // SpringApplication.run : 내장 WAS 실행
        SpringApplication.run(Application.class, args);
    }
}
