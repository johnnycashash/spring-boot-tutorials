package org.johnycash.di.qualifier;

public class PrintFactory {
   public PrintService getPrint(String type) {
        PrintService printService;
        switch (type) {
            case "console":
                printService = new ConsolePrint();
                break;
            case "laser":
                printService = new LaserPrint();
                break;
            case "ink":
                printService = new InkJetPrint();
                break;
            default:
                printService = new LaserPrint();
        }
        return printService;
    }
}
