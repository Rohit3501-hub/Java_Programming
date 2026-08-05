package SmartHomeSystem;

class SmartTV implements Switchable, InternetConnected {
    private String brand;
    private String model;
    private int screenSize;
    private String wifiName;

    public SmartTV(String brand, String model, int screenSize, String wifiName) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.wifiName = wifiName;
    }


    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turned off.");
    }


    public void displayDeviceDetails() {
        System.out.println("Smart TV Details:"
                + "Brand: " + brand
                + "\nModel: " + model
                + "\nScreen Size: "+ screenSize + " inches "
                + "\nWi-Fi Name: " + wifiName
        );

    }


    @Override
    public void connectTowifi() {
        System.out.println("connect the wifi");
    }

    @Override
    public void disconnectTowifi() {
        System.out.println("Disconnect the wifi");

    }
}