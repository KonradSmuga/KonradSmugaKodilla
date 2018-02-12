package com.kodilla.spring.reader;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public interface Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata);
}
