public class Snowblower {
    String snowblowerManufacturer;
    String snowblowerEngineType; // тип двигателя (электрический, бензиновый, дизельный)
    String snowblowerChassisType; //тип шасси (электролопаты, колёсные, гусеничные)
    boolean snowblowerReverse;
    boolean snowblowerHeadlights;
    int snowblowerPrice;
    int snowblowerSpeed;

    public void goBack(){
        boolean snowblowerReverse;
        snowblowerReverse = true;
    }
    public void goForward(){
        boolean snowblowerReverse;
        snowblowerReverse = false;
    }
    public void useHeadlights(){
        boolean snowblowerHeadlights;
        snowblowerHeadlights = true;
    }
    private void turnOffHeadlights(){
        boolean snowblowerHeadlights;
        snowblowerHeadlights = false;
    }
    private void lateForParty(){
        //увеличивает на 100 значение атрибута snowblowerSpeed
    }
    private void turnОffTheSnowblower(){
        int snowblowerSpeed;
        snowblowerSpeed = 0;
    }

}
