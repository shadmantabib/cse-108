import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class pructioncompanysearch {
    public void printdetail(int i) {
        Movie s = MovieList.movieList.get(i);
        System.out.println(s);
    }

    Scanner scan = new Scanner(System.in);
    String name;



    public void mostrecent(String para) throws Exception {

        // String[] input=new Scanner(System.in);


        final String INPUT_FILE_NAME = "movies.txt";
        final String OUTPUT_FILE_NAME = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        List<Integer> number = new ArrayList<Integer>();

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String test = new String(line);
            String[] out = test.split(",");
            if (out[6].equalsIgnoreCase(para)) {
                number.add(Integer.parseInt(out[1]));
                Collections.sort(number);
                Collections.reverse(number);
            }
        }
        br.close();
        int searchIndex = -1;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie s = MovieList.movieList.get(i);
            if (s.Year_of_Release == number.get(0) && s.Production_Company.equalsIgnoreCase(para)) {
                printdetail(i);
            }
        }

    }

    public void maxrev(String para) throws Exception {

        final String INPUT_FILE_NAME = "movies.txt";
        final String OUTPUT_FILE_NAME = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        List<Integer> number = new ArrayList<Integer>();

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String test = new String(line);
            String[] out = test.split(",");

            if (out[6].equals(para)) {
                number.add(Integer.parseInt(out[8]));
                Collections.sort(number);
                Collections.reverse(number);
            }

        }
        br.close();
        int searchIndex = -1;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie s = MovieList.movieList.get(i);
            if (s.Production_Company.equalsIgnoreCase(para) && (s.Revenue == number.get(0)))
                printdetail(i);

        }
    }


    public void totalprofit(String para) throws Exception {

        final String INPUT_FILE_NAME = "movies.txt";
        final String OUTPUT_FILE_NAME = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        List<Integer> number = new ArrayList<Integer>();
        int sum = 0;
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String test = new String(line);
            String[] out = test.split(",");

            if (out[6].equalsIgnoreCase(para)) {
                number.add(Integer.parseInt(out[8]) - Integer.parseInt(out[7]));

            }

        }
        br.close();
        for (int i = 0; i < number.size(); i++) {
            sum = sum + number.get(i);
        }
        if (sum > 0) {
            System.out.println("total profit this company " + sum);
        } else if (sum < 0) {
            System.out.println("It incurred loss!!!total loss this company " + sum);
        } else {
            System.out.println("No loss no profit ");
        }
    }

    public void prodandnumofmovies() throws Exception {
        final String INPUT_FILE_NAME = "movies.txt";
        //final String OUTPUT_FILE_NAME = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        List<String> prc = new ArrayList<String>();
        MovieList.filework();

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String test = new String(line);
            String[] out = test.split(",");


            prc.add(out[6]);
            Collections.sort(prc);
            Collections.reverse(prc);

        }
        //br.close();
        //Iterator<String> itObjectForList = prc.iterator();
        Set<String> set = new HashSet<String>(prc);
        Iterator<String> itObjectForSet = set.iterator();
        while(itObjectForSet.hasNext()) {
            int sum = 0;
            String q=new String((itObjectForSet.next()));
            for (int j = 0; j < MovieList.movieList.size(); j++) {
                Movie s = MovieList.movieList.get(j);
                if (q.equalsIgnoreCase(s.Production_Company)) {
                    sum++;
                }

            }
            System.out.println("Production Company: " + itObjectForSet.next() + " MovieCount: " + sum);
        }
    }
}
