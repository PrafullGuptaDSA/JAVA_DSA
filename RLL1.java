import javafx.scene.Node;

class RLL1{
    Node head;
    private int size;
    RLL1(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add first, last

// add first
    public void addFirst(String data){
        Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }


        // add last
        public void addLast(String data) {
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }

            Node currNode=head;
            while(currNode.next != null){
                currNode=currNode.next;
            }
            currNode.next=newNode;            
        }
        //print
        public void printList() 
        {
              if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node currNode=head;
            while(currNode !=null){
                System.out.print(currNode.data +" -> ");
                currNode=currNode.next;
            }
            System.out.println("Null");          
        

            
        }

        //delete first
        public void deleteFirst(){
            if(head==null){

                System.out.println("list is empty");
                return;
            }
            size--;
            head=head.next;
        }
        // delete last
        public void deleteLast(){
            
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node seconLast=head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                seconLast=seconLast.next;
            }
            seconLast.next=null;
        }
        public int getSize(){
            return size;
        }
        public void reverseIterate(){
            if(head==null || head.next==null){
                return;
            }
            Node prevNode=head;
            Node currNode=head.next;
            while(currNode!=null){
                Node nextNode=currNode.next;
                currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
            }
            head.next=null;
            head=prevNode;

        }
        //easy 
        public Node reverseRecurrsive(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node newHead=reverseRecurrsive(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
        }
 

    public static void main(String[] args) {
        RLL1 list=new RLL1();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("4");
        list.addFirst("5");
        list.printList();
        list.head=list.reverseRecurrsive(list.head);
        list.printList();
        System.out.println(list);
    }
}