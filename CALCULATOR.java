import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
public class CALCULATOR {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные:");
        String inputStr = in.nextLine();
        char[] inputChar = inputStr.toCharArray();
        char operation = 0;
        int result;
        int num1 ;
        int num2 ;
        int Ar = 0 ;


        for(int i=0; i<inputStr.length(); i++ ){
            if(inputChar[i]=='+'){
                operation ='+';
                Ar++;
            }

            if(inputChar[i]=='-'){
                operation ='-';
                Ar++;
            }

            if(inputChar[i]=='*'){
                operation ='*';
                Ar++;
            }

            if(inputChar[i]=='/'){
                operation ='/';
                Ar++;
            }
        }

        if(operation == 0){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("ОШИБКА! Данные не являются математической операцией");
                System. exit(0);
            }
        }

        if(Ar > 1){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("ОШИБКА! Более одной операции");
                System. exit(0);
            }
        }

        String inputStrReturn = String.valueOf(inputChar);
        String inputStrReturn2 = inputStrReturn.replaceAll("\\s","");
        String[] afterSplit = inputStrReturn2.split("[+/*-]");

        if      ((Objects.equals(afterSplit[0],"1") || Objects.equals(afterSplit[0],"2")
                || Objects.equals(afterSplit[0],"3")|| Objects.equals(afterSplit[0],"4")
                || Objects.equals(afterSplit[0],"5")|| Objects.equals(afterSplit[0],"6")
                || Objects.equals(afterSplit[0],"7")|| Objects.equals(afterSplit[0],"8")
                || Objects.equals(afterSplit[0],"9")|| Objects.equals(afterSplit[0],"10"))
                &&(Objects.equals(afterSplit[1],"1")|| Objects.equals(afterSplit[1],"2")
                || Objects.equals(afterSplit[1],"3")|| Objects.equals(afterSplit[1],"4")
                || Objects.equals(afterSplit[1],"5")|| Objects.equals(afterSplit[1],"6")
                || Objects.equals(afterSplit[1],"7")|| Objects.equals(afterSplit[1],"8")
                || Objects.equals(afterSplit[1],"9")|| Objects.equals(afterSplit[1],"10"))){

            num1 = Integer.parseInt(afterSplit[0]);
            num2 = Integer.parseInt(afterSplit[1]);

            if(operation =='+'){
                result = num1 + num2;
            }else if(operation =='-'){
                result = num1 - num2;
            }else if(operation =='*'){
                result = num1 * num2;
            }else {
                result = num1 / num2;
            }
            System.out.println("Output:");
            System.out.println( +result);

        }else if ((Objects.equals(afterSplit[0],"I") || Objects.equals(afterSplit[0],"II")
                || Objects.equals(afterSplit[0],"III")|| Objects.equals(afterSplit[0],"IV")
                || Objects.equals(afterSplit[0],"V")|| Objects.equals(afterSplit[0],"VI")
                || Objects.equals(afterSplit[0],"VII")|| Objects.equals(afterSplit[0],"VIII")
                || Objects.equals(afterSplit[0],"IX")|| Objects.equals(afterSplit[0],"X"))
                &&(Objects.equals(afterSplit[1],"I") || Objects.equals(afterSplit[1],"II")
                || Objects.equals(afterSplit[1],"III")|| Objects.equals(afterSplit[1],"IV")
                || Objects.equals(afterSplit[1],"V")|| Objects.equals(afterSplit[1],"VI")
                || Objects.equals(afterSplit[1],"VII")|| Objects.equals(afterSplit[1],"VIII")
                || Objects.equals(afterSplit[1],"IX")|| Objects.equals(afterSplit[1],"X"))){
            rome part1 = rome.valueOf(afterSplit[0]);
            num1 = part1.getArab();
            rome part2 = rome.valueOf(afterSplit[1]);
            num2 = part2.getArab();
            if(operation =='+'){
                result = num1 + num2;
            }else if(operation =='-'){
                result = num1 - num2;
            }else if(operation =='*'){
                result = num1 * num2;
            }else {
                result = num1/ num2;
            }
            if(result < 1){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("ОШИБКА! Отрицательное значение в римской нумерации");
                    System. exit(0);
                }
            }
            System.out.println("Результат: ");
            System.out.println( rome.values()[result-1]);
        }
        else if ((Objects.equals(afterSplit[0],"1") || Objects.equals(afterSplit[0],"2")
                || Objects.equals(afterSplit[0],"3")|| Objects.equals(afterSplit[0],"4")
                || Objects.equals(afterSplit[0],"5")|| Objects.equals(afterSplit[0],"6")
                || Objects.equals(afterSplit[0],"7")|| Objects.equals(afterSplit[0],"8")
                || Objects.equals(afterSplit[0],"9")|| Objects.equals(afterSplit[0],"10"))
                &&(Objects.equals(afterSplit[1],"I") || Objects.equals(afterSplit[1],"II")
                || Objects.equals(afterSplit[1],"III")|| Objects.equals(afterSplit[1],"IV")
                || Objects.equals(afterSplit[1],"V")|| Objects.equals(afterSplit[1],"VI")
                || Objects.equals(afterSplit[1],"VII")|| Objects.equals(afterSplit[1],"VIII")
                || Objects.equals(afterSplit[1],"IX")|| Objects.equals(afterSplit[1],"X"))){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("ОШИБКА! Разные системы счисления");
            }
        }
        else if ((Objects.equals(afterSplit[0],"I") || Objects.equals(afterSplit[0],"II")
                || Objects.equals(afterSplit[0],"III")|| Objects.equals(afterSplit[0],"IV")
                || Objects.equals(afterSplit[0],"V")|| Objects.equals(afterSplit[0],"VI")
                || Objects.equals(afterSplit[0],"VII")|| Objects.equals(afterSplit[0],"VIII")
                || Objects.equals(afterSplit[0],"IX")|| Objects.equals(afterSplit[0],"X"))
                &&(Objects.equals(afterSplit[1],"1")|| Objects.equals(afterSplit[1],"2")
                || Objects.equals(afterSplit[1],"3")|| Objects.equals(afterSplit[1],"4")
                || Objects.equals(afterSplit[1],"5")|| Objects.equals(afterSplit[1],"6")
                || Objects.equals(afterSplit[1],"7")|| Objects.equals(afterSplit[1],"8")
                || Objects.equals(afterSplit[1],"9")|| Objects.equals(afterSplit[1],"10"))){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("ОШИБКА! Разные системы счисления");
            }
        }
        else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("ОШИБКА! Число на ввод не должно превышать 10");
            }
        }
        in.close();
    }
}

enum rome {
    I(1), II(2), III(3), IV(4), V(5),
    VI(6), VII(7), VIII(8), IX(9), X(10),
    XI(11), XII(12), XIII(13), XIV(14), XV(15),
    XVI(16), XVII(17), XVIII(18), XIX(19), XX(20),
    XXI(21), XXII(22), XXIII(23), XXIV(24), XXV(25),
    XXVI(26), XXVII(27), XXVIII(28), XXIX(29), XXX(30),
    XXXI(31), XXXII(32), XXXIII(33), XXXIV(34), XXXV(35),
    XXXVI(36), XXXVII(37), XXXVIII(38), XXXIX(39), XL(40),
    XLI(41), XLII(42), XLIII(43), XLIV(44), XLV(45),
    XLVI(46), XLVII(47), XLVIII(48), XLIX(49), L(50),
    LI(51), LII(52), LIII(53), LIV(54), LV(55),
    LVI(56), LVII(57), LVIII(58), LIX(59), LX(60),
    LXI(61), LXII(62), LXIII(63), LXIV(64), LXV(65),
    LXVI(66), LXVII(67), LXVIII(68), LXIX(69), LXX(70),
    LXXI(71), LXXII(72), LXXIII(73), LXXIV(74), LXXV(75),
    LXXVI(76), LXXVII(77), LXXVIII(78), LXXIX(79), LXXX(80),
    LXXXI(81), LXXXII(82), LXXXIII(83), LXXXIV(84), LXXXV(85),
    LXXXVI(86), LXXXVII(87), LXXXVIII(88), LXXXIX(89), XC(90),
    XCI(91), XCII(92), XCIII(93), XCIV(94), XCV(95),
    XCVI(96), XCVII(97), XCVIII(98), XCIX(99), C(100);
    private final int Arab;
    rome(int Arab){
        this.Arab = Arab;
    }
    public int getArab (){
        return Arab;
    }


}