package com.dongann.zuul.filter;

import com.dongann.common.enums.ErrCodes;
import com.dongann.common.exception.BusinessException;
import com.dongann.common.util.SerialUtil;
import com.dongann.common.util.ServiceResult;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @FileName: AuthFilter
 * @Author: <a href="dongann@aliyun.com">dongchang'an</a>.
 * @CreateTime: 2020/9/18 1:44 下午
 * @Version: v1.0
 * @description:
 */
@Slf4j
@Component
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //设置过滤类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //设置过过滤器优先级
        return -4;
    }

    @Override
    public boolean shouldFilter() {
        //是否需要过滤
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        HttpServletResponse response = context.getResponse();
        Date startDate = new Date();
        ServiceResult serviceErrorResult = null;
        try {
            //设置线程名
            String newThreadName = "ZUUL" + SerialUtil.nextSeq(".mweb", 8);
            Thread.currentThread().setName(newThreadName);
            request.setAttribute("startDate", startDate);
            request.setAttribute("threadName", newThreadName);
            //获取token
            String token = request.getHeader("token");
            if (StringUtils.isEmpty(token)) {
                throw new BusinessException(ErrCodes.TOKEN_ERROR);
            }
        } catch (Exception e) {
            log.error("拦截器异常 ：", e);
            serviceErrorResult = new ServiceResult(ErrCodes.SYSTEM_ERROR);
        }
        if (serviceErrorResult != null) {
            ServiceResult.writerJson(serviceErrorResult, response);
        }
        return null;

    }
}
