package com.fenghuang.shop.Service;

import com.fenghuang.shop.Mapper.GoodsMapper;
import com.fenghuang.shop.Vo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    //图片暂时无法实现
    public void add(Goods goods) {
        try {

            //因为图片是以MultipartFile形式上传，所以要将MultipartFile转变成byte型
//            InputStream ins = goods.getImage().getInputStream();

            byte[] bytes = goods.getImage().getBytes();
            goods.setGimg(bytes);


//            byte[] buffer=new byte[1024];
//            int len=0;
//            ByteArrayOutputStream bos=new ByteArrayOutputStream();
//            while((len=ins.read(buffer))!=-1){
//                bos.write(buffer,0,len);
//            }
//            bos.flush();
//            byte data[] = bos.toByteArray();//图片的byte类型
//            goods.setGimg(data);//绑定图片byte，上传到Mysql云数据库中

        } catch (IOException e) {
            e.printStackTrace();
        }
        goodsMapper.addgoods(goods);
    }

}
