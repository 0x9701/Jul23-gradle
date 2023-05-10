package eth.ox9701.cache.controller;


import eth.ox9701.cache.api.ExchangeServer;
import eth.ox9701.cache.entity.ConfigInfo;
import eth.ox9701.cache.service.HisConfigInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cache")
public class CacheController {
    @Autowired
    private HisConfigInfoService hisConfigInfoService;
    @Autowired
    private ExchangeServer exchangeServer;

    @GetMapping("/getById")
    public Map<String, Object> getById(String id){
        String byId = hisConfigInfoService.getById(id);
        //hisConfigInfoService.addCache(id);
        Map<String, Object> map = new HashMap<>();
        map.put(id,byId);
        return map;
    }
    // todo 保存后到redis
    @PostMapping("/save")
    public String saveConfig(@RequestBody ConfigInfo configInfo){
        String save = exchangeServer.save(configInfo);
        return save;
    }




}
