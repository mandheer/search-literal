package in.pabreja.exercise.industrybuying.searchliteral.repository;

import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IbMessageRepository extends JpaRepository<IbMessageData,Long> {
}
