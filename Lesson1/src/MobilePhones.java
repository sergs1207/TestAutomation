public class MobilePhones {
    String mobilePhonesManufacturer;
    String mobilePhonesPhoneModel;
    String mobilePhonesType; //тип телефона (смартфон, КПК, одноразовый телефон, бабушкофон/дедушкофон)
    string mobilePhonesOperatingSystem;
    boolean mobilePhonesTheCamera;
    int mobilePhonesBatteryCapacity;
    boolean mobilePhonesScreenLock;
    boolean mobilePhonesFlashlight;

    public void toChargeBattery(){
        //увеличивает на 10 значение атрибута mobilePhonesBatteryCapacity
    }
    public void startCall(){
        //уменьшает на 10 значение атрибута mobilePhonesBatteryCapacity
    }
    public void lockScreen(){
        boolean mobilePhonesScreenLock;
        mobilePhonesScreenLock = true;
    }
    private void unlockScreen(){
        boolean mobilePhonesScreenLock;
        mobilePhonesScreenLock = false;
    }
    private void turnOnFlashlight(){
        boolean mobilePhonesFlashlight;
        mobilePhonesFlashlight = true;
    }
    private void turnOffFlashlight(){
        boolean mobilePhonesFlashlight;
        mobilePhonesFlashlight = false;
    }

}
