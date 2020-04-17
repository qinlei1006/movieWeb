package com.lovo.web.service;

import com.lovo.web.entity.TicketEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("movieService")
public interface ITicketService {
    /**
     * 查询出所有电影票
     * @return
     */
    @RequestMapping("/findAllTicket")
    List<TicketEntity> findAllTicket();
}
