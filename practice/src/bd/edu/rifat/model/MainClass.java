package bd.edu.rifat.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass  {

    public static void main(String[] args) {



        Scanner in=new Scanner(System.in);
        System.out.print("How many movies you want ? : ");
        int noOfmovie=in.nextInt();
        ArrayList<Movie> movies=new ArrayList<>();
        for (int i=1; i<=noOfmovie;i++){
            System.out.println("Movie No :"+i);
            System.out.println("*******************");
            System.out.print("Enter Movie name :");
            String name=in.next();
            System.out.print("Enter movie rating :");
            double rating=in.nextDouble();
            System.out.print("enter release date :");
            String release=in.next();
            Movie m=new Movie( name,release,rating);

            System.out.println("Enter category . 1.Horror 2.Action");
            int b=in.nextInt();
            m.setCategory(HelperClass.categoriList.get(b-1));

            System.out.println("Enter production . 1.Marvel 2.Dc");
            int d=in.nextInt();
            m.setProduction(HelperClass.productionList.get(d-1));

            System.out.print("Enter InitialBudget :");
            double initialBudget=in.nextDouble();
            System.out.print("Enter Box Office :");
            double boxOffice=in.nextDouble();

            m.getProduction().setInitialBudget(initialBudget);
            m.getProduction().setBoxOfice(boxOffice);

            m.setComments(HelperClass.commentList);

            movies.add(m);


        }

        for (Movie mm : movies){
            System.out.println(mm);
        }
    }
}
