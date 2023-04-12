package one.digital.innovation;

public class No {
    private int dado;
    private No refNo = null;
    //Construtores
    public No(){
    }
    public No(int dado) {
        this.dado = dado;
    }
    //Getters and Setters
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public No getRefNo() {
        return refNo;
    }
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }
    //toString
    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
