import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class sampleEntry {
	
	static Logger log=LogManager.getLogger(sampleEntry.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
		log.info("This is a logger");
		
	}

}
