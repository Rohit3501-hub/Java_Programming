package Pattern;

public class FabinacciSeries {
    public void main(String[] args) {
        int num1=0;
        int num2=1;
        int num3=1;
      for(int i=0;i<6;i++){
          System.out.print(num1+" ");
         num3 =num1+num2;
         num1 = num2;
         num2 = num3;
      }
    }
}

