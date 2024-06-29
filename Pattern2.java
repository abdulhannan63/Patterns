import java.util.*;
public class Pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        /*code for this pattern
            ******
            *    *
            *    *
            *    *
            *    *
            ******
         */
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<a;j++){
        //         if(i==0  || i==a-1 || j==0 || j==a-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");

        //         }
        //     }
        //     System.out.print("\n");
        // }

        // pattern 3
        /*
         *  8
            88
            888
            8888
            88888
            888888
         */
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("8");
        //     }
        //     System.out.print("\n");
        // }
        
        // pattern 4
        for(int i=0;i<a;i++){
            for(int k=0;k<a-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
                
            }
            System.out.print("\n");
        }
    }
}
