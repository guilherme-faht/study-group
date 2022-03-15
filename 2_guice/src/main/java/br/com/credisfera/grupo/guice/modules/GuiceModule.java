package br.com.credisfera.grupo.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;

import br.com.credisfera.grupo.common.AccountService;
import br.com.credisfera.grupo.common.AccountServiceImpl;
import br.com.credisfera.grupo.common.BookService;
import br.com.credisfera.grupo.common.BookServiceImpl;
import br.com.credisfera.grupo.common.PersonDao;
import br.com.credisfera.grupo.common.PersonDaoImpl;
import br.com.credisfera.grupo.guice.Foo;
import br.com.credisfera.grupo.guice.Person;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		try {
			bind(AccountService.class).to(AccountServiceImpl.class);
			bind(Person.class).toConstructor(Person.class.getConstructor());
			// bind(Person.class).toProvider(new Provider<Person>() {
			// public Person get() {
			// Person p = new Person();
			// return p;
			// }
			// });
			bind(Foo.class).toProvider(new Provider<Foo>() {
				public Foo get() {
					return new Foo();
				}
			});
			bind(PersonDao.class).to(PersonDaoImpl.class);

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Provides
	public BookService bookServiceGenerator() {
		return new BookServiceImpl();
	}

}
