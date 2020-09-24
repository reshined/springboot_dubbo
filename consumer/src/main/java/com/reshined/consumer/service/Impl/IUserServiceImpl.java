package com.reshined.consumer.service.Impl;

import com.reshined.consumer.service.IUserService;
import com.reshined.provider.service.ITicketService;
import org.apache.dubbo.config.annotation.Reference;

@org.springframework.stereotype.Service
//@Service
public class IUserServiceImpl implements IUserService {

    //负载均衡配置
    // random 随机，默认的
    // roundrobin 轮询
    // leastactive //最少活跃
    // consistenthash //一致性Hash

    @Reference(loadbalance = "roundrobin") //reference 获取服务，只能是接口，不能是实现类
    ITicketService iTicketService;

    public String bugTicket(String name) {
        String result = iTicketService.saleTicket(name);
        return result;
    }

}
