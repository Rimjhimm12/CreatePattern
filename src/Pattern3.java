public class Pattern3 {
    public static void main(String[] args) {
        int x =10;
        for(int i = 1; i<=x; i++){

            for(int j = x-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int n = 1; n<=i; n++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
