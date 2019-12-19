/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Carlos Herrera
 */
public class Acces implements AccesInterface {

    private boolean flag = false;

    @Override
    public void login(String username, String password) {
        try {
            if (username.equals("admin") && password.equals("pass")) {
                setFlag(true);
            } else {
                System.out.println("Ahutorized person only");
            }
        } catch (Exception e) {
            System.out.println("Your Username or Password are wrong");
            logout();
            setFlag(false);
        }
    }

    @Override
    public void logout() {
        System.out.println("Have a good day");
        setFlag(false);
    }

    /**
     * @return the flag
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
