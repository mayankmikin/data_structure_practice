import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Hello World!");
        ArrayList<String> mylist= new ArrayList<String>();
        mylist.add(0,"mayank");
        mylist.add("verma");
        mylist.add("aditya");
        mylist.add("gaurav");
        ArrayList<Integer> mylist2=new ArrayList<>();
        mylist2.add(3);
        System.out.println(mylist);
        System.out.println(mylist2);
        Collections.sort(mylist);

    }

}
