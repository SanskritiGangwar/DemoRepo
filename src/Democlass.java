public class Democlass {

    public static void main(String[] args){

        Counter c1 = new Counter();
        c1.increasecounter();

        Counter c2 = new Counter();
        c2.increasecounter();
    }
}

class Counter{
    static int c=0;
    public void increasecounter(){
        c++;
        System.out.println(c);
    }
}