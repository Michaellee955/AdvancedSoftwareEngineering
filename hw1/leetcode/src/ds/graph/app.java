package ds.graph;

public class app {

    public static void main(String[] args){
        Graph myGraph = new Graph(5);

        myGraph.addEdge(0,1);

        Object [] values = myGraph.adj(4);
        for (Object val: values){
            System.out.println(val);
        }
    }
}
