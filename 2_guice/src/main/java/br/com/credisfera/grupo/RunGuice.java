
package br.com.credisfera.grupo;

import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import br.com.credisfera.grupo.guice.Communication;
import br.com.credisfera.grupo.guice.binding.AOPModule;
import br.com.credisfera.grupo.guice.modules.BasicModule;

public class RunGuice {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new BasicModule(), new AOPModule());
		Communication comms = injector.getInstance(Communication.class);
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				String input = scanner.nextLine();
				if (input.equalsIgnoreCase("-sair")) {
					break;
				} else {
					comms.sendMessage(input);
				}

			}
		}
	}
}
