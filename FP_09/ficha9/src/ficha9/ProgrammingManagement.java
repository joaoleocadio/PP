package ficha9;

public class ProgrammingManagement {
    private final int MAXPESSOAS = 20;
    
    private Pessoa[] lista = new Pessoa[MAXPESSOAS];
    private int count = 0;
    
    
    public void addPessoa(Pessoa pessoa){
        if (count < MAXPESSOAS){
            lista[count] = pessoa;
            count+=1;
        } else {
            System.out.println("Maxímo de pessoas!");
        }
    }
    
    public Pessoa removerPessoa(int pos){
        if(pos < lista.length && pos != -1){
            if (lista[pos] == null) {
                System.out.println("Essa pessoa não existe!");
                return null;
            } else {
                Object delete = lista[pos];
                lista[pos] = null;
                for (int i = pos; i < (count - 1); i++){
                    lista[i] = lista[i + 1]; 
                }
                count -= 1;
                lista[count] = null;
                return (Pessoa) delete;
            }
        } else {
            System.out.println("Posição inexistente!");
            return null;        
        }
    }
    
    
    public String imprimirAdministrative() {
        String resp = "";
        for (int i = 0; i < this.count; i++) {
            if (this.lista[i] instanceof Administrativo) {
                Administrativo administrativo = (Administrativo) this.lista[i];
                resp += administrativo.printAdministrative();
            }
        }
        return resp;
    }
    
    public String imprimirJavaProgrammer() {
        String resp = "";
        for (int i = 0; i < this.count; i++) {
            if (this.lista[i] instanceof Programador_Java) {
                Programador_Java javaProgrammer = (Programador_Java) this.lista[i];
                resp += javaProgrammer.printJavaProgrammer();
            }
        }
        return resp;
    }
    
    public String imprimirProjectManager() {
        String resp = "";
        for (int i = 0; i < this.count; i++) {
            if (this.lista[i] instanceof Gestor_projeto) {
                Gestor_projeto projectManager = (Gestor_projeto) this.lista[i];
                resp += projectManager.printProjectManager();
            }
        }
        return resp;
    }
    
     public String imprimir() {
        String resp = "";
        for (int i = 0; i < this.count; i++) {
            if (this.lista[i] instanceof Administrativo) {
                Administrativo administrativo = (Administrativo) this.lista[i];
                resp += administrativo.printAdministrative(); // imprime administrativos
            } else if (this.lista[i] instanceof Programador_Java) {
                Programador_Java javaProgrammer = (Programador_Java) this.lista[i];
                resp += javaProgrammer.printJavaProgrammer(); // imprime java programmers
            } else if (this.lista[i] instanceof Gestor_projeto) {
                Gestor_projeto projectManager = (Gestor_projeto) this.lista[i];
                resp += projectManager.printProjectManager(); // imprime project managers
            } else {
                resp += this.lista[i].toString(); // imprime default (person normal)
            }
            resp += "\n";
        }
        return resp;
    }
    
    public String toString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += "Pessoa " + (i + 1) + " : " + "\n" + lista[i].toString() + "\n";
        }
        return text;
    }
    
    
}
