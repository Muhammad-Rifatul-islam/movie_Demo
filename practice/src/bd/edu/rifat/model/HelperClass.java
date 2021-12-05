package bd.edu.rifat.model;

import java.util.ArrayList;

public class HelperClass  {

    static ArrayList<Comment> commentList;
    static ArrayList<Production> productionList;
    static ArrayList<String> categoriList;

    static {

        commentList=new ArrayList<>();
        productionList=new ArrayList<>();

        commentList.add(new Comment("rifat Mazumder","12 jan 2021","awesome movie"));
        commentList.add(new Comment("sifat","14 jan 2021","nice movie"));

        productionList.add(new Production("marvel","dhaka"));
        productionList.add(new Production("Dc","Cumilla"));

        categoriList =new ArrayList<>();
        categoriList.add("horror");
        categoriList.add("action");







    }

}
