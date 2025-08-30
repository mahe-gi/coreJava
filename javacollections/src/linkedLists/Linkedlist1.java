package linkedLists;


class Node1{
    String data;
    Node1 next;
    public  Node1(String  data) {
        this.data = data;
    }
}


class  ChainedList{
    public  int size;
    public Node1 head;
    public  ChainedList(){
        size =0;x
    }
        public  void addFirst(String data)
    {
        if(size == 0){
            head =new Node1(data);
        }


    }


}



public class Linkedlist1 {
    public static void main(String[] args) {
        ChainedList lists = new ChainedList();
        lists.addFirst("hello");
    }


}
