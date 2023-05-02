package eth.ox9701.cache.service.impl;

import cn.hutool.log.Log;
import cn.hutool.log.StaticLog;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import eth.ox9701.cache.config.RedisTemplateConfig;
import eth.ox9701.cache.constant.KeyEnum;
import eth.ox9701.cache.entity.HisConfigInfo;
import eth.ox9701.cache.mapper.HisConfigInfoMapper;
import eth.ox9701.cache.service.HisConfigInfoService;
import eth.ox9701.cache.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HisConfigInfoServiceImpl  extends ServiceImpl<HisConfigInfoMapper, HisConfigInfo> implements HisConfigInfoService{


    @Autowired
    private HisConfigInfoMapper hisConfigInfoMapper;
    @Resource
    private RedisUtils redisUtils;

    @Override
    public String getById(String id) {
        // 查询缓存是否存在
        Object hget = redisUtils.hget(KeyEnum.CONFIG.getTypeName(), id);
        if (null==hget){
            StaticLog.info("缓存查询为空 {} ",id);
            HisConfigInfo hisConfigInfo = hisConfigInfoMapper.selectById(id);
            addCache(id);
            return hisConfigInfo.toString();
        }
        return hget.toString();
    }

    @Override
    public String addCache(String id) {
        HisConfigInfo hisConfigInfo = hisConfigInfoMapper.selectById(id);
        if ( null == hisConfigInfo){
            log.error("查询结果为空");
        }
        //redisUtils.set(id,hisConfigInfo.toString());
        redisUtils.hset(KeyEnum.CONFIG.getTypeName(),hisConfigInfo.getId().toString(),hisConfigInfo.toString());
        StaticLog.info("存储成功 {} log.", hisConfigInfo.getId());
        return hisConfigInfo.toString();
    }

}
