package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class ArbolNario {
    public static class Nodo {
        public int valor;
        public List<Nodo> hijos;

        public Nodo(int valor) {
            this.valor = valor;
            this.hijos = new ArrayList<>();
        }
    }

    private Nodo raiz;

    public void agregarRaiz(int valor) {
        this.raiz = new Nodo(valor);
    }

    public void agregarHijo(Nodo padre, int valor) {
        if (padre != null) {
            padre.hijos.add(new Nodo(valor));
        }
    }

    public Nodo getRaiz() {
        return this.raiz;
    }

    public int alturaMaxima() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(Nodo nodo) {
        if (nodo == null) return 0;

        int maxAltura = 0;
        for (Nodo hijo : nodo.hijos) {
            int alturaHijo = calcularAltura(hijo);
            maxAltura = Math.max(maxAltura, alturaHijo);
        }
        return maxAltura + 1;
    }
}