package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBSTTest {
    
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {

        //Si el nodo es null entonces returna un nuevo nodo Raiz con el valor de value.
        if (node == null) {
            node = new Node (value);
            return node;
        }

        //Si value es menor que el valor del nodo 
        if (value < node.getValue()) {
            //metodo recursivo para poder insertar el nodo izquierdo
            node.setLeft(insert(node.getLeft(), value));


        }else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }

        //retorna un nuevo nodo, pero este nodo apunta a hijos
        return node;

                


    }

    //Metodo para crear un arbol y retornando una raiz, con entrada de un array

    public Node generateTree(int[] valores) {
        //Colocamos los valores con un foreach
        for (int valoresTree : valores) {
            insert(valoresTree);
        }

        return getRoot();
        
    }

    

    






    

}
