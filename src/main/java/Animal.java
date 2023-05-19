
import java.util.Scanner;

public class Animal {
    public String Nome;
    public String Classe;
    public String Familia;
    public int Idade;
    public boolean Estado;
    public int Caloria;
    public int Forca;

    /*
    NASCER – método que pergunta os dados do animal:
    nome, classe e família, coloca-o em estado vivo,
    insere uma quantidade de calorias e força e
    insere 0 como estado do atributo idade....
    */
    public void nascer(String nome, String classe, String familia) {
        this.Nome = nome;
        this.Classe = classe;
        this.Familia = familia;
        this.Idade = 0;
        this.Estado = true;
        this.Caloria = 10;
        this.Forca = 10;
        
        System.out.println("O " + Nome + " nasceu");
    }

    /*
    MORRER – método que coloca o objeto em estado morto
    */
    public String morrer() {
        this.Estado = false;
        this.Forca = 0;
        return "Morto";
    }

    /*
    COMER – método que, caso o animal não esteja cheio 
    e/ou morto, insere determinada quantidade de calorias
    e retira uma quantidade de força por ter realizado 
    essa ação.
    */
    public void comer() {
        if ((Estado) & (Forca > 10)) {
            Caloria = Caloria + 20;
            Forca = Forca - 10;
        }
    }

    /*
    CORRER – método que retira determinada quantidade de
    calorias e uma quantidade de força por ter realizado 
    essa ação, caso o animal não esteja morto ou exausto.
    */
    public void correr() {
        if ((Estado) & (Forca >= 10) & Caloria > 10 ) {
            Caloria = Caloria - 10;
            Forca = Forca - 10;
        } else if (!(Estado)) {
            System.out.println("O animal está morto e não pode correr!");
            }else if (Caloria < 10){
                System.out.println("O animal está fraco! Faça-o comer!");
            }else {
                System.out.println("O animal está exausto! Faça-o dormir!");
            }
    }

    /*
    DORMIR – método que retira determinada quantidade de 
    calorias e insere uma quantidade de força, caso o 
    animal não esteja morto.
    */
    public void dormir() {
        if (Estado) {
            Caloria = Caloria - 5;
            Forca = Forca +20;
        }else {
            System.out.println("O animal está morto!");
        }
    }

    @Override
    public String toString() {
        String vivo;
        if (Estado) vivo = "vivo";
        else vivo = "morto";
        return "O animal: " + Nome +
                "da classe: " + Classe +
                " está " + vivo;
    }
    
    
    public static void main(String[] args) {
        String Nome, Classe, Familia;
        System.out.println("Qual o nome do animal?");
        Scanner scanner = new Scanner(System.in);
        Nome = scanner.next();
        System.out.println("Qual a classe do animal?");
        Classe = scanner.next();
        System.out.println("Qual a família do animal?");
        Familia = scanner.next();
        Animal animal1 = new Animal();
        animal1.nascer(Nome, Classe, Familia);
        animal1.toString();
    }
}
