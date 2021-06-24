package br.edu.pepper.hazelcastdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parameters")
class ParameterController {

    @Autowired
    private ParameterService parameterService;

    @GetMapping("/{key}")
    public String getParameterValueByKey(@PathVariable("key") String key) {
        return parameterService.getParameterValueByKey(key);
    }
}
