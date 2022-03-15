
package br.com.credisfera.grupo.guice.binding;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

import br.com.credisfera.grupo.guice.aop.MessageLogger;
import br.com.credisfera.grupo.guice.aop.MessageSentLoggable;

public class AOPModule extends AbstractModule {

	@Override
	protected void configure() {
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(MessageSentLoggable.class), new MessageLogger());
	}
}
