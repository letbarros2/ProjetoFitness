package visão;

public class Calculo {
    
    private int idade;
    private double peso, altura;
    private String sexo, nivelAtividade;

    public double getAltura() {
        return altura / 100;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNivelAtividade() {
        return nivelAtividade;
    }

    public void setNivelAtividade(String nivelAtividade) {
        this.nivelAtividade = nivelAtividade;
    }
    
    public double calcularGMB(){
    if ("Masculino".equals(getSexo())){
        
        if (getIdade() >= 1 && getIdade() <= 3){
            return (60.9 * getPeso()) - 54;
        }
        else if (getIdade() <= 10){
            return (22.7 * getPeso()) + 495;
        }
        else if (getIdade() <= 18){
            return (17.5 * getPeso()) + 651;
        }
        else if (getIdade() <= 30){
            return (15.3 * getPeso()) + 679;
        }
        else if (getIdade() <= 60){
           return (11.6 * getPeso()) + 879;

        }
         else if (getIdade() > 60){
            return (13.5 * getPeso()) + 487;
        }
    }
    
    else if ("Feminino".equals(getSexo())){
        if (getIdade() >= 1 && getIdade() <= 3){
            return (61.0 * getPeso()) - 51;
        }
        else if (getIdade() <= 10){
            return (22.5 * getPeso()) + 499;
        }
        else if (getIdade() <= 18){
            return (12.2 * getPeso()) + 746;
        }
        else if (getIdade() <= 30){
            return (14.7 * getPeso()) + 496;
        }
        else if (getIdade() <= 60){
           return (8.7 * getPeso()) + 829;

        }
         else if (getIdade() > 60){
            return (10.5 * getPeso()) + 596;
        }
    
    }
    
    return 0;
    
    }
 
    public double IMC(){
        return getPeso() / (getAltura() * getAltura());   
    }
    
    public double pesoIdeal(){
    
        return 22 * (getAltura() * getAltura());
    }
    
    public String tipoIMC(){
        if (IMC() < 17){
            return "MUITO ABAIXO DO PESO";

        }
        else if (IMC() >= 17 && IMC() <= 18.49){
            return "ABAIXO DO PESO";
            
        }
        else if (IMC() >= 18.50 && IMC() <= 24.99){
            return "NORMAL";
        }
        else if (IMC() >= 25 && IMC() < 29.99){
            return "ACIMA DO PESO";

        
        }
        else if (IMC() >= 30 && IMC() < 34.99){
            return "OBESIDADE I";
        }
        else if (IMC() >= 35 && IMC() < 39.99){
            return "OBESIDADE II";
        }
        else if(IMC() > 40){
            return "OBESIDADE III";
        }
        return "";

    }
    
    public double calcularGET(){
        double taxa = 1;
        double get;
        

        
        if ("Masculino".equals(getSexo())){
        if("Leve".equals(getNivelAtividade())){
            taxa = 1.55;
        }
        else if("Moderada".equals(getNivelAtividade())){
            taxa = 1.78;
        }
        else if("Itensa".equals(getNivelAtividade())){
            taxa = 2.10;
        }
        }
        
        else if ("Feminino".equals(getSexo())){
        if("Leve".equals(getNivelAtividade())){
            taxa = 1.56;
        }
        else if("Moderada".equals(getNivelAtividade())){
            taxa = 1.64;
        }
        else if("Itensa".equals(getNivelAtividade())){
            taxa = 1.82;
        }
        }
   
            
        get = calcularGMB() * taxa;
        
        if(getIdade() >= 13 && getIdade() <= 15){
            return get + ((get*13)/100);
        }
        else if(getIdade() >= 16 && getIdade() <= 19){
            return get + ((get*5)/100);
        }
        else if(getIdade() >= 40 && getIdade() <=  49){
            return get - ((get*5)/100);
        }
        else if(getIdade() >= 50 && getIdade() <= 59){
            return get - ((get*10)/100);
        }
        else if(getIdade() >= 60 && getIdade() <= 69){
           return get - ((get*20)/100);
        }
        else if (getIdade() > 70){
          return get - ((get*30)/100);
        }
        else{
            return get;
        }
        

    }
}
