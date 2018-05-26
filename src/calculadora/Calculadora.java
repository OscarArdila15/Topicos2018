package calculadora;

/**
 *
    * @author Oscar Ardila
 */
public class Calculadora {
    private int ans=0;
    
    public Calculadora(){
        ans=0;
    }
    
    
    public  int suma(int a, int b){
        ans=a + b;
        return ans;
    }
    public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public int div(int a, int b){
        if (b==0){
            throw new ArithmeticException("no se puede dividir por cero");
        }
        ans=a/b;
        return ans;
    }
    
    public int add(int v){
        ans=ans+v;
        return ans;
    }
    
    public int sub(int v){
        ans=ans-v;
        return ans;
    }
    
    public int ans(){
        return ans;
    }
    
    public void clear(){
        ans=0;
    }
    
    public void optima() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            
        }
    }
}