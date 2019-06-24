package com.guojing.family.discoverydubboexamplecustomer.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Component;

/**
 * @Author: guojing
 * @Date: 2019/4/19 11:46
 */
@Component
public class SelfConfigs {
    @NacosValue(value = "${customer.demo.config:lemon-config}", autoRefreshed = true)
    private String useLocalCache;

    public String getUseLocalCache() {
        return useLocalCache;
    }

    public void setUseLocalCache(String useLocalCache) {
        this.useLocalCache = useLocalCache;
    }
}
