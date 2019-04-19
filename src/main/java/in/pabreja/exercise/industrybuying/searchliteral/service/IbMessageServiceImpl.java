package in.pabreja.exercise.industrybuying.searchliteral.service;

import in.pabreja.exercise.industrybuying.searchliteral.jpa.QueryManager;
import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import in.pabreja.exercise.industrybuying.searchliteral.model.NLPEngineType;
import in.pabreja.exercise.industrybuying.searchliteral.model.ResponseWrapper;
import in.pabreja.exercise.industrybuying.searchliteral.nlp.NLPProcessor;
import in.pabreja.exercise.industrybuying.searchliteral.nlp.NLPProcessorCreator;
import in.pabreja.exercise.industrybuying.searchliteral.repository.IbMessageRepository;
import in.pabreja.exercise.industrybuying.searchliteral.stereotype.IndustryBuyingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@IndustryBuyingService
public class IbMessageServiceImpl implements IbMessageService {

    @Autowired
    NLPProcessorCreator processorCreator;

    @Autowired
    QueryManager queryManager;

    @Override
    public ResponseWrapper getAllMessages() {
        return null;
    }

    @Override
    public ResponseWrapper getQueryCriteriaMessages(String query) {
        List<IbMessageData> data = queryManager.execute(query);
        NLPProcessor processor = processorCreator.getProcessor();

        Map<NLPEngineType, Map<String, Double>> typeMapMap = processorCreator.getProcessor().process(data);

        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setTotal_matches(data.size());
        responseWrapper.setTruth(typeMapMap.get(NLPEngineType.INDUSTRY_BUYING));
        responseWrapper.setGoogle(typeMapMap.get(NLPEngineType.GOOGLE));
        responseWrapper.setCube(typeMapMap.get(NLPEngineType.CUBE));
        responseWrapper.setIbm(typeMapMap.get(NLPEngineType.IBM));

        return responseWrapper;
    }
}
