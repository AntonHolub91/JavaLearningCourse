package Lesson12_collections.homework;

import java.util.Arrays;

public class MyCollection {
    int length;
    String type;
    int[] intArray;
    String[] stringArray;
    boolean[] booleanArray;

    public MyCollection() {
        this.length = 5;
        this.type = "unknown";
    }

    public MyCollection(int... values) {
        this.intArray = values;
        this.length = values.length;
        this.type = "int";
    }

    public MyCollection(String... values) {
        this.stringArray = values;
        this.length = values.length;
        this.type = "String";
    }

    public MyCollection(boolean... values) {
        this.booleanArray = values;
        this.length = values.length;
        this.type = "boolean";
    }

    @Override
    public String toString() {
        return switch (this.type) {
            case "int" -> (intArray == null) ? "[]" : Arrays.toString(intArray);
            case "String" -> (stringArray == null) ? "[]" : Arrays.toString(stringArray);
            case "boolean" -> (booleanArray == null) ? "[]" : Arrays.toString(booleanArray);
            default -> "[]";
        };
    }

    public void add(int value) {
        if (intArray == null) {
            intArray = new int[0];
        }
        int[] newArray = new int[intArray.length + 1];
        for (int i = 0; i < intArray.length; i++) {
            newArray[i] = intArray[i];
        }
        newArray[newArray.length - 1] = value;
        intArray = newArray;
        length = intArray.length;
        type = "int";
    }

    public void add(String value) {
        if (stringArray == null) {
            stringArray = new String[0];
        }
        String[] newArray = new String[stringArray.length + 1];
        for (int i = 0; i < stringArray.length; i++) {
            newArray[i] = stringArray[i];
        }
        newArray[newArray.length - 1] = value;
        stringArray = newArray;
        length = stringArray.length;
        type = "String";
    }

    public void add(boolean value) {
        if (booleanArray == null) {
            booleanArray = new boolean[0];
        }
        boolean[] newArray = new boolean[booleanArray.length + 1];
        for (int i = 0; i < booleanArray.length; i++) {
            newArray[i] = booleanArray[i];
        }
        newArray[newArray.length - 1] = value;
        booleanArray = newArray;
        length = booleanArray.length;
        type = "boolean";
    }

    public void remove(int index) {
        if (type.equals("int")) {
            int[] newArray = new int[intArray.length - 1];
            int count = 0;
            for (int i = 0; i < intArray.length; i++) {
                if (i != index) {
                    newArray[count] = intArray[i];
                    count++;
                }
            }
            intArray = newArray;
            length = intArray.length;
        }
        if (type.equals("String")) {
            String[] newArray = new String[stringArray.length - 1];
            int count = 0;
            for (int i = 0; i < stringArray.length; i++) {
                if (i != index) {
                    newArray[count] = stringArray[i];
                    count++;
                }
            }
            stringArray = newArray;
            length = stringArray.length;
        }
        if (type.equals("boolean")) {
            boolean[] newArray = new boolean[booleanArray.length - 1];
            int count = 0;
            for (int i = 0; i < booleanArray.length; i++) {
                if (i != index) {
                    newArray[count] = booleanArray[i];
                    count++;
                }
            }
            booleanArray = newArray;
            length = booleanArray.length;
        }
    }

    public void getByIndex(int index) {
        if (type.equals("int")) {
            System.out.println(intArray[index]);
        }
        if (type.equals("String")) {
            System.out.println(stringArray[index]);
        }
        if (type.equals("boolean")) {
            System.out.println(booleanArray[index]);
        }
    }

    public boolean isPresented(int value) {
        boolean result = false;
        for (int i : intArray) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isPresented(String value) {
        boolean result = false;
        for (String s : stringArray) {
            if (s.equals(value)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isPresented(boolean value) {
        boolean result = false;
        for (boolean b : booleanArray) {
            if (b == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void clear() {
        if (type.equals("int")) {
            intArray = null;
        }
        if (type.equals("String")) {
            stringArray = new String[5];
        }
        if (type.equals("boolean")) {
            booleanArray = new boolean[5];
        }
        length = 0;
    }
}

class TestMyCollection {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection(1,2,3,4,5,6);
        System.out.println(mc);
        System.out.println(mc.length);
        mc.add(1);
        System.out.println(mc);
        mc.remove(0);
        System.out.println(mc);
        System.out.println(mc.isPresented(10));
        System.out.println(mc.isPresented(3));
        mc.clear();
        System.out.println(mc);
        mc.add(10);
        System.out.println(mc);
        mc.clear();
        System.out.println(mc);
        mc.add(777);
        System.out.println(mc);
        System.out.println(mc.length);

        MyCollection mc1 = new MyCollection();
        System.out.println(mc1.length);
        System.out.println(mc1.type);
        System.out.println(mc1);
        mc1.add("a");
        System.out.println(mc1.length);
        System.out.println(mc1.type);
        System.out.println(mc1);
        mc1.remove(0);
        System.out.println(mc1);
        System.out.println(mc1.length);
    }
}