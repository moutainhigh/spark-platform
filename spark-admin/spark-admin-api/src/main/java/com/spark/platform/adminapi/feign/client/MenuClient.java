package com.spark.platform.adminapi.feign.client;

import com.spark.platform.adminapi.feign.fallback.MenuClientFallBack;
import com.spark.platform.common.base.constants.ServiceNameConstants;
import com.spark.platform.common.base.support.ApiResponse;
import com.spark.platform.commonfeign.config.FeignRequestInterceptorConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: spark-platform
 * @Package: com.spark.platform.adminapi.feign.client
 * @ClassName: MenuClient
 * @Author: wangdingfeng
 * @Description: 菜单 client
 * @Date: 2020/3/17 9:27
 * @Version: 1.0
 */
@FeignClient(contextId = "menuClient", name = ServiceNameConstants.SOPHIA_ADMIN, configuration = FeignRequestInterceptorConfig.class, fallback = MenuClientFallBack.class)
public interface MenuClient {

    /**
     * 查询用户权限
     * @param userId
     * @return
     */
    @GetMapping("/menu/api/findAuthByUserId")
    ApiResponse findAuthByUserId(@RequestParam Long userId);
}