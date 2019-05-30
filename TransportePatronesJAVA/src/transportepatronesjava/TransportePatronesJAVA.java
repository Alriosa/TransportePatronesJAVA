/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportepatronesjava;

/**
 *
 * @author Alriosa
 */
import java.util.Scanner;

public class TransportePatronesJAVA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menuOption;

        System.out.println("Welcome to transport App");
        System.out.println("What do you wish to do?");
        System.out.println("1- Advance");
        System.out.println("2- Stop");
        System.out.println("3- Reverse");
        System.out.println("4- Status");
        menuOption = in.nextInt();
        menu(menuOption);
    }

    public static int menu(int pmenuOption){

        switch (pmenuOption){
            case 1:
                advance();
                 break;
            case 2:
                stop();
                break;
            case 3:
                reverse();
                break;
            case 4:
                status();
                break;

        default:
            System.out.println("Wrong");
            break;}
        return pmenuOption;
    }

    private static void advance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void reverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

