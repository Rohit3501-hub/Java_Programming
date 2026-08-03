package JavaAssessmentPaper;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {12, 15, 9, 18, 30,21};
        int max = arr[0];
        int min = arr[0];
        int even= 0;
        int odd = 0;
        int sum = 0;
        //int size=0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if(arr[i]%2==0){
                even ++;
            }else {
                odd++;
            }

            sum = sum + arr[i];
        }
        double size =0;
        double average = (double) sum / size;

        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The Average : "+ average);
        System.out.println("The Even is : "+even);
        System.out.println("The Odd is : "+ odd);
    }
}

