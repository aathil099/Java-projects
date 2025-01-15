public class stack {

    static stacknode top=null;

    public static void main(String[] args) {
        push(1,2);                     //
        push(3,4);
        push(5,6);
        push(7,8);
        push(45,46);
        System.out.println("-------------------------------");    
		System.out.println("before the first pop");
		System.out.println("-------------------------------");
		printStack();
		System.out.println("-------------------------------");
		System.out.println("after the first pop");
		System.out.println("-------------------------------");
		pop();                        //45,46 will be removed
		pop();                       //7,8 will be removed
		printStack();               //to print rest nodes 
    }

    static void push(int i, int j){
        stacknode tmp;
        if(top==null){
            top=new stacknode(i, j);
        }
        else {
            tmp = new stacknode(i, j);
            tmp.next = top;
            top = tmp;
        }
    }
    static void printStack(){
        stacknode tmp;
		for (tmp=top; tmp!=null; tmp=tmp.next) {
			System.out.println(tmp);
		}
    }
    static void pop(){
        stacknode tmp;
        tmp=top;
        top=top.next;
        System.out.println("----------<<REMOVED>>----------");     //to show what will be removed        
		System.out.println("node [x=" + tmp.x + ", y=" + tmp.y +"]");
		System.out.println("----------<<------->>----------");
    }
}

class stacknode {
    int x;
    int y;
    stacknode next;

    stacknode(int x, int y){
        this.x = x;
        this.y = y;
        this.next = null;
    }

    @Override
    public String toString() {
        return "node [x=" + x + ", y=" + y + "]";
    }
}
