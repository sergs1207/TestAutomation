public class DeviceForCutting {
    String deviceForCuttingType; //ножницы или машинка
    String deviceForCuttingManufacturer;
    float deviceForCuttingServiceLife;
    int yearOfIssue;
    boolean deviceForCuttingBattery; //наличие аккамулятора
    float deviceForCuttingWear;
    int deviceForCuttingNozzle;

    public void toCut(){
        //увеличивает на 1.0 значение атрибута deviceForCuttingWear
    }
    public void breakDown(){
        float deviceForCuttingWear;
        deviceForCuttingWear = 100;
    }
    public void sendForWarrantyService(){
        //увеличивает на 1.0 значение атрибута deviceForCuttingServiceLife
    }
    private void instalLargerNozzle(){
        //увеличивает на 3 значение атрибута deviceForCuttingNozzle
    }
    private void installSmallerNozzle(){
        //уменьшает на 3 значение атрибута deviceForCuttingNozzle
    }
    private void cutBald(){
        int deviceForCuttingNozzle;
        deviceForCuttingNozzle = 0;
    }
}