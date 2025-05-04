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
    private int soundLevel;

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

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed " + getSpeed());
    }
}
