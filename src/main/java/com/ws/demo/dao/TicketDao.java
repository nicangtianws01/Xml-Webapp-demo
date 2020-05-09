package com.ws.demo.dao;

import com.ws.demo.entity.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TicketDao {
    List<Ticket> getTicketList(@Param("keyword") String keyword);
}
