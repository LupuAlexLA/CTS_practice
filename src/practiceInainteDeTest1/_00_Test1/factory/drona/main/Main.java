package practiceInainteDeTest1._00_Test1.factory.drona.main;

import practiceInainteDeTest1._00_Test1.factory.drona.classes.*;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new AlertareFactory();
        FieldReport report1 = factory.create(213.22, 222.23, "this is a alert");
        System.out.println(report1.getTimestamp() + " " + report1.getLatitude() + " " + report1.getLongitude() + " " + report1.getDetails());

        factory = new AvertizareFactory();
        FieldReport report2 = factory.create(203.22, 202.23, "this is a warning");
        System.out.println(report2.getTimestamp() + " " + report2.getLatitude() + " " + report2.getLongitude() + " " + report2.getDetails());


        factory = new InformareFactory();
        FieldReport report3 = factory.create(293.22, 292.23, "this is a info");
        System.out.println(report3.getTimestamp() + " " + report3.getLatitude() + " " + report3.getLongitude() + " " + report3.getDetails());

    }
}
