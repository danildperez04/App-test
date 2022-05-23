package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
    public User(){}

    public User(String name, String carnet,String password, ArrayList<Test> tests) {
        this.name = name;
        this.carnet = carnet;
        this.password = password;
        this.tests = tests;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public ArrayList<Test> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Test> tests) {
        this.tests = tests;
    }
    
    private String name;
    private String carnet;
    private String password;
    private ArrayList<Test> tests;
}
