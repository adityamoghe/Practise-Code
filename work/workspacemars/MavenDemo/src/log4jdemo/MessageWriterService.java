package log4jdemo;

import org.apache.log4j.Logger;

public class MessageWriterService {
	
static final Logger LOGGER= Logger.getLogger(MessageWriterService.class.getName());
	
	public void writeMessage() {
		
		
		LOGGER.info("Method begins here");
		
		
		
	}
}
