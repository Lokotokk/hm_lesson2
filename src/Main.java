//  Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
//
// задание 1 доп необязательное
//        Доработать алгоритм сортировки подсчетом для и отрицательных чисел.
//
// задание 2 доп необязательное
//        Аналитически обосновать в каких случаях эффективнее применять быструю сортировку, а когда сортировку подсчетом. Произвести ряд экспериментов с различной длиной массивов и различным диапазоном значений. Оценить и интерпретировать результаты экспериментов, соотнести с теоретическими выкладками.
//
// задание 3 доп необязательное VERY HARD
//
//        Надо сделать имитацию БД по хранению чисел.
//
//        шаг 1 - генерируем список со случайной длиной , со случайным минимальных значением и случайным максимальным. Можно вывести на экран.
//        шаг 2 - ваша программа выбирает наилучший вариант сортировки исходя из параметров входного массива - как минимум, из двух вариантов - из сортировки подсчетом и из быстрой сортировки.
//        шаг 3 - производится сортировка и создается некая коллекция данных, которая хранит в себе первоначальное расположение элементов. Засекаем время выполнения и выводим на экран.
//        шаг 4 - вы вводите число с клавиатуры, далее выполняется бинарный поиск всех таких значений. Засекаем время выполнения и выводим на экран.
//        шаг 5 - вам выводятся индексы первоначального списка с шага 1, где находились такие числа.
//
//        шаги 4-5 можно сделать внутри цикла while True.
//
//        Мораль этого задания - можно помучиться один раз, выполнить сортировку, зато потом будет очень быстрый поиск элементов.
//
//        Пример работы программы - на входе массив [0 ,1 ,5 ,8 99, 100,1]
//        Вы ввели -> 1
//        вам выдается 1,6 то есть значение 1 в первоначальном списке находилось на позициях 1 и 6

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i --)
            heapify(array, array.length, i);

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if(leftChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }
}