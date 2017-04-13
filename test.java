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
       k.s = "hassan";
       ArrayList<my> sth = new ArrayList<>();
       sth.add(k);
        System.out.println(k.s);
        System.out.println(sth.get(0).s);
        sth(k);
        System.out.println(k.s);
        System.out.println(sth.get(0).s);
    }
}
