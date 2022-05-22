package Controller;

import Model.User;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileStream {
    
    public ArrayList<User> getUsers(){
        try{
            ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("users.out"));   
            users = (ArrayList<User>) archivo.readObject();
         
            return users;
        }catch(IOException e){
            System.out.println("ERROR DE EJECUCION");
            return null;
        }catch(ClassNotFoundException io){
            System.out.println("NO SE HA ENCONTRADO LA CLASE");
            return null;
        }
    }
    
    public void setNewUser(User user){
        try{
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("users.out"));
            users.add(user);
            
            archivo.writeObject(users);
            
            archivo.close();
        }catch(FileNotFoundException e){
            System.out.println("Ha ocurrido un error! \nNo hemos encontrado la ruta del archivo especificado");
        }
        catch(IOException io){
            System.out.println("Ha ocurrido un error! \nLa ejecucion del programa ha sido interrumpida");
        }
    }
    
    ArrayList<User> users;
}
