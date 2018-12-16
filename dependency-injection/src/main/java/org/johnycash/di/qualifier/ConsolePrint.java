package org.johnycash.di.qualifier;

import org.springframework.stereotype.Component;

//using config class @Component
public class ConsolePrint implements PrintService {
    @Override
    public String print() {
        return "Printing on Console";
    }
}