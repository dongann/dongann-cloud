package com.dongann.consunme.feign;

import com.dongann.consunme.dto.DemoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @FileName: DemoFeign
 * @Author: <a href="dongann@aliyun.com">dongchang'an</a>.
 * @CreateTime: 2020/9/1 2:51 下午
 * @Version: v1.0
 * @description:
 */
@Component
@FeignClient("DONGANN-SERVICE")
public interface DemoFeign {

    @PostMapping("/getDemoInfo.json")
    public String getDemoInfo(@RequestBody DemoDto demoDto);
}
