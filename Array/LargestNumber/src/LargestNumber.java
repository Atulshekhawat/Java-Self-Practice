public class LargestNumber {

    public static int largestNumber(int[] marks){
        int largest = Integer.MIN_VALUE;

        for (int i=0;i<marks.length;i++){
            if (largest < marks[i]){
                    largest = marks[i];
            }
        }
          return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {23,4,34,43,64,75,57,89,90};

        System.out.println("Largest Number is " + largestNumber(numbers));
    }
}
