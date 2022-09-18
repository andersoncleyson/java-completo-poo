package arraysListas.entities;

public class Quartos {
    private String name;
    private String email;
    private int numeroQuarto;

    public Quartos(String name, String email, int numeroQuarto){
        this.name = name;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setNumeroQuarto(int numeroQuarto){
        this.numeroQuarto = numeroQuarto;
    }

    public int getNumeroQuarto(){
        return numeroQuarto;
    }

    public String toString(){
        return this.numeroQuarto + ": " + this.name + ", " + this.email;
    }
}
