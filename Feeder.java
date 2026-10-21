public class Feeder {

    private int currentFood;
    private int consumedAmount;
    private double rdm = Math.random();

    public Feeder(int cF) {
    currentFood = cF;
    }

    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.95) {

            while (rdm > 0.5) {
                rdm = Math.random();
            }
            consumedAmount = (int) rdm;

            for (byte i = 0; i < numBirds; i++) {
                if (currentFood <= 0) {
                    currentFood = 0;
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