package com.dongann.consunme.controller;

import com.dongann.consunme.dto.DemoDto;
import com.dongann.consunme.feign.DemoFeign;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
public class DemoController {
    @Resource
    private DemoFeign demoFeign;

    @PostMapping("/getFeignDemoInfo.json")
    public String getDemoInfo(@RequestBody DemoDto demoDto){
        return demoFeign.getDemoInfo(demoDto);
    }
}
