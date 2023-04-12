package one.digital.innovation;

public class Fila<T> {
    private No<T> refNoEntradaFila;
    public Fila() {
        this.refNoEntradaFila = null;
    }
    //isEmpty
    public boolean isEmpty(){
        return this.refNoEntradaFila == null ? true : false;
    }
    //.enqueue
    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    //first
    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }
    //.dequeue
    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }
    //toString
    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while(true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] --->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += null;
                    break;
                }
            }
        }else{
            stringRetorno = null;
        }
        return stringRetorno;
    }
}
