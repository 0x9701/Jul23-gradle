package eth.ox9701.cache.controller;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import eth.ox9701.cache.service.ThreadPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadPoolController {


    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    @Autowired
    private ThreadPoolService threadPoolService;

    private static final Log logger = LogFactory.get();

    /**
     * 这是controller层面的异步
     * 先打印主线程名称，然后执行线程池任务，最后打印子线程名称
     * @return
     */
    @GetMapping("/thread")
    public String testThread() {
        threadPoolTaskExecutor.execute(() -> {
            try {
                Thread.sleep(10000);// 为了演示方便，让变成休眠10秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.info("执行线程池任务");
            logger.info(Thread.currentThread().getName());//打印线程名称
        });// 需要传递Runnable对象

        logger.info("主线程名称:{}", Thread.currentThread().getName());//再打印主线程名称
        //return Result.success("success");
        return "Success";
    }

    @GetMapping("/threadService")
    public String threadService(){
        logger.info("start controller");
        threadPoolService.doThread();
        logger.info("end controller");
        return "threadService";
    }

}
