/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.sa;

/**
 *
 * @author Carlos Flores
 */
public class person {
    private String name;
    private String address;
    private String string;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        System.out.println("Método original de la clase Herencias");
        this.address = address;
    }
    
      public void setstring(String string) {
        System.out.println("Método original de la clase Herencias");
        this.string = string;
    }

    public static class SetVariable {

        public SetVariable() {
        }
    }

    public static class NombreMetodo {

        public NombreMetodo() {
        }
    }

    

}