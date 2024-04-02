package _00_RecapTest.builder.main;

import _00_RecapTest.builder.classes.HolidayBuilder;
import _00_RecapTest.builder.classes.HolidayPackage;

public class Main {
    public static void main(String[] args) {
        HolidayBuilder builder = new HolidayBuilder();

        String[] lowCostActivities = new String[] {"vizita muzeu", "vizita manastiri"};
        HolidayPackage lowCostPackage = builder.addTransportType("without")
                                               .addPrice(500.00f)
                                               .addHotelRanking(3)
                                               .addNightsOfAccommodation(3)
                                               .addRoomType("single")
                                               .addExtraActivities(lowCostActivities)
                                               .build();

        String[] budgetCostActivities = new String[] {"piscina", "spa"};
        HolidayPackage budgetCostPackage = builder.addTransportType("bus")
                .addPrice(750.00f)
                .addHotelRanking(4)
                .addNightsOfAccommodation(5)
                .addRoomType("double")
                .addExtraActivities(budgetCostActivities)
                .build();

        String[] highCostActivities = new String[] {"sauna", "ciubar"};
        HolidayPackage highCostPackage = builder.addTransportType("airplain")
                .addPrice(1500.00f)
                .addHotelRanking(5)
                .addNightsOfAccommodation(7)
                .addRoomType("penthouse")
                .addExtraActivities(highCostActivities)
                .build();

        System.out.println(lowCostPackage);
        System.out.println(budgetCostPackage);
        System.out.println(highCostPackage);
    }
}
