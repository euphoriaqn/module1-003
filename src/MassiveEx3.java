import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Илья on 09.07.2017.
 */
public class MassiveEx3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // Считывание елементов массива
        while (true)
        try {
            System.out.println("Введите елементы массива через пробел. Пример:  10 20 30 40 3 ");
            String str = scan.nextLine();
            //Преобразование массива string в Int. тут может сорвать exeption
            int[] massive = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            //Инициализация двумерного массива для второго задания. В него будет записываться елемент и количество его повторений
            int masSize = massive.length;
            int[][] countAndElement = new int[masSize][2];
            //Нахождение минимального, максимального елемента массива и кол-во посторений числа 5
            int minNumbMas = massive[0];
            int maxNumbMas = massive[0];
            int indexMin = 0, indexMax = 0, fiveCount =0;
            for (int i =0; i < masSize; i++){
                if (massive[i] < minNumbMas){
                    minNumbMas = massive[i];
                    indexMin = i;
                }
                if (massive[i] > maxNumbMas){
                    maxNumbMas = massive[i];
                    indexMax = i;
                }
                if (massive[i] ==5) fiveCount++;
            }
            System.out.println("Минимальный елемент массива: " + "massive[" + indexMin + "} = " + minNumbMas);
            System.out.println("Максимальный елемент массива: " + "massive[" + indexMax + "} = " + maxNumbMas);
            System.out.println("Количество повторений числа 5 равна " + fiveCount + " повторениям");
            // Сортировка массива
            for(int i = 1; i < massive.length; i++)
            {
                for(int j = i; (j >= 1) && (massive[j] < massive[j - 1]); j--)
                {
                    int a = massive[j];
                    massive[j] = massive[j-1];
                    massive[j-1] = a;
                }
            }
            System.out.println("Отсортированный массив: ");
            for (int i: massive
                    ) {
                System.out.print(i + " ");
            }
            System.out.println();
            // Заполнение двумерного массива [число][количество повторений]
            for(int i = 0; i < massive.length; i++)
            {
                int count = 0;
                for(int j = 0; j < massive.length; j++)
                {
                    if (massive[i] == massive[j])
                        count++;
                    countAndElement[i] [0] = massive[i];
                    countAndElement[i] [1] = count;
                }

            }
            //Инициализация вспомогательных переменных для задания №2
            int nominalMax = 0, numberMax = 0, nominalMin = massive[masSize-1], numberMin = 0;
            //Поиск пары  [максимальное число][повторения]  и  пары [минимальное число]
            for (int i = 0; i < masSize; i++) {
                if (countAndElement[i][1] > nominalMax)  {
                    nominalMax = countAndElement[i][1];
                    numberMax = countAndElement [i][0];
                }
                if (countAndElement[i][1] < nominalMin){
                    nominalMin = countAndElement [i][1];
                    numberMin = countAndElement [i][0];
                }

            }
            System.out.println("Максимальным числом в массиве является число " + numberMax + ", которое повторяется " + nominalMax + " раз/раза");
            System.out.println("Минимальным числом в массиве является число " + numberMin+ ", которое повторяется " + nominalMin + " раз/раза");
            break;
        } catch (Exception e){

        }

    }
}
