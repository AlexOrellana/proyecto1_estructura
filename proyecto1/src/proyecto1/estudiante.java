/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author alex
 */
public class estudiante {
    String nombre;
    int num_cuenta;
    String carrera;

    public estudiante(String nombre, int num_cuenta, String carrera) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.carrera = carrera;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    @Override
    public String toString() {
        return nombre + "," + num_cuenta + "," + carrera ;
    }
    
}
