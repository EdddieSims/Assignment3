package cput.driverinfo.config;

import cput.driverinfo.DriverInfo;
import cput.driverinfo.Impl.DriverInfoImpl;
import org.springframework.context.annotation.Bean;

/**
 * Created by Edmund on 2016/03/18.
 */
public class AppConfig
{
    @Bean(name = "dInfo")
    public DriverInfo getDriverInfo()
    {
        return new DriverInfoImpl();
    }


}
