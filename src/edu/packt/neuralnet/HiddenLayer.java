package edu.packt.neuralnet;

import edu.packt.neuralnet.math.IActivationFunction;


public class HiddenLayer extends NeuralLayer {
    

    public HiddenLayer(int numberofneurons,IActivationFunction iaf,
            int numberofinputs){
        super(numberofneurons,iaf);
        numberOfInputs=numberofinputs;
        init();
    }
    
    /**
     * setPreviousLayer
     * This method links this layer to a previous layer in the Neural Network
     * 
     * @param previous Previous Neural Layer
     * @see HiddenLayer
     */
    @Override
    public void setPreviousLayer(NeuralLayer previous){
        this.previousLayer=previous;
        if(previous.nextLayer!=this)
            previous.setNextLayer(this);
    }
    
    /**
     * setNextLayer
     * This method links this layer to a next layer in the Neural Network
     * 
     * @param next Next Neural Layer
     * @see HiddenLayer
     */
    @Override
    public void setNextLayer(NeuralLayer next){
        nextLayer=next;
        if(next.previousLayer!=this)
            next.setPreviousLayer(this);
    }
    
}
