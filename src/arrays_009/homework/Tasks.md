**Дополнительное задание**
<br>Создайте класс **Arrays**.
<br>Создайте массив размерностью в 10 элементов, выведите на экран все элементы массива в обратном
порядке.

**Задание 2**
<br>Создайте класс **CustomerArray**.
<br>Требуется:
<br>Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
массива задает пользователь).
Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
элементов, среднее арифметическое всех элементов, вывести все нечетные значения.

**Задание 3**
<br>Создайте класс **ReversedArray**.
<br>Требуется:
1) Создать метод myReverse(int[] array), который принимает в качестве аргумента массив
   целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
   порядке).
2) Создайте метод int[] subArray(int[] array, int index, int count). Метод возвращает
   часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
   размерностью, которая соответствует значению аргумента count.
   Если аргумент count содержит значение больше чем количество элементов, которые входят в
   выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
   то при формировании нового массива размерностью в count, заполните единицами те элементы,
   которые не были скопированы из исходного массива.
   
**Задание 4**
<br>Создайте класс UserArray.
<br>Требуется:
<br>Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
Создайте метод, который принимает два аргумента, первый аргумент – типа int[] array, второй
аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент, а
элементы получаемого массива в качестве первого аргумента должны копироваться в новый массив
начиная с индекса 1.