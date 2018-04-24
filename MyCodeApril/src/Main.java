import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
	    Notebook nb = new Notebook("Acer r7","i7", "ddr5", 8,
                               "Geforce", 2);
	    Constructor[] inform = Computer.class.getConstructors();
	    for(Constructor o : inform){
            System.out.println("--- "+o);
        }
        System.out.println("-----------------");
        Class classOfNote = Notebook.class;
        Class classOfNb = nb.getClass();
        Field[] nbFields = classOfNb.getDeclaredFields();
        for(Field o: nbFields){
            System.out.println("print of nb - "+o.getType().getName()
                               + " "+ o.getName());
        }
        try {
            Field fieldNameOfNote = classOfNote.getDeclaredField("name");
            System.out.println("имя - "+fieldNameOfNote);
        }catch (NoSuchFieldException e){
            System.out.println("NoSuchField");
        }
       Field[] allFieldsOfNote = classOfNote.getDeclaredFields();
        for(Field o : allFieldsOfNote){
            System.out.println(("Тип_поля Имя_поля : " + o.getType().getName()
                    + " " + o.getName()));
        }

    }
}
