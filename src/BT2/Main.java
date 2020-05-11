/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Khiem
 */
public class Main {
    public static void main(String[] args) {
          MyStringBuilder stb = new MyStringBuilder.Builder()
                .addString("Khiem "+";")
                .addFloat((float) 0.5)
                .addBool(true)
                .builder();
        System.out.println(stb.toString());
    }
}
