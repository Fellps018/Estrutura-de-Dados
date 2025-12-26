
   public class ListaLigada{
    private No primeiro;
    private No ultimo;
    private String nomedaLista;
    
    public ListaLigada(String nome) {
        nomedaLista = nome;
       
    }

    public void InserenaFrente(String item) {
        if(Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            primeiro = new No(item, primeiro);
        }
    }
    
    public void InserenoFundo(String item) {
        if(Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            ultimo.setProx(new No(item));
            ultimo = ultimo.getProx();
        }
        
    }
    
    public String RemovedaFrente() {
        if(Vazia()) {
            return null;
        }
        String item = primeiro.getDado();
        
        if(primeiro == ultimo) {
            primeiro = ultimo = null;   
        } else {
            primeiro = primeiro.getProx();
        }
        return item;
    }
    
    public String RemoveDoFundo() {
        if (Vazia()) {
            return null;
        }
        String item = ultimo.getDado();
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            No atual = primeiro;
            while(atual.getProx() != ultimo) {
                atual = atual.getProx();
            }
            ultimo = atual;
            atual.setProx(null);
        }
        return item;
    }
    
    public boolean Vazia() {
        return primeiro == null;
    }
    
    public void EscreveLista() {
       String temp = "";
         if (Vazia()) {
             temp += "A lista: " + nomedaLista + " esta vazia.";
             System.out.print(temp);
             
         }
         No atual = primeiro;
         while (atual != null) {
             temp = atual.getDado();
             atual = atual.getProx();
             
              System.out.print(temp + " ");
             
         }
        
}
    
    public static void main(String[] args) {
        ListaLigada l1 = new ListaLigada("Test cach");
        
        System.out.println("=== TESTE DA LISTA ===");
       l1.InserenaFrente("E \n");
l1.InserenaFrente("D");
  l1.InserenaFrente("C");
    l1.InserenaFrente("B");
      l1.InserenaFrente("A");
    l1.EscreveLista();
        
    }
}

