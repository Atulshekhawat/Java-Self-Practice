public class BasicPattern {

    public static  void solidRectangle(){
        System.out.println("Rectangular Pattern");
        for (int i=1;i<=3;i++){
            for (int j=1;j<=7;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void halfPyramid(){
        System.out.println("Half Pyramid Pattern Star");
        int n=5;

        for (int i=0;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void halfPyramidWithNumber(){
        System.out.println();
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }

    public static void reverseHalfPyramid(){
        System.out.println("Inverted Half Pyramid");
        int n=5;
         for (int i=n;i>=1;i--){
             for (int j=1;j<i;j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }

    public static  void invertedHalfPyramidWithNumber(){
        System.out.println("Inverted Half Pyramid With Number");
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void reverseHalfPyramid180(){
        System.out.println("Reverse Half Pyramid 180 rotated");
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void characterPattern(){
         char ch='A';
         int n=5;
        for (int i = 0; i <= n; i++) {
            for (int j=0;j<=i;j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void demo(){
        int n=5;
        char ch='A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRectangle();
        halfPyramid();
        halfPyramidWithNumber();
        reverseHalfPyramid();
        reverseHalfPyramid180();
        invertedHalfPyramidWithNumber();
        characterPattern();
        demo();
    }
}
