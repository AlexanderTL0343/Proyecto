
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class GYM {
   
    private int campos[] = {0,0,0,0,0,0};
    
    
    public void setReserva(int pos, int entry){
        if(campos[pos]==0){
            campos[pos]=entry;
        }else{
            JOptionPane.showMessageDialog(null, "Horario ocupado");
        }
    }
    
    public int getReserva(int x){
        return campos[x];
    }
    
    public void quitarReserva(int x){
        campos[x]=0;
    }
    
    
    
    
    
    
    
    
}
