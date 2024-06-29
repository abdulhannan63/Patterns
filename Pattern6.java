/**
 * Pattern 6-9
 */
import java.util.*;
class Pattern6 {
    public static void main(String srg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sc.close();
        // Pattern 6------------------------------------------>
        
        //    *
        //   ** 
        //  *** 
        // ****


        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=a-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Pattern 7------------------------------------------>
        
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567
        // for(int i=1;i<=a;i++){
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Pattern 8------------------------------>
        for(int i=a;i>0;i--){
            
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}