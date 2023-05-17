package eth.ox9701.exchange.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Data
@EnableAsync
@Configuration
@ConfigurationProperties(prefix = "poolconfig")
public class ExThreadPoolConfig {
    /**
     * 线程池维护线程的最少数量，即使没有任务需要执行，也会一直存活
     */
    private int corePoolSize;

    /**
     * 线程池维护线程的最大数量
     */
    private int maxPoolSize;

    /**
     * 缓存队列（阻塞队列）当核心线程数达到最大时，新任务会放在队列中排队等待执行
     */
    private int queueCapacity;

    /**
     * 允许的空闲时间，当线程空闲时间达到keepAliveTime时，线程会退出，直到线程数量=corePoolSize
     */
    private int keepAlive;
    @Bean
    public TaskExecutor taskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //设置核心线程数
        executor.setCorePoolSize(corePoolSize);
        // 设置最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        // 设置队列容量
        executor.setQueueCapacity(queueCapacity);
        // 设置允许的空闲时间（秒）
        executor.setKeepAliveSeconds(keepAlive);
        // 设置默认线程名称
        executor.setThreadNamePrefix("thread-");
        // 设置拒绝策略rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALL_RUNS:不在新线程中执行任务，二十由调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 等待所有任务结束后在关闭线程池
        executor.setWaitForTasksToCompleteOnShutdown(true);
        return executor;
    }




}
