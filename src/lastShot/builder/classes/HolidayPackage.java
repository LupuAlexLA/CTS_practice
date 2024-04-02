package lastShot.builder.classes;

import java.util.Arrays;

public class HolidayPackage implements AbstractHolidayPackage {
    private String transportType;
    private int nightsOfAccommodation;
    private String roomType;
    private int hotelRanking;
    private String[] extraActivities;
    private float price;

    HolidayPackage(String transportType, int nightsOfAccommodation, String roomType,
                          int hotelRanking, String[] extraActivities, float price) {
        this.transportType = transportType;
        this.nightsOfAccommodation = nightsOfAccommodation;
        this.roomType = roomType;
        this.hotelRanking = hotelRanking;
        this.extraActivities = extraActivities;
        this.price = price;
    }

    @Override
    public String getTransportType() {
        return transportType;
    }

    @Override
    public int getNightsOfAccommodation() {
        return nightsOfAccommodation;
    }

    @Override
    public String getRoomType() {
        return roomType;
    }

    @Override
    public int getHotelRanking() {
        return hotelRanking;
    }

    @Override
    public String[] getExtraActivities() {
        return extraActivities;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transportType='" + transportType + '\'' +
                ", nightsOfAccommodation=" + nightsOfAccommodation +
                ", roomType='" + roomType + '\'' +
                ", hotelRanking=" + hotelRanking +
                ", extraActivities=" + Arrays.toString(extraActivities) +
                ", price=" + price +
                '}';
    }
}
