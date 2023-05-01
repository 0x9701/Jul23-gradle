package eth.ox9701.mq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQController {
    @GetMapping("/t")
    public String hello(){
        return "hello";
    }
}
