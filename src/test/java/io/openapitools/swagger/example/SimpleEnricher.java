package io.openapitools.swagger.example;

import io.openapitools.swagger.config.Enricher;
import io.swagger.v3.oas.models.OpenAPI;

import java.util.Set;

public class SimpleEnricher implements Enricher {

    public SimpleEnricher() {

    }

    @Override
    public void enhance(OpenAPI swagger, Set<Class<?>> classes) {
        classes.forEach(clazz -> {
        });
    }
}