public class Food {
    float foodProtein;
    float foodFats;
    float foodCarbohydrates;
    boolean foodVitamins;
    String kindOfFood; //растительная или животная
    String foodName;
    int foodTaste;

    public void fryInOil(){
        //увеличивает на 10.0 значение атрибута foodFats
    }
    public void steamed(){
        boolean foodVitamins;
        foodVitamins = true;
    }
    public void boilInWater(){
        boolean foodVitamins;
        foodVitamins = false;
    }
    private void addSugar(){
        //увеличивает на 10.0 значение атрибута foodCarbohydrates
    }
    private void toSalt(){
        //увеличивает на 10 значение атрибута foodTaste
    }
    private void toSaltAndPepper(){
        //увеличивает на 25 значение атрибута foodTaste
    }
}
