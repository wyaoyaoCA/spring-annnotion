package study.wyy.spring.proxy.anli.staticproxy;

import study.wyy.spring.proxy.anli.CarSale;
import study.wyy.spring.proxy.anli.staticproxy.CarCompany;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 12:21
 * @description:
 */
public class CarSaleProxy implements CarSale {
    private CarCompany carCompany;

    public CarSaleProxy(CarCompany carCompany) {
        this.carCompany = carCompany;
    }

    /**
     * 真正销售汽车还是调用汽车公司的销售汽车的方法
     * @param price
     */
    @Override
    public void sale(Integer price) {
        System.out.println("收取手续费");
        carCompany.sale(price);
        System.out.println("汽车入户");
    }
}
