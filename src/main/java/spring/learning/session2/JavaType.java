package spring.learning.session2;

public class JavaType {

    public static final int TWO = 2; // khai bao constant trong Java

    public static void main(String[] args) {
        int count;
        byte someByte;
        someByte = 1;
        count = 1;
        count = count * TWO;
        System.out.println(count);
        System.out.println(someByte);
        char c = 'f';
        System.out.println(c);
        c = (char) count;
        System.out.println(c);
        boolean isFun = true;
        System.out.println(isFun);
        long big = 213123L;
        System.out.println(big);
        double f = 32.5;
        System.out.println(f);
        int x = 24;
        byte b = (byte) x;
        int x1 = 0xFFFFFFFF;
        System.out.println(x1);
    }

    public void printSomeValue() {
        System.out.println("abccawdawd");
    }

}
