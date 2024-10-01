import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
public class SearchMovie {
    public void printdetail(int i){
        Movie s = MovieList.movieList.get(i);
        System.out.println(s);
    }
    public void searchbytitle(){
        System.out.println("enter the name of the movie you want to search");
        Scanner scan= new Scanner(System.in);
        String t= scan.nextLine();
        t+=scan.nextLine();
        //System.out.println("enter the name of the movie you want to search");


        int searchIndex = -1;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie s = MovieList.movieList.get(i);
            if (s.Title.equalsIgnoreCase(t)) {
                searchIndex = i;
            }
        }
        if (searchIndex == -1) {
            System.out.println("No such production company with this name");
        }
        else{
            printdetail(searchIndex);
        }



    }
    public void searchbyReleaseYear(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the releaseyear of the movie you want to search");
        int t=scn.nextInt();

        int searchIndex = -1;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie s = MovieList.movieList.get(i);
            if (s.Year_of_Release==(t)) {
                searchIndex = i;
                printdetail(searchIndex);
            }
        }
        if (searchIndex == -1) {
            System.out.println("No such production company with this releaseyear");
        }

    }
    public void searchbyGenre(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the name of the genre you want to search");
        String t=scn.next();

        int searchIndex = -1;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie s = MovieList.movieList.get(i);
            if (s.Genre.equalsIgnoreCase(t)) {
                searchIndex = i;
                printdetail(searchIndex);
            }
        }
        if (searchIndex == -1) {
            System.out.println("No such production company with this genre");
        }

    }
    public void searchbyproductioncompany(){



        System.out.println("enter the name of the production company ,ypur input format should be:There would be just one word in the second line and after the end of first line have a SPACE and press enter");
       // String[] input=new Scanner(System.in);
        Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();
        name+=scan.nextLine();


        int searchIndex = -1;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie s = MovieList.movieList.get(i);
            if (s.Production_Company.equals(name)) {
                searchIndex = i;
                printdetail(searchIndex);
            }
        }
        if (searchIndex == -1) {
            System.out.println("No such production company with this with this name");
        }
    }
    public void searchbyrunningtime(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the runningtime of the movie you want to search");
        int t=scn.nextInt();

        int searchIndex = -1;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie s = MovieList.movieList.get(i);
            if (s.Running_Time==(t)) {
                searchIndex = i;
                printdetail(searchIndex);
            }
        }
        if (searchIndex == -1) {
            System.out.println("No such production company with this runningtime");
        }

    }
    public void top10()throws Exception {
        final String INPUT_FILE_NAME = "movies.txt";
        final String OUTPUT_FILE_NAME = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        List<Integer> number = new ArrayList<Integer>();

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String test = new String(line);
            String[] out = test.split(",");

            number.add((Integer.parseInt(out[8]))-(Integer.parseInt(out[7])));
            Collections.sort(number);
            Collections.reverse(number);
        }
        br.close();
        int searchIndex = -1;

            for(int j=0;j<10;j++) {
                for (int i = 0; i < MovieList.movieList.size(); i++) {
                Movie s = MovieList.movieList.get(i);
                if (s.Revenue - s.Budget == (number.get(j))) {
                    searchIndex = i;
                    printdetail(i);
                    System.out.println("\n");
                }
            }
        }

    }


}
