/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoria;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author evi
 */
public class Xoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File infile = new File("C:/pdp_2017/princ_comp/05.in");
        Scanner scnr = new Scanner(infile); 
        
        int n; 
        int m; 
        int k;
    
        n = scnr.nextInt();  
        m = scnr.nextInt(); 
        k = scnr.nextInt();
        
        int[][] akmes = new int[m][2];
     
        for (int i=0; i<m; i++) {
         akmes[i][0]=scnr.nextInt();
         akmes[i][1]=scnr.nextInt();
        }
        
        int res = sinistoses.countComponents(n, m, k, akmes); 
    
        System.out.println(res);
    }

}
