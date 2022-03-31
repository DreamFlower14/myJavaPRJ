public class True {
    public static void main(String[] args) {
        int inc = 2, j, i;
        for( j = 1; j <= 4; j++){
            for( i = 1; i < 5; i++) {
            if( i < inc ){
                System.out.print("*");
            }
            }
            System.out.println();
            inc++;
        }

    }
}
