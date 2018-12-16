package org.johnycash.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectionPrint {
    @Autowired
    @Qualifier("inkJetPrint")
    private PrintService printService;

    public String printMessage() {
        return printService.print();
    }
}

