/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class USU {
        
    private String datosNombres[] ={
        "Sofia Manzanares "," Eliseo Alvaro ","Alejandra Salmeron ","Octavio Adan","Benita Parra ","Marcela Toribio ","Juliana Robles ","Eider Palazon ","Fuensanta Jimeno "," Dionisio Giraldo",
        " Virginia Carreras"," Angel Maria Xu ","Martina Soto ","Clotilde Camino","Luis Alberto Borja ","Marta Carreras "," Luis Angel Rivas"," Josu Frances","Aitana Vicente "," Candida Arribas",
        "Adan Muñoz "," Maria Purificacion Cortes","Jan Burgos ","Daniel Pinto ","Maria Angels Cazorla ","Juan Ignacio Lozano ","Concepcion Postigo ","Ayman Yuste "," Eduardo Jose Jerez","Jesus Maria Moreno"
    };
        
    private int datosIdentificación[] ={
        1,2,3,4,5,6,7,8,9,10, 
        11,12,13,14,15,16,17,18,19,20,
        21,22,23,24,25,26,27,28,29,30  
    };
        
        
public String getNombre(int pos){
    return datosNombres[pos];
}

public int getID(int pos){
    return datosIdentificación[pos];
}
    
}
