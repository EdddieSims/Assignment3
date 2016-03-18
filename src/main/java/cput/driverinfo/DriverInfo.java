package cput.driverinfo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Edmund on 2016/03/18.
 */
public interface DriverInfo
{
    void setDrivers(String d);
    ArrayList getDrivers();

    void setCars(int year, String makeModel);
    HashMap getCars();

    String getTrack(int num);

    void setTotalTime(int lap1, int lap2, int lap3, int lap4);
    int getTotalTime();
}
