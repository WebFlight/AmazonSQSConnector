// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package amazonsqsconnector.actions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

import amazonsqsconnector.proxies.constants.Constants;
import amazonsqsconnector.usecases.MessageFetcher;

public class InitializeMessageFetching extends CustomJavaAction<java.lang.Void>
{
	private java.lang.String fetchingMicroflow;
	private java.lang.Long numberOfThreads;

	public InitializeMessageFetching(IContext context, java.lang.String fetchingMicroflow, java.lang.Long numberOfThreads)
	{
		super(context);
		this.fetchingMicroflow = fetchingMicroflow;
		this.numberOfThreads = numberOfThreads;
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		ILogNode logger = Core.getLogger(Constants.getLOGNODE());
		int numberOfThreads = Math.toIntExact(this.numberOfThreads);
		ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
		
		logger.info(String.format("Initialized prize request fetching with %s threads.", numberOfThreads));
		
		for (int i = 0; i < numberOfThreads; i++) {
			Runnable messageFetcher = new MessageFetcher(logger, fetchingMicroflow);
			executorService.submit(messageFetcher);
		}
		
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "InitializeMessageFetching";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
