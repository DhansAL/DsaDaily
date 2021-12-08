package linkedLists;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node =  new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size =+ 1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;

        }
        Node node =  new Node(val);
        tail.next = node;
        tail = node;
        size ++;

    }

    public void insert(int val , int index){
        if(index== 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index ; i++) {
             temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
        // INSERT USING RECURSION Q1 KUNAL LL DLL CLL QUES VIDEO
    // USED WHEN VAR SIZE, TAIL are NOT given
    public void insertRec(int val , int index){
        head = insertRec( val, index, head);
    }
    private Node insertRec(int val , int index, Node node){
        if(index == 0){
             Node temp = new Node(val,node);
             size++;
             return temp;
        }
        // if index or remaining indexes are not 0 rn
        node.next = insertRec(val, index-1,node.next );
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size -2); // 0 based indexing => siZe -1 = last elm -2 = secondlast
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    //delete random elem iin ll;
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size --;
        return val;
    }

    //question 1
    public void duplicates(){
        Node node = head;
        while(node.next != null  ){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
      }
      //ques 2 merge ll
    public static LL merge(LL first, LL second){
        Node f  = first.head;
        Node s = second.head;

        LL ans = new LL();
        while(f!= null && s!= null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s  = s.next;
            }
            //if one list ends first add rest elms in ans ll
            while(f!=null){
                ans.insertLast(f.value);
                f  = f.next;
            }
            while(s!=null){
                ans.insertLast(s.value);
                s  = s .next;
            }
        }
        return ans;
    }


    // getting the node index value
    public Node get (int index) {
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        return node;
    }


    public void display(){
        Node temp= head ;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class  Node {
        private int value;
        private Node next;

        //constructors
        public Node(int value){
            this.value = value;
        }
        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
