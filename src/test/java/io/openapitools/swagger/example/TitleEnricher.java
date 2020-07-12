package io.openapitools.swagger.example;

import io.swagger.v3.oas.models.OpenAPI;

import java.util.Set;
import java.util.function.BiConsumer;

public class TitleEnricher implements BiConsumer<OpenAPI, Set<Class<?>>> {

    @Override
    public void accept(OpenAPI swagger, Set<Class<?>> classes) {
        swagger.getInfo().setTitle(swagger.getInfo().getTitle() + " (Enriched)");
    }
}