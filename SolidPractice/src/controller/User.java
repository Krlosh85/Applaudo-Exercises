/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.simulatedDB;

/**
 *
 * @author Carlos Herrera
 */
public class User implements UserInterface {

    private static int userCount = 1;
    protected static int id = 1;
    public int selected = 0;
    private String name;
    private int Age;
    private String DUI;
    private boolean flag = false;

    protected simulatedDB sDB = new simulatedDB();

    @Override
    public void create() {
        sDB.id[id - 1] = sDB.id[userCount - 1];
        sDB.user[id - 1] = getName();
        sDB.DUI[id - 1] = getDUI();
        userCount++;
        id++;
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read() {
        if (userCount == 0) {
            System.out.println("There are no users at the moment");
        } else {
            for (int i = 0; i < userCount -1 ; i++) {
                System.out.println(sDB.id[i] + " " + sDB.user[i] + " " + sDB.DUI[i]);
            }
        }

    }

    @Override
    public void delete() {
        if (selected > userCount) {
            System.out.println("There aren't that number of users");
        } else {
            sDB.DUI[selected] = "Empty";
            sDB.user[selected] = "Empty";
            System.out.println("The user was successfully removed");
        }
    }

    /**
     * @return the userCount
     */
    public int getUserCount() {
        return userCount;
    }

    /**
     * @param userCount the userCount to set
     */
    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the DUI
     */
    public String getDUI() {
        return DUI;
    }

    /**
     * @param DUI the DUI to set
     */
    public void setDUI(String DUI) {
        this.DUI = DUI;
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
