package one.digitelinnovation;

public class Main {
    public static void main(String[] args){
        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();
        System.out.println("Esta é a lista de desejos do casal Vasconcelos Lima:");
        minhaListaEncadeada.add("Automóvel novo/seminovo");
        minhaListaEncadeada.add("Duas CNHs categoria B");
        minhaListaEncadeada.add("Trabalhar home office");
        minhaListaEncadeada.add("Juntar um dinheirinho");
        minhaListaEncadeada.add("Viajar pra um lugar frio com dinheiro pra gastar");
        minhaListaEncadeada.add("Voltar à academia");
        minhaListaEncadeada.add("Emagrecer");
        System.out.println(minhaListaEncadeada);
        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3, "");
        System.out.println(minhaListaEncadeada);
    }
}
