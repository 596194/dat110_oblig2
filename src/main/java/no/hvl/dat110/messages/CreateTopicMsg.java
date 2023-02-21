package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	// Object variable
	private String topic;
	
	
	// Constructor
   public CreateTopicMsg(String user, String topic) {
    super(MessageType.CREATETOPIC, user);
    this.topic=topic;
    
    	}

   // get-method
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
    	return "CreateTopicMsg [ topic=" + topic + super.toString() + "]";
    	}
    

