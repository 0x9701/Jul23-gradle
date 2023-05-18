package eth.ox9701.exchange.service.impl;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import eth.ox9701.exchange.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {
    private static final Log logger = LogFactory.get();
    @Override
    @Async("taskExecutor") // 这注解的函数会被异步处理
    public void executeAsync() {
        logger.info("start executeAsync");
        try {
            //System.out.println("当前运行线的程名称：" + Thread.currentThread().getName());
            Thread.sleep(2000);
            logger.info("当前运行线的程名称：" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("end executeAsync"+Thread.currentThread().getName());
    }

    @Override
    public void noThread() {
        logger.info("start executeAsync");
        try {
            //System.out.println("当前运行线的程名称：" + Thread.currentThread().getName());
            Thread.sleep(2000);
            logger.info("当前运行线的程名称：" + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("end executeAsync"+Thread.currentThread().getName());
    }

}
