package com.busnet.app.GamarraApp;

import com.busnet.app.GamarraApp.interfaces.Ropas_bebe;
import com.busnet.app.GamarraApp.interfaces.Ropas_caballeros;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Ropas_bebe ropas_bebe = new Ropas_bebe();
        System.out.println( ropas_bebe.InformePrenda() + " " 
    	+ ropas_bebe.InformeDescripsion() +" "+
    	ropas_bebe.InformeTalla());
        
        
        Ropas_caballeros ropas_caballeros = new Ropas_caballeros();
        System.out.println( ropas_caballeros.InformePrenda() + " " 
            	+ ropas_caballeros.InformeDescripsion() +" "+
            	ropas_caballeros.InformeTalla()+" "+
            	ropas_caballeros.InformeImagen()+" "+
            	ropas_caballeros.InformePrecio());
                
    }
}
