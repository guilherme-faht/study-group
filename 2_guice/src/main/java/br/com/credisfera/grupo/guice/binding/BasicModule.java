
package br.com.credisfera.grupo.guice.binding;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import br.com.credisfera.grupo.guice.Communication;
import br.com.credisfera.grupo.guice.CommunicationMode;
import br.com.credisfera.grupo.guice.DefaultCommunicator;
import br.com.credisfera.grupo.guice.EmailCommunicationMode;
import br.com.credisfera.grupo.guice.IMCommunicationMode;
import br.com.credisfera.grupo.guice.SMSCommunicationMode;

public class BasicModule extends AbstractModule {

	@Override
	protected void configure() {
		try {
			bind(Communication.class).toConstructor(Communication.class.getConstructor(Boolean.TYPE));
		} catch (NoSuchMethodException ex) {
			Logger.getLogger(BasicModule.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SecurityException ex) {
			Logger.getLogger(BasicModule.class.getName()).log(Level.SEVERE, null, ex);
		}
		bind(DefaultCommunicator.class).annotatedWith(Names.named("AnotherCommunicator")).to(DefaultCommunicator.class)
				.asEagerSingleton();

		bind(CommunicationMode.class).annotatedWith(Names.named("IMComms")).to(IMCommunicationMode.class);
		bind(CommunicationMode.class).annotatedWith(Names.named("EmailComms")).to(EmailCommunicationMode.class);
		bind(CommunicationMode.class).annotatedWith(Names.named("SMSComms")).to(SMSCommunicationMode.class);
	}
}
