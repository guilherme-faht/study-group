package br.com.credisfera.grupo.guice;

import com.google.inject.Inject;

import br.com.credisfera.grupo.common.AccountService;

public class GuiceUserService {

	@Inject
	private AccountService accountService;

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

}
