package top.codekiller.leyou.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.codekiller.leyou.service.IGoodsHtmlService;
import top.codekiller.leyou.service.IGoodsService;
import top.codekiller.leyou.service.impl.GoodsService;

import java.util.Map;

@Controller
@RequestMapping("item")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @Autowired
    private IGoodsHtmlService goodsHtmlService;

    /**
     * 跳转到页面详情页
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{id}.html")
    public String toItemPage(Model model,@PathVariable("id")Long id){
        Map<String, Object> map = goodsService.loadData(id);
        model.addAllAttributes(map);

       // this.goodsHtmlService.createHtml(id);
        return "item";
    }

}
