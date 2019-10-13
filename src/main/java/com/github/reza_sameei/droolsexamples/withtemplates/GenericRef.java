package com.github.reza_sameei.droolsexamples.withtemplates;

import java.util.Map;

public class GenericRef {

    private final String type;
    private final Map<String, String> key;
    private final long time;

    public GenericRef(String type, Map<String, String> key, long time) {
        this.type = type;
        this.key = key;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public Map<String, String> getKeyMap() {
        return this.key;
    }

    public String getKey(String key) {
        return this.key.get(key);
    }

    public Iterable<String> getKeys() {
        return this.key.keySet();
    }

    public long getTime() {
        return time;
    }
}
