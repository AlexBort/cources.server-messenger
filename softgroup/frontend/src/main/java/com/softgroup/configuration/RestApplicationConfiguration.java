package com.softgroup.configuration;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.softgroup",
               excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
public class RestApplicationConfiguration {


}
