package by.parf.config;

import by.parf.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by parf on 2.10.15.
 */
@SpringBootApplication
@EnableMongoRepositories(basePackages = "by.parf")
@ComponentScan(basePackages = "by.parf")
public class ApplicationConfiguration{

    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args ) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }
}
