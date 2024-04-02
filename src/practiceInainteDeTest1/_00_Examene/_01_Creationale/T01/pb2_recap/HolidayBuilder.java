package practiceInainteDeTest1._00_Examene._01_Creationale.T01.pb2_recap;

public class HolidayBuilder {
    private String transportType;
    private int nightsOfAccommodation;
    private String roomType;
    private int hotelRanking;
    private String[] extraActivities;
    private float price;

    HolidayBuilder addTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    HolidayBuilder addNightsOfAccommodation(int nightsOfAccommodation) {
        this.nightsOfAccommodation = nightsOfAccommodation;
        return this;
    }

    HolidayBuilder addRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    HolidayBuilder addHotelRanking(int hotelRanking) {
        this.hotelRanking = hotelRanking;
        return this;
    }

    HolidayBuilder addExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
        return this;
    }

    HolidayBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    HolidayPackage build() {
        return new HolidayPackage(transportType, nightsOfAccommodation, roomType, hotelRanking, extraActivities, price);
    }
}
