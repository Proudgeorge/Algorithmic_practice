import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author simba@onlying.cn
 * @date 2019/8/28 16:38
 */
public class Graph {
    private int v; // 顶点个数
    private LinkedList<Integer> adj[]; //临接表
    public Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for (int i=0;i<v;++i){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int s,int t){
        //无向图一条边存两次
        adj[s].add(t);
        adj[t].add(s);
    }
    public void bfs(int s,int t){
        if (s == t) return;
        boolean[] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] prey = new int[v];
        for (int i=0;i<v;++i){
            prey[i] = -1;
        }
        while (queue.size() != 0){
            int w = queue.poll();
            for (int i=0;i<adj[w].size();++i){
                int q = adj[w].get(i);
                if (!visited[q]){
                    prey[q] = w;
                    if (q == t){
                        print(prey,s,t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }
    private void print(int[] prev,int s,int t){
        //递归打印 s->t的路径
        if (prev[t] != -1&& t!=s){
            print(prev,s,prev[t]);
        }
        System.out.println(t+" ");
    }

}
