package org.example.controller;



import org.example.model.ArbolNario;
import org.example.view.VistaArbol;

public class ControladorArbol {
    private ArbolNario modelo;
    private VistaArbol vista;

    public ControladorArbol(ArbolNario modelo, VistaArbol vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {

        modelo.agregarRaiz(1);



        int altura = modelo.alturaMaxima();
        vista.mostrarAltura(altura);
    }
}