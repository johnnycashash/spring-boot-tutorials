package org.johnycash.di.config;

import org.johnycash.di.qualifier.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class PrintConfig {
    //recommended when you have no control over the source code
    //example datasource config, hibernate config, third party lib, jms but not for below custom classes
    //as @component can be used there
    /*@Bean("laserPrint")
    public PrintService getLaserPrintService(){
        return new LaserPrint();
    }
    @Bean("inkJetPrint")
    public PrintService getInkJetPrintService(){
        return new InkJetPrint();
    }
    @Bean("consolePrint")
    public PrintService getConsolePrintService(){
        return new ConsolePrint();
    }*/

//    @Bean
//    public PrintFactory printFactory(){
//        return new PrintFactory();
//    }
//    @Bean
//    public PrintService laserPrint(PrintFactory printFactory){
//        return printFactory.getPrint("laser");
//    }
//    @Bean
//    public PrintService inkJetPrint(PrintFactory printFactory){
//        return printFactory.getPrint("ink");
//    }
//    @Bean
//    public PrintService consolePrint(PrintFactory printFactory){
//        return printFactory.getPrint("console");
//    }
}
