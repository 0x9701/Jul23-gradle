openfeign 生产者


MQ生产者 参考地址https://blog.csdn.net/qq_35387940/article/details/100514134


Spring读取配置文件和初始化过程
https://blog.csdn.net/inthat/article/details/102819826


多线程
另外需要注意的是：关于注解失效需要注意以下几点

注解的方法必须是public方法
方法一定要从另一个类中调用，也就是从类的外部调用，类的内部调用是无效的，因为**@Transactional和@Async注解的实现都是基于Spring的AOP，而AOP的实现是基于动态代理模式实现的**。那么注解失效的原因就很明显了，有可能因为调用方法的是对象本身而不是代理对象，因为没有经过Spring容器。
异步方法使用注解@Async的返回值只能为void或者Future
而关于ThreadPoolTaskExecutor的拒绝策略和处理流程其实和ThreadPoolExecutor是一致的，可以从ThreadPoolTaskExecutor配置类配置拒绝策略的时候看出：本质上还是使用ThreadPoolExecutor的拒绝策略。
————————————————
版权声明：本文为CSDN博主「雨～旋律」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_44754515/article/details/125805766