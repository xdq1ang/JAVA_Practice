package src.P9.interface_;

public class Interface05 {
    public static void main(String[] args) {

    }
}

interface ID{//public default
    int n=200;//public static final
    void hi();//public
}

class Hi implements ID{
    @Override
    public void hi() {
        System.out.println("hi");
    }
}