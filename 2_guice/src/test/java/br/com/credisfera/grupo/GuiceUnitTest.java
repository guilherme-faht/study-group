package br.com.credisfera.grupo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import br.com.credisfera.grupo.common.BookService;
import br.com.credisfera.grupo.guice.FooProcessor;
import br.com.credisfera.grupo.guice.GuicePersonService;
import br.com.credisfera.grupo.guice.GuiceUserService;
import br.com.credisfera.grupo.guice.Person;
import br.com.credisfera.grupo.guice.modules.GuiceModule;

public class GuiceUnitTest {

	@Test
	public void givenAccountServiceInjectedInGuiceUserService_WhenGetAccountServiceInvoked_ThenReturnValueIsNotNull() {
		Injector injector = Guice.createInjector(new GuiceModule());
		GuiceUserService guiceUserService = injector.getInstance(GuiceUserService.class);
		assertNotNull(guiceUserService.getAccountService());
	}

	@Test
	public void givenBookServiceIsRegisteredInModule_WhenBookServiceIsInjected_ThenReturnValueIsNotNull() {
		Injector injector = Guice.createInjector(new GuiceModule());
		BookService bookService = injector.getInstance(BookService.class);
		assertNotNull(bookService);
	}

	@Test
	public void givenMultipleBindingsForPerson_WhenPersonIsInjected_ThenTestFailsByProvisionException() {
		Injector injector = Guice.createInjector(new GuiceModule());
		Person person = injector.getInstance(Person.class);
		assertNotNull(person);
	}

	@Test
	public void givenFooInjectedToFooProcessorAsOptionalDependency_WhenFooProcessorIsRetrievedFromContext_ThenCreationExceptionIsNotThrown() {
		Injector injector = Guice.createInjector(new GuiceModule());
		FooProcessor fooProcessor = injector.getInstance(FooProcessor.class);
		assertNotNull(fooProcessor);
	}

	@Test
	public void givenGuicePersonServiceConstructorAnnotatedByInject_WhenGuicePersonServiceIsInjected_ThenInstanceWillBeCreatedFromTheConstructor() {
		Injector injector = Guice.createInjector(new GuiceModule());
		GuicePersonService personService = injector.getInstance(GuicePersonService.class);
		assertNotNull(personService);
	}

	@Test
	public void givenPersonDaoInjectedToGuicePersonServiceBySetterInjection_WhenGuicePersonServiceIsInjected_ThenPersonDaoInitializedByTheSetter() {
		Injector injector = Guice.createInjector(new GuiceModule());
		GuicePersonService personService = injector.getInstance(GuicePersonService.class);
		assertNotNull(personService);
		assertNotNull(personService.getPersonDao());
	}
}
