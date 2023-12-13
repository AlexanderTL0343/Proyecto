
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class logica {
    Cine peli[] = new Cine[50];
    USU empleados = new USU();
    GYM gimnasio = new GYM();
    Reporte reporte = new Reporte();
    Baile baile = new Baile();
    Yoga yoga = new Yoga();
    
    
    
    //iniciar objetos
    public void activacion(){
        yoga.activar();
        baile.activar();
    }
    
    //VARIABLES SALA DE CINE
    int salaEleccion;
    int estado;
    int IDtemporal;
    int cantidad = 0;
    
    public int getTamano(){
        if(peli[salaEleccion-1].getTamano()==0){
            return 1;
        }else{
            return 2;
        }
    }
    
    
    
    //crear sala de cine
    public void hacerSala(String name, int size){
        if(cantidad<10){
            peli[cantidad] = new Cine(name,cantidad+1,size);
            cantidad = cantidad+1;
        }else{
            JOptionPane.showMessageDialog(null, "Limite de peliculas alcanzado");
        }
        
    }
    
    //eliminar sala
    public void quitarSala(int del){
        cantidad--;
        for (int i = del; i < cantidad; i++) {
            peli[i].setNombrePeli(peli[i+1].nombrePeli());
            peli[i].setTamano(peli[i+1].getTamano());
            
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    peli[i].setAsientoS(j, k, peli[i+1].getAsiento(j, k));
                }
            }
            
        }
    }
    
    //consultar emplado cine
    public void consultaCine(int id){
        String temp = ""+getEmpleado(id) + " ID: "+id+"\nAsientos:\n";
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if(peli[salaEleccion-1].getAsiento(i, j)==id){
                    switch (j) {
                        case 0 -> temp = temp+"A"+i+1+"\n";
                        case 1 -> temp= temp+"B"+i+1+"\n";
                        case 2 -> temp= temp+"C"+i+1+"\n";
                        case 3 -> temp= temp+"D"+i+1+"\n";
                        case 4 -> temp= temp+"E"+i+1+"\n";
                        case 5 -> temp= temp+"F"+i+1+"\n";
                        default -> {
                        }
                    }
                }
            }
            
        }
        
        JOptionPane.showMessageDialog(null, temp);
        
    }
    
    
    //cambiar tamaño sala de cine
    public void cambiarTamañoPeli(int x){
        if(x==0){
            for (int i = 0; i < 5; i++) {
                peli[salaEleccion-1].setAsientoS(i, 5, 0);
            }
        }
        peli[salaEleccion-1].setTamano(x); 
    }
    
    //cambiar nombre pelicula
    public void cambiarNombrePeli(String nameTemp){
        peli[salaEleccion-1].setNombrePeli(nameTemp);
        
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    //revisar nombre pelicula
    public String getMovNombre(){
        return peli[salaEleccion-1].nombrePeli();
    }
    
    //añadir empleado a asiento   
    public void setAsientoPeli(int f,int c){
        peli[salaEleccion-1].setAsiento(f, c, IDtemporal);
    }
    
    //remover empleado de asiento
    public void quitarAsientoP(int r,int c){
        peli[salaEleccion-1].quitarAsiento(r, c);
    }
    
    
    public int getEstadoBotones(int row, int col){
        if(peli[salaEleccion-1].getAsiento(col, row)==0){
            return 1;
        }else{
            return 0;
        }
    }
    
    
    public String getListaPeliculas(int x){
        String tempStr = "";
        
        if(x<cantidad) {
            tempStr = tempStr + (x+1) + ". " + peli[x].nombrePeli();
        }
        
        
        
        return tempStr;
    }
    
    
    public int getEstado() {
        return estado;
    }

    //setter getters de vars temp
    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getSalaEleccion() {
        return salaEleccion;
    }

    public void setSalaEleccion(int salaEleccion) {
        this.salaEleccion = salaEleccion;
    }

    public int getTempID() {
        return IDtemporal;
    }

    public void setTempID(int IDtemporal) {
        this.IDtemporal = IDtemporal;
    }
    
    
    
    //obtener nombres de empleados usando ID
    
    public String getEmpleado(int id){
        String tempS = "";
        
        for (int i = 0; i < 30; i++) {
            if(empleados.getID(i)==id){
                tempS = empleados.getNombre(i);
            }
        }
        
        
        
        return tempS;
    }
    
    
    
    //gym
    public void setReserva(int pos,int ID){
        gimnasio.setReserva(pos, ID);
    }
    
    public void removerReserva(int x){
        gimnasio.quitarReserva(x);
    }
    
    public int getReserva(int x){
        return gimnasio.getReserva(x);
    }
    
    public String etiquetas(int x){
        String tempS = "" + (x+2)+"PM: ";
        
        if(gimnasio.getReserva(x)==0){
            tempS= tempS +"Vacio";
        }else{
            tempS= tempS+getEmpleado(gimnasio.getReserva(x));
        }
        
        return tempS;
    }
    
    
    
    //Yoga
    public void AgregarReservaYoga(int horario,int ID){
        yoga.setReserva(horario, ID);
    }
    
    public void quitarReservaYoga(int horario,int x){
        yoga.quitarReserva(horario, x);
    }
    
    public int getReservaYoga(int horario,int x){
        return yoga.getReserva(horario, x);
    }
    
    
    public String listaYoga(int horario,int x){
        String tempS = "";
        
        if(yoga.getReserva(horario,x)!=0){
            tempS= tempS+ (x+1)+": "+getEmpleado(yoga.getReserva(horario,x))+" ID: "+yoga.getReserva(horario,x);
        }
        
        return tempS;
    }
    
    
    //baile
    public void setReservaBaile(int horario,int ID){
        baile.setReserva(horario, ID);
    }
    
    public void quitarReservaBaile(int horario,int x){
        baile.quitarReserva(horario, x);
    }
    
    public int getBaile(int horario,int x){
        return baile.getReserva(horario, x);
    }
    
    
    public String listaBaile(int horario,int x){
        String tempS = "";
        
        if(baile.getReserva(horario,x)!=0){
            tempS= tempS+ (x+1)+": "+getEmpleado(baile.getReserva(horario,x))+" ID: "+baile.getReserva(horario,x);
        }
        
        return tempS;
    }
    
    
    //historial
    public void addReporte(String temp){
        
        reporte.setInfo(temp);
        
    }
    
    public String getReporte(int x){
        return reporte.getInfo(x);
    }
    
    
    
    
    
}
