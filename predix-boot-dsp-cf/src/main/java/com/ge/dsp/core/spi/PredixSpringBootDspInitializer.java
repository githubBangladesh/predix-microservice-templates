package com.ge.dsp.core.spi;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author tturner
 *
 */
@ImportResource(
{
        "classpath*:META-INF/spring/predix-boot-dsp-scan-context.xml",
        "classpath*:META-INF/spring/predix-boot-dsp-cxf-context.xml"
})
public class PredixSpringBootDspInitializer
{

    /**
     * Ensure the Tomcat container comes up, not the Jetty one.
     * @return - the factory
     */
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory()
    {
        return new TomcatEmbeddedServletContainerFactory();
    }

    /**
     * Spin up a CXFServlet and tie to the mentioned URL
     * 
     * @return -
     */
    @SuppressWarnings("nls")
    @Bean
    public ServletRegistrationBean servletRegistrationBean()
    {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }

}
