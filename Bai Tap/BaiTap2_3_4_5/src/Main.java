import gent.BinatyTree;

public class Main {
    public static void main(String[] args) {
        BinatyTree bt = new BinatyTree();
        bt.insert(21);
        bt.insert(32);
        bt.insert(12);
        bt.insert(10);
        bt.insert(3);
        //Duyet cay nhi phan postOrder
        bt.postOrder(bt.getRoot());
        bt.delete(12);
        bt.postOrder(bt.getRoot());
        bt.searchNode(bt.getRoot(),2);



    }
}