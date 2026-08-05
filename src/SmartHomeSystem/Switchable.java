package SmartHomeSystem;

 interface Switchable {

    void turnOn();

    void turnOff();
}

interface InternetConnected {
    void connectTowifi();

    void disconnectTowifi();
}