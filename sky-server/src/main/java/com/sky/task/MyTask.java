package com.sky.task;

/**
 * ClassName: MyTask
 * Description:
 *
 * @Author jinjianxia
 * @Create 2024/5/2 15:19
 * @Version 1.0
 */

import com.sky.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义定时任务类
 */
@Component
@Slf4j
public class MyTask {


    /**
     * 定时任务 每隔5秒触发一次
     */
//    @Scheduled(cron = "0/5 * * * * ?")
    public void executeTask() {
        log.info("定时任务开始执行：{}", new Date());
    }

}