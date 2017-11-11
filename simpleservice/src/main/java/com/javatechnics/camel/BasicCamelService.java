package com.javatechnics.camel;

import com.javatechnics.camel.service.TimeService;
import org.apache.aries.blueprint.annotation.Bean;
import org.apache.aries.blueprint.annotation.Service;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@Bean(id = "BasicCamelService")
@Service(interfaces = {TimeService.class})
public class BasicCamelService implements TimeService
{
    public BasicCamelService()
    {
        Logger.getLogger("BasicCamelService").log(Level.INFO, "This is the basic Camel service starting.");
    }

    public String getTime()
    {
        return new Date().toString();
    }
}
