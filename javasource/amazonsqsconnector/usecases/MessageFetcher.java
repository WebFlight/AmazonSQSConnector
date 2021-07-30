package amazonsqsconnector.usecases;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;

public class MessageFetcher implements Runnable {
	
	private ILogNode logger;
	private String prizeRequestFetchingMicroflow;
	
	public MessageFetcher(ILogNode logger, String prizeRequestFetchingMicroflow) {
		this.logger = logger;
		this.prizeRequestFetchingMicroflow = prizeRequestFetchingMicroflow;
	}

	@Override
	public void run() {
		while(true) {
			try {
				IContext context = Core.createSystemContext();
				Core.microflowCall(this.prizeRequestFetchingMicroflow)
					.execute(context);
			} catch (Exception e) {
				logger.error("Error during prize request fetching.", e);
			}
		}
	}
}
