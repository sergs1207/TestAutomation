public class PC {
    String pcManufacturer;
    String pcType; //стационарный, ноутбук, неттоп и т.д.
    String pcModel;
    boolean pcDiskDrive; //наличие дисковода
    float pcPrice;
    String pcOperatingSystem;
    float pcLoadingRAM;
    float pcAvailableMemory;
    int pcScreenBrightness;

    public void launchTheApplication(){
        //увеличивает на 10.0 значение атрибута pcLoadingRAM
    }
    public void disableApplication(){
        //уменьшает на 10.0 значение атрибута pcLoadingRAM
    }
    public void installApp(){
        //уменьшает на 10.0 значение атрибута pcAvailableMemory
    }
    private void removeApp(){
        //увеличивает на 10.0 значение атрибута pcAvailableMemory
    }
    private void makeScreenBrighter(){
        //увеличивает на 5 значение атрибута pcScreenBrightness
    }
    private void makeLessBrightScreen(){
        //уменьшает на 5 значение атрибута pcScreenBrightness
    }
}
