package eth.ox9701.exchange.controller;




import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import eth.ox9701.exchange.api.CacheServer;
import eth.ox9701.exchange.entity.ConfigInfo;
import eth.ox9701.exchange.service.ConfigInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;
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
    public Map getOne(@Param("id") String id){
        QueryWrapper<ConfigInfo> wrapper = new QueryWrapper();
        wrapper.eq("id",id);
        ConfigInfo one = configInfoService.getOne(wrapper);
        System.out.println("!23123");
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





}
