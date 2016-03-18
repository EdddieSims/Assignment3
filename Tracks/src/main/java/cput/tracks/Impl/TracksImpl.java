package cput.tracks.Impl;

import cput.tracks.Tracks;

/**
 * Created by Edmund on 2016/03/17.
 */
public class TracksImpl implements Tracks
{
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
            return "Dubai";
        }
        else
        {
            return "New Orlenes";
        }
    }
}
