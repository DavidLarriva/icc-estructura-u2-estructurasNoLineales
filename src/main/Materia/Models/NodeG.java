package main.Materia.Models;



import java.util.List;


public class NodeG {
    private int value;
    List<NodeG> neighbors;

    

    public NodeG(int value, List<NodeG> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }
    public NodeG(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
   
    public List<NodeG> getNeighbors() {
        return neighbors;
    }
    
    public void addNeighbor(NodeG neighbor) {
        neighbors.add(neighbor);
    }
    
}