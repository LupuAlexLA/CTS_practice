package _00_Examene._01_Creationale.T01.pb2_builder;

import java.util.List;

public class HolidayPackageBuilder {
    private String transportType;
    private int nightsOfAccommodation;
    private String roomType;
    private int hotelRanking;
    private List<String> extraActivities;
    private float price;

    public HolidayPackageBuilder addTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public HolidayPackageBuilder addNightsOfAccommodation(int nightsOfAccommodation) {
        this.nightsOfAccommodation = nightsOfAccommodation;
        return this;
    }

    public HolidayPackageBuilder addRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    public HolidayPackageBuilder addHotelRanking(int hotelRanking) {
        this.hotelRanking = hotelRanking;
        return this;
    }

    public HolidayPackageBuilder addExtraActivities(List<String> extraActivities) {
        this.extraActivities = extraActivities;
        return this;
    }

    public HolidayPackageBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    public HolidayPackage build() {
        return new HolidayPackage(transportType, nightsOfAccommodation, roomType, hotelRanking, extraActivities, price);
    }
}
