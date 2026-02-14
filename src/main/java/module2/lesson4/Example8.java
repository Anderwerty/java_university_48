package module2.lesson4;

import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        MyPrinter myPrinter = new MyPrinter();
        MyScanner myScanner = new MyScanner();
        MFD mfd = new MFD();

        List<Printable> printers = List.of(myPrinter, mfd);
        List<Scannable> scanners = List.of(myScanner, mfd);
    }
}

interface Printable {
    void print(String text);
}

interface Scannable {
    void scan(String text);
}

interface MFDable extends Printable, Scannable{

    @Override
    void print(String text);
}

class MyPrinter implements Printable {

    @Override
    public void print(String text) {
        System.out.println("print");
    }
}

class MyScanner implements Scannable {

    @Override
    public void scan(String text) {
        System.out.println("scan");
    }
}

class MFD implements Printable, Scannable {

    @Override
    public void print(String text) {
        System.out.println("MFD print");
    }

    @Override
    public void scan(String text) {
        System.out.println("MFD scan");
    }
}