public class Penguin extends Animal implements Walk, Swim{
    @Override
    public void eatingCompleted() {

    }

    public Penguin() {
        setNameOfAnimal("Penguin");
    }

    private boolean isSwimming;
    private double walkSpeed;
    private double swimSpeed;

    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean swimming) {
        isSwimming = true;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void swimming() {

    }

    @Override
    public void walking() {

    }
}
