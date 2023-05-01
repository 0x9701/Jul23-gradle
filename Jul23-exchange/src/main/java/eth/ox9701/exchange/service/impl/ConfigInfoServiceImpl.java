package eth.ox9701.exchange.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import eth.ox9701.exchange.entity.ConfigInfo;
import eth.ox9701.exchange.mapper.ConfigInfoMapper;
import eth.ox9701.exchange.service.ConfigInfoService;
import org.springframework.stereotype.Service;

/**
* @author apple
* @description 针对表【config_info(config_info)】的数据库操作Service实现
* @createDate 2022-08-24 22:58:30
*/
@Service
public class ConfigInfoServiceImpl extends ServiceImpl<ConfigInfoMapper, ConfigInfo> implements ConfigInfoService {

}
