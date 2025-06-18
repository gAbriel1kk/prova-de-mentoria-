import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
    Scanner notas = new Scanner(System.in);
    
    System.out.println("Informe a primeira NotaA: ");
    double notaA = notas.nextDouble();
    
    System.out.println("Informe a segunda notaB");
    double notaB = notas.nextDouble();
        
    double mediaAprovacao = 7;
    
    double mediaNotas = (notaA+notaB)/2;
    
    if (mediaNotas >= mediaAprovacao){
        System.out.println("Sua nota foi: "+mediaNotas+" aprovado");
        
    }else{
        System.out.println("sua nota foi: "+mediaNotas+".reprovado");
    }
    }