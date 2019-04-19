package in.pabreja.exercise.industrybuying.searchliteral.nlp;

import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import in.pabreja.exercise.industrybuying.searchliteral.stereotype.IndustryBuyingFactory;
import org.springframework.beans.factory.annotation.Autowired;

@IndustryBuyingFactory
public class NLPProcessorCreator {

    @Autowired
    private CubeProcessor cubeProcessor;
    @Autowired
    private IndustryBuyingProcessor industryBuyingProcessor;
    @Autowired
    private IbmProcessor ibmProcessor;
    @Autowired
    private GoogleProcessor googleProcessor;


    public NLPProcessor getProcessor(){

                industryBuyingProcessor.setNext(cubeProcessor);
                cubeProcessor.setNext(googleProcessor);
                googleProcessor.setNext(ibmProcessor);
        return industryBuyingProcessor; // after wiring all the processor
    }
}
