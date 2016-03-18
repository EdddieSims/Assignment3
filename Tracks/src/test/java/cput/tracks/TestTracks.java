package cput.tracks;

import cput.tracks.Impl.TracksImpl;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/17.
 */
public class TestTracks
{
    private Tracks track;

    @Before
    public void setUp() throws Exception {
        track = new TracksImpl();
    }

    @Test
    public void testTrack() throws Exception
    {
        Assert.assertEquals("Hockenheimring", track.getTrack(2));
    }

    @After
    public void tearDown() throws Exception {


    }
}
