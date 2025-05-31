package LLD;


class bird {
    public void fly(){
        System.out.println("Fly in Sky");
    }
}

class Eagle extends bird {
    @Override
    public void fly(){
        System.out.println("Fly in Sky");
    }
}
class Penguin extends bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
public class IncorrectLSPBird {

    public static void main(String[] args){
        Penguin penguin = new Penguin();
        Eagle eagle = new Eagle();

        penguin.fly();
        eagle.fly();
    }
}
