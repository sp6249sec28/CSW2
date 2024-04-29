// package Ch 17;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
public class BFS {
    public static void main(String[] args) {
        Graph g = new Graph();
        bfs(g, 0);
    }
    public static void bfs(Graph graph, int source){
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[graph.nodes];

        visited[source] = true;
        queue.add(source);

        while(!queue.isEmpty()){
            Integer curr = queue.remove();
            System.out.print(curr + " "); 
            List<Integer> adjNodes = graph.adjNodes(curr);
            for(int node : adjNodes) {
                if (!visited[node]){
                    visited[node] = true;
                    queue.add(node);
                }
            }  
        }
    }
}
class Graph{
    int nodes;
    List<Integer>[] adj;
    public Graph(){

    }
    public List<Integer> adjNodes(int node){
        return null;

    }
}
