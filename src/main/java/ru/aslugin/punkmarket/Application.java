package ru.aslugin.punkmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.aslugin.punkmarket.configuration.ApplicationConfig;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
public class Application {
    public static void main(String[] args) {
        var context = SpringApplication.run(Application.class, args);
        ApplicationConfig config = context.getBean(ApplicationConfig.class);
//        System.out.println(config);
    }
}
