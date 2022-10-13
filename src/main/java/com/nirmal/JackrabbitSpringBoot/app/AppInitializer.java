package com.nirmal.JackrabbitSpringBoot.app;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot initialization class of the JackrabbitSpringBoot project
 *
 * @author Nirmal Balasooriya
 *
 */

//@EnableJpaRepositories("com.nirmal.springbootrest")
@SpringBootApplication(scanBasePackages = { "com.nirmal.JackrabbitSpringBoot.app" })
@ComponentScan({"com.nirmal.JackrabbitSpringBoot.app"})
public class AppInitializer extends SpringBootServletInitializer {

    @Autowired
    DataSource dataSource;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppInitializer.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class, args);
    }
}