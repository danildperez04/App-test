package Model;

import java.util.ArrayList;

public class User {
    public User(){}

    public User(String nombre, String email, int id, ArrayList<Test> tests) {
        this.nombre = nombre;
        this.email = email;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Test> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Test> tests) {
        this.tests = tests;
    }
    
    private String nombre;
    private String email;
    private static String password;
    private int id;
    private ArrayList<Test> tests;
}
