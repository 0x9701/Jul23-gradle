package eth.ox9701.cache.service.impl;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import eth.ox9701.cache.service.ThreadPoolService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ThreadPoolServiceImpl implements ThreadPoolService {

    private static final Log logger = LogFactory.get();

    @Override
    @Async("threadPoolTaskExecutor")
    public void doThread() {
        logger.info("start service");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("end service");
    }
}
