package cz.ucl.jee.sem03;


import cz.ucl.jee.accounts.AccountService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AccountValidator {

	//TODO implement custom validator that uses AccountService.accountExists for checking

}
