package com.jwolfe.ankyl.commons.utils;

import java.io.InputStream;

public class ResourceHelper {
    public static InputStream getResourceAsStream(String name) {
        return ClassLoader.getSystemClassLoader().getResourceAsStream(name);
    }
}
