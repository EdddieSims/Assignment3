package cput.driverinfo;

import cput.driverinfo.config.AppConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Edmund on 2016/03/18.
 */
public class DriverInfoTest
{
    private DriverInfo driver;
    private ApplicationContext ctx;

    private HashMap carList;
    private ArrayList driverNames;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        driver = (DriverInfo)ctx.getBean("dInfo");

        driver.setCars(2014, "Mercedes Petronas AMG F1");
        driver.setCars(2015, "Yamaha Superbike");
        driver.setCars(2016, "Ford Focus RS");
        driver.setCars(1991, "Chevrolet Corvette");

        driver.setDrivers("Lewis Hamilton");
        driver.setDrivers("Valentino Rossi");
        driver.setDrivers("Ken Block");
        driver.setDrivers("Kye Kelly");

        driver.setTotalTime(6, 4, 5, 4);

        driverNames = driver.getDrivers();
        carList = driver.getCars();
    }

    @Test
    public void testDriver() throws Exception
    {
        Assert.assertEquals("Lewis Hamilton", driver.getDrivers().get(0));
    }

    @Test
    public void testCar() throws Exception
    {
        Assert.assertEquals("Mercedes Petronas AMG F1", driver.getCars().get(2014));
    }

    @Test
    public void testTrack() throws Exception
    {
        Assert.assertEquals("Hockenheimring", driver.getTrack(2));
    }

    @Test
    public void testTime() throws Exception
    {
        Assert.assertEquals(19, driver.getTotalTime());
    }

    @After
    public void tearDown() throws Exception {


    }
}
