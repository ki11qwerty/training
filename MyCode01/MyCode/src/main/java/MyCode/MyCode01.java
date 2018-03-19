package MyCode;
public class MyCode01 {

    public static void main(String[] args) {
        MyCode mc = new MyCode();
        System.out.println(mc.addCalc(8,6,7) + mc.addCalc(3,10,22));
    }
    public int addCalc(int a, int b, int c){
        return a+b+c;
    }
}