package com.reshined.provider.service.impl;

import com.reshined.provider.service.ITicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper  服务注册与发现
@Service  //Service注解，会将服务注册到注册中心
@Component
public class ITicketServiceImpl implements ITicketService {
    @Override
    public String saleTicket(String name) {
        return name + " buy a ticket by provider !";
    }
}
