/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Acces;
import controller.User;
import java.util.Scanner;

/**
 *
 * @author Carlos Herrera
 */
public class SolidPractice {

    public static Acces aC = new Acces();
    public static User uS = new User();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to User Register System, URS");
            System.out.println("Username:");
            String user = scan.next();

            System.out.println("Password:");
            String password = scan.next();

            aC.login(user, password);

            if (aC.isFlag()) {
                if (uS.getUserCount() == 0) {
                    System.out.println("You have to enter a new user");
                } else {
                    while (aC.isFlag()) {
                        System.out.println("What do you want to do?");
                        System.out.println("1- Create 2- Read 3-Delete 4-Exit");
                        int decision = scan.nextInt();
                        switch (decision) {
                            case 1:
                                System.out.println("Let's create an user");
                                System.out.println("Name:");
                                uS.setName(scan.next());
                                
                                System.out.println("Age:");
                                uS.setAge(scan.nextInt());
                                
                                System.out.println("DUI:");
                                uS.setDUI(scan.next());
                                uS.create();
                                break;
                            case 2:
                                System.out.println("Check all the users");
                                uS.read();
                                break;
                            case 3:
                                System.out.println("Delete an user:");
                                uS.read();
                                System.out.println("Who do you want to delete?");
                                uS.selected = scan.nextInt();
                                uS.delete();
                                break;
                            case 4:
                                aC.logout();
                                break;
                            default:
                                System.out.println("That is not a valid number");
                                break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error running app");
        }
    }

}
