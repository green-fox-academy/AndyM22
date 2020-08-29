package HelloDIProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellodiprojectApplication implements CommandLineRunner {

    private final Printer printer;

    @Autowired
    public HellodiprojectApplication(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellodiprojectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
    }
}
