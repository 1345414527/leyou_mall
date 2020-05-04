package top.codekiller.leyou.service;


import top.codekiller.leyou.pojo.Cart;

import java.util.List;

public interface ICartService {

    /**
     * 添加购物车信息
     * @param cart
     */
    void addCart(Cart cart);


    /**
     * 获取购物车信息
     * @return
     */
    List<Cart> queryCards();


    /**
     * 更新sku的数量
     * @param cart
     */
    void updateCart(Cart cart);
}
