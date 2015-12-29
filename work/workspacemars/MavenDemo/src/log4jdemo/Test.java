package log4jdemo;

public class Test {
	
	public static void main(String[] args) {
		
		MessageWriterService messageWriterService = new MessageWriterService();
		messageWriterService.writeMessage();
	}
}
