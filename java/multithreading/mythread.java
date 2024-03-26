// Using thread class
class mythread extends Thread{
    public void run(){
        System.out.println("Thread is created!");
    }

    public static void main(String[] args) {
        mythread t= new mythread();
        t.start();
    }
}



