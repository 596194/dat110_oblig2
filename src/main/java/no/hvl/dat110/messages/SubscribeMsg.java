package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 
	// object variable

    // TODO:
    // Implement object variables - a topic is required
	private String topic;

    // TODO:
    // Complete the constructor, get/set-methods, and toString method
    // as described in the project text
	
	// constructor
    public SubscribeMsg(String user, String topic) {
        		super(MessageType.SUBSCRIBE, user);
        		this.topic=topic;
    }

    //get-method
    public String getTopic() {
        return topic;
    }
    //set-method
    public void setTopic(String topic) {
        this.topic = topic;
    }

    // toString method
    @Override
    public String toString() {
        return "CreateTopicMsg [topic=" + topic + super.toString() + "]";
        	
    }

	


}
