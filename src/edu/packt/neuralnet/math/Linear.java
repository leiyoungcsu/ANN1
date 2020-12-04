package edu.packt.neuralnet.math;


public class Linear implements IActivationFunction {
    
    /**
     * Coefficient that multiplies x
     */
    private double a=1.0;
    
    /** 
     * Linear dummy constructor
     */
    public Linear(){
        
    }
    
    /**
     * Linear constructor
     * @param value coefficient of the Linear function
     */
    public Linear(double value){
        this.setA(value);
    }
    
    /** 
     * setA
     * Sets a new coefficient for the Linear function
     * @param value new coefficient for the linear function
     */
    public void setA(double value){
        this.a=value;
    }
    
    /**
     * calc
     * Performs the calculation of this function
     * @param x
     * @return Returns the result of this function
     */
    @Override
    public double calc(double x){
        return a*x;
    }
    
    @Override 
    public double derivative(double x){
        return a;
    }
    
}
