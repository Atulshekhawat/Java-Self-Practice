public class BasicPattern {

    public static  void solidRectangle(){
        System.out.println("Rectangular Pattern");
        for (int i=0;i<=3;i++){
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

    public static void main(String[] args) {
        solidRectangle();
        halfPyramid();
    }
}
