import java.lang.*;

public class Add{
    void add(int ... x){
        int sum = 0;
        for(int i = 0; i < x.length -1; i++){
            sum += x[i];
            System.out.print(x[i] + " + ");
        }
        sum += x[x.length -1];
         System.out.println(x[x.length -1] + " = " + sum);
    }


}