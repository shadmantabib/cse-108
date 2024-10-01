import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

public class AddNew {
    public void addmovie()throws Exception{
        //final String INPUT_FILE_NAME = "movies.txt";
        // String OUTPUT_FILE_NAME = "movies.txt";
        System.out.println("enter Title .If the title has more than one word please take the last word in second line and press a SPACE after first line finished");

        Scanner scan= new Scanner(System.in);
        String title= scan.nextLine();
        title+=scan.nextLine();
       // BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME,true));
        //bw.write(title +",");
       //bw.write(System.lineSeparator());

        System.out.println("enter Year of Release");

        Scanner scan1= new Scanner(System.in);
        String yor=scan1.next();

        //bw.write(yor+",");

        System.out.println("enter the genre");
        Scanner scan2=new Scanner(System.in);
        Scanner scan3=new Scanner(System.in);
        Scanner scan4=new Scanner(System.in);
        String genre1=scan2.nextLine();
        //bw.write(genre1+",");
        String genre2=scan3.nextLine();
       // bw.write(genre2+",");
        String genre3=scan4.nextLine();
        //bw.write(genre3+",");
        String genre=genre1+genre2+genre3;

        //BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME));
       // bw.write(genre+",");


        System.out.println("enter run time");
        Scanner scan5= new Scanner(System.in);
        String runtime=scan5.next();
       // bw.write(runtime+",");


        System.out.println("enter production company .If the company name has more than one word please take the last word in second line and press a SPACE after first line finished");
        Scanner scan6= new Scanner(System.in);
        String prc= scan6.nextLine();
        prc+=scan.nextLine();
        //bw.write(prc+",");

        System.out.println("Enter budget");

        Scanner scan7= new Scanner(System.in);
        String budget=scan7.next();
        //bw.write(budget+",");

        System.out.println("enter revenue");
        Scanner scan8= new Scanner(System.in);
        String revenue=scan8.next();
        MovieList.movieList.add(new Movie(title,Integer.parseInt(yor),genre,Integer.parseInt(runtime),prc,Integer.parseInt(budget),Integer.parseInt(revenue)));
       // bw.write(revenue);

      // bw.write(System.lineSeparator());
      // bw.close();
        String OUTPUT_FILE_NAME = "movies.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME,true));
        bw.write( (MovieList.movieList.get(MovieList.movieList.size()-1).Title)+",");
        bw.write((MovieList.movieList.get(MovieList.movieList.size()-1).Year_of_Release)+",");
        String test=new String((MovieList.movieList.get(MovieList.movieList.size()-1).Genre));
        String[] out=test.split(" ");
        int p=0;
        while(p<out.length){
            bw.write(out[p]+",");
            p++;
        }
        bw.write((MovieList.movieList.get(MovieList.movieList.size()-1).Running_Time)+",");
        bw.write((MovieList.movieList.get(MovieList.movieList.size()-1).Production_Company)+",");

        bw.write((MovieList.movieList.get(MovieList.movieList.size()-1).Budget)+",");
        bw.write((MovieList.movieList.get(MovieList.movieList.size()-1).Revenue ));
        //bw.write(System.lineSeparator());
        bw.close();
        System.out.println("New Movie has been being added");
        //MovieList.movieList.add(new Movie(title,yor,genre,runtime,prc,budget,revenue));
    }
}
