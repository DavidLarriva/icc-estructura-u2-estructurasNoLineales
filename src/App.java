import java.util.LinkedList;
import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        //EJERCICIOS HEHCOS EN CLASE

        //runArbolBinario();
        //runArbolRecorridos();
        //runEjercicio3();
        //runArbolAVL();

       //PRACTICA 15/02/2025

       runEjercicio01();
       runEjercicio02();
       runEjercicio03();
       runEjercicio04();








    }

    private static void runArbolAVL() {
        ArbolAVL arbolAvl = new ArbolAVL();
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};

        // Insertar cada valor al árbol
        for (int valor : values) {
            arbolAvl.insert(valor);
        }

        // Imprimir el árbol binario
        arbolAvl.printTree();
    }

    //Metodo para correr el ejercicio 03
    private static void runEjercicio03() {
        // Construir el arbol del ejemplo
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        System.out.println("EJERCICIO 03: ");
        System.out.println();

        // Imprimir el arbol como "Input"
        System.out.println("Input:");
        printTree(root, 0);

        
        ListLevels levels = new ListLevels();
        List<LinkedList<Node>> result = levels.ListLeves(root);

        // Imprimir el resultado en el formato deseado
        System.out.println("\nOutput:");
        for (int i = 0; i < result.size(); i++) {
            List<Node> level = result.get(i);
            for (int j = 0; j < level.size(); j++) {
                System.out.print(level.get(j).getValue());
                if (j < level.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("---------------------------------------------------------------");
        System.out.println();

    }

    // Método para imprimir el arbol como en la entrada
    private static void printTreeLevels(Node root) {
        if (root == null) return;

        ListLevels levels = new ListLevels();
        List<LinkedList<Node>> result = levels.ListLeves(root);

        for (int i = 0; i < result.size(); i++) {
            List<Node> level = result.get(i);

            // Imprimir nodos en la misma línea
            for (int j = 0; j < level.size(); j++) {
                System.out.print(level.get(j).getValue());
                if (j < level.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea al final de cada nivel
        }
    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        // Insertar cada valor al árbol
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

    
        arbolBinario.printTree();
    }

    public static void runArbolRecorridos() {
        ArbolBinario arbolBinario = new ArbolBinario(); 
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
    
    
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
    
        // Crear instancia de ArbolRecorridos
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
    
        // Realizar recorridos en el árbol
        System.out.println("Recorrido en preOrden (iterativo):");
        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());

        // Recorrido en preorden recursivo
        System.out.println("Recorrido en preOrden (recursivo):");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
        System.out.println(); 

        System.out.println("Recorrido en posOrder:");
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        
        System.out.println("Recorrido en inOrden:");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
        System.out.println(); 
    }  

    //Metodo para imprimir un arbol con recursividad
    public static void printTree(Node root, int espacios) {
        //Metodo estatico y publico para imprimir un arbol con recursividad
        int COUNT = 4;
        
        if (root == null) {
            return;
        }

        
        espacios += COUNT;

        
        printTree(root.getRight(), espacios);

        
        System.out.println();
        
        for (int i = COUNT; i < espacios; i++) {
            System.out.print(" ");
        }
        
        System.out.println(root.getValue());

        
        printTree(root.getLeft(), espacios);
    }
    
    //Metodo para correr el ejercicio 01
    public static void runEjercicio01() {
        
        //EJERCICIO 01

        //Aqui lo que hacemos es primero implementar un array de enteros para posteriormente implementarlos al arbol con un for y posteriormente
        //imprimir con el metodo printTree.

        //Instanciamos la clase del primer Ejercicio
        InsertBSTTest insertBSTTest = new InsertBSTTest();
        int[] valoresArbol = {5, 3, 7, 2, 4, 6, 8};


        //LLamada al metodo que inserta los valores de un array en un arbol
        Node arbol = insertBSTTest.generateTree(valoresArbol);

        System.out.println("EJERCICIO 01: ");
        System.out.println();
        //Imprimimos el input
        System.out.print("Input: [");
        for (int valores : valoresArbol){
            System.out.print(valores + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();

        System.out.println("Output: ");

        //Imprimimos el output
        int cero = 0;
        printTree(arbol, cero);  
        System.out.println();
        System.out.println("---------------------------------------------------------------");



    }

    //Metodo para correr el ejercicio 02
    public static void runEjercicio02() {
        
        //EJERCICIO 02

        //Aqui lo que hacemos es primero crear un arbol de ejemplo, despues imprimirlo, despues invertirlo con la clase InvertBinaryTree y por ultimo imprimir los dos arboles

        //Creamos el arbol con InsertBSTTest 
        InsertBSTTest insertBSTTest = new InsertBSTTest();
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        int[] valoresArbol = {4, 2, 7, 1, 3, 6, 9};
        Node raizNormal = insertBSTTest.generateTree(valoresArbol);

        //Mensaje de Eejercicio 02
        System.out.println("EJERCICIO 02: ");
        System.out.println();

        //Imprimimos el arbol con el metodo de la App
        System.out.println("Input: ");
        printTree(raizNormal, 0);

        System.out.println();
        //Invertimos el arbol y lo guardamos en otro nodo
        Node raizInvertida = invertBinaryTree.invertTree(raizNormal);

        //Imprimimos el arbol invertido 
        System.out.println("Output: ");
        printTree(raizInvertida, 0);

        System.out.println("---------------------------------------------------------------");







    }

    //Metodo para correr el ejercicio 04
    public static void runEjercicio04() {
        //EJERCICIO 04

        //Aqui lo que hacemos es primero crear un arbol de ejemplo, despues imprimirlo, despues calcular su profundidad con la clase Depth y despues imprimir su profundidad

        Depth depth = new Depth();

        //Creamos el arbol del ejemplo del pdf 
        Node raiz = new Node(4);

        
        raiz.setLeft(new Node(2));
        raiz.setRight(new Node(7));
        raiz.getLeft().setLeft(new Node(1));
        raiz.getLeft().setRight(new Node(3));
        raiz.getLeft().getLeft().setLeft(new Node(8));



        //Mensaje de Eejercicio 04
        System.out.println("EJERCICIO 04: ");
        System.out.println();

        //Imprimimos el arbol con el metodo de la App
        System.out.println("Input: ");
        printTree(raiz, 0);

        System.out.println();

        //Calculamos la profundidad
        int profundidad = depth.maxDepth(raiz);

        System.out.println("Output: " + profundidad);
        

        System.out.println("---------------------------------------------------------------");

    }

}