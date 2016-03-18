package cput.totaltime.Impl;

import cput.totaltime.RaceTime;

/**
 * Created by Edmund on 2016/03/17.
 */
public class RaceTimeImpl implements RaceTime
{
    int totalTime = 0;

    public void setTotalTime(int lap1, int lap2, int lap3, int lap4)
    {
        totalTime = lap1 + lap2 + lap3 + lap4;
    }

    public int getTotalTime()
    {
        return totalTime;
    }
}
