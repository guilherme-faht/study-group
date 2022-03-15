
package br.com.credisfera.grupo.guice;

import br.com.credisfera.grupo.guice.aop.MessageSentLoggable;
import br.com.credisfera.grupo.guice.constant.CommunicationModel;

public class EmailCommunicationMode implements CommunicationMode {

	public CommunicationModel getMode() {
		return CommunicationModel.EMAIL;
	}

	@MessageSentLoggable
	public boolean sendMessage(String Message) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
