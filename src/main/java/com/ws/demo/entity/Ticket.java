package com.ws.demo.entity;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Ticket implements Serializable {
    private static final long serialVersionUID = 323071200534593782L;
    private Integer ticketId;
    private String company;
    private String ticketNo;
    private String ctId;
    private String itId;
    private String type;
    private BigDecimal scny;
    private BigDecimal totalTax;
    private BigDecimal fcny;
    private Double baseAgencyRate;
    private BigDecimal baseAgencyFee;
    private Double addAgencyRate;
    private BigDecimal addAgencyFee;
    private Double totalAgencyRate;
    private BigDecimal totalAgencyFee;
    private BigDecimal refundFee;
    private BigDecimal acny;
    private BigDecimal turnOverFee;
    private Date bookDate;
    private Date ticketingDate;
}
