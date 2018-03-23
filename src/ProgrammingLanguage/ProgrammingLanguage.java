/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingLanguage;

/**
 *
 * @author Zsolt
 */
public class ProgrammingLanguage {
    String language_name;
    String language_type;
    
    //Construktor
    
    ProgrammingLanguage(String n, String t){
        language_name = n;
        language_type = t;
    }
    
    public static void main(String[] args) {
        ProgrammingLanguage C = new ProgrammingLanguage("C", "Procedural");
        ProgrammingLanguage Cpp = new ProgrammingLanguage("Cpp", "Object-Oriented");
    
            C.display();
            Cpp.display();
    
    
    }
    
    void display(){
        System.out.println("Language name:"+language_name);
        System.out.println("Language type:"+language_type);
    }
}
