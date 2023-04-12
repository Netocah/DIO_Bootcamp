package one.digitalinnovation;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);//Este novo nó será usado no final
        if(this.isEmpty()){//Checando se a lista está vazia para adicionar
            referenciaEntrada = novoNo;//o respectivo nó do método
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;//Este nó recebe a referencia de
        for(int i = 0; i < this.size()-1; i++){//entrada e vai percorrendo toda a
            noAuxiliar = noAuxiliar.getProximoNo();//lista para no final adicionar o
        }                                       //novo nó no final da lista
        noAuxiliar.setProximoNo(novoNo);//novoNo adicionado ao final da lista
    }
    public T get(int index){
        return getNo(index).getConteudo();//usando getter para achar o nó do índice específico deste método personalizado
    }
    private No<T> getNo(int index){
        validaIndice(index);
        if(index < this.size()) {
            No<T> noAuxiliar = referenciaEntrada;
            No<T> noRetorno = null;
            for (int i = 0; i <= index; i++) {//varrendo a lista até o index passado por parâmetro
                noRetorno = noAuxiliar;//utilizando um nó de retorno e um auxiliar
                noAuxiliar = noAuxiliar.getProximoNo();//o auxiliar vai servir para pular de um indice a outro dentro da lista
            }
            return noRetorno;//neste ponto o noRetorno corresponde ao nó no índice passado pelo método, enquanto o noAuxiliar está no próximo da lista
        }
        return null;//neste ponto o NoAuxiliar é deletado pela JVM
    }
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index ==0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior= getNo(index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }
    public void validaIndice(int index){
        if(index >= size()){//testa se o valor passado pelo método é um index inválido
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice "+index+" desta lista. Esta lista só vai até o índice "+ultimoIndice+".");
        }//caso o teste valide que o index é maior ou igual o tamanho da lista, o programa dispara uma exceção informando que a lista só vai até certo indice
    }
    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno+="No{conteudo="+noAuxiliar.getConteudo()+"}-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno+="null";
        return strRetorno;
    }
}
