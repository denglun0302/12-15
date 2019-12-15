import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
           int[] a=new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            int f=sc.nextInt();

            int count=0;
            for(int i=0;i<a.length;i++){
                if(f==a[i]){
                    count++;
                }
            }
            System.out.println(count);


        }

    }
}

