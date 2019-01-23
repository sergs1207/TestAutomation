public class FluorescentLights {
    String fluorescentLightsManufacturer;
    float fluorescentLightsServiceLife;
    String fluorescentLightsType; //тип лампы (газоразрядная ртутная высокого/низкого давления, плазменный дисплей)
    int luminousEfficiency; //светоотдача
    float fluorescentLightsPrice;
    boolean surgeProtection; //наличие механизма защиты от перепадов напряжения
    int lightBrightness;

    public void turnOn(){
        //увеличивает на 1 значение атрибута lightBrightness
    }
    public void turnOff(){
        int lightBrightness;
        lightBrightness=0;
    }
    public void overvoltage(){
        //увеличивает на 5 значение атрибута lightBrightness
    }
    private void switchTheLampOnAndOffOften(){
        //уменьшает на 1 значение атрибута fluorescentLightsServiceLife
    }
    private void wipeTheLamp(){
        //увеличивает на 5 значение атрибута luminousEfficiency
    }
    private void doNotWipeLampEveryLong(){
        //уменьшает на 5 значение атрибута luminousEfficiency
    }
}
