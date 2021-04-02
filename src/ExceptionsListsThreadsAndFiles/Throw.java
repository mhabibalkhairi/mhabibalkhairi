package ExceptionsListsThreadsAndFiles;
import java.io.IOException;
public class Throw {
    static void main(int x){
        if(x<0) {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    }
}
