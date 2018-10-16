package com.l2l.enterprise.vessel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "org.activiti.cloud.services",
    "org.activiti.cloud.alfresco",
    "org.activiti.spring"
 })
public class CustomActivitiQueryAutoConfiguration {
    public CustomActivitiQueryAutoConfiguration(){
        System.out.println("====CustomActivitiQueryAutoConfiguration====");
    }

//    @Bean
//    public ProcessInstanceResourceAssembler processInstanceResourceAssembler(){
//        System.out.println("===ProcessInstanceResourceAssembler===");
//        return new ProcessInstanceResourceAssembler();
//    }
//
//    @Bean
//    public TaskResourceAssembler taskResourceAssembler(){
//        System.out.println("===TaskResourceAssembler===");
//        return new TaskResourceAssembler();
//    }
//    @Bean
//    public org.activiti.cloud.services.rest.assemblers.TaskResourceAssembler taskResourceAssembler(RuntimeBundleInfoAppender runtimeBundleInfoAppender) {
//        System.out.println("===TaskResourceAssemblers===");
//        return new org.activiti.cloud.services.rest.assemblers.TaskResourceAssembler(new ToCloudTaskConverter(runtimeBundleInfoAppender));
//    }
}
