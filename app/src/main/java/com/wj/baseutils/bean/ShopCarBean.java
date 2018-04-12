package com.wj.baseutils.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wj on 2018/4/11.
 * 购物车数据
 */

public class ShopCarBean implements Serializable {

    public ShopCarBean(String shopname, List<ShopCarProductItem> item) {
        this.shopname = shopname;
        this.item = item;
    }

    public String shopname;//店铺名称
    public List<ShopCarProductItem> item;//商品Item

    public static class ShopCarProductItem implements Serializable {
        public String img;//商品图片
        public String productname;//商品名称
        public int quantity;//商品数量
        public String price;//商品价格
        public String category;//商品类别


        public ShopCarProductItem(String img, String productname, int quantity, String price, String category) {
            this.img = img;
            this.productname = productname;
            this.quantity = quantity;
            this.price = price;
            this.category = category;
        }
    }


    /**
     * 制作购物车假数据
     */
    public static List<ShopCarBean> createLocalDate() {
        List<ShopCarBean> data = new ArrayList<>();

        List<ShopCarBean.ShopCarProductItem> list = new ArrayList<>();
        ShopCarBean.ShopCarProductItem item = new ShopCarBean.ShopCarProductItem("",
                "太平鸟男装2018春款灰色男士商务休闲牛津纺别致刺绣男士衬衫"
                , 1, "279", "灰色;XL");
        list.add(item);
        ShopCarBean shopCarBean = new ShopCarBean("太平鸟", list);


        List<ShopCarBean.ShopCarProductItem> list2 = new ArrayList<>();
        ShopCarBean.ShopCarProductItem item2 = new ShopCarBean.ShopCarProductItem("",
                "【到手价5388】Apple/苹果 IPhone 8 plus 64G全网通手机"
                , 1, "6688", "无合约版;金色;官方标配");

        ShopCarBean.ShopCarProductItem item3 = new ShopCarBean.ShopCarProductItem("",
                "【限时优惠】Apple/苹果 IPhone 6 32G全网通4G手机"
                , 1, "2048", "4G全网通;金色;官方标配;32G");

        list2.add(item2);
        list2.add(item3);
        ShopCarBean shopCarBean2 = new ShopCarBean("苏宁易购官方旗舰店", list2);

        data.add(shopCarBean);
        data.add(shopCarBean2);

        return data;
    }
}
