package main;

import java.sql.SQLOutput;

public class Classroom {

    public static void main(String[] args) {

        Wilder Jocelyn = new Wilder("Jocelyn", true);
        Wilder Maxime = new Wilder("Maxime", true);
        Wilder Alexandra = new Wilder("Alexandra", true);
        Wilder AnneOnyme = new Wilder("Anne Onyme", false);


        System.out.println(Jocelyn.whoAmI());
        System.out.println(Maxime.whoAmI());
        System.out.println(Alexandra.whoAmI());
        System.out.println(AnneOnyme.whoAmI());
    }


}

