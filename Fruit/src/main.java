
import controller.FruitShopSystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quắn
 */
public class main {
    
    public static void main(String[] args) {
        String mChon[] = {"Create Fruit", "View oders", "Shopping", "Exit"};
        FruitShopSystem frs = new FruitShopSystem("FRUIT SHOP SYSTEM", mChon);
        frs.run();
    }
}