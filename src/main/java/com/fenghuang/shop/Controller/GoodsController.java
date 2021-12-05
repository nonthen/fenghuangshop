package com.fenghuang.shop.Controller;

import com.fenghuang.shop.Service.GoodsService;
import com.fenghuang.shop.Vo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/addgoodsPage")
    public String addGoodsPage(Model model){//返回发布商品界面
        return "addgoods";
    }

    @RequestMapping("/addgoods")
    public String addGoods(Goods goods){//将界面上的发布商品的信息加入goods表中，然后返回发布商品界面

        goodsService.add(goods);
        if (goods!=null){
            System.out.println("商品发布成功");
        }
        return "redirect:/addgoodsPage";
    }

}
