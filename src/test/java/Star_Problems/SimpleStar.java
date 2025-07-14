package Star_Problems;

public class SimpleStar {
    public static void main(String[] Args){
        int size = 4 ;
//        leftUpwardTriangle(size);
//        System.out.println("---------------------------------------------------------");
//        leftDownwardTriangle(size);
//        System.out.println("---------------------------------------------------------");
//        rightUpwardTriangle(size);
//        System.out.println("---------------------------------------------------------");
//        rightDownwardTriangle(size);
//        System.out.println("---------------------------------------------------------");
//        leftArrow(size);
        System.out.println("---------------------------------------------------------");
        rightArrow(size);
        System.out.println("---------------------------------------------------------");
//        upArrow(size);
//        System.out.println("---------------------------------------------------------");
//        downArrow(size);
//        System.out.println("---------------------------------------------------------");
    }

    public static void leftUpwardTriangle(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftDownwardTriangle(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = size ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightUpwardTriangle(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = size ; j >= i ; j--){
                System.out.print("  ");
            }

            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightDownwardTriangle(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("  ");
            }

            for(int j = size ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightArrow(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1 ; i <= size ; i++){
            for(int j = size - 1 ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftArrow(int size){
        for(int i = 1 ; i <= size ; i++){
            for(int j = size - 1 ; j >= i ; j--){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("  ");
            }
            for(int k = size - 1 ; k >= i ; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void upArrow(int size) {
        for (int i = 1; i <= size; i++) {
            for(int j = size ; j >= 1 ; j--){
                if(i < j){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    public static void downArrow(int size) {
        for (int i = 1; i <= size; i++) {
            for(int j = 1 ; j <= i ; j++){
               System.out.print(" ");
            }
            for(int j = size ; j >= i ; j--){
                System.out.print("*");
            }
            for(int j = size - 1; j >= i ; j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
