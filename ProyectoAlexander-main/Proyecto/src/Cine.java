
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Cine {
    
    private String nombrePeli;
    private int salaPeli;
    private int tamano;
    
    private int asiento[][] = {
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };

    //CONSTRUCTOR

    public Cine(String nombrePeli, int salaPeli, int tamano) {
        this.nombrePeli = nombrePeli;
        this.salaPeli = salaPeli;
        this.tamano = tamano;
    }
    
    

    //SETTERS
    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public void setsalaPeli(int salaPeli) {
        this.salaPeli = salaPeli;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    public void setAsientoS(int row, int col, int entry){
        this.asiento[row][col] = entry;
    }
    
    public void setAsiento(int row, int col, int entry){
        if(asiento[row][col] == 0){
            this.asiento[row][col] = entry;
        }else{
            JOptionPane.showMessageDialog(null, "Asiento ocupado");
        }
    }
    
    public void quitarAsiento(int row, int col){
        asiento[row][col] = 0;
    }
    
    
    //GETTERS

    public String nombrePeli() {
        return nombrePeli;
    }

    public int salaPeli() {
        return salaPeli;
    }

    public int getTamano() {
        return tamano;
    }
    
    public int getAsiento(int f, int c){
        return asiento[f][c];
    }
    
}
