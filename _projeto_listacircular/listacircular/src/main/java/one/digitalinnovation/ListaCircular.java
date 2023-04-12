package one.digitalinnovation;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior do que o tamanho da lista.");
        No<T> noAuxiliar = cauda;
        if(index == 0){//removendo o nó[0](Cauda)
            this.cauda = this.cauda.getNoProximo();//fazendo a cauda receber a referência do próximo nó
            this.cabeca.setNoProximo(this.cauda);//fazendo a referencia do próximo nó da cabeça apontar para a nova cauda(o próximo nó)
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());//setando a referencia de proximo nó do nó zero direto para o nó 2
        }else{
            for(int i = 0; i < index-1; i++){//essa condição faz com que possamos usar o nó anterior ao nó indicado pelo índice para usálo como deletador
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());//usando o nó deletador setamos a referencia de próximo nó para o nó segiunte ao nó indicado pelo índice, assim o nó será deletado pela JVM
        }
        this.tamanhoLista--;
    }
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);//declarando novo nó
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;//novo nó adicionado como cabeça
            this.cauda = this.cabeca;//referenciando a cauda à cabeça porque só temos um nó na lista
            this.cabeca.setNoProximo(cauda);//setando referencia de proximo nó da cabeça para a cauda
        }else{//se a lista não estiver vazia
            novoNo.setNoProximo(this.cauda);//setando a referencia de próximo nó do novo nó para o nó que é a cauda até então(e deixará de ser a cauda)
            this.cabeca.setNoProximo(novoNo);//setando referencia de proximo no da cabeça para o novo nó
            this.cauda = novoNo;//referenciando a cauda da lista como sendo o novo nó
        }
        this.tamanhoLista++;
    }
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        if(index == 0){
            return this.cauda;
        }else{
            No<T> noAuxiliar = this.cauda;
            for(int i = 0; (i < index) && (noAuxiliar != null);i++ ){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            return noAuxiliar;
        }
    }
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false ;
    }
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo="+noAuxiliar.getConteudo()+"}]-->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao início)": "[]";
        return strRetorno;
    }
}
