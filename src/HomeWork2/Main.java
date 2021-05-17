package HomeWork2;

public class Main {
    public static void main(String[] args) {
        String[][] oneArrays = {
                {"1","2","3","4"},
                {"5","a","7","8"},
                {"11","12","13","14"},
                {"15","16","17","18"}
        };


        String[][] twoArrays = {
                {"1","2","3","4"},
                {"5","7","8"},
                {"11","12","13","14"},
                {"15","16","17","18"}
        };

        String[][] threeArrays = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"11","12","13","14"},
                {"15","16","17","18"}
        };

        try {
            //checkArrays.checkTwoDimArrays(oneArrays);
            //checkArrays.checkTwoDimArrays(twoArrays);
            checkArrays.checkTwoDimArrays(threeArrays);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
