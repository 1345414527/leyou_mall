package top.codekiller.leyou.controller;


import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.codekiller.leyou.pojo.Cart;
import top.codekiller.leyou.service.ICartService;

import java.util.List;

@Controller
public class CartController {

    @Autowired
    private ICartService cartService;


    /**
     * 添加购物车信息
     * @param cart
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> addCart(@RequestBody Cart cart){
            this.cartService.addCart(cart);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    /**
     * 获取购物车信息
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Cart>> queryCards(){
        List<Cart> carts=this.cartService.queryCards();
        if(CollectionUtils.isEmpty(carts)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carts);
    }


    /**
     * 更新sku的数量
     * @param cart
     * @return
     */
    @PutMapping
    public ResponseEntity<Void> updateNum(@RequestBody Cart cart){
        this.cartService.updateCart(cart);
        return ResponseEntity.noContent().build();
    }



}
