public class Main {
    public static void main(String[] args) {
        Feeder a = new Feeder(1000);
        //a.simulateOneDay(5);
        //System.out.println(a.getEnd());
        int result = a.simulateManyDays(10, 5);
        System.out.println(result);
    }
}