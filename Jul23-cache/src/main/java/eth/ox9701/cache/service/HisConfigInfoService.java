package eth.ox9701.cache.service;

import com.baomidou.mybatisplus.extension.service.IService;
import eth.ox9701.cache.entity.HisConfigInfo;

public interface HisConfigInfoService extends IService<HisConfigInfo> {
    String getById(String id);
    String addCache(String id);
}
