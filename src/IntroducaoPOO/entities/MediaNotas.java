package IntroducaoPOO.entities;

public class MediaNotas {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaMedia(){
        return this.nota1 + this.nota2 + this.nota3;
    }

    public double missing(){
        double notaFailed = 60 - notaMedia();
        return notaFailed;
    }

    public String passOrFailed(){
        if(notaMedia() >= 60){
            return "PASS";
        } else {
            return "FAILED\n" + "MISSING " + String.format("%.2f", missing()) + " POINTS";
        }
    }

    public String toString(){
        return "FINAL GRADE = " + String.format("%.2f", notaMedia()) + "\n" + passOrFailed();
    }
}
