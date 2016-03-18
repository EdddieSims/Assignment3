package cput.drivers.Impl;

import cput.drivers.Drivers;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Edmund on 2016/03/17.
 */
public class DriversImpl implements Drivers
{
    ArrayList driverList = new ArrayList();
    @Override
    public void setDrivers(String driver)
    {
        driverList.add(driver);
    }

    @Override
    public ArrayList getDrivers()
    {
        return driverList;
    }
}
