package Model;

import java.util.ArrayList;

public class User {
    public User(){}

    public User(String nombre, String carnet,String password, ArrayList<Test> tests) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.tests = tests;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getPassword() {
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
    
    private String nombre;
    private String carnet;
    private static String password;
    private ArrayList<Test> tests;
}
