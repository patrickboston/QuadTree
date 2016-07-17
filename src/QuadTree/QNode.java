package QuadTree;
import qtvisualizer.QuadTreeNode;

public class QNode implements QuadTreeNode {
    double value;
    QNode[] children;
    
    public QNode(double v){
        value = v;
        children = new QNode[4];
    }
    
    @Override
    public QNode[] getChildren(){
        return children;
    }
}
