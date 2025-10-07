class Demo{
    public static void main(String[] args) {
        Queue myQ = new Queue();
        
        myQ.enqueue(5);
        myQ.enqueue(6);
        myQ.enqueue(7);
        myQ.enqueue(8);
        myQ.enqueue(9);
        myQ.enqueue(10);

        multiply(myQ);
        System.out.println(myQ.dequeue());
    }

    static void multiply(Queue myQ){
        for(int i= 0; i < myQ.size();i++){
            int val = (int) myQ.dequeue() * 3;
            myQ.enqueue(val);
        }
    }
}