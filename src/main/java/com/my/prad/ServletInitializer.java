package com.my.prad;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * The type Servlet initializer.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	/*sdfs
	sfsf
	 */
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PradApplication.class);
	}

}
