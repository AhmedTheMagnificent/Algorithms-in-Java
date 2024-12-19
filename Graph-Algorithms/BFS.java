import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BFS{
    private int vertices;
    private ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices){
        this.vertices = vertices;
        adj = new ArrayList<>(vertices);

        for(int i = 0; i < vertices; i++){
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int w){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public int PrimsMST(){
        int cost = 0;
        boolean visited = new Set<Integer>(vertices);
        
    }

}