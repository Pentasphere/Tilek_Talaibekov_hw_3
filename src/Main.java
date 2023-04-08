import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 30) - 15;
            String rounding1 = String.format("%.2f",array[i]);
            System.out.println(rounding1);
        }
        System.out.println("------------------------------------------------------|");
        int sumOfPositiveNumbersAfterCondition = 0;
        double positiveNumbersAfterCondition = 0;
        boolean proverka = false;
        for (double elementOfArray : array) {
            if(elementOfArray < 0) {
                proverka = true;
            } else if (elementOfArray > 0 && proverka) {
                positiveNumbersAfterCondition += elementOfArray;
                sumOfPositiveNumbersAfterCondition++;
                System.out.println(elementOfArray);
            }

        }
        System.out.println("The value of the arithmetic mean is: " + positiveNumbersAfterCondition/sumOfPositiveNumbersAfterCondition);
        System.out.println("------------------------------------------------------|");

        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}