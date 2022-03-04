import java.util.Random;

public class Rnd{

    int size;
    double ourValues [];

    Rnd(int givenSize, int k){
        size = givenSize;
        Random tmp = new Random();
        ourValues = new double [size];
        for(int j=0;j<size;j++){
             double sum =0;
            for(int i=0;i<k;i++){
                sum +=  tmp.nextDouble();
            }
            ourValues[j]=sum;
        }
    }

    void Print(){
        for(int i=0;i<size;i++){
            System.out.println("["+i+"] = " + ourValues[i]);
        }
    }

    double Min(){
        double tmpMin = ourValues[0];
        for(int i = 0;i<size;i++){
            if(tmpMin>ourValues[i]){
                tmpMin = ourValues[i];
            }
        }
        return tmpMin;
    }

    double Max(){
        double tmpMax = ourValues[0];
        for(int i = 0;i<size;i++){
            if(tmpMax<ourValues[i]){
                tmpMax = ourValues[i];
            }
        }
        return tmpMax;
    }

    double Average(){
        double sum = 0;
        for(int i = 0;i<size;i++){
            sum +=ourValues[i];
        }
        double averageInList = sum/size;
        return averageInList;
    }

    void Draw(){
        System.out.println("Jest problem");
    }
  
}
