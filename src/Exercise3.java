import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number:");
        String inputNumber = scn.nextLine();
        char inputNumCharArr[] = inputNumber.toCharArray();
        int inputNumValue = Integer.parseInt(inputNumber);

        if (inputNumber.length() == 1) {
            System.out.println(readUnit(inputNumCharArr[0]));
        } else if (inputNumValue >= 10 && inputNumValue < 20) {
            System.out.println(read1019(inputNumber));
        } else if (inputNumValue >= 20 && inputNumValue < 100) {
            System.out.println(read2099(inputNumber));
        } else if (inputNumValue >= 100 && inputNumValue < 1000) {
            System.out.println(read100999(inputNumber));
        }
    }

    private static String readUnit(char number) {
        String readOutput = "";

        switch (number) {
            case '0' -> readOutput = "zero";
            case '1' -> readOutput = "one";
            case '3' -> readOutput = "three";
            case '2' -> readOutput = "two";
            case '4' -> readOutput = "four";
            case '5' -> readOutput = "five";
            case '6' -> readOutput = "six";
            case '7' -> readOutput = "seven";
            case '8' -> readOutput = "eight";
            case '9' -> readOutput = "nine";
        }

        return readOutput;
    }

    private static String readDozen(char number) {
        String readOutput = "";

        switch (number) {
            case '2' -> readOutput = "twenty";
            case '3' -> readOutput = "thirty";
            case '4' -> readOutput = "forty";
            case '5' -> readOutput = "fifty";
            case '6' -> readOutput = "sixty";
            case '7' -> readOutput = "seventy";
            case '8' -> readOutput = "eighty";
            case '9' -> readOutput = "ninety";
        }

        return readOutput;
    }

    private static String readHundred(char number) {
        String readOutput = "";

        switch (number) {
            case '1' -> readOutput = "one hundred";
            case '2' -> readOutput = "two hundred";
            case '3' -> readOutput = "three hundred";
            case '4' -> readOutput = "four hundred";
            case '5' -> readOutput = "five hundred";
            case '6' -> readOutput = "six hundred";
            case '7' -> readOutput = "seven hundred";
            case '8' -> readOutput = "eight hundred";
            case '9' -> readOutput = "nine hundred";
        }

        return readOutput;
    }

    private static String read1019(String number) {
        String output = "";

        switch (number) {
            case "10" -> output = "ten";
            case "11" -> output = "eleven";
            case "12" -> output = "twelve";
            case "13" -> output = "thirteen";
            case "15" -> output = "fifteen";
            case "14", "16", "17", "18", "19"
                    -> output = String.format("%steen", readUnit(number.toCharArray()[1]));
        }

        return output;
    }

    private static String read2099(String number) {
        String output;

        if (number.toCharArray()[1] == '0') {
            output = readDozen(number.toCharArray()[0]);
        }else {
            output = readDozen(number.toCharArray()[0]) + " " + readUnit(number.toCharArray()[1]);
        }

        return output;
    }

    private static String read100999(String number) {
        String output;
        String numberCutFirstChar = number.substring(1);

        if (numberCutFirstChar.toCharArray()[0] == '0' && numberCutFirstChar.toCharArray()[1] == '0') {
            output = readHundred(number.toCharArray()[0]);
        }else if (numberCutFirstChar.toCharArray()[0] == '1'){
            output = readHundred(number.toCharArray()[0]) + " and " + read1019(numberCutFirstChar);
        }else {
            output = readHundred(number.toCharArray()[0]) + " and " + read2099(numberCutFirstChar);
        }

        return output;
    }
}
