package io.openapitools.swagger.config;

import java.util.Set;

public interface Enricher {
    public void enhance(Set<Class<?>> clazzes);
}
