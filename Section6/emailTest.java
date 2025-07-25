package Section6;

class emailTest {
    public static void main(String[] args) {
        String str = "Jonhson@gmail.com";
        int pos = str.indexOf('@');
        int lastindex = str.length();
        System.out.println(str.substring(0,pos));
        System.out.println(str.substring(pos,lastindex));
    //     for (int i = 0; i < pos; i++) {
            
    //     }
    //     System.out.println();

    //     for (int j = pos++; j <= lastindex; j++) {
    //         System.out.print(str.substring(j));
    //     }
    //     System.out.println();

    }

}
