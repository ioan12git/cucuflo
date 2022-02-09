package io.javabrains.springbootstarter.detest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TesteController {

//    @RequestMapping("/")
//    public String get(){
//        return "Hello from get()";
//    }
    @RequestMapping("/index")
    String index(){
        //mapped to hostname:port/home/index/
        return "Hello from index";
    }
    @RequestMapping(value={ "/page", "page*","view/*,**/msg"})
    String indexMultipleMapping(){
        return "Hello from index multiple mapping.";
    }
}
