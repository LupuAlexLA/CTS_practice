package practiceInainteDeTest1.lastShot.builder.main;

import practiceInainteDeTest1.lastShot.builder.classes.HolidayBuilder;
import practiceInainteDeTest1.lastShot.builder.classes.HolidayPackage;

public class Main {
    public static void main(String[] args) {
        String[] lowCostEA = new String[] {"plimbare pe jos ca saracii", "tv in camera"};
        HolidayPackage lowCostBuilder = new HolidayBuilder().addTransportType("fara")
                .addNightsOfAccommodation(3).addRoomType("single").addHotelRanking(3)
                .addExtraActivities(lowCostEA).addPrice(150.00f).build();

        String[] middleCostEA = new String[] {"piscina", "sauna"};
        HolidayPackage middleCostBuilder = new HolidayBuilder().addTransportType("autobuz")
                .addNightsOfAccommodation(5).addRoomType("double").addHotelRanking(4)
                .addExtraActivities(middleCostEA).addPrice(250.00f).build();

        String[] highCostEA = new String[] {"ciubar", "spa"};
        HolidayPackage highCostBuilder = new HolidayBuilder().addTransportType("avion")
                .addNightsOfAccommodation(7).addRoomType("penthouse").addHotelRanking(5)
                .addExtraActivities(highCostEA).addPrice(350.00f).build();

        System.out.println(lowCostBuilder);
        System.out.println(middleCostBuilder);
        System.out.println(highCostBuilder);
    }
}
