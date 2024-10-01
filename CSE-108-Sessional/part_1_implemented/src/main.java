import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;

public class main {
    public void menu2() {

    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int opt;
        int cns = 0;
        boolean cur = true;

        while (cur) {
            if (cns == 0 && cur == true) {
                System.out.println("1) Search Movies\n" +
                        "2) Search Production Companies\n" +
                        "3) Add Movie\n" +
                        "4) Exit System\n");
                System.out.println("enter your option:");
                opt = scan.nextInt();
                if (opt == 1) {
                    cns = 1;
                }
                if (opt == 2) {
                    cns = 2;
                }
                if (opt == 3) {
                    cns = 3;
                }
                if (opt == 4) {
                    cns = 4;
                }

            }
            if (cns == 1 && cur == true) {
                System.out.println("1) By Movie Title\n" +
                        "2) By Release Year \n" +
                        "3) By Genre \n" +
                        "4) By Production Company\n" +
                        "5) By Running Time \n" +
                        "6) Top 10 Movies \n" +
                        "7) Back to Main Menu");
                System.out.println("enter your option:");
                opt = scan.nextInt();
                if (opt == 1) {
                    //MovieList ob=new MovieList();
                    MovieList.filework();
                    SearchMovie ob1 = new SearchMovie();
                    ob1.searchbytitle();
                    cns = 1;
                    cur = true;
                }
                if (opt == 2) {
                    // MovieList ob=new MovieList();
                    MovieList.filework();
                    SearchMovie ob1 = new SearchMovie();
                    ob1.searchbyReleaseYear();
                    cns = 1;
                    cur = true;
                }
                if (opt == 3) {
                    // MovieList ob=new MovieList();
                    MovieList.filework();
                    SearchMovie ob1 = new SearchMovie();
                    ob1.searchbyGenre();
                    cns = 1;
                    cur = true;
                }
                if (opt == 4) {
                    //MovieList ob=new MovieList();
                    MovieList.filework();
                    SearchMovie ob1 = new SearchMovie();
                    ob1.searchbyproductioncompany();
                    cns = 1;
                    cur = true;
                }
                if (opt == 5) {
                    // MovieList ob=new MovieList();
                    MovieList.filework();
                    SearchMovie ob1 = new SearchMovie();
                    ob1.searchbyrunningtime();
                    cns = 1;
                    cur = true;
                }
                if (opt == 6) {
                    // MovieList ob=new MovieList();
                    MovieList.filework();
                    SearchMovie ob1 = new SearchMovie();
                    ob1.top10();
                    cns = 1;
                    cur = true;
                }
                else if (opt == 7) {
                    cns = 0;
                    //System.out.println("flag");
                    cur = true;

                }

            }
            if (cns == 2 && cur==true) {


                //Scanner scan = new Scanner(System.in);
                String name;
                System.out.println("enter the name of the production company you want to search" + "And after each space of one word please press ENTER to write the remaining word");
                Scanner sc = new Scanner(System.in);
                name = sc.nextLine();
                name += sc.nextLine();

                System.out.println("1)Most Recent\n2) movie with max reven\n3) Total Profit\n4) List of production company and count of produced movies\n5) Back to Main Menu");
                Scanner scn = new Scanner(System.in);
                pructioncompanysearch ob = new pructioncompanysearch();
                opt = scn.nextInt();
                if (opt == 1) {
                    //MovieList ob1 = new MovieList();
                    MovieList.filework();
                    ob.mostrecent(name);
                }
                if (opt == 2) {
                    //MovieList ob1 = new MovieList();
                    MovieList.filework();
                    ob.maxrev(name);
                }
                if (opt == 3) {
                    //MovieList ob1 = new MovieList();
                    MovieList.filework();
                    ob.totalprofit(name);
                }
                if (opt == 4) {
                    // MovieList ob1=new MovieList();
                    MovieList.filework();
                    ob.prodandnumofmovies();
                }
                else if(opt==5){
                    cns = 0;
                    cur = true;
                }

            }
            if (cns == 3 && cur==true) {
                // MovieList ob1=new MovieList();
                MovieList.filework();
                AddNew ob = new AddNew();
                ob.addmovie();
                cur = true;
                cns = 4;


            }
            if (cns == 4) {
                //MovieList ob1=new MovieList();
                MovieList.filework();
                finalcheck ab = new finalcheck();
                ab.checker();
                System.exit(0);
            }
        }
    }
}
         // System.out.println("Here it ends");


        //scan.close();

        /*MovieList ob=new MovieList();
        MovieList.filework();
        for (Movie s : MovieList.movieList) {
            System.out.println(s.Title);
        }
        System.out.println("\n");
        SearchMovie ob1 = new SearchMovie();*/
        // ob.searchbytitle();
        // ob.searchbyReleaseYear();
        //ob.searchbyGenre();
       // ob.searchbyproductioncompany();
        //ob.searchbyrunningtime();
        //System.out.println(line);

        // br.close();
        //ob1.top10();
        //List<Movie> movieList = new ArrayList();
        // movieList.add(new Movie(a.b.c.d.e.f));*/
        //pructioncompanysearch ob=new pructioncompanysearch();
        //ob.entercomp();
       // AddNew ob1=new AddNew();
       //ob1.addmovie();

        //finalcheck ab=new finalcheck();
        //ab.checker();



