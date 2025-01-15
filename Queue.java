public class Queue {
    
    static node top=null;

    public static void main(String[] args) {
        addQ(1, 2);
        addQ(3, 4);
        addQ(11, 22);
        addQ(30, 40);
        addQ(21, 77);
        addQ(5, 3);
        addQ(7, 8);

        print_Queue();
        System.out.println("-------------------------------");
        System.out.println("After removing");
        System.out.println("-------------------------------");
        removeQ();                   //will be removed 22,23
        print_Queue();
        System.out.println("-------------------------------");
        System.out.println("After removing");
        System.out.println("-------------------------------");
        removeQ();
        print_Queue();
        System.out.println("-------------------------------");
        System.out.println("After removing");
        System.out.println("-------------------------------");
        
        

    }

    static void addQ(int x, int y){ // a function to print a given linked list
        if(top==null){
            top = new node(x,y);    //object created for the node
        }else{
            node ptr;
            for(ptr=top;ptr.next!=null;ptr=ptr.next);
            ptr.next=new node(x,y);
        }
    }

    static void removeQ(){
        if(top==null){
            System.out.println("Queue is empty, nothing to remove");
            return;
        }

        node temp=top;
        top=top.next;
        temp.next=null;
    }

    static void print_Queue(){
        node tmp;
        for(tmp=top; tmp != null; tmp=tmp.next){
            System.out.println("node [x=" + tmp.x +", y=" + tmp.y +"]");

        }
    }
}

class node {
    int x;
    int y;
    node next;

    node(int x,int y){
        this.x=x;
        this.y=y;
        this.next=null;
    }
    public String toString(){
        return "node [x=" + x +", y=" + y +"]";
    }
    
}
