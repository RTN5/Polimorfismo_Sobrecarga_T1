/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_sobrecarga_t1;

/**
 *
 * @author User
 */
class Precio_Repuestos{
    int SistemaTransimsion(int EngranajeConico, int EngranajeRecto){
        return EngranajeConico+EngranajeRecto;
    }
    
    double SistemaTransmision(double RetenGrasa, int RetenesAceite, double RetenFuerzaAxial){
        return RetenGrasa+RetenesAceite+RetenFuerzaAxial;
    }
    
    double SistemaTransmision(double DiscoEmbrague, int Cojinete){
        return DiscoEmbrague+Cojinete;
    }
    
    int SistemaTransmision(int Diferencial, int ArbolTransmision){
        return Diferencial+ArbolTransmision;
    }
}

public class Polimorfismo_Sobrecarga_T1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Precio_Repuestos  SC1 = new Precio_Repuestos();
        Precio_Repuestos  SC2 = new Precio_Repuestos();
        Precio_Repuestos  SC3 = new Precio_Repuestos();
        Precio_Repuestos  SC4 = new Precio_Repuestos();
        
        System.out.println("      Universidad de las Fuerzas Armadas ESPE\n");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Materia: Programación [7450] ");
        System.out.println("Alumno: Esteban Morales\n");
        System.out.println("        Polimorfismo con sobrecarga");
        System.out.println("_________________________________________");
        
        
        int Precio_engranes;
        SC1.SistemaTransmision(40, 20);
        Precio_engranes = SC1.SistemaTransmision(40, 20);
        System.out.println("Costo de engranajes:"+Precio_engranes);
        
        double Precio_Retenes;
        SC2.SistemaTransmision(5.50 , 20, 40.8);
        Precio_Retenes = SC2.SistemaTransmision(5.50, 20, 40.8);
        System.out.println("Costo de Retenes:"+Precio_Retenes);
        
        double Precio_Embrague;
        SC3.SistemaTransmision(60, 20);
        Precio_Embrague = SC3.SistemaTransmision(60, 20);
        System.out.println("Costo del Embrague y cojinete :"+Precio_Embrague);
        
        int Precio_Diferencial;
        SC4.SistemaTransmision(300, 175);
         Precio_Diferencial = SC4.SistemaTransmision(300, 175);
        System.out.println("Costo del diferencial y arbolde trasmisión:"+ Precio_Diferencial);
    }
    
}
