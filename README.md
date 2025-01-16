# Práctica 03 - Ejercicios Logica con Árboles

Este repositorio contiene cuatro ejercicios relacionados con árboles binarios, así como una clase `App` que incluye métodos para correr los diferentes ejercicios ubicados en diferentes paquetes y clases, además la clase App incluye el método PrintTree para imprimir un árbol binario.

---

## Ejercicio 01: `InsertBSTTest`

**Clase:** `InsertBSTTest`  
**Ubicación:** `main.Ejercicio_01_insert`

### Descripción General

Esta clase gestiona la inserción de valores en un Árbol Binario de Búsqueda (BST). Contiene un nodo raíz (`root`) de tipo `Node` y varios métodos para insertar valores y generar un árbol a partir de un arreglo de enteros.

### Métodos Principales

1. **`getRoot()`**  
   - Retorna la referencia a la raíz del árbol (`root`).

2. **`insert(int value)`**  
   - Inserta un nuevo valor en el BST, actualizando la raíz (en caso de que inicialmente fuese `null` o se requiera enlazar nuevos nodos).

3. **`insert(Node node, int value)`** (privado)  
   - Método recursivo que:
     - Crea un nuevo nodo si `node` es `null`.
     - Si `value` es menor que el valor del nodo actual, se inserta en el subárbol izquierdo.
     - Si `value` es mayor, se inserta en el subárbol derecho.
     - Retorna el nodo “actualizado”.

4. **`generateTree(int[] valores)`**  
   - Toma un arreglo de enteros y llama a `insert(...)` para cada uno, construyendo así el BST completo.
   - Retorna la raíz resultante para mayor comodidad.



---

## Ejercicio 02: `InvertBinaryTree`

**Clase:** `InvertBinaryTree`  
**Ubicación:** `main.Ejercicio_02_invert`

### Descripción General

Esta clase ofrece un método para **invertir** un árbol binario de manera recursiva. El proceso de inversión consiste en intercambiar los subárboles izquierdo y derecho de cada nodo.

### Métodos Principales

- **`invertTree(Node root)`**  
  - Si el nodo raíz (`root`) es `null`, retorna `null`.  
  - Llama recursivamente para invertir el subárbol izquierdo y derecho.  
  - Intercambia las referencias de `root.left` y `root.right`.  
  - Retorna la `root` invertida.


---

## Ejercicio 03: `ListLevels`

**Clase:** `ListLevels`  
**Ubicación:** `main.Ejercicio_03_listLevels`

### Descripción General

Esta clase permite **obtener** las listas de nodos para cada nivel de un árbol binario (un **recorrido por niveles**), y también **imprimir** esas listas.

### Métodos Principales

1. **`ListLeves(Node root)`**  
   - Devuelve un `List<LinkedList<Node>>`, donde cada `LinkedList<Node>` representa un nivel del árbol.  
   - Utiliza un enfoque BFS (nivel por nivel), aprovechando listas enlazadas (`LinkedList`) para separar cada nivel.

2. **`imprimirListasPorNivel(List<LinkedList<Node>> listas)`**  
   - Recorre la lista de niveles (cada `LinkedList<Node>`) y muestra sus valores, indicando el número de nivel.  



---

## Ejercicio 04: `Depth`

**Clase:** `Depth`  
**Ubicación:** `main.Ejercicio_04_depth`

### Descripción General

Esta clase calcula la **profundidad máxima** (o altura) de un árbol binario. La profundidad máxima es la longitud del camino más largo desde la raíz hasta una hoja.

### Métodos Principales

- **`maxDepth(Node root)`**  
  - Si `root` es `null`, retorna `0`.  
  - Llama recursivamente a `maxDepth(root.getLeft())` y `maxDepth(root.getRight())`.  
  - Devuelve `Math.max(leftDepth, rightDepth) + 1`.  
  - De esta forma, se va subiendo por la recursión y sumando 1 por cada nivel hasta la raíz.



---




