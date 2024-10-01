import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Movie {


    public  String Title;
    public  int Year_of_Release;
    public  String Genre;
    public   int Running_Time;
    public  String Production_Company;
    public  int Budget;
    public  int Revenue;


    public  Movie(String Title, int Year_of_Release, String Genre, int Running_Time, String Production_Company, int Budget, int Revenue) {

        this.Title = Title;
        this.Year_of_Release = Year_of_Release;
        this.Genre = Genre;
        this.Running_Time = Running_Time;
        this.Production_Company = Production_Company;
        this.Budget = Budget;
        this.Revenue = Revenue;

    }
    public String toString(){
        return "Title: "+Title+"\n"+"Realeasing Year:"+Year_of_Release+"\n"+"Genre:"+Genre+"\n"+"Running Time: "+Running_Time+"\n"+"Production Company: "+Production_Company+"\n"+"Budget: "+Budget+"\n"+"Revenue: "+Revenue ;
    }

    // public Movie(String title, String s, String genre, String s1, String production_company, String s2, String s3) {


   /* public Movie(String title, String s, String genre, String s1, String production_company, String s2, String s3) {
    }

       /* public String getName() {
            return name;
        }*/

        /*public int getId() {
            return id;
        }


}
public class FileOperations {

    private static final String INPUT_FILE_NAME = "movies.txt";
    private static final String OUTPUT_FILE_NAME = "out.txt";*/

    /*public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        while (true) {
            String line = br.readLine();
            StringTokenizer tokens = new StringTokenizer(line, ",");


            a=tokens.nextToken();
            b=tokens.nextToken();
            c=tokens.nextToken()+tokens.nextToken()+tokens.nextToken();
            d=tokens.nextToken();
            e=tokens.nextToken();
            f=tokens.nextToken();
            g=tokens.nextToken();


            if (line == null) break;
            System.out.println(line);
        }
        br.close();*/
}