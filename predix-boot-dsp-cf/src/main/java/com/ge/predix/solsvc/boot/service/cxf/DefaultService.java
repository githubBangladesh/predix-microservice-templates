package com.ge.predix.solsvc.boot.service.cxf;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

/**
 * A Spring Bean registered with CXF.  See the xml file predix-boot-dsp-cxf-context.xml
 * Note that predix-boot-dsp-cf project also helps you register using a Spring RestTemplate if you like pure Spring    
 * @author tturner
 */
@Component
@Path("/")
public class DefaultService
{

    /**
     * 
     */
    public DefaultService()
    {
        super();
    }

    /**
     * -
     * 
     * @return string
     */
    @SuppressWarnings("nls")
    @GET
    @Path("ping/")
    public Response doNothing()
    {
        return handleResult("Greetings from DSP " + new Date());
    }

    /**
     * @param entity
     *            to be wrapped into JSON response
     * @return JSON response with entity wrapped
     */
    protected Response handleResult(Object entity)
    {
        ResponseBuilder responseBuilder = Response.status(Status.OK);
        responseBuilder.type(MediaType.APPLICATION_JSON);
        responseBuilder.entity(entity);
        return responseBuilder.build();
    }
}
