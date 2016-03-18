package cput.cars.Impl;

import cput.cars.Cars;

import java.util.HashMap;

/**
 * Created by Edmund on 2016/03/17.
 */
public class CarsImpl implements Cars
{
    HashMap cars = new HashMap<String, String>();

    @Override
    public void setCars(int year, String makeModel)
    {
        cars.put(year ,makeModel);
    }

    @Override
    public HashMap getCars() {
        return cars;
    }
}
