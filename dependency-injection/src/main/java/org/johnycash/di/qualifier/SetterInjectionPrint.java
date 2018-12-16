package org.johnycash.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionPrint {

    private PrintService printService;

    @Autowired
    public void setPrintService(@Qualifier("laserPrint") PrintService printService) {
        this.printService = printService;
    }

    public String printMessage() {
        return printService.print();
    }
}
