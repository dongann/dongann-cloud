package com.dongann.consunme.controller;

import com.dongann.common.dto.DemoDto;
import com.dongann.common.util.ServiceResult;
import com.dongann.consunme.feign.DemoFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @FileName: DemoController
 * @Author: <a href="dongann@aliyun.com">dongchang'an</a>.
 * @CreateTime: 2020/8/27 3:08 下午
 * @Version: v1.0
 * @description:
 */
@Slf4j
@RestController
public class DemoController {
    @Resource
    private DemoFeign demoFeign;

    @RequestMapping(value = "api/getFeignDemoInfo.json",method = RequestMethod.POST)
    public ServiceResult getDemoInfo(@RequestBody DemoDto demoDto){
        return demoFeign.getDemoInfo(demoDto);
    }
}
