/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class Reporte {
    private int Control = 0;
    private String INFO[]= {
        "","","","","","","","","","","","","","","","","","","",""
    };
    
    
    
    
    public void setInfo(String s){
        if(Control<20){
            INFO[Control]=s;
            Control =Control+1;
        }else{
            for (int i = 0; i < 19; i++) {
                INFO[i]=INFO[i+1];
            }
            INFO[20]=s;
        }
    }
    
    
    public String getInfo(int i){
        String tempS ="";
        if(i<Control){
            tempS = ""+(i+1)+" "+INFO[i];
        }
        return tempS;
    }
    
}
