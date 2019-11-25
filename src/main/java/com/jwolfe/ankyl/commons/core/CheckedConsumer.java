package com.jwolfe.ankyl.commons.core;

@FunctionalInterface
public interface CheckedConsumer<T> {
    void accept(T t) throws InterruptedException;
}
