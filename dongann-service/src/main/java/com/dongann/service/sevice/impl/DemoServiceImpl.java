package com.dongann.service.sevice.impl;

import com.dongann.service.sevice.DemoService;
import org.springframework.stereotype.Service;

/**
 * @FileName: DemoServiceImpl
 * @Author: <a href="dongann@aliyun.com">dongchang'an</a>.
 * @CreateTime: 2020/8/27 3:05 下午
 * @Version: v1.0
 * @description:
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getDemoInfo(String msg) {
        return msg;
    }
}
