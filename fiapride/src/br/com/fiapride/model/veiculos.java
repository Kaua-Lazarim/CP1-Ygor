package br.com.fiapride.model;

public class veiculos {
    
	//mudei o gas para double pois int ele teria menos controle dos gastos, alem de que p metodo tava add em double
    private String individuo;
    private String placa;
    private double gas; 

   
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGas() {
        return gas;
    }

    
    //add apenas se o valor for superior a 0
    public void adicionar(double v) {
        if (v > 0) {
            this.gas += v;
        }
    }
    
    
    // Só permite gastar se tiver o suficiente, se n tiver n vai gastar e vai aparecer o sysout
    public void gasta(double v) {
        if (this.gas >= v) {
            this.gas -= v;
        } else {
            System.out.println("Combustível insuficiente!");
        }
    }
}