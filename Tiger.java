public class Tiger extends Animal implements Walk {

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + ": I have eaten meat");
    }

    public Tiger() {
        setNameOfAnimal("Tiger");
    }

    private int numberOfStripes;
    private double speed;
    private int soundLevelOfRoar;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed " + getSpeed());
    }
}
