public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль.");
        byte gpu = 4;
        short ram = 16;
        int maxPowerGpu = 85;
        long ssdVolume = 512;
        float cpuFrequence = 3.3f;
        double osBuild = 22000.795d;
        char audio = 'R';
        boolean isGaming = true;
        System.out.println("Операционная система: Windows 11 сборки " + osBuild);
        System.out.println("Процессор: AMD Ryzen 5 5600H " + cpuFrequence + "GHz");
        System.out.println("Накопитель: SSD SAMSUNG_MZALQ512 " + ssdVolume + "GB");
        System.out.println("Оперативная память: " + ram + "GB");
        System.out.println("Видеокарта: NVIDIA GeForce RTX 3050 Laptop GPU " + gpu + "GB");
        System.out.println("Максимальное энергопотребление видеокарты: " + maxPowerGpu + "W");
        System.out.println("Звуковая карта: Realtek(" + audio + ")");
        System.out.println("Игровой компьютер: " + isGaming);

        System.out.println("\n2. Расчёт стоимости товара со скидкой.");
        double penPrice = 100;
        double bookPrice = 200;
        double discountAmount = (penPrice + bookPrice)* 0.11;
        System.out.println("Сумма скидки = " + discountAmount);
        System.out.println("Стоимость товаров, с учётом скидки = " + (penPrice + bookPrice - discountAmount));

        System.out.println("\n3. Вывод на консоль слова JAVA.");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных.");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println("Первоначальное значение 'byte': " + byteMax);
        System.out.println("Значение 'byte' после инкремента: " + ++byteMax);
        System.out.println("Значение 'byte' после декремента: " + --byteMax);
        System.out.println("Первоначальное значение 'short': " + shortMax);
        System.out.println("Значение 'short' после инкремента: " + ++shortMax);
        System.out.println("Значение 'short' после декремента: " + --shortMax);
        System.out.println("Первоначальное значение 'int': " + intMax);
        System.out.println("Значение 'int' после инкремента: " + ++intMax);
        System.out.println("Значение 'int' после декремента: " + --intMax);
        System.out.println("Первоначальное значение 'long': " + longMax);
        System.out.println("Значение 'long' после инкремента: " + ++longMax);
        System.out.println("Значение 'long' после декремента: " + --longMax);

        System.out.println("\n5. Перестановка значений переменных.");
        int num1 = 1;
        int num2 = 2;
        int temp = num1;
        System.out.println("Первоначальное значение первой переменной: " + num1);
        System.out.println("Первоначальное значение второй переменной: " + num2);
        System.out.println("Перестановка значений переменных с помощью третьей переменной:");
        num1 = num2;
        num2 = temp;
        System.out.println("Значение первой переменной после перестановки: " + num1);
        System.out.println("Значение второй переменной после перестановки: " + num2);
        System.out.println("Перестановка значений переменных с помощью арифмитический действий:");
        num2 += num1;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("Значение первой переменной после перестановки: " + num1);
        System.out.println("Значение второй переменной после перестановки: " + num2);
        System.out.println("Перестановка значений переменных с помощью побитовой операции:");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Значение первой переменной после перестановки: " + num1);
        System.out.println("Значение второй переменной после перестановки: " + num2);

        System.out.println("\n6. Вывод символов и их кодов.");
        System.out.println("35 = " + (char) 35);
        System.out.println("38 = " + (char) 38);
        System.out.println("64 = " + (char) 64);
        System.out.println("94 = " + (char) 94);
        System.out.println("95 = " + (char) 95);

        System.out.println("\n7. Произведение и сумма цифр числа.");
        int number = 345;
        int firstNum = number % 10;
        int secondNum = (number / 10) % 10;
        int thirdNum = (number / 10) / 10;
        int amount = firstNum + secondNum + thirdNum;
        int multiplication = firstNum * secondNum * thirdNum;
        System.out.println("Сумма цифр числа 345 = " + amount);
        System.out.println("Произведение цифр числа 345 = " + multiplication);

        System.out.println("\n8 Вывод на консоль ASCII-арт Дюка.");
        char backSlash = 92;
        char forwardSlash = '/';
        char space = ' ';
        char parenthesisClose = ')';
        char parenthesisOpen = '(';
        char underscore = '_';
        System.out.println("" + space + space + space + space + forwardSlash + backSlash);
        System.out.println("" + space + space + space + forwardSlash + space + space + backSlash);
        System.out.println("" + space + space + forwardSlash + underscore + parenthesisOpen + space + parenthesisClose + backSlash);
        System.out.println("" + space + forwardSlash + space + space + space + space + space + space + backSlash);
        System.out.println("" + forwardSlash + underscore + underscore + underscore + underscore + forwardSlash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n9 Преобразование секунд.");
        int totalSec = 86399;
        int sec = totalSec % 60;
        int min = (totalSec % 3600) / 60;
        int hour = totalSec / 3600;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}