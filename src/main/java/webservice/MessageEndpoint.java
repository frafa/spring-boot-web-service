package webservice;

import it.ff.message.GetMessageRequest;
import it.ff.message.GetMessageResponse;
import it.ff.message.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MessageEndpoint {
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageEndpoint.class);
	
	private static final String NAMESPACE_URI = "http://ff.it/Message";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMessageRequest")
	@ResponsePayload
	public GetMessageResponse getCountry(@RequestPayload GetMessageRequest request) {
		GetMessageResponse msgResponse = new GetMessageResponse();

		LOGGER.debug(String.format("Environment : %s", request.getMessage().getEnvironment()));
		LOGGER.debug(String.format("Environment : %s", request.getMessage().getMsgId()));
		LOGGER.debug(String.format("Environment : %s", request.getMessage().getDatetime()));
		
		Response response = new Response();
		response.setCode("0");
		response.setMsg("OK");
		
		msgResponse.setResponse(response);
		return msgResponse;
	}
}
