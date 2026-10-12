package org.cursillo.commons.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI(@Value("${spring.application.name}") String nombreServicio) {
        return new OpenAPI()
                .info(new Info().title(nombreServicio).version("1.0.0"))
                .servers(List.of(new Server().url("/api")));
    }
}