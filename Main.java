public class Main {
    private static double xcur;
    private static int xSquaredCoeff1=1;
    private static int xCoeff1=0;
    private static int constant1=-5;
    private static double xVal1=5;
    private static double xGuess=2;

  public static double funcEval(int xSquaredCoeff,int xCoeff,int constant,double Xval){
    return xSquaredCoeff * Math.pow(Xval,2) + (double)(xCoeff*Xval)+ constant;
  }
  public static double derEval(int xSquaredCoeff,int xCoeff,int constant,double Xval){
    return (double)(2*xSquaredCoeff*Xval) + (double)(xCoeff);
  }
 public static double Newton(double x0,int cnt,int count,double fx,double fpx){
  if(cnt==count){
    return xcur;   
  }
  else{
    xcur = x0-fx/fpx;
  return Newton(xcur,cnt+1,count,funcEval(xSquaredCoeff1,xCoeff1,constant1,xcur),derEval(xSquaredCoeff1,xCoeff1,constant1,xcur));
}
 
  }
    public static void main(String[] args) {
    
  int num=20;
  double funcVal=funcEval(xSquaredCoeff1,xCoeff1,constant1,xVal1);
  double derVal=derEval(xSquaredCoeff1,xCoeff1,constant1,xVal1);
  System.out.println("the value of f(x) at x=5 is "+funcVal);
  System.out.println("the value of f'(x) at x=5 is "+derVal);
  System.out.println("the estimated zero of f(x) is "+ Newton(xGuess,1,num,funcEval(xSquaredCoeff1,xCoeff1,constant1,xGuess),derEval(xSquaredCoeff1,xCoeff1,constant1,xGuess))+" by Newton's Method");  
  
    }
}