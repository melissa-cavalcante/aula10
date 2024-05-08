public class App {
    public static void main(String[] args) throws Exception{
    Relogio r1 = new Relogio();
    r1.setHora(11);
    r1.setMinuto(15);
    r1.setSegundo(30);

    System.out.println(r1.getHora()+":"+r1.getMinuto()+":"+r1.getSegundo());

    Relogio r2 = new Relogio(11);
    System.out.println(r2.getHora()+":"+r2.getMinuto()+":"+r2.getSegundo());

    Relogio r3 = new Relogio(11, 22);
    System.out.println(r3.getHora()+":"+r3.getMinuto()+":"+r3.getSegundo());

    Relogio r4 = new Relogio(11, 22, 30);
    System.out.println(r4.getHora()+":"+r4.getMinuto()+":"+r4.getSegundo());

    Relogio r5 = new Relogio();
    System.out.println(r5.getHora()+":"+r5.getMinuto()+":"+r5.getSegundo());
    }
}

