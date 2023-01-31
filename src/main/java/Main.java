package main.java;


public class Main {

    public static void main(String[] args) {
        String num1 = "100000";
        String num2 = "1";

        System.out.println(sum(num1, num2));
    }

    public static String sum (String num1, String num2) {

        StringBuffer totalSum = new StringBuffer();

        int inHand = 0;
        int sum = 0;


        if(num1.length()>num2.length()){
            num2 = padLeftZeros(num2,num1.length());
        } else if (num2.length()>num1.length()) {
            num1 = padLeftZeros(num1,num2.length());
        }

        String[] num1Array = new String[num1.length()];
        num1Array = num1.split("");

        String[] num2Array = new String[num2.length()];
        num2Array = num2.split("");

        for(int i = num1.length()-1 ; i >= 0; i--){
            sum = Integer.parseInt(num1Array[i]) + Integer.parseInt(num2Array[i]);
            sum += inHand;
            if(sum <= 9){
                totalSum.append(Integer.toString(sum));
                inHand=0;
            }else {
                totalSum.append(Integer.toString(sum % 10));
                inHand = 1;
            }
        }

        if(inHand==1)totalSum.append(inHand);
        return String.valueOf(totalSum.reverse());
    }

    static String padLeftZeros (String input, int length){
        StringBuilder sb = new StringBuilder();
        if (!(input.length() >= length)) {

            while (sb.length() < length - input.length()) {
                sb.append('0');
            }
            sb.append(input);
        }
        return sb.toString();
    }
}