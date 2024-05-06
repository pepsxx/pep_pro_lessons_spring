package com.xandr.springcourse.les13.v1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xandr.springcourse.les13.v1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

