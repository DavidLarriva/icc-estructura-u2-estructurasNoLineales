import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Ejercicio_03_listLevels.ListLevels;

public class App {
    public static void main(String[] args) throws Exception {
        runArbolBinario();


        /*public void runEjercicio3() {
            ArbolBinario arbolBinario = new ArbolBinario();
            ListLeves listLeves = new ListLeves();
            int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
            
            for (int valor : valores) {
                arbolBinario.insert(valor);
            }
    
            System.out.println("Listas por Nivel:");
            listLeves.imprimirListasPorNivel(listLeves.ListLeves(arbolBinario.getRoot()));
        }*/
    
    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        int[] valores = {40,20,60,10,30,50,70,5,15,55};
        
        for(int i=0;i<valores.length;i++){
            arbolBinario.insert(valores[i]);
        }
        System.out.println("Recorrido Pre order");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido pos order");
        
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido en orden ");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());

        System.out.println();
        System.out.println();
        arbolBinario.printTree();

        

        
    }

    
    }
    
    


    

