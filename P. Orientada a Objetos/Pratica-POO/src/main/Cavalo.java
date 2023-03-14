package main;
public class Cavalo {

    String nome;
    String cor;
    String raca;
    int peso;

    Cavalo(){}

    Cavalo(String nome, String cor, String raca, int peso){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }

    public int getPeso() {
        return peso;
    }

    public String custoRacaoCavalo(Double precoDoKg, String periodo){

        // Proporção de alimento são 200 gramas de ração para 100Kg de peso
        Double pesoConvertido = (double) peso;
        Double ProporcaoDePeso = pesoConvertido / 100;
        Double custoRacao = ((ProporcaoDePeso * 650) / 1000) * precoDoKg;
        Double custoRacaoDia = custoRacao, custoRacaoSemana = custoRacao * 7, custoRacaoMes = custoRacao * 30, custoRacaoAno = custoRacao * 365;
        if(periodo == "dia"){
            String custoRacaoDiaStr = "Para 200gramas em 100Kg de peso a cada dia, custo de ração por dia: R$"+String.format("%.2f",custoRacaoDia).toString();
            return custoRacaoDiaStr;
        } else if(periodo == "semana"){
            String custoRacaoSemanaStr = "Para 200gramas em 100Kg de peso a cada dia, custo de ração por semana: R$"+String.format("%.2f",custoRacaoSemana).toString();
            return custoRacaoSemanaStr;
        } else if(periodo == "mes"){
            String custoRacaoMesStr = "Para 200gramas em 100Kg de peso a cada dia, custo de ração por mês: R$"+String.format("%.2f",custoRacaoMes).toString();
            return custoRacaoMesStr;
        } else if(periodo == "ano"){
            String custoRacaoAnoStr = "Para 200gramas em 100Kg de peso a cada dia, custo de ração por ano: R$"+String.format("%.2f",custoRacaoAno).toString();
            return custoRacaoAnoStr;
        } else{
            String erro = "O periodo deve constar como um dos itens: dia, semana, mes ou ano.";
            return erro;
        }
        
    }
}
