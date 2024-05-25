import java.util.*;

interface mother{
    abstract void display();
}

interface uncle{
    abstract void display();
}
class son implements mother, uncle{
    public void display(){
        System.out.println("Son's Asset");
    }
}

