package Lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public AppData() {
    }

    @Override
    public String toString() {
        String temp = "";
        for (String col: header) {
            temp += col + ";";
        }
        temp += "\n";

        for (int [] str: data) {
            temp += String.valueOf(str[0]) + ";" + String.valueOf(str[1]) + ";" +String.valueOf(str[2]) + ";\n";
        }
        return temp;
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }
}
