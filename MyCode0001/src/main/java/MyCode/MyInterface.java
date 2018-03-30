package MyCode;

public interface MyInterface {
    double myFunc(int a, int b, int c) throws OneParametrIsNullExeption;
}

class OneParametrIsNullExeption extends Exception{
    OneParametrIsNullExeption(){
        super(">>Деление на ноль!");
    }
}