package cput.totaltime;

import cput.totaltime.Impl.RaceTimeImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/17.
 */
public class RaceTimeTest
{
    private RaceTime time;
    @Before
    public void setUp() throws Exception
    {
        time = new RaceTimeImpl();
        time.setTotalTime(1, 2, 3, 4);
    }

    @Test
    public void testTotalTime() throws Exception
    {
        Assert.assertEquals(10, time.getTotalTime());
    }

    @After
    public void tearDown() throws Exception
    {

    }
}
