package com.conygre.spring.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Profile("!test")
public class SwaggerConfig {

        @Bean
        public Docket newsApi() {
                return new Docket(DocumentationType.SWAGGER_2)
                        .groupName("stocks")
                        .apiInfo(apiInfo())
                        .select()
                        .paths(PathSelectors.any())
                        .build();
        }

        private ApiInfo apiInfo() {
                return new ApiInfoBuilder()
                        .title("Trading App REST API with Swagger")
                        .description(" It is a CRUD API")
                        .build();
        }
        }
