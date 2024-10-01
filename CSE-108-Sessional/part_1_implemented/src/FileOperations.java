import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class FileOperations {

    /*static public String a;
    static public  String b;
    static public String c;
    static public String  d;
    static public String e;
    static public String f;
    static public String g;

    static public void filework()throws Exception {
        final String INPUT_FILE_NAME = "movies.txt";
        final String OUTPUT_FILE_NAME = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));


        while (true) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer tokens = new StringTokenizer(line, ",");
            a = tokens.nextToken();
            b = String.valueOf(tokens.nextToken());
            c = tokens.nextToken() + tokens.nextToken() + tokens.nextToken();
            d = String.valueOf(tokens.nextToken());
            e = tokens.nextToken();
            f = String.valueOf(tokens.nextToken());
            g = String.valueOf(tokens.nextToken());
            System.out.println(line);
        }




        //if (line == null) break;
        //System.out.println(line);


    }
    public static String returna(){
        return a;
    }
    public static String returnb(){
        return b;
    }
    public static String returnc(){
        return c;
    }
    public static String returnd(){
        return d;
    }
    public static String returne(){
        return e;
    }
    public static String returnf(){
        return f;
    }
    public static String returng() {
        return g;
    }


       // String text = "Hello World";
       /* BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME));
        bw.write(text);
        bw.write(System.lineSeparator());
        bw.close();
    }*/
}