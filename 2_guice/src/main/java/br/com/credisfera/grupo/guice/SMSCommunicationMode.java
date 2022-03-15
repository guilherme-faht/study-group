
package br.com.credisfera.grupo.guice;

import java.util.logging.Logger;

import com.google.inject.Inject;

import br.com.credisfera.grupo.guice.aop.MessageSentLoggable;
import br.com.credisfera.grupo.guice.constant.CommunicationModel;

public class SMSCommunicationMode implements CommunicationMode {

	@Inject
	private Logger logger;

	public CommunicationModel getMode() {
		return CommunicationModel.SMS;
	}

	@MessageSentLoggable
	public boolean sendMessage(String message) {
		logger.info("SMS message sent");
		return true;
	}
}
