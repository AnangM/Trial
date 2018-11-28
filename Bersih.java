import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Bersih{
    public static void main(String[] args){
        String command = "clear";
        Runtime runtime = Runtime.getRuntime();
        try {
         Process process = runtime.exec(command);
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
         String line;
         while ((line = bufferedReader.readLine()) != null) {
         System.out.println(line);
         }
        } catch (IOException e) {
         System.out.println(e);
        }
}
}