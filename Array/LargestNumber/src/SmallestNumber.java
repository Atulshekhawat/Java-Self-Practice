public class SmallestNumber {

    public static int smallestNumber(int[] numbers){
        int smallest = Integer.MAX_VALUE;

        for (int i=0;i<numbers.length;i++){
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest ;
    }

    public static void main(String[] args) {
        int[] numbers = {23,64,34,43,64,75,57,89,90};

        System.out.println("Smallest Value is :" +smallestNumber(numbers));
    }
}
