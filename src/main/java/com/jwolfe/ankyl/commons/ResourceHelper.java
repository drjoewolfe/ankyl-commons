package com.jwolfe.ankyl.commons;

import java.io.InputStream;

public class ResourceHelper {
    public static InputStream getResourceAsStream(String name) {
        return ClassLoader.getSystemClassLoader().getResourceAsStream(name);
    }
}
