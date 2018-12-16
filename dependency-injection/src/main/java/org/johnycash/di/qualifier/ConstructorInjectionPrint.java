package org.johnycash.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionPrint {

    private PrintService printService;

    @Autowired
    public ConstructorInjectionPrint(@Qualifier("consolePrint") PrintService printService) {
        this.printService = printService;
    }

    public String printMessage() {
        return printService.print();
    }
}
