package com.andoliver46.ms.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class OpenApiConfig {

	@Bean
	@Lazy(false)
	List<GroupedOpenApi> apis(SwaggerUiConfigParameters uiConfig, RouteDefinitionLocator locator){
		
		var definitions = locator.getRouteDefinitions().collectList().block();
		
		definitions.stream()
			.filter(routeDefinition -> routeDefinition.getId().matches(".*-service"))
			.forEach(routeDefinition -> {
				String name = routeDefinition.getId();
				uiConfig.addGroup(name);
				GroupedOpenApi.builder().pathsToMatch("/" + name + "/**").group(name).build();
			});
		
		return new ArrayList<>();
	}
	
}
