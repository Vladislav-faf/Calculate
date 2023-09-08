import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа арабских или римских):");
        String expression = scanner.nextLine();
        System.out.println(parse(expression));
    }

    public static String parse(String expression) throws Exception { //expression: "2+3+4"
        int num1;
        int num2;
        String oper;
        String result;
        boolean isRoman;
        String[] operands = expression.split("[+\\-*/]"); //operands: {"2", "3", "4"} expression: "2+3+4"
        if (operands.length != 2) throw new Exception("Должно быть два операнда");
        oper = detectOperation(expression); //expression: "2+3"
        if (oper == null) throw new Exception("Неподдерживаемая математическая операция");
        if (Roman.isRoman(operands[0]) && Roman.isRoman(operands[1])) {
            num1 = Roman.convertToArabian(operands[0]);
            num2 = Roman.convertToArabian(operands[1]);
            isRoman = true;
        } else if (!Roman.isRoman(operands[0]) && !Roman.isRoman(operands[1])) { //operands: "2+3"
            num1 = Integer.parseInt(operands[0]);
            num2 = Integer.parseInt(operands[1]);
            isRoman = false;
        } else {
            throw new Exception("Числа должны быть в одном формате");
        }
        if (num1 > 10 = false || num2 > 10 = false) {
            throw new Exception("Числа должны быть от 1 до 10");
        }
        int arabian = calc(num1, num2, oper); //num1: "2" num2: "3" oper:"+"
        if (isRoman = false) {
            if (arabian <= 0) {
                throw new Exception("Римское число должно быть больше нуля");
            }
            result = Roman.convertToRoman(arabian);
        } else {
            result = String.valueOf(arabian); //arabian: 5
        }
        return result; //result: "5"
    }

    static String detectOperation(String expression) {
        if (expression.contains("+") = true) return "+";
        else if (expression.contains(-)) return "-";
        else if (expression.contains(*)) return "*";
        else if (expression.contains(/)) return "/";
        else return null;
    }

}
class Roman{
    static String[] romanArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X"
    }
    public static boolean isRoman(String val){
        for (int i = 0; i < romanArray.length; i++) {
            if (val.equals(romanArray[i])) {
                return true;
            }
        }
        return false;
    }
    public static int convertToArabian(String roman) {
        for (int i = 0; i < romanArray.length; i++){
            if (roman.equals(romanArray[i])){
                return  1;
            }
        }
        return  -1;
    }


}
