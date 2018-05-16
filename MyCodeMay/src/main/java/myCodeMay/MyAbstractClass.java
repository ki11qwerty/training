package myCodeMay;

abstract class MyAbstractClass extends myNewAbstractClass  {
    int a = 10;

    public int myPublicMethod(int poh){
        return a + poh;
    }
    abstract int myAbstractMethod(int poh);
}
