package ru.aslugin.punkmarket.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@OpenAPIDefinition(
    info = @Info(
        title = "PUNK market backend API",
        version = "1.0.0",
        description = "API methods for PUNK market — service for the sale of products",
        contact = @Contact(name = "Alexander Slugin", url = "https://github.com/ASlugin", email = "slugin.alexander@gmail.com")
    )
)
public record ApplicationConfig(String test) {
}
