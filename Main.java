import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    Scanner entrada = new Scanner(System.in);
    boolean continuar = true;
    ArrayList<Conta> contas = new ArrayList<Conta>();
    int n = 1;

    
    while(continuar)
    {
      System.out.println("\n1 - Criar Conta \n" +
                         "2 - Abrir Conta \n" +
                         "3 - Sacar       \n" +
                         "4 - Depositar   \n" +
                         "5 - Mensalidade \n" +
                         "6 - Fechar Conta \n"+
                         "7 - Informações  \n" +
                         "8 - Sair          \n"
                         );
     
     int escolha = Integer.parseInt(entrada.nextLine());


     
     float valor;
     int numero;
     
     switch(escolha)
     {
       case 1:
         
         System.out.println("\nDigite o seu nome:");
         String nome = entrada.nextLine();
         
         
         System.out.println("\nDigite 1 para conta corrente \n" +
                            "Digite 2 para conta poupança \n");
                            
        int tipoConta = Integer.parseInt(entrada.nextLine());
        String tipo = "";
        
        if (tipoConta == 1)
        {
          tipo = "cc";
        }
        
        else if(tipoConta == 2)
        {
          tipo = "cp";
        }
        
        else
        {
          System.out.println("\nOpção Invalida. Tente Novamente:");
        }
        
        
        
        Conta c1 = new Conta(nome, tipo, n);    
        contas.add(c1);
        n  = n + 1;
        break;
            
      case 2:
        
        System.out.println("\nDigite o número da sua conta:"); 
        numero = Integer.parseInt(entrada.nextLine()) - 1;
        contas.get(numero).abrir();
        break;

            
      case 3:
        
        System.out.println("\nDigite o número da sua conta:");    
        numero = Integer.parseInt(entrada.nextLine()) - 1;
        
        contas.get(numero).sacar();
        break;

            
      case 4:
        
        System.out.println("\nDigite o número da sua conta:");    
        numero = Integer.parseInt(entrada.nextLine()) - 1;   
        

        contas.get(numero).depositar();
        break;
        
         
      case 5:
        
        System.out.println("\nDigite o numero da sua conta:");
        numero = Integer.parseInt(entrada.nextLine()) - 1;
        contas.get(numero).mensalidade();
        break;

        
      case 6:
        
        System.out.println("\nDigite o numero da sua conta:");
        numero = Integer.parseInt(entrada.nextLine()) - 1;
        break;

        
      case 7:
        
        System.out.println("\nDigite o numero da sua conta:");
        numero = Integer.parseInt(entrada.nextLine()) - 1;
        contas.get(numero).informacoes();
        break;

       
      case 8:
        continuar = false;
        break;

        
      default:
        System.out.println("Opção Invalida:");
        
     }
     
     
     
      
    }
  }  
}
