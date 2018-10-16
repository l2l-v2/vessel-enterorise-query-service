package com.l2l.enterprise.vessel.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableJpaRepositories({"org.activiti.cloud.services.query.app.repository"})
@EntityScan(
    basePackages = {"org.activiti.cloud.services.query.model"}
)
@Inherited
//@EnableAutoConfiguration(
//    exclude = {ActivitiQueryAutoConfiguration.class}
//)
public @interface EnableCustomActivitiQuery {
}
