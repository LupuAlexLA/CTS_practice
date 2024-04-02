package practiceInainteDeTest1._00_Examene._01_Creationale.T01.pb2_recap;

public class Main {
    public static void main(String[] args) {
        HolidayBuilder builder = new HolidayBuilder();
        HolidayPackage lux = builder.addNightsOfAccommodation(2).addPrice(750.50f).addHotelRanking(5).addRoomType("double")
                .addTransportType("air plane").addExtraActivities(new String[] {"haha", "hihi"}).build();
        System.out.println(lux);

        HolidayPackage buget = builder.addNightsOfAccommodation(5).addPrice(1550.50f).addHotelRanking(4).addRoomType("double")
                .addTransportType("bus").addExtraActivities(new String[] {"auau", "vaivai"}).build();
        System.out.println(buget);

        HolidayPackage lowCost = builder.addNightsOfAccommodation(3).addPrice(350.50f).addHotelRanking(2).addRoomType("double")
                .addTransportType("bus").addExtraActivities(new String[] {"aoleu", "vaiDeMine"}).build();
        System.out.println(lowCost);
    }
}
