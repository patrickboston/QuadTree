package QuadTree;
import java.util.Random;

public class QuadTree {

    QNode root;

    public void insertAtRandomPosition(double value) {
        QNode n = new QNode(value);
        Random rand = new Random();
        
        if (root == null) {
            root = n;
        } else {
            QNode current = root;
            boolean nodeInserted = false;

            while (!nodeInserted) {
                int index = rand.nextInt(4);
                if (current.children[index] == null) {
                    current.children[index] = n;
                    nodeInserted = true;
                } else {
                    current = current.children[index];
                }
            }
        }
    }
    
    public double sum(QNode startNode) {
        if (startNode == null) {
            return 0;
        } else {
            double sum = startNode.value;
            //Sums up the values of the starting node as well as its children.
            for (int i = 0; i <= 3; i++) {
                double childrenSum = sum(startNode.children[i]);
                sum += childrenSum;
            }
            return sum;
        }
    }
}
