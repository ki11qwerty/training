import java.util.concurrent.Phaser;
public class Main {
public static Phaser myPhaser = new Phaser(5);
static volatile int sR = 0;
    public static void main(String[] args) {
        Main mn = new Main();
        for(int i =0;i<1000;i++){
        new Thread(()-> mn.methode1()).start();
        myPhaser.
        }
//
//        myPhaser.toString();
//        System.out.println("dhlgjdhg");
//        myPhaser.
//        myPhaser.arriveAndAwaitAdvance();
//        myPhaser.toString();
//        System.out.println("djgljdhgskdjgh");

    }
    public synchronized void methode1(){
        sR +=1;
        if(sR ==0 || sR%10==0)
            System.out.println();
            System.out.print(sR+",");
    }
}
