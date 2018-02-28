package amazonsqsconnector.factories;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

import amazonsqsconnector.proxies.constants.Constants;

public class AmazonSQSFactory {
	private static AmazonSQS sqs = null;
	
	protected AmazonSQSFactory() {}
	
	public static AmazonSQS getSQS() {
		if(sqs == null) {
			String accessKey = Constants.getACCESS_KEY_ID();
			String secretKey = Constants.getSECRET_ACCESS_KEY();
			AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
			AWSCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(credentials);
			
			
			sqs = AmazonSQSClientBuilder.standard()
	                .withCredentials(credentialsProvider)
	                .withRegion(Regions.EU_CENTRAL_1)
	                .build();
		}

		return sqs;
	}
}
