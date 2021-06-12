package HomeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData {

    private static String[] header;
    private static int[][] data;

    public AppData() {
        header = new String[]{"Value1", "Value2", "Value3"};
        data = new int[][]{{100, 200, 123}, {300, 400, 500}};
    }

    static String separator = ";";

    public static void saveFileInCsv() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("csvFile.csv"))) {
            String listHeader = "";
            for (String head: header){
                listHeader = listHeader + head + separator;
            }
            listHeader += "\n";
            bufferedWriter.write(listHeader);
            String listData = "";
            for (int i = 0; i < data.length; i++){
                for (int j = 0; j < data[i].length; j++) {
                    listData = listData + data[i][j] + separator;
                }
                listData += "\n";
            }
            bufferedWriter.write(listData);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadCsvFile(String csvFile){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))){
            header = bufferedReader.readLine().split(separator);
            String line;
            ArrayList<int[]> intArrayList = new ArrayList<>();
            while((line = bufferedReader.readLine()) != null ){
                String[] arraysStringValues = line.split(separator);
                int[] arraysIntValues = new int[arraysStringValues.length];
                for (int i = 0; i < arraysStringValues.length; i++) {
                    arraysIntValues[i] = Integer.parseInt(arraysStringValues[i]);
                }
                intArrayList.add(arraysIntValues);
                data = intArrayList.toArray(new int[][]{});
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AppData appData = new AppData();
        //AppData.saveFileInCsv();
        AppData.loadCsvFile("csvFile.csv");
        System.out.println(Arrays.toString(AppData.header));
        System.out.println(Arrays.deepToString(AppData.data));
    }


}