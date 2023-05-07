package eth.ox9701.cache.controller;

import eth.ox9701.cache.entity.HisConfigInfo;
import eth.ox9701.cache.service.HisConfigInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cache")
public class CacheController {
    @Autowired
    private HisConfigInfoService hisConfigInfoService;

    @GetMapping("/getById")
    public String getById(String id){
        String byId = hisConfigInfoService.getById(id);
        //hisConfigInfoService.addCache(id);
        return byId;
    }




}
