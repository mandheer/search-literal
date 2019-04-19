package in.pabreja.exercise.industrybuying.searchliteral.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGEDATA")
public class IbMessageData {

    @Id
    @Column(name = "m_id")
    private String msgId;

    @Column(name = "message_str")
    private String msgTxt;
    @Column(name = "m_phone")
    private String phone;
    @Column(name = "m_t_val")
    private String ibTruthVal;
    @Column(name = "m_cube_val")
    private String cubeTruthVal;
    @Column(name = "m_g_val")
    private String gTruthVal;
    @Column(name = "m_g_sprob")
    private String gSpamProbVal;
    @Column(name = "m_g_nsprob")
    private String gNotSpamProbVal;
    @Column(name = "m_ibm_val")
    private String ibmTruthVal;
    @Column(name = "m_ibm_sprob")
    private String ibmSpamProbVal;
    @Column(name = "m_ibm_nsprob")
    private String ibmNotSpamProbVal;

    @Column(name = "m_l_id")
    private String messagesLiteralId;

    public String getMsgId() {
        return msgId;
    }

    public String getMsgTxt() {
        return msgTxt;
    }

    public String getPhone() {
        return phone;
    }

    public String getIbTruthVal() {
        return ibTruthVal;
    }

    public String getCubeTruthVal() {
        return cubeTruthVal;
    }

    public String getgTruthVal() {
        return gTruthVal;
    }

    public String getgSpamProbVal() {
        return gSpamProbVal;
    }

    public String getgNotSpamProbVal() {
        return gNotSpamProbVal;
    }

    public String getIbmTruthVal() {
        return ibmTruthVal;
    }

    public String getIbmSpamProbVal() {
        return ibmSpamProbVal;
    }

    public String getIbmNotSpamProbVal() {
        return ibmNotSpamProbVal;
    }

    public String getMessagesLiteralId() {
        return messagesLiteralId;
    }


    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public void setMsgTxt(String msgTxt) {
        this.msgTxt = msgTxt;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIbTruthVal(String ibTruthVal) {
        this.ibTruthVal = ibTruthVal;
    }

    public void setCubeTruthVal(String cubeTruthVal) {
        this.cubeTruthVal = cubeTruthVal;
    }

    public void setgTruthVal(String gTruthVal) {
        this.gTruthVal = gTruthVal;
    }

    public void setgSpamProbVal(String gSpamProbVal) {
        this.gSpamProbVal = gSpamProbVal;
    }

    public void setgNotSpamProbVal(String gNotSpamProbVal) {
        this.gNotSpamProbVal = gNotSpamProbVal;
    }

    public void setIbmTruthVal(String ibmTruthVal) {
        this.ibmTruthVal = ibmTruthVal;
    }

    public void setIbmSpamProbVal(String ibmSpamProbVal) {
        this.ibmSpamProbVal = ibmSpamProbVal;
    }

    public void setIbmNotSpamProbVal(String ibmNotSpamProbVal) {
        this.ibmNotSpamProbVal = ibmNotSpamProbVal;
    }

    public void setMessagesLiteralId(String messagesLiteralId) {
        this.messagesLiteralId = messagesLiteralId;
    }
}
