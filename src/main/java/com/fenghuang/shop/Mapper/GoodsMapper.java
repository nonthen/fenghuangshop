package com.fenghuang.shop.Mapper;

import com.fenghuang.shop.Vo.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsMapper {

    @Insert("insert into goods (gname,gprice,gdesc,gnum,gimg)values(#{goods.gname},#{goods.gprice},#{goods.gdesc},#{goods.gnum},#{goods.gimg})")
    void addgoods(@Param("goods") Goods goods);

}
