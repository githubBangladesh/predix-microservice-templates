package com.ge.predix.solsvc.boot.service.cxf;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A rest service that registers itself using the DSP ServiceManager
 * Note that predix-boot-dsp-cf project also helps you register using a Spring RestTemplate if you like pure Spring    
 * @author predix
 */
@Consumes({ "application/json", "application/xml" })
@Produces({ "application/json", "application/xml" })
@Path("/dynamicservice")
public interface DynamicService {

	/**
	 * @return -
	 */
	@GET
	@Path("/dynamic")
    public Response doNothing();
	
}
