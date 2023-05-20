
public class Ave extends Animal {
    private String cor_pena;
    private Boolean voa;

    public Ave(String NA,String CA,String FA,String CP,Boolean V) {
        super(NA, CA, FA);
        this.cor_pena = CP;
	this.voa = V;
    }

    public void setCor_pena(String cor_pena) {
        this.cor_pena = cor_pena;
    }

    public void setVoa(Boolean voa) {
        this.voa = voa;
    }

    public String getCor_pena() {
        return cor_pena;
    }

    public Boolean getVoa() {
        return voa;
    }
    
    public void voar (float mts){
        if ((super.Estado) & (voa) & (Forca >= 3) & (Caloria > mts*0.5)){
           Caloria = Caloria - mts*0.5;
	   Forca = Forca - 3;
        }else if (super.Estado){
            System.out.println("A ave está morta e não pode voar!");
        }else if (voa == false){
            System.out.println("A ave não voa!");
        }else {
            System.out.println("A ave está exausta! Faça-a dormir um pouco!");
        }
    }
    
    @Override
    public void mostra_dados(){
        String vivo;
        if (Estado) vivo = "vivo";
        else vivo = "morto";
        System.out.println("A ave: " + Nome +
                " da classe: " + Classe +
                " está " + vivo);
    }
}
