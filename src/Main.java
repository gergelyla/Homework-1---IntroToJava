import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
       //calculateSumOfFirst100Numbers();
       //minimumOfArray();
       maxDigit();
    }

    private static void maxDigit() {
        int number=5819;
        maxDigit();
    }

    private static void minimumOfArray() {
        int array[]={10,5,-10,8,75};
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Minimul din array este: "+min);
    }

    private static void calculateSumOfFirst100Numbers() {
        int sum=0;
        for (int i=1;i<101;i++){
            sum=sum+i;
        }
        System.out.println("Suma primelor 100 numere mai mari de 0 este: "+sum);
    }
}
