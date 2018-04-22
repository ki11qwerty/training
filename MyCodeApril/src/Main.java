import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
	Notebook nb = new Notebook("Acer r7","i7", "ddr5", 8,
                               "Geforce", 2);
	Class inform = nb.getClass();
        System.out.println(inform);
        System.out.println(inform.getConstructors());
        System.out.println(inform.getName());

    }
}
