public class MyMain {
    public static void main(String[] args) {
        byte b1 = 1;
        int i1 = b1;
        System.out.println(i1);

        int i2 = 10;
        short s1 = (short) i2;
        System.out.println(s1);

        final int i3 = 1765;
        long l1 = 1_312_423_888_000L;

        float f1 = 10.24F;

        double d1 = 5.867;
        int i4 = (int) Math.round(d1);
        System.out.println(i4);

        char c1 = 'A';
        char c2 = 1;
        char c3 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int i5 = 3;
        int i6 = 10;
        int i7 = i5 * i6;
        int i8 = i6 % i5;
        long l3 = 100L;
        System.out.println(i5 + i6);
        System.out.println(i7);
        System.out.println(i8);
        System.out.println(i5 + l3);

        int i9 = (i6 / (i5 + 1)) * 2;
        System.out.println(i9);
    }
}
