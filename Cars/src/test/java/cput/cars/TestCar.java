package cput.cars;

import cput.cars.Impl.CarsImpl;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Edmund on 2016/03/17.
 */
public class TestCar
{
    private Cars cars;
    private HashMap carList;

    @Before
    public void setUp() throws Exception
    {
        cars = new CarsImpl();

        cars.setCars(1968, "Ford Mustang");
        cars.setCars(2015, "Yamaha Superbike");
        cars.setCars(2016, "Ford Focus RS");
        cars.setCars(1991, "Chevrolet Corvette");

        carList = cars.getCars();
    }

    @Test
    public void testCars() throws Exception
    {
        Assert.assertEquals("Ford Focus RS", carList.get(2016));
    }

    @After
    public void tearDown() throws Exception {


    }
}
