package eth.ox9701.exchange.controller;




import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import eth.ox9701.exchange.api.CacheServer;
import eth.ox9701.exchange.entity.ConfigInfo;
import eth.ox9701.exchange.service.ConfigInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/config")
@RestController
public class ConfigInfoController {

    @Resource
    private ConfigInfoService configInfoService;
    @Resource
    private CacheServer cacheServer;
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getOne")
    public Map getOne(@RequestParam(value = "id",required = true) String id){
        QueryWrapper<ConfigInfo> wrapper = new QueryWrapper();
        wrapper.eq("id",id);
        ConfigInfo one = configInfoService.getOne(wrapper);
        Map map = new HashMap();
        map.put("config",one);
        map.put("code",200);
        return map;
    }

    @GetMapping("/getId")
    public String getId(String id){
        String byId = cacheServer.getById(id);
        return byId;
    }

    @PostMapping("/save")
    public String save(@RequestBody ConfigInfo configInfo){
        return configInfoService.save(configInfo)==true?"success":"fail";
    }





}
