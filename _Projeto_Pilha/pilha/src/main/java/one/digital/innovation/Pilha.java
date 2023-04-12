package one.digital.innovation;
public class Pilha {
    private No refNoEntradaPilha;
    //Construtor vazio
    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    //Método TOP
    public No top(){
        return refNoEntradaPilha;
    }
    //Método Push
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    //Método Pop
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }
    @Override
    public String toString() {
        String stringRetorno = "----------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "---------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado =" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                stringRetorno += "===============\n";
                break;

            }
        }
        return stringRetorno;
    }
}
