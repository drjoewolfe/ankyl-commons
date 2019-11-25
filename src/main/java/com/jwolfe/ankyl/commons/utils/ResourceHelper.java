package com.jwolfe.ankyl.commons.utils;

import java.io.InputStream;

public class ResourceHelper {
    private ResourceHelper() {
    }

    public static InputStream getResourceAsStream(final String name) {
        return ClassLoader.getSystemClassLoader().getResourceAsStream(name);
    }
}
