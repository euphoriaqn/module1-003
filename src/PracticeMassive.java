/**
 * Created by Илья on 09.07.2017.
 */
import java.util.Scanner;
public class PracticeMassive {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of massive ");
        int masSize = scan.nextInt();
        int[] massive = new int[masSize];
        // Считывание елементов массива
        for(int j = 0; j<masSize; j++) {

            System.out.println("Enter element " + j + "");
            massive[j] = scan.nextInt();
        }
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

    }
}
