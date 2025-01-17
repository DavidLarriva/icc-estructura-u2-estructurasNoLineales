package main.Ejercicio_03_listLevels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.Materia.Models.Node;

public class ListLevels {
    public List<LinkedList<Node>> ListLeves(Node root) {
        List<LinkedList<Node>> resultado = new ArrayList<>();

        if (root == null) {
            return resultado; 
        }

        LinkedList<Node> nivelActual = new LinkedList<>();
        nivelActual.add(root);

        while (!nivelActual.isEmpty()) {
            resultado.add(new LinkedList<>(nivelActual)); 
            LinkedList<Node> nivelSiguiente = new LinkedList<>();
            
            for (Node nodo : nivelActual) {
                if (nodo.getLeft() != null) {
                    nivelSiguiente.add(nodo.getLeft());
                }
                if (nodo.getRight() != null) {
                    nivelSiguiente.add(nodo.getRight());
                }
            }
            nivelActual = nivelSiguiente; 
        }

        return resultado;
    }

    public void imprimirListasPorNivel(List<LinkedList<Node>> listas) {
        int nivel = 0;
        for (LinkedList<Node> lista : listas) {
            System.out.print("Nivel " + nivel++ + ": ");
            for (Node nodo : lista) {
                System.out.print(nodo.getValue() + " -> ");
            }
            System.out.println("null");
        }
    }
}

