import java.util.HashMap;
import java.util.PriorityQueue;

class Graph{
    HashMap<Integer, HashMap<Integer, Integer>> graph;
    Graph(){
        graph = new HashMap<>();
    }

    void addEdge(int u, int v, int w){
        graph.computeIfAbsent(u, k -> new HashMap<>()).put(v, w);
        graph.computeIfAbsent(v, k -> new HashMap<>()).put(u, w);
    }
}

public class DijkstrasAlgorithm{
    

    HashMap<Integer, Integer> dijkstra(int start, HashMap<Integer, HashMap<Integer, Integer>> graph){
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.add(new int[]{0, start});
        HashMap<Integer, Integer> distances = new HashMap<>();
        for(int node : graph.keySet()){
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        while(!heap.isEmpty()){
            int[] top = heap.poll();
            int currentDistance = top[0];
            int currentVertex = top[1];
            for(int neighbour : graph.get(currentVertex).keySet()){
                int distance = currentDistance + graph.get(currentVertex).get(neighbour);
                if(distance < distances.get(neighbour)){
                    distances.put(neighbour, distance);
                    heap.add(new int[]{distance, neighbour});
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2, 1);
        g.addEdge(1, 3, 4);
        g.addEdge(2, 3, 2);
        g.addEdge(2, 4, 5);
        g.addEdge(3, 4, 1);

        DijkstrasAlgorithm dijsktra = new DijkstrasAlgorithm();
        HashMap<Integer, Integer> distances = dijsktra.dijkstra(1, g.graph);
        for(int vertex : distances.keySet()){
            System.out.println(vertex + " " + distances.get(vertex));
        }
        
    }
}
