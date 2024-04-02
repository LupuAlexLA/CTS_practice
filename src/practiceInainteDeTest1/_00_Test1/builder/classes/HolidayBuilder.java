package practiceInainteDeTest1._00_Test1.builder.classes;

public class HolidayBuilder {
    private String transportType;
    private int nightsOfAccommodation;
    private String roomType;
    private int hotelRanking;
    private String[] extraActivities;
    private float price;

    public HolidayBuilder addTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public HolidayBuilder addNightsOfAccommodation(int nightsOfAccommodation) {
        this.nightsOfAccommodation = nightsOfAccommodation;
        return this;
    }

    public HolidayBuilder addRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    public HolidayBuilder addHotelRanking(int hotelRanking) {
        this.hotelRanking = hotelRanking;
        return this;
    }

    public HolidayBuilder addExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
        return this;
    }

    public HolidayBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    public HolidayPackage build() {
        return new HolidayPackage(transportType, nightsOfAccommodation, roomType, hotelRanking, extraActivities, price);
    }
}
