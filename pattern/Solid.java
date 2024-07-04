package pattern;

public class Solid {
    public static void main(String[] args) {
        int y = 5;
		System.out.println("*");
		for (int i = 2; i<=y-1; i++) {
			System.out.print("* ");
			for ( int j = 1; j<=i-2; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
		if (y>1) {
		for ( int j = 1; j <= y; j++) {
			System.out.print("* ");
		}
		}
        // MANY PATTERN'S MADE
        int t = 4;
        int m = 5;
        for (int i = 1; i<=t; i++){
            for ( int j = 1; j<=m; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        // System.out.println();
            for ( int i = t; i>=1; i-- ){
                for( int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                    System.out.println();
            }
                int l = 4;
                // outer loop 
                for ( int i =1; i<=l; i++){
                    // inner loop  -> space prrint 
                    for ( int j =1; j<=l-i; j++){
                        System.out.print(" ");
                    }
                    //  inner loop -> star print 
                    for ( int j = 1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                // finish
                int n = 5;
                for ( int i = 1; i<=n; i++) {
                    //  1st part
                    for ( int j = 1; j<=i; j++){
                        System.out.print("*");
                    }
                    // space
                    int space = 2*( n-i);
                    for ( int j = 1; j<= space; j++){
                        System.out.print(" ");
                    }
                    for ( int j = 1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                //  lower part 
                for ( int i = n; i>=1; i--) {
                    // 1st part 
                    for ( int j = 1; j<=i; j++) {
                        System.out.print("*");
                    }
                    //     SPACES
                    int space = 2*( n-i);
                    for ( int j = 1; j<= space; j++){
                        System.out.print(" ");
                    }
                    // 2nd PART
                    for ( int j = 1; j<= i; j++) { 
                        System.out.print("*");
                    }
                    System.out.println();
                }
                                

                int k = 5;
                for ( int i = 1; i<=k; i++){
                    for ( int j = 1; j<=k-i; j++){
                        System.out.print(" ");
                    }
                    for ( int j = 1; j<=i; j++){
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                 
                

    }
    
}
