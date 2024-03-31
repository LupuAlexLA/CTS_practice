package _00_Examene._01_Creationale.T01.pb2_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HolidayPackage implements AbstractHolidayPackage {
    private String transportType;
    private int nightsOfAccommodation;
    private String roomType;
    private int hotelRanking;
    private String[] extraActivities;
    private float price;

    public HolidayPackage() {
    }

    public HolidayPackage(String transportType, int nightsOfAccommodation, String roomType, int hotelRanking, String[] extraActivities, float price) {
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
        return extraActivities.clone();
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
