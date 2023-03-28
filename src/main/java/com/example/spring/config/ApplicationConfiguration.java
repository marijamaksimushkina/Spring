package com.example.spring.config;

import com.example.spring.database.pool.ConnectionPool;
import com.example.web.config.WebConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Import(WebConfiguration.class)
@Configuration(proxyBeanMethods = true)
public class ApplicationConfiguration {
        @Bean("pool2")
        @Scope(BeanDefinition.SCOPE_SINGLETON)
        public ConnectionPool pool2(@Value("${db.username}") String username){
                return new ConnectionPool(username, 20);
        }
        @Bean
        public ConnectionPool pool3 (){
                return new ConnectionPool("test-pool", 25);
        }

}
