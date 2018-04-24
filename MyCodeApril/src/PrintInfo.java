import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PrintInfo {
    public void printConstructors(Object ob){
        Constructor[] constructor = ob.getClass().getConstructors();
        System.out.println("---------------constructors-"+ob.getClass().getName()+"-----------------");
        for(Constructor o : constructor){
            System.out.println(o);
        }
    }
    public void printFields(Object ob){
        Field[] fields = ob.getClass().getDeclaredFields();
        System.out.println("---------------fields-"+ob.getClass().getName()+"-----------------");
        for(Field o : fields){
            System.out.println(" "+o);
        }
    }
    public void printMethods(Object ob){
        Method[] methods = ob.getClass().getDeclaredMethods();
        System.out.println("---------------methods-"+ob.getClass().getName()+"-----------------");
        for(Method o : methods){
            System.out.println((o.getReturnType() + " ||| " + o.getName() + " ||| "
                    + Arrays.toString(o.getParameterTypes())));
        }
    }
}
