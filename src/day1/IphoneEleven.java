package day1;

public class IphoneEleven {
    public static void main(String[] args) {
        MobilePhone iPhoneEleven= new MobilePhone();
        iPhoneEleven.setSize(10);
        iPhoneEleven.setBrand("Apple");
        iPhoneEleven.setColor("Black");
        iPhoneEleven.setoS("ios");
        iPhoneEleven.setPrice(2000.25);
        iPhoneEleven.setBattery("Li-Polymer");
        iPhoneEleven.setConnectivity("LTE");
        iPhoneEleven.setNumberOfCamera(2);
        System.out.println(iPhoneEleven.getBrand());
        System.out.println(iPhoneEleven.getColor());
        System.out.println(iPhoneEleven.getDisplay());
        System.out.println(iPhoneEleven.getBattery());
        System.out.println(iPhoneEleven.getConnectivity());
        System.out.println(iPhoneEleven.getNumberOfCamera());
        System.out.println(iPhoneEleven.getPrice());


    }
}
