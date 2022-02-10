package chap15.sec04.queue;

public class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
	
}
