package com.dongann.service.api;

import com.dongann.common.dto.DemoDto;
import com.dongann.common.util.ServiceResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FileName: DemoApi
 * @Author: <a href="dongann@aliyun.com">dongchang'an</a>.
 * @CreateTime: 2020/9/2 9:35 上午
 * @Version: v1.0
 * @description:
 */
public interface DemoApi {

    @RequestMapping(value = "/getDemoInfo.json",method = RequestMethod.POST)
    public ServiceResult getDemoInfo(@RequestBody DemoDto demoDto);
}
