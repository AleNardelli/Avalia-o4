package com.avaliacaosprint.Sprint4.Sprint4;
	
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apipedidos() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/**"))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
            ApiInfo apiInfo = new ApiInfo("Pedidos API SpringBoot", "Avaliação 4 - Sprint 4", "Created By Alexandre Nardelli", "Terms of service",
                    new Contact("GitHub", "https://github.com/AleNardelli", "Developer"), null, null,
                            new ArrayList<VendorExtension>());
                    return apiInfo;
        }




    }