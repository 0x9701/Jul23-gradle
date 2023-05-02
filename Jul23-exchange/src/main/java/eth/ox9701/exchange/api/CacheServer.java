package eth.ox9701.exchange.api;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("Jul23-cache")
public interface CacheServer {
    @GetMapping("/cache/getById")
    public String getById(@RequestParam("id") String id);
}
