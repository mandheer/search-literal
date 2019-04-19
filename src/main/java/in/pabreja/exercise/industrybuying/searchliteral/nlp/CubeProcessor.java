package in.pabreja.exercise.industrybuying.searchliteral.nlp;

import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import in.pabreja.exercise.industrybuying.searchliteral.model.NLPEngineType;
import in.pabreja.exercise.industrybuying.searchliteral.stereotype.IndustryBuyingComponent;
import in.pabreja.exercise.industrybuying.searchliteral.stereotype.IndustryBuyingService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@IndustryBuyingComponent
public class CubeProcessor implements NLPProcessor {

    private NLPProcessor nextToProcess;

    @Override
    public void setNext(NLPProcessor nextToProcess) {
        this.nextToProcess = nextToProcess;
    }

    @Override
    public Map<NLPEngineType, Map<String, Double>> process(List<IbMessageData> data) {
        Map<NLPEngineType, Map<String, Double>> ret = new HashMap<>();
        Map<String, Double> retMapData = new HashMap<>();


        int spamCount = 0;
        int notSpamCount = 0;
        int nullCount = 0;

        for(IbMessageData m : data){
            if("spam".equalsIgnoreCase(m.getCubeTruthVal())) spamCount++;
            else if("not-spam".equalsIgnoreCase(m.getCubeTruthVal())) notSpamCount++;
            else nullCount++;
        }

        retMapData.put("spam", Double.valueOf(spamCount));
        retMapData.put("not-spam", Double.valueOf(notSpamCount));
        retMapData.put("unknown", Double.valueOf(nullCount));

        ret.put(getName(),retMapData);

        if(nextToProcess != null) {
            Map<NLPEngineType, Map<String, Double>> processed = nextToProcess.process(data);
            ret.put(nextToProcess.getName(),processed.get(nextToProcess.getName()));
        }
        return ret;
    }

    @Override
    public NLPEngineType getName() {
        return NLPEngineType.CUBE;
    }
}
