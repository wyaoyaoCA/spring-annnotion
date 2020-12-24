package study.wyy.spring.proxy.anli.staticproxy;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 12:25
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        CarCompany carCompany = new CarCompany();
        CarSaleProxy carSaleProxy = new CarSaleProxy(carCompany);
        carSaleProxy.sale(100);
    }
}
