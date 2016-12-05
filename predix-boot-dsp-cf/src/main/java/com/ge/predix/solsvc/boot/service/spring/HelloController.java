package com.ge.predix.solsvc.boot.service.spring;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This @RestController registers with Spring RestTemplate.  
 * Note that predix-boot-dsp-cf project also helps you register using a CXF Template if you like standard Java annotations, see DefaultService and DynamicService    
 * @author predix
 */
@RestController
public class HelloController {

	
    /**
     * 
     */
    public HelloController() {
		super();
	}

	/**
	 * @param echo - the string to echo back
	 * @return -
	 */
	@SuppressWarnings("nls")
    @RequestMapping("/")
    public String index(@RequestParam(value="echo",defaultValue="echo") String echo) {
        return "Greetings from Predix Boot! " + (new Date());
    }

}