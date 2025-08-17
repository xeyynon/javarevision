import java.util.*;

public class strobogrammatic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.nextLine();
        if (isStrobogrammatic(num)) {
            System.out.println(num + " is a strobogrammatic number");
        } else {
            System.out.println(num + " is not a strobogrammatic number");
        }

    }

    public static boolean isStrobogrammatic(String num){
        Map<Character, Character> stroboDic= new HashMap<>();
        stroboDic.put('0','0');
        stroboDic.put('1','1');
        stroboDic.put('6','9');
        stroboDic.put('8','8');
        stroboDic.put('9','6');

        int n= num.length();
            for(int i =0,j=(n-1);i<=j;i++,j--){
                char left=num.charAt(i);
                char right=num.charAt(j);
                char mapping = stroboDic.getOrDefault(left,'-');
                if(mapping=='-'){
                    return false;
                }
                if(mapping !=right){
                    return false;
                }
            }
            return true;
    }
}