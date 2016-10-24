package project.activemq.client;

public interface JmsClient {
	public void send(String msg);
	public String receive();
}
