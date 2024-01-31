package ittimfn.sample.junit.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Controller {
    private Map<String, String> map = new HashMap<String, String>();

    public String getRandomValue(String key) {
        if (!map.containsKey(key)) {
            map.put(key, this.generate());
        }
        return map.get(key);
    }

    String generate() {
        return UUID.randomUUID().toString();
    }
}
