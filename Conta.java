import java.util.Scanner;

class Conta {
  
  Scanner entrada = new Scanner(System.in);
  
  String dono;
  String tipo;
  int numConta;
  boolean aberta;
  float saldo;
  
  // Metodo contrutor
  public Conta(String nome,String tipo,int numero)
  {
      this.dono = nome;
      this.tipo = tipo;
      this.numConta = numero;
      this.aberta = false;
      
      // Definindo saldo inicial  
      if (tipo == "cc"){
        this.saldo = 50;
      }else{
        this.saldo = 150;
      }
  }
   
  // Informaçoes
  
  public void informacoes(){
    System.out.printf("\n\nSeu nome é: %s \n ", this.dono );
    System.out.printf("    O tipo da sua conta é: %s \n ", this.tipo );
    System.out.printf("    O numero da sua conta é: %d \n ", this.numConta );
    System.out.printf("    Sua Conta está aberta?: %b \n ", this.aberta );
    System.out.printf("    Seu saldo é: %.2f \n\n\n\n\n\n\n\n ", this.saldo );
  }
  
  
  
  // abrir Conta 
  public void abrir()
  {
    this.aberta = true;
  }
  
  // sacar  
  public void sacar(){
    if (this.aberta){
      
      System.out.println("Digite o valor que você deseja Sacar:");
      float valor = Float.parseFloat(entrada.nextLine());

      if (this.saldo > 0 && this.saldo >= valor){  
        this.saldo = this.saldo - valor;
     }else{
       System.out.println("Você não tem dinheiro");
     }     
        
   }else{
    System.out.println("Sua conta está fechada");
   }
  }
  
  public void fecharConta()
  {
    if(!this.aberta)
    {
      if(this.saldo > 0)
      {
        System.out.println("Saque o dinheiro da sua conta antes de fechar:" + this.saldo);
      } else if(this.saldo == 0){
        this.aberta = false;  
      }else{
        System.out.println("Você está devendo ao banco, deposite:" + this.saldo);
      }
    }
    
  }
  
  //depositar
  public void depositar(){
    if (this.aberta){
      
      System.out.println("Digite o valor que você deseja Depositar:");
      float valor = Float.parseFloat(entrada.nextLine());
      
      this.saldo = this.saldo + valor;
   }else{
      System.out.println("Sua conta está fechada:");
    }
  }  
  
  public void  mensalidade(){
    this.saldo -= 20;
  }
      
  public void setDono(String nome){
    this.dono = nome;
  }
    
  public void setTipo(String t){
    this.tipo = tipo;
  }  
  
  public void setSaldo(float valor){
    this.saldo = valor;
  }

  public void setNumConta(int valor){
    this.numConta = valor;
  }
    
  public String getDono(){
    return this.dono;
  }
  
  public String getTipo(){
    return this.tipo;
  }
    
  public float getSaldo(){
    return this.saldo;
  }
  
  public int getNumConta(){
    return this.numConta;
  }
  
}
