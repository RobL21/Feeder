public class Main{
    public static void main(String[] args){
        Feeder a = new Feeder(250);
       //a.simulateOneDay(15);
        int result = a.simulateManyDays(10, 5);
        System.out.println(result);
    }
}