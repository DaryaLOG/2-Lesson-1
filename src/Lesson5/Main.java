package Lesson5;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Age", "Weight", "Height"});
        appData.setData(new int[][]{{22, 55, 165}, {28, 52, 166}, {30, 59, 168}});


        try (PrintWriter out = new PrintWriter("players.txt")){
            out.println(appData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        AppData appData2 = new AppData();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("players.txt"))) {
            String tempString;
            if ((tempString = bufferedReader.readLine()) !=null) {
                String[] values = tempString.split(";");
                appData2.setHeader(values);
            }

            ArrayList<Integer[]> data = new ArrayList<>();
            while ((tempString = bufferedReader.readLine()) !=null) {
                String[] values = tempString.split(";");
                if (values.length == 3){
                    Integer[] arr = new Integer[3];
                    arr[0] = Integer.parseInt(values[0]);
                    arr[1] = Integer.parseInt(values[1]);
                    arr[2] = Integer.parseInt(values[2]);
                    data.add(arr);
                }
            }
            Integer[][] arrInt = data.toArray(new Integer[data.size()][data.get(0).length]);
            int[][] newarr = new int[data.size()][data.get(0).length];
            for (int i = 0; i<arrInt.length; i++) {
                newarr[i][0] = arrInt[i][0];
                newarr[i][1] = arrInt[i][1];
                newarr[i][2] = arrInt[i][2];
            }
            appData2.setData(newarr);

            System.out.println(appData2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
