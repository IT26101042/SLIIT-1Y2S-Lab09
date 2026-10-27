package Q04;

// a)
class Device {
    private String deviceId;
    private String deviceType;

    // b)
    private static int deviceCount;

    // c)
    static {
        deviceCount = 100;
    }

    // d)
    public Device(String deviceId, String deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        deviceCount++;
    }

    // e)
    public static void displayDeviceCount() {
        System.out.println("Device Count: " + deviceCount);
    }

    // f)
    public void displayDeviceInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Type: " + deviceType);
        System.out.println();
    }
}

public class Q04 {
    public static void main(String[] args) {
        System.out.println("---- Initial Count ----");
        Device.displayDeviceCount();

        // f)
        Device device1 = new Device("D001", "Laptop");
        Device device2 = new Device("D002", "Printer");
        Device device3 = new Device("D003", "Scanner");


        System.out.println("\n---- Device Details ----");
        device1.displayDeviceInfo();
        device2.displayDeviceInfo();
        device3.displayDeviceInfo();


        System.out.println("---- Final Count ----");
        Device.displayDeviceCount();
    }
}