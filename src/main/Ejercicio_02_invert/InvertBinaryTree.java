package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    private Node root;

    //Metodo para invertir un arbol recursivamente


    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        
        //Simplemente hacemos una variable tipo 'Node' tanto del subarbol izquierdo de la raiz como del subarbol derecho y luego llamamos al metodo recursivamente
        Node leftSubtree = invertTree(root.getLeft());
        Node rightSubtree = invertTree(root.getRight());

        
        root.setLeft(rightSubtree);
        root.setRight(leftSubtree);

        

        return root;  
    }

   

    
}
