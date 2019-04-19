package in.pabreja.exercise.industrybuying.searchliteral.nlp;

import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import in.pabreja.exercise.industrybuying.searchliteral.model.NLPEngineType;

import java.util.List;
import java.util.Map;

public interface NLPProcessor {

    void setNext(NLPProcessor nextToProcess);
    Map<NLPEngineType, Map<String,Double>> process(List<IbMessageData> data);
    NLPEngineType getName();
}
