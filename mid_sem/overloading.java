class A extends B {
    public static void main(String[] args) {
        A x = new A();
        x.Area(5);
        x.Area(6,5);
    }
}

class B {
    
    void Area(int size)
    {
        System.out.println("square");
    }
    
    void Area(int length,int wridth){
         System.out.println("reactangle");
    }
}
