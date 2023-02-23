package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	//object variables
	private String topic;
	private String message;
	
	//constructor
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic=topic;
		this.message=message;
	}
	
	//get-method
	public String getTopic() {
		return topic;
	}
	//set-method
	public void setTopic(String topic) {
		this.topic = topic;
	}
	//get-method
	public String getMessage() {
		return message;
		
	}
	//set-method
	public void setMessage(String message) {
		this.message=message;
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "PublishMsg [topic=" + topic + ", " + "message=" + message + "]"
				+ super.toString();
	} 
	

	
}
