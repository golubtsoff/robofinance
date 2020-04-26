public class Task1 {

    public static int calcSumm() throws Exception {
        return sumOfEvenNumbers(4_000_000);
    }

    public static int sumOfEvenNumbers(int maxFibonacciValue) throws Exception {
        if (maxFibonacciValue < 2){
            throw new Exception("Max value should be more than 2");
        }

        int value1 = 1;
        int value2 = 2;
        int sum = 2;
        while (value1 + value2 <= maxFibonacciValue){
            int nextValue = value1 + value2;
            if (nextValue % 2 == 0){
                sum += nextValue;
            }
            value1 = value2;
            value2 = nextValue;
        }
        return sum;
    }
}
