package problems100;

public class PlusOne {

    private static int[] app(int[] digits){
        int len = digits.length;
        int c = 0;
        for (int d=len-1;d>=0;d--){
            int temp;
            if (d==len-1)
                temp = digits[d]+1;
            else
                temp = digits[d];
            temp = temp + c;
            digits[d] = temp/10;
            c = temp%10;
        }
        if (c==1){
            int[] newDigits = new int[len+1];
            newDigits[0] = c;
            for (int i=1;i<len+1;i++){
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }
}
