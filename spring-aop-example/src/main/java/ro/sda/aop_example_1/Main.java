package ro.sda.aop_example_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.aop_example_1.config.ProjectConfig;
import ro.sda.aop_example_1.services.MathService;

public class Main {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MathService mathService = context.getBean(MathService.class);

            mathService.add(1, 2);
            mathService.subtract(5, 2);
            mathService.divide(7, 8);

            try {
                mathService.add(2, 2);
            } catch (RuntimeException e) {
                e.getMessage();
            }

            try {
                mathService.divide(2, 2);
            } catch (RuntimeException e) {
                e.getMessage();
            }
        }
    }
}
