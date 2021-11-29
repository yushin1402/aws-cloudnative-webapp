package com.example.backendforfrontend.app.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@ConfigurationProperties(prefix="service")

@Data
public class ServiceProperties {
	
	private String dns;

}
