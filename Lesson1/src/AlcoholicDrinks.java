public class AlcoholicDrinks {
    public byte alcoholVolume; //процент аклоголя на 1 литр продукта
    String alcoholPacking; //тип упаковки (тетрапак, бутылка, картонная упаковка и др.)
    float alcoholPackingVolume; //объём упаковки в литрах
    String alcoholType; //тип напитка (слабоалкогольный или крепкий спиртной напиток)
    String alcoholName;
    String alcoholManufacturer;
    boolean alcoholPopularity;
    int numberOfBottles;
    float pricePerBottle;

    public void drinkUp(){
        //уменьшает на 1 значение атрибута numberOfBottles
    }
    public void buyMore(){
        //увеличивает на 1 значение атрибута numberOfBottles
    }
    public void addMoreAlcohol(){
        //увеличивает на 5 значение атрибута alcoholVolume
    }
    private void dilute(){
        //уменьшает на 5 значение атрибута alcoholVolume
    }
    private void increaseThePrice(){
        //увеличивает на 1.0 значение атрибута pricePerBottle
    }
    private void reduceThePrice(){
        //уменьшает на 1.0 значение атрибута pricePerBottle
    }
}
