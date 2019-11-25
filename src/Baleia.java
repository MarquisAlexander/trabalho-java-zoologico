class Baleia extends Mamifero {
    public void mami3() {
      System.out.println("eu prefiro a água");  
    }
    public void mami4() {
        System.out.println("eu sou uma baleia");
    }
    
    //REALIZANDO A CHAMADA
    public static void main(String args[]) {
        Baleia objB = new Baleia();
        Cachorro objC = new Cachorro();
        objB.animal3();
        objB.mami1();
        objC.mami5();
        objB.mami3();
        objB.mami4();
    }
}