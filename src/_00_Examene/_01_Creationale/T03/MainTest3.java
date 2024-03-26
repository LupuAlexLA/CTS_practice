package _00_Examene._01_Creationale.T03;

import _00_Examene._01_Creationale.T03.pb1_singletonRegistry.SingletonRegistry;
import _00_Examene._01_Creationale.T03.pb2_FactoryMethod.*;

public class MainTest3 {
    public static void main(String[] args) {
        // Singleton Registry
        /*SingletonRegistry registry = new SingletonRegistry();
        SingletonRegistry.ControlSpace controlSpace = registry.getSingleton(
                SingletonRegistry.ControlSpace.class.getSimpleName());
        controlSpace.connect();
        controlSpace.disconnect();

        SingletonRegistry.WebService webService = registry.getSingleton(
                SingletonRegistry.WebService.class.getSimpleName());
        webService.connect();
        webService.disconnect();

        SingletonRegistry.GpsSatelitte gpsSatelitte = registry.getSingleton(
                SingletonRegistry.GpsSatelitte.class.getSimpleName());
        gpsSatelitte.connect();
        gpsSatelitte.disconnect();

        SingletonRegistry.ControlSpace controlSpace2 = registry.getSingleton(
                SingletonRegistry.ControlSpace.class.getSimpleName());

        if(controlSpace == controlSpace2) {
            System.out.println("Same refs!");
        } else {
            System.out.println("Diff ref!");
        }*/

        // Factory Method
        AbstractReportFactory reportFactory1 = new AlertReportFactory();
        FieldReport report1 = reportFactory1.createReport(43.123, 23.456, "alert1");
        System.out.println(report1.getTimestamp());
        System.out.println(report1.getLatitude());
        System.out.println(report1.getLongitude());
        System.out.println(report1.getDetails());

        AbstractReportFactory reportFactory2 = new InfoReportFactory();
        FieldReport report2 = reportFactory2.createReport(45.123, 26.456, "info");
        System.out.println(report2.getTimestamp());
        System.out.println(report2.getLatitude());
        System.out.println(report2.getLongitude());
        System.out.println(report2.getDetails());

        AbstractReportFactory reportFactory3 = new WarningReportFactory();
        FieldReport report3 = reportFactory3.createReport(44.123, 24.456, "warning");
        System.out.println(report3.getTimestamp());
        System.out.println(report3.getLatitude());
        System.out.println(report3.getLongitude());
        System.out.println(report3.getDetails());

        AbstractReportFactory reportFactory4 = new AlertReportFactory();
        FieldReport report4 = reportFactory4.createReport(46.123, 25.456, "alert2");
        System.out.println(report4.getTimestamp());
        System.out.println(report4.getLatitude());
        System.out.println(report4.getLongitude());
        System.out.println(report4.getDetails());
    }
}
