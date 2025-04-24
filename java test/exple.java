import java.io.*;
public class exple {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name:");
        String name = reader.readLine();
        System.out.println("hello, "+name);
        reader.close();
    }
        
    }

