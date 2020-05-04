package com.leyou.order.mapper;


import com.leyou.order.pojo.OrderDetail;
import tk.mybatis.mapper.additional.dialect.oracle.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;


public interface OrderDetailMapper extends Mapper<OrderDetail>, InsertListMapper<OrderDetail> {
}
