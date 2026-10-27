public class Feeder {

    private int currentFood;
    private int consumedAmount;

    public Feeder(int cF) {
        currentFood = cF;
    }

    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.95) {
            consumedAmount = (int) (Math.random() * (50 - 10 + 1) + 10);
            
            for (byte i = 0; i < numBirds; i++) {
                if (currentFood <= 0) {
                    currentFood = 0;
                    break;
                } else {
                    currentFood -= consumedAmount;
                }
            }
        } else {
            currentFood = 0;
        }
        System.out.println(currentFood);
    }

}