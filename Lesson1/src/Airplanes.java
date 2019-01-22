public class Airplanes {
    byte numberOfWings;
    int yearOfIssue;
    int numberOfPassengers;
    String airplanesColor;
    boolean airplanesPilot; //пилотируемый самолёт, беспилотник или гибрид
    String aiprlanesManufacturer;
    float volumeOfTheTank;
    int airplanesSpeed;
    int numberOfEngines;


    public void speedMode(){
        //увеличивает на 100 значение атрибута int airplanesSpeed
    }

    public void slowdown(){
        //уменьшает на 100 значение атрибута int airplanesSpeed
    }

    public void burningEngine(){
        //уменьшает на 1 значение атрибута int numberOfEngines
    }

    private void passengerBoarding(){
        //увеличивает на 50 значение атрибута int numberOfPassengers
    }

    private void disembarkingPassengers(){
        //уменьшает на 50 значение атрибута int numberOfPassengers
    }

    private void stand(){
        int airplanesSpeed;
        airplanesSpeed = 0;
    }

}
