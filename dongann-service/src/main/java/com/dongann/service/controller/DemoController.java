package com.dongann.service.controller;


import com.dongann.common.dto.DemoDto;
import com.dongann.common.util.ServiceResult;
import com.dongann.service.api.DemoApi;
import com.dongann.service.sevice.DemoService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @FileName: DemoController
 * @Author: <a href="dongann@aliyun.com">dongchang'an</a>.
 * @CreateTime: 2020/8/27 3:08 下午
 * @Version: v1.0
 * @description:
 */
@RestController
public class DemoController implements DemoApi {
    @Resource
    private DemoService demoService;

    @Override
    public ServiceResult getDemoInfo(DemoDto demoDto){
        return demoService.getDemoInfo(demoDto.getDemoMsg());
    }
}
