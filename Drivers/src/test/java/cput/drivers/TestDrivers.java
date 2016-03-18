package cput.drivers;

import cput.drivers.Impl.DriversImpl;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Edmund on 2016/03/17.
 */
public class TestDrivers
{
    private Drivers drivers;
    private ArrayList driverNames;

    @Before
    public void setUp() throws Exception
    {
        drivers = new DriversImpl();

        drivers.setDrivers("Lewis Hamilton");
        drivers.setDrivers("Valentino Rossi");
        drivers.setDrivers("Ken Block");
        drivers.setDrivers("Kye Kelly");

        driverNames = drivers.getDrivers();
    }

    @Test
    public void testName() throws Exception
    {
        Assert.assertEquals("Kye Kelly", driverNames.get(3));
    }

    @After
    public void tearDown() throws Exception {


    }
}
