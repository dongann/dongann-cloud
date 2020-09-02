package com.dongann.consunme.fallback;

import com.dongann.common.dto.DemoDto;
import com.dongann.common.enums.ErrCodes;
import com.dongann.common.util.ServiceResult;
import com.dongann.consunme.feign.DemoFeign;
import org.springframework.stereotype.Component;

/**
 * @FileName: DemoFeignBack
 * @Author: <a href="dongchangan@rrslj.com">dongchang'an</a>.
 * @CreateTime: 2020/9/2 3:43 下午
 * @Version: v1.0
 * @description:
 */
@Component
public class DemoFeignFallback implements DemoFeign {
    @Override
    public ServiceResult getDemoInfo(DemoDto demoDto) {
        return ServiceResult.getError(ErrCodes.BUSINESS_ERROR);
    }
}
