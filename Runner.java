public class Runner {
    public static void main(String[] args) {
        // Queue myQ = new Queue();
        // Queue anotherQ = new Queue();

        // myQ.enqueue(5);
        // myQ.enqueue(6);
        // myQ.enqueue(7);
        // // System.out.println(myQ.dequeue());
        // // System.out.println(myQ.dequeue());

        // printQueue(myQ);
      
        
    }

    

    public static void printQueue(Queue Q){  
        //Check if the queue is empty
        if(Q.isEmpty()){
          System.out.println("Error: Trying to print an empty queue");
        }
        else{
           for(int i = 0; i < Q.size();i++){
           Object temp = Q.dequeue();
             System.out.print(temp + " ");  	 
           Q.enqueue(temp);
           }
        }
          System.out.println("");
    }  

    public static boolean inQueue(int n,Queue Q){
        if(Q.isEmpty()){
            System.out.println("Error: The queue is empty");
            return false;
          }
          else{
            for(int i = 0; i < Q.size();i++){
                Object temp = Q.dequeue();
                if((int)temp == n) return true;
                Q.enqueue(temp);
            }
          }
        return false;
    }
}
