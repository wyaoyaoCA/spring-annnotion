package study.wyy.spring.proxy.anli.staticproxy;

import study.wyy.spring.proxy.anli.CarSale;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 12:19
 * @description:
 */
public  class CarCompany implements CarSale {
    @Override
    public void sale(Integer price) {
        System.out.println("售出一辆汽车");
    }
}
