package com.dongann.consunme.feign;


import com.dongann.consunme.fallback.DemoFeignFallback;
import com.dongann.service.api.DemoApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @FileName: DemoFeign
 * @Author: <a href="dongann@aliyun.com">dongchang'an</a>.
 * @CreateTime: 2020/9/1 2:51 下午
 * @Version: v1.0
 * @description:
 */
@Component
@FeignClient(name = "DONGANN-SERVICE",fallback = DemoFeignFallback.class)
public interface DemoFeign extends DemoApi {
}
