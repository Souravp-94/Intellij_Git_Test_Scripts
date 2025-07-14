package Star_Problems;

public class NumberStar {
    public static void main(String[] Args){
        int size = 5 ;
        leftUpwardNumTriangle(size);
        System.out.println("---------------------------------------------------------");
        leftDownwardNumTriangle(size);
        System.out.println("---------------------------------------------------------");
//        rightArrow(size);
//        System.out.println("---------------------------------------------------------");
//        rightUpwardTriangle(size);
//        System.out.println("---------------------------------------------------------");
//        rightDownwardTriangle(size);
//        System.out.println("---------------------------------------------------------");
//        leftArrow(size);
//        System.out.println("---------------------------------------------------------");
    }

    public static void leftUpwardNumTriangle(int size){
        int counter = 1 ;
        for(int i = 1 ; i <= size ; i++){
//            int counter = 1 ;
            for(int j = 1 ; j <= i ; j++){
                System.out.print(counter + " ");
//                counter++;
            }
            counter++;
            System.out.println();
        }
    }

    public static void leftDownwardNumTriangle(int size){
        int counter = 1 ;
        for(int i = 1 ; i <= size ; i++){
            for(int j = size ; j >= i ; j--){
                System.out.print(counter + " ");
//                counter++;
            }
            System.out.println();
        }
    }

    public static void rightUpwardTriangle(int size){

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
}
