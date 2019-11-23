package com.rubypaper;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BoardwebApplication {

    private static final String PROPERTIES = "spring.config.location=classpath:/application.yml,classpath:/db.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(BoardwebApplication.class)
                .properties(PROPERTIES)
                .run(args);
//        SpringApplication.run(BoardwebApplication.class, args);
    }

}
