class myQueue {

    int[] arr;
    int f;
    int r;
    int size;
    int n;
    public myQueue(int n) {
        this.n=n;
        arr=new int[n];
        f=0;
        r=0;
        size=0;
    }

    public boolean isEmpty() {
        return(size==0);
       
    }

    public boolean isFull() {
        return(size==n);
    }

    public void enqueue(int x) {
        if(size==n){
            // System.out.print("Queue is full");
            return;
        }
        arr[r++]=x;
        if(r==n) r=0;
        size++;
    }

    public int dequeue() {
        if(size==0){
            // System.out.print("Queue is empty");
            return -1;
        }
        int frontval=arr[f];
        f++;
        if(f==n) f=0;
        size--;
        return frontval;
    }

    public int getFront() {
        if(size==0){
            // System.out.print("Queue is empty");
            return -1;
        }
        return arr[f];
    }

    public int getRear() {
        if(size==0){
            // System.out.print("Queue is empty");
            return -1;
        }
        if(r==0){
            return arr[n-1];
        }
        return arr[r-1];
    }
}
