import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MovieList {
    static List<Movie> movieList = new ArrayList();

    public static void filework()throws Exception {
         String INPUT_FILE_NAME = "movies.txt";
       // final String OUTPUT_FILE_NAME = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));


        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String test=new String(line);
            String[] out=test.split(",");

            movieList.add(new Movie(out[0],Integer.parseInt(out[1]),out[2]+" "+out[3]+" "+out[4],Integer.parseInt(out[5]),out[6],Integer.parseInt(out[7]),Integer.parseInt(out[8])));

        }
        br.close();
        }


    }

