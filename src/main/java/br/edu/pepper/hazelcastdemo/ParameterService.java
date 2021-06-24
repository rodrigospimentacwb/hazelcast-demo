package br.edu.pepper.hazelcastdemo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ParameterService {

    @Cacheable("parametersCache")
    public String getParameterValueByKey(String key) {
        return findParameterSlowSource(key);
    }

    private String findParameterSlowSource(String key) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Value of parameter";
    }
}
