package br.com.popfood.configuration.security.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Projeto Pós Graduação Arquitetura de Software Distribuido - PUCMINAS",
                description = "Implementação de um sistema para controle de estabelecimentos delivery",
                contact = @Contact(
                        name = "Julio Cezar",
                        url = "https://github.com/soltein/Arquitetura_Software_PucMinas",
                        email = "julio@soltein.com.br"
                ),
                license = @License(name = "UNLICENSED"),
                version = "1.0.0"
        )
)
@SecurityScheme(
        name = "Bearer", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT"
)
public class OpenApiConfig {

}