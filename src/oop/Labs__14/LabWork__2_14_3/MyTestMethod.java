package oop.Labs__14.LabWork__2_14_3;

public class MyTestMethod <T extends Number>{

    public static <T> T calculateSum(T[] array, T maxValue) {
        T result = null;
        if(maxValue instanceof Integer) {
            Integer sum = 0;
            for (T t : array) {
                if((Integer) t > (Integer) maxValue) {
                    sum += (Integer)t;
                }
            }
            result = (T) sum;
        } else if(maxValue instanceof Double) {
            Double sum = 0.0;
            for (T t : array) {
                if((Double) t > (Double) maxValue) {
                    sum += (Double)t;
                }
            }
            result = (T) sum;
        }

        return result;
    }
}
