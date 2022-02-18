/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoria;
import java.util.*;
/**
 *
 * @author evi
 */
public class sinistoses {
    
    public static int countComponents(int n, int m, int k, int[][] edges){
        int teams;
        int[] root = new int[n+1];

        //root of each village is itself
        for(int i=0; i<n+1; i++){
          root[i] = i;
        }
                
        //create the graph as given
        for(int i=0; i<m; i++) {
            root = union(n, edges[i][0], edges[i][1], root);        
        }

        
        //add new edges-creating min{#teams}
        for(int i=0; i<k; i++){
            int j=2;
            
            while(root[1] == root[j]){
                j += 1;
            }
            
            union(n, root[1], root[j], root);
        }
        
        
        //count and return min{#teams}
        teams = counter(n, root);
        return teams;
    }
    
    //counting teams
    public static int counter(int nodes, int [] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
    
        for(int i=1; i< nodes+1; i++) {
            if(list.contains(arr[i]) == false) {
                list.add(arr[i]);
            }
        }
        
        int c = list.size();
        return c;    
    }
    
    //creating edge between a-b
    public static int[] union(int n, int a, int b, int[] root) {
        
        int ra = root[a];
          int rb = root[b];

          for(int j=1; j<n+1; j++){
            if(root[j] == ra){
                root[j] = rb;
            }
          }
        return root;
    }
    
}
 
    

