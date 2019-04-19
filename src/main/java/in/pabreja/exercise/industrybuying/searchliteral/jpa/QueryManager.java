package in.pabreja.exercise.industrybuying.searchliteral.jpa;

import in.pabreja.exercise.industrybuying.searchliteral.model.IbMessageData;
import in.pabreja.exercise.industrybuying.searchliteral.stereotype.IndustryBuyingService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

@IndustryBuyingService
public class QueryManager {

    public List<IbMessageData> execute(String query){

        // write query filter logic here
        List<IbMessageData> messages = new ArrayList<>();

        String nativeQuery = "SELECT * from MESSAGEDATA where message_str like \'%"+query+"%\'";
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        try(Session session = sf.openSession()){

        Transaction tx = session.beginTransaction();

        messages = session.createNativeQuery(nativeQuery,IbMessageData.class)
                .list();
        System.out.println("total records : "+messages.size());
        session.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return messages;
    }
}
