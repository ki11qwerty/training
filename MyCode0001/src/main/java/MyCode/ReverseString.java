// G.Shildt - Method reference (459) return here after framework
//collection

//G.Shildt - java.util.collection (563)--(567...)

package MyCode;

interface StringFunc {
    String func(String n);
}

class MyStringOps {

    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodRefDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Лямбда- выражения повышают эффективность Java";
        String outStr;
        outStr = stringOp(MyStringOps::strReverse , inStr);
        System.out.println("Иcxoднaя строка   : " + inStr);
        System.out.println("Oбpaщeннaя строка : " + outStr);
    }
}