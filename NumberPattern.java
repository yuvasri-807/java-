import java.util.*;
public class NumberPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, num=0;
        int diff = 2;
        int count = 0;
        System.out.println("Enter number of terms:");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(num+" ");
            num = num + diff;
            count++;
            if(count == 2){
                diff = diff + n;
                count = 0;
            }
        }


    }
    
}


    

