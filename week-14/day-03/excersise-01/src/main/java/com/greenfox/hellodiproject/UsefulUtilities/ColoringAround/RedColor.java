package ColoringAround;

import HelloDIProject.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    private final Printer printer;

    @Autowired
    public RedColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("This is red color");
        System.out.println("This is red color");
    }

}
