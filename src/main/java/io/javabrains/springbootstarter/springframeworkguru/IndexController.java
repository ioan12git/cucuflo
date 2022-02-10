package io.javabrains.springbootstarter.springframeworkguru;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController {


        @RequestMapping("/")
        String get(){
            //mapped to hostname:port/home/
            return "Hello from get";
        }
        @RequestMapping("/index")
        String index(){
            //mapped to hostname:port/home/index/
            return "Hello from index";
        }
        @RequestMapping(value={"", "/page", "page*","view/*,**/msg"})
        String indexMultipleMapping(){
            return "Hello from index multiple mapping.";
        }
        @RequestMapping(value="/id")
        String getIdByValue(@RequestParam("id1") String personId){
            System.out.println("Id is "+personId);
            return "Get ID from query string of URL with value element";
        }
        @RequestMapping( "/personId")
        String getId(@RequestParam String pId){
            System.out.println("ID is "+pId);
            return "Get ID from query string of URL without value element";
        }
        @RequestMapping("/name")
        String getName(@RequestParam(value="nume", required = false,defaultValue = "Gigi") String personName){
            if(personName == null){
                System.out.println("nume este "+personName+" care este de fapt default");
                return "Required element of request param null";
            } else {
                System.out.println("nume este "+personName);
                return "Required element of request param";
            }


    }

}





