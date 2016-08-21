/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author alex
 */
public class estudiantes_notas {
    int num_cuenta;
    VSArrayList notas= new VSArrayList(0, 10);

    public estudiantes_notas(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }
    
    void agregar_nota(Object nota){
        int pos=0;
        if (notas.size()==0) {
            pos=0;
        }else{
            pos = pos + 1;      
        }
        notas.insert2(nota,pos);
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }
    
    double promedio(){
        double resultado=0.0;
        for (int i = 0; i < notas.size(); i++) {
            resultado = resultado + (1.0)*((int)notas.get(i));
        }
        resultado = (resultado/((int)notas.size()));
        return resultado;
    }
}
