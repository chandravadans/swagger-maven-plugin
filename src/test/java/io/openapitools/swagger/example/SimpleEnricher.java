package io.openapitools.swagger.example;

import io.openapitools.swagger.config.Enricher;

import java.util.Set;

public class SimpleEnricher implements Enricher {

    public SimpleEnricher() {

    }

    @Override
    public void enhance(Set<Class<?>> classes) {
        classes.forEach(clazz -> {
        });
    }
}