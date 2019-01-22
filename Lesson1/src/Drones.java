public class Drones {
    boolean dronesHasCamera; //наличие камеры
    String dronesManufacturer;
    float dronesPrice; //стоимость
    String droneType; //степень автономности (управляемый дистанционно или полностью автоматический)
    float dronesFlyingHeight;
    int dronesYearOffIssue;
    int dronesSpeed;

    public void speedMode(){
        //увеличивает на 10 значение атрибута int dronesSpeed
    }

    public void slowdown(){
        //уменьшает на 10 значение атрибута int dronesSpeed
    }

    public void stand(){
        int dronesSpeed;
        dronesSpeed = 0;
    }

    private void takeoff(){
        //увеличивает на 100 значение атрибута int dronesFlyingHeight
    }

    private void landing(){
        //уменьшает на 100 значение атрибута int dronesFlyingHeight
    }

    private void toFall(){
        int dronesFlyingHeight;
        dronesFlyingHeight = 0;
    }

}

