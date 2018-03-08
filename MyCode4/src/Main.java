public class Main {
    public static void main(String[] args) {
	Main main = new Main();
	Class m = main.getClass();
	String name = m.getName();
	System.out.print(" " + m+", "+name );
    }
}
//    Object это базовый класс для всех остальных объектов в Java. Каждый класс наследуется
//        от Object. Соответственно все классы наследуют методы класса Object.
//        Методы класса Object:
//public final native Class getClass()
//public native int hashCode()
//public boolean equals(Object obj)
//protected native Object clone() throws CloneNotSupportedException
//public String toString()
//public final native void notify()
//public final native void notifyAll()
//public final native void wait(long timeout) throws InterruptedException
//public final void wait(long timeout, int nanos) throws InterruptedException
//public final void wait() throws InterruptedException
//protected void finalize() throws Throwable