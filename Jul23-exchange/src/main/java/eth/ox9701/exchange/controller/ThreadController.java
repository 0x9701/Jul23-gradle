package eth.ox9701.exchange.controller;

import eth.ox9701.exchange.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/thread")
@RestController
public class ThreadController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping(value = "/thread")
    public String thread(){
        asyncService.executeAsync();
        return "Success";
    }


    @GetMapping("/noThread")
    public String noThread(){
        asyncService.noThread();
        return "Success";
    }
}
