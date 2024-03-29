package _00_Examene._01_Creationale.T01.pb2_builder;

import java.util.List;

public class HolidayPackage implements AbstractHolidayPackage {
    private String transportType;
    private int nightsOfAccommodation;
    private String roomType;
    private int hotelRanking;
    private List<String> extraActivities;
    private float price;

    public HolidayPackage() {
    }

    public HolidayPackage(String transportType, int nightsOfAccommodation, String roomType, int hotelRanking, List<String> extraActivities, float price) {
        this.transportType = transportType;
        this.nightsOfAccommodation = nightsOfAccommodation;
        this.roomType = roomType;
        this.hotelRanking = hotelRanking;
        this.extraActivities = extraActivities;
        this.price = price;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transportType='" + transportType + '\'' +
                ", nightsOfAccommodation=" + nightsOfAccommodation +
                ", roomType='" + roomType + '\'' +
                ", hotelRanking=" + hotelRanking +
                ", extraActivities=" + extraActivities +
                ", price=" + price +
                '}';
    }

    @Override
    public String getTransportType() {
        return null;
    }

    @Override
    public int getNightsOfAccommodation() {
        return 0;
    }

    @Override
    public String getRoomType() {
        return null;
    }

    @Override
    public int getHotelRanking() {
        return 0;
    }

    @Override
    public String[] getExtraActivities() {
        return new String[0];
    }

    @Override
    public float getPrice() {
        return 0;
    }
}
