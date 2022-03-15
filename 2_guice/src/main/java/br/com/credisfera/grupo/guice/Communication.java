
package br.com.credisfera.grupo.guice;

import java.util.Date;

import com.google.inject.Inject;

public class Communication {

	final Date start = new Date();

	@Inject
	private DefaultCommunicator communicator;

	public Communication(Boolean keepRecords) {
		if (keepRecords) {
			System.out.println("keeping records");
		}
	}

	public boolean sendMessage(String message) {

		return communicator.sendMessage(message);
	}

	public DefaultCommunicator getCommunicator() {
		return this.communicator;
	}
}
