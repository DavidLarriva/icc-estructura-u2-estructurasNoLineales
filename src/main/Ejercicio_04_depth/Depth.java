package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    Node root;
    

    public int maxDepth(Node root) {
        //Caso base si no hay nodo retorna 0 nomas
        if (root == null) {
            return 0;
        }
        
        // Muchas llamadas recursivas para cada uno de los niveles
        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());
        
        //Cada uno de los niveles va a quedar de forma Math.max(0,0) + 1 entonces con cada nivel va subiendo el metodo hasta llegar a la raiz y asi encuentra la profundidad
        //Math.max es para comparar dos cantidades y devuelve la mayor de las dos
        return Math.max(leftDepth, rightDepth) + 1;
    }


    
    
}
