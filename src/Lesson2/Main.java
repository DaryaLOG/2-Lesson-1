package Lesson2;

import com.sun.source.doctree.SummaryTree;

public class Main {
    public static void main(String[] args) {
        try {
            String[][] arrayString = {{"1", "2", "1", "2"}, {"3", "рррр", "1", "2"}, {"5", "6", "1", "2"}, {"5", "6", "1", "2"}};
            calculate(arrayString);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void calculate(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = array.length;
        int cols = array[0].length;

        if (rows != 4 || cols != 4) {
            throw new MyArraySizeException("Неверный размер массива!");
        }
        int summ = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                try {
                    int p = Integer.valueOf(array[row][col]);
                    summ += p;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не число!");
                }
            }
        }
        System.out.println("Сумма всех элементов массива = " + summ);
    }
}
