package in.pabreja.exercise.industrybuying.searchliteral.controller;

import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import in.pabreja.exercise.industrybuying.searchliteral.model.ResponseWrapper;
import in.pabreja.exercise.industrybuying.searchliteral.repository.IbMessageRepository;
import in.pabreja.exercise.industrybuying.searchliteral.service.IbMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IbMessageLiteralController {

    @Autowired
    IbMessageService ibMessageService;

    @GetMapping("/search/all")
    public ResponseWrapper getAllMessages() {
        return null;
    }

    @GetMapping("/search")
    public ResponseWrapper getQueryMessages(@RequestParam String q) {
        return ibMessageService.getQueryCriteriaMessages(q);
    }

    @GetMapping("/search/{msgId}")
    public ResponseWrapper getMessageWithId(@PathVariable String msgId) {
        return null;
    }

}
