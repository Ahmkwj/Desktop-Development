/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 28-09-2025-10h-11m
*/

package qa.udst.ecommerce.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("E-commerce API")
                        .version("1.0.0")
                        .description("API documentation for E-commerce application"));
    }
}