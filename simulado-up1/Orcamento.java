public class Orcamento {

private int nrOrcamento;
private String date;
private String nomeContato;
private String telefoneContato;
private double valor;
private char situacao;

public Orcamento (int nrOrcamento, String date, String nomeContato, String telefoneContato) {
    this.situacao = '1';
    this.nrOrcamento = nrOrcamento;
    this.date = date;
    this.nomeContato = nomeContato;
    this.telefoneContato = telefoneContato;
}

public boolean registrarValor(double valor){

    if (situacao == '1'){
        this.valor = valor;
        situacao = '2';
        return true;
    } 
    return false;
}

public boolean definirExecucao(char decisao){
    
    if (situacao == '2'){
        if (decisao == 'A') {
            situacao = '3';
        } else if (decisao == 'R') {
            situacao = '4';
        }
        return true;
    }
    return false;
}

public char avancar(){
    if (situacao == '3'){
        situacao = '5';
        return situacao;
    } else if (situacao == '4'){
        situacao = '0';
        return situacao;
    } else if (situacao == '5'){
        situacao = '9';
        return situacao;
    } else{
    return 0;
    }
}

}

