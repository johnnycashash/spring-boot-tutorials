package org.johnycash.di.springboot;

import org.johnycash.di.controller.DriveAndPrintController;
import org.johnycash.di.profile.PropertyInjectionVehicle;
import org.johnycash.di.qualifier.ConstructorInjectionPrint;
import org.johnycash.di.qualifier.PropertyInjectionPrint;
import org.johnycash.di.qualifier.SetterInjectionPrint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        ConstructorInjectionPrint constructorInjectionPrint = (ConstructorInjectionPrint) ctx.getBean("constructorInjectionPrint");
        System.out.println(constructorInjectionPrint.printMessage());
        SetterInjectionPrint setterInjectionPrint = (SetterInjectionPrint) ctx.getBean("setterInjectionPrint");
        System.out.println(setterInjectionPrint.printMessage());
        PropertyInjectionPrint propertyInjectionPrint = (PropertyInjectionPrint) ctx.getBean("propertyInjectionPrint");
        System.out.println(propertyInjectionPrint.printMessage());


        PropertyInjectionVehicle propertyInjectionVehicle = (PropertyInjectionVehicle) ctx.getBean("propertyInjectionVehicle");
        System.out.println(propertyInjectionVehicle.driveTheVehicle());


        DriveAndPrintController driveAndPrintController = (DriveAndPrintController) ctx.getBean("driveAndPrintController");
        System.out.println(driveAndPrintController.driveTheVehicle());
        System.out.println(driveAndPrintController.printMessage());

    }

}

