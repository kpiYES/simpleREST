package com.restSpringBoot.restSpringBoot.config;

import com.restSpringBoot.restSpringBoot.repository.HumanRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public HumanRepository humanRepository(){
        return new HumanRepository();
    }
}
