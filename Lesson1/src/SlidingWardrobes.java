public class SlidingWardrobes {
    String slidingWardrobesMaterial; //из чего изготовлен шкаф
    boolean slidingWardrobesMirror; //наличие зеркала
    int slidingWardrobesNumberFreeShelves;
    int slidingWardrobesHeight;
    int slidingWardrobesWidth;
    int slidingWardrobesClianliness;

    public void installMirror(){
        boolean slidingWardrobesMirror;
        slidingWardrobesMirror = true;
    }
    public void breakTheMirror(){
        boolean slidingWardrobesMirror;
        slidingWardrobesMirror = false;
    }
    public void putThingsInTheCloset(){
        //уменьшает на 1 значение атрибута slidingWardrobesNumberFreeShelves
    }
    private void removeThingsFromTheCloset(){
        //увеличивает на 1 значение атрибута slidingWardrobesNumberFreeShelves
    }
    private void wipeShelves(){
        //увеличивает на 5 значение атрибута slidingWardrobesClianliness
    }
    private void trashInCloset(){
        //уменьшает на 5 значение атрибута slidingWardrobesClianliness
    }

}
