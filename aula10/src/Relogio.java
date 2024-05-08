public class Relogio {
    public int hora;
    public int minuto;
    public int segundo;

    public Relogio(){

    }

    //1ª versão inserindo horas, minutos e segundos
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //2ª versão inserindo apenas horas e minutos
    public Relogio(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    //3ª versão inserindo apenas horas
    public Relogio(int hora){
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    //4ª versão não perimite criar, pois ja existe um construtor com dois parametros inteiros
    //public Relogio(int hora, int segundo){
        //this.hora = hora;
        //this.minuto = 0;
        //this.segundo = segundo;
    //}

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    
}
