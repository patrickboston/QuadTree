package QuadTree;
import qtvisualizer.QuadTreeViz;

public class Main {
   public static void main(String[] args){
       QuadTree qt = new QuadTree();
       
       //Test routine for adding up numbers from 1-100.
       for(int i=1; i<=100; i++){
           qt.insertAtRandomPosition(i);
       }
       double sum = qt.sum(qt.root);
       System.out.println("The sum of the elements in the array is: " + sum);
       
       //Visualization
       QuadTreeViz viz = new QuadTreeViz(qt.root);
   } 
}
