package cput.driverinfo.Impl;

import cput.driverinfo.DriverInfo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Edmund on 2016/03/18.
 */
public class DriverInfoImpl implements DriverInfo
{
    ArrayList driverList = new ArrayList();
    HashMap cars = new HashMap<String, String>();
    int totalTime = 0;

    @Override
    public void setDrivers(String d)
    {
        driverList.add(d);
    }

    @Override
    public ArrayList getDrivers()
    {
        return driverList;
    }

    @Override
    public void setCars(int year, String makeModel)
    {
        cars.put(year ,makeModel);
    }

    @Override
    public HashMap getCars()
    {
        return cars;
    }

    @Override
    public String getTrack(int num)
    {
        if(num == 1)
        {
            return "Circuit de Spa";
        }
        else if(num == 2)
        {
            return "Hockenheimring";
        }
        else if(num == 3)
        {
            return "Yas Marina Circuit";
        }
        else
        {
            return "The Pad";
        }
    }

    @Override
    public void setTotalTime(int lap1, int lap2, int lap3, int lap4)
    {
        totalTime = lap1 + lap2 + lap3 + lap4;
    }

    @Override
    public int getTotalTime()
    {
        return totalTime;
    }
}
