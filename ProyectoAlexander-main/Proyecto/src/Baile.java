
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Baile {
    private int horarios[][] = new int[2][30];
    private int control1 =0;
    private int control2 =0;
    
    
    public void activar(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 30; j++) {
                horarios[i][j]=0;
            }
        }
    }
    
    public void setReserva(int horario,int eID){
        if(horario == 0 && control1<30){
            horarios[horario][control1]=eID;
            control1++;
        }else if(horario == 1 && control2<30){
            horarios[horario][control2]=eID;
            control2++;
        }else{
            JOptionPane.showMessageDialog(null, "Horario lleno");
        }
    }
    
    public void quitarReserva(int horario,int x){
        if(horario==0){
            control1--;
            for (int i = x; i < control1; i++) {
                horarios[horario][i]=horarios[horario][i+1];
            }
            horarios[horario][control1]=0;
        }else{
            control2--;
            for (int i = x; i < control2; i++) {
                horarios[horario][i]=horarios[horario][i+1];
            }
            horarios[horario][control2]=0;
        }
    }
    
    public int getReserva(int horario,int x){
        return horarios[horario][x];
    }

}
