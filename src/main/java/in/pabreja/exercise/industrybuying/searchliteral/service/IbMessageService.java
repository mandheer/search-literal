package in.pabreja.exercise.industrybuying.searchliteral.service;

import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import in.pabreja.exercise.industrybuying.searchliteral.model.ResponseWrapper;

public interface IbMessageService {

    ResponseWrapper getAllMessages();

    ResponseWrapper getQueryCriteriaMessages(String query);
}
