import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    volatile String currentLetter = null;
    private final Object ob = new Object();

    public static void main(String[] args){
        Main mn = new Main();
        FileWriter fw = null;
        String str = "hello";
        String str2 = "world";
        String str3 = "!";

        new Thread(() -> mn.method1(str,fw)).start();
        new Thread(() -> mn.method1(str2,fw)).start();
        new Thread(() -> mn.method1(str3,fw)).start();

    }
        void method1(String str, FileWriter fw) {
            synchronized (ob) {
            try {
                fw = new FileWriter("myWords.txt", true);
                    for (int i = 0; i < 10; i++) {
                        System.out.print( i +", ");
                        fw.write(str + "\n");
                        fw.flush();
                      ob.wait(20);
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }catch (InterruptedException e){
                e.printStackTrace();
                }finally{
                    try {
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

}

