public class Main {

    public static void main(String[] args) {
	Notebook nb = new Notebook("Acer r7","i7", "ddr5", 8,
                               "Geforce", 2);
	Notebook nb1 = new Notebook("wtf");
        System.out.println(nb.getName()+"-"+nb.getCpu());
        System.out.println(nb1.getName()+"-"+nb1.getCpu());
        nb1.setName("emptyBox");
        System.out.println(nb1.getName());
    }
}
