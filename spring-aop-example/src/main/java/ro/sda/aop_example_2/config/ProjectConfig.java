package ro.sda.aop_example_2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"ro.sda.aop_example_2.services", "ro.sda.aop_example_2.aspects"})
public class ProjectConfig {
}

