package ColoringAround;

import HelloDIProject.HellodiprojectApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringAroundApplication implements CommandLineRunner {

    private final RedColor redColor;

    @Autowired
    public ColoringAroundApplication(RedColor redColor) {
        this.redColor = redColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellodiprojectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        redColor.printColor();
    }

}
