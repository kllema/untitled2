//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int min = 0;
       int max = 0;
       int[]arr = {45,78,-15,12,34,6,90,7,-2,-45};
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
System.out.println(min);
System.out.println(max);

        int[]arr1 = {45,78,-15,12,34,6,90,7,-2,-45};
        int[]num =new int[10];
        int[]num2 = new int[10];
        int index1 = 0;
        int index2 = 0;
        for (int j : arr1) {
            if (j % 2 != 0) {
                num[index1] = j;
                index1++;

            } else {
                num2[index2] = j;
                index2++;


            }
        }
        System.out.println("нечётные:");
        for (int j : num) {
            if (j == 0) {
                continue;

            }
            System.out.println(j);

        }
        System.out.println("чётные:");
        for (int j : num2) {
            if (j == 0) {
                continue;

            }
            System.out.println(j);
        }


    }
}