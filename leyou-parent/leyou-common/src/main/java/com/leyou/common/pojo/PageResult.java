package com.leyou.common.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

public class PageResult<T>  {

    /**
     * 当前数据总条数
     */
    private Long total;
    /**
     * 当前总页数
     */
    private Integer totalPage;
    /**
     * 当前页数据
     */
    private List<T> items;


    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(){

    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}
