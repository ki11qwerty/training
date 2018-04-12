package MyCode;
import java.io.*;

public class Run {
    public static void main(String[] args) throws Exception {
        String[] command = { "C:\\Users\\KillQwerty\\Desktop\\progs\\cmder\\cmder.exe"};
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                process.getInputStream()));
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println("Output: " + s);
        }
    }
}
