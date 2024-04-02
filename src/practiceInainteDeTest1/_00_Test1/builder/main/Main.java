package practiceInainteDeTest1._00_Test1.builder.main;

import practiceInainteDeTest1._00_Test1.builder.classes.HolidayBuilder;
import practiceInainteDeTest1._00_Test1.builder.classes.HolidayPackage;

public class Main {
    public static void main(String[] args) {
        HolidayBuilder builder = new HolidayBuilder();
        String[] activitatiLowCost = new String[] {"terasa", "bar"};
        HolidayPackage lowCost = builder.addNightsOfAccommodation(5).addHotelRanking(3).addPrice(500.00f)
                .addRoomType("garsoniera").addExtraActivities(activitatiLowCost).addTransportType("fara")
                .build();

        String[] activitatiBuget = new String[] {"spa", "piscina"};
        HolidayPackage buget = builder.addNightsOfAccommodation(5).addHotelRanking(4).addPrice(750.00f)
                .addRoomType("ap cu 2 camere").addExtraActivities(activitatiBuget).addTransportType("autobuz")
                .build();

        String[] activitatiLux = new String[] {"ciubar", "sauna"};
        HolidayPackage lux = builder.addNightsOfAccommodation(7).addHotelRanking(5).addPrice(1500.00f)
                .addRoomType("penthouse").addExtraActivities(activitatiLux).addTransportType("avion")
                .build();

        System.out.println(lowCost);
        System.out.println(buget);
        System.out.println(lux);
    }
}
