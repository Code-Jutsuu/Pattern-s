public class inverted_star_pyramid {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){
        
        for(int i=n; i>0; i--){
            
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
