package cn.edu.fzu.sosd.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApp {

  public static void main(String[] args) {
    new SpringApplicationBuilder(DemoApp.class).run(args);
  }

}
