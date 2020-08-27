package HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PrinterServiceImpl implements PrinterService {

    private PrinterService printerService;

    @Autowired
    PrinterServiceImpl(PrinterService printerService){
        this.printerService = printerService;

    }
    @Override
    public void log(String message) {
        System.out.println(LocalDateTime.now().toString() + "MY PRINTER SAYS --- " + message);
    }


}
