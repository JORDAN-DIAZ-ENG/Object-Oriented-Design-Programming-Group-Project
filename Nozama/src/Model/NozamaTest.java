package Model;

import DataTypes.Item;
import Model.NozamaSystem;

public class NozamaTest
{
    public static void main(String[] args) {
        NozamaSystem instance = NozamaSystem.getInstance();

        System.out.println(instance.logIn("username", "password"));



        System.out.println();

        for (Item item : instance.getInventory())
        {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("Hello, welcome to Nozama!");


        Cart c = new Cart();
        Item i = new Item("99", "carrots", "33","carrots gone bad");
        c.addItem(i);
        System.out.println(c.getCart());

    }
}
