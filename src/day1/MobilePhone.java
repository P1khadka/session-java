package day1;

public class MobilePhone {
    // States
    //Os(String)
   private String oS;
    public void setoS(String oS){
        this.oS=oS;
    }
    public String getoS(){
        return this.oS;
    }
    // color(String)
    private String color;
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    //price(double)
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    // size(int)
    private int size;
    public void setSize(int price){
        this.price=price;
    }

    public int getSize() {
        return size;
    }

    public String getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    //sizeunit(String)
    private String sizeUnit;

    // brand(String)
    private String brand;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return this.brand;
    }
    // storage(int)
    private  int storage;
    public void setStorage(int storage){
        this.storage=storage;
    }
    public int getStorage(){
        return this.storage;
    }
    //storageunit(String)
    private String storageUnit;
    public void setStorageUnit(String storageUnit){
        this.storageUnit=storageUnit;
    }
    public String getStorageUnit(){
        return this.storageUnit;
    }
    // number of cameras(int)
    private int numberOfCamera;
    // connectivity(String)
   private  String connectivity;

    public int getNumberOfCamera() {
        return numberOfCamera;
    }

    public void setNumberOfCamera(int numberOfCamera) {
        this.numberOfCamera = numberOfCamera;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    // battery(String)
   private  String battery;
    // display(String)
   private String display;

    // behaviours
    // buy
    // add to cart
    // share
    // like
    //increase quantity
    //add to wishlist
    //view comments
}
