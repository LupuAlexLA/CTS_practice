package _00_Examene._01_Creationale.T01.pb2_builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> activ1 = new ArrayList<>();
        //activ1 = List.of(new String[]{"vizita muzeu", "vizita gran canaria"});
        activ1.add("vizita muzeu");
        activ1.add("vizita gran canaria");

        HolidayPackageBuilder holidayPackageBuilder = new HolidayPackageBuilder();
        holidayPackageBuilder.addTransportType("airplane").addNightsOfAccommodation(3)
                .addHotelRanking(5).addPrice(450.50f)
                .addRoomType("double").addExtraActivities(activ1);
        HolidayPackage spain = holidayPackageBuilder.build();
        System.out.println(spain);

//        holidayPackageBuilder.addRoomType("basic");
//
//        HolidayPackage spain2 = holidayPackageBuilder.build();
//        System.out.println(spain2);
    }
}
