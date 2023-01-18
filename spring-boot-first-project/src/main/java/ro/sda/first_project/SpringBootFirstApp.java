package ro.sda.first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class SpringBootFirstApp {
    public static void main(String[] args) {
//  exemplu de creare thread-uri
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        })

        SpringApplication.run(SpringBootFirstApp.class, args);
    }
}
