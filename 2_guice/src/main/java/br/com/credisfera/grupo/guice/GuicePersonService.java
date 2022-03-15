package br.com.credisfera.grupo.guice;

import com.google.inject.Inject;

import br.com.credisfera.grupo.common.PersonDao;

public class GuicePersonService {

	@Inject
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

}
