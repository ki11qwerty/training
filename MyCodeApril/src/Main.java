public class Main {

    public static void main(String[] args) {
        Main mn = new Main();
        PrintInfo pi = new PrintInfo();
	    Notebook nb = new Notebook("Acer r7","i7", "ddr5", 8,
                               "Geforce", 2);
	    Notebook nbClear = new Notebook("empty");
	    Computer cp = new Computer();
	    pi.printConstructors(nb);
        pi.printConstructors(cp);
        pi.printConstructors(nbClear);
        pi.printFields(nb);
        pi.printFields(cp);
        pi.printFields(nbClear);
        pi.printMethods(nb);
        pi.printMethods(cp);

    }

}
