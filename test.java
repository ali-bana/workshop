/**
 * Created by ali on 3/27/17.
 */

import java.util.*;

class my
{
    public String s;
}

public class test
{

    public static void sth(my k)
    {
        k.s = "abcd";
                return;
    }

    public static void main(String args[])
    {
       my k = new my();
       k.s = "karim";
       ArrayList<my> sth = new ArrayList<>();
       sth.add(k);
        System.out.print  System.out.println(k.s);
        System.out.println(sth.get(0).s);
<<<<<<< HEAD
        System.out.println("branch added sd");
=======
        System.out.println("new branch dev");
>>>>>>> origin/dev
        //sth dfd
    }

}
