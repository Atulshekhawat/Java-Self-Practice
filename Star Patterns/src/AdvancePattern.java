public class AdvancePattern {

    public static void hollowRectangle(){
        int n=4;
        int m=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (i==1||j==1||i==n||j==m){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public  static void invertedRotatedHalfPyramid(){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void floydTriangle(){
        int n=5,counter=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void  zero_one_triangle(){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static  void  butterflyPattern(){
        int n=5;
//        1st part
        for (int i = 1; i <= n; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
//        2nd Part
        for (int i=n;i>=0;i-- ){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=5;j++){
                if (i==1 || j==1 || i==5 || j==5) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public  static void diamondShape(){
        for (int i=1;i<=5;i++){
//            inner loop for space
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
//            inner loop for stars
            for (int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
            System.out.println();
            }

        for (int i=5;i>=1;i--){
//            inner loop for space
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

//            inner loop for stars
            for (int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
        public  static void mirroredRightTriangle(){
        int n=7;
        for (int i=1;i<=n;i++){
//            inner loop for space
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
//            inner loop for star
            for (int j=1;j<=i;j++) {
                if (i == 1 || j == 1 || j == i || i==n ){  //not able to print the last line for this triangle
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void invertedRightTriangle(){
        int n=4;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                if (i == 1 || j == 1 || i == n || j == n) { //how to print star at (2,3) and (3,2)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle();
        invertedRotatedHalfPyramid();
        floydTriangle();
        zero_one_triangle();
        butterflyPattern();
        solidRhombus();
        hollowRhombus();
        diamondShape();
        mirroredRightTriangle();
        invertedRightTriangle();
    }
}
