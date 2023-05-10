package eth.ox9701.cache.api;

import eth.ox9701.cache.entity.ConfigInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("Jul23-exchange")
public interface ExchangeServer {
    @RequestMapping(value = "/config/save",method = RequestMethod.POST)
    public String save(@RequestBody ConfigInfo configInfo);
}
