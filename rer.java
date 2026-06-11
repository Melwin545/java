class Main{
    static int[] queue={10,20,30};
    static int front =0;
    static int rear = 2;
    
    static void dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed " +queue[front ]);
        front++;//after front removed move to next Element
    }
    public static void main(String args[]){
        dequeue();
        
        for(int i =front;i<=rear;i++){
            System.out.println(queue[i] +"");
        }
    }
}