
package br.com.credisfera.grupo.guice;

import java.util.logging.Logger;

import com.google.inject.Inject;

import br.com.credisfera.grupo.guice.aop.MessageSentLoggable;
import br.com.credisfera.grupo.guice.constant.CommunicationModel;

public class IMCommunicationMode implements CommunicationMode {

	@Inject
	private Logger logger;

	public CommunicationModel getMode() {
		return CommunicationModel.IM;
	}

	@MessageSentLoggable
	public boolean sendMessage(String message) {
		logger.info("IM Message Sent");
		return true;
	}
}
