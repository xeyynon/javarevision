package Section7;

public class domain {

    void protocol(String str, int pos) {
        System.out.println("The Protocol Name is");
        System.out.println(str.substring(0, pos));
    }

    void domain(String str, int pos) {
        System.out.println("The Domain Name is ");
        int length = str.length();
        String Result = str.substring(pos + 1, length);
        System.out.println(Result);
        if (Result == "com") {
            System.out.println(Result + " Is is a commertical Website");
        } else if (Result == "org") {
            System.out.println(Result + " It is a organization's website");
        } else if (Result == "net") {
            System.out.println(Result + " It is a Network Website");
        } else if (Result == "gov") {
            System.out.println(Result + " It is a Governtment Website");
        }
        else
            System.out.println("ERROR");
    }

    public static void main(String[] args) {
        domain dd = new domain();
        String str = "http://www.google.com";
        int pos = str.indexOf('/');
        int dotpos = str.lastIndexOf(".");

        dd.protocol(str, pos);
        dd.domain(str, dotpos);

    }

}
