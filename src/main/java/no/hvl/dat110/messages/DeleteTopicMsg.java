package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker
	// Object variable
	private String topic;
	
	// Constructor
	public DeleteTopicMsg(String user, String topic) {
		super(MessageType.DELETETOPIC, user);
		this.topic=topic;
	}
	// get-method
	public String getTopic() {
		return topic;
	}
	// set-method
	public void setTopic(String topic) {
		this.topic = topic;
	}
	// toString method
	@Override
	public String toString() {
		return "CreateTopicMsg [topic=" + topic + super.toString() + "]";
	}
	
}
