package io.openapitools.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;

import java.util.Set;

public interface Enricher {
    public void enhance(OpenAPI openAPI, Set<Class<?>> clazzes);
}
