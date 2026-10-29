public class Feeder {

    private int currentFood;
    private int consumedAmount;
    private int endAmount;

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
        
        endAmount = currentFood;
    }

    public int simulateManyDays(int numBirds, int numDays) {

        int days = 0;

        if (currentFood == 0) {
            return 0;
        }

        for (byte i = 0; i < numDays; i++) {

            simulateOneDay(numBirds);
            if (endAmount > 0) {
                days++;
            } else if (endAmount == 0) {
                days++;
                break;
            }

        }
        return days;

    }

    public int getEnd() {
        return endAmount;
    }

}