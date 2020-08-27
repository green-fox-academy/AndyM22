package com.greenfox.hellodiproject;

import HelloService.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class HellodiprojectApplication implements CommandLineRunner, PrinterService {

    private PrinterService printerService;

    @Autowired
    void PrinterServiceImpl(PrinterService printerService) {
        this.printerService = printerService;

    }

    @Override
    public void log(String message) {
        System.out.println(LocalDateTime.now().toString() + "MY PRINTER SAYS --- " + message);
    }

    public static void main(String[] args) {
        SpringApplication.run(HellodiprojectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printerService.log("hello");
    }
}
