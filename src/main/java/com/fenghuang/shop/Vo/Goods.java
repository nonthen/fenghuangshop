package com.fenghuang.shop.Vo;

import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

//商品实体类
public class Goods {
    private int gid;
    private String gname;
    private MultipartFile Image;
    //    private String gimg;//图片路径
    private byte[] gimg;
    private float gprice;
    private String gdesc;
    private int gnum;
    private int iscar;//是否加入购物车
    private int isshop;//是否直接购买

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public MultipartFile getImage() {
        return Image;
    }

    public void setImage(MultipartFile image) {
        Image = image;
    }

    public byte[] getGimg() {
        return gimg;
    }

    public void setGimg(byte[] gimg){
        //因为图片是以MultipartFile形式上传，所以要将MultipartFile转变成byte型
        //将文件图片转为byte类型
//        InputStream ins = Image.getInputStream();
//        byte[] buffer=new byte[1024];
//        int len=0;
//        ByteArrayOutputStream bos=new ByteArrayOutputStream();
//        while((len=ins.read(buffer))!=-1){
//            bos.write(buffer,0,len);
//        }
//        bos.flush();
//        gimg = bos.toByteArray();
        this.gimg = gimg;
    }

//    public String getGimg() {
//        return gimg;
//    }
//
//    public void setGimg(String gimg) {
//        this.gimg = gimg;
//    }

    public float getGprice() {
        return gprice;
    }

    public void setGprice(float gprice) {
        this.gprice = gprice;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public int getGnum() {
        return gnum;
    }

    public void setGnum(int gnum) {
        this.gnum = gnum;
    }

    public int getIscar() {
        return iscar;
    }

    public void setIscar(int iscar) {
        this.iscar = iscar;
    }

    public int getIsshop() {
        return isshop;
    }

    public void setIsshop(int isshop) {
        this.isshop = isshop;
    }




}
