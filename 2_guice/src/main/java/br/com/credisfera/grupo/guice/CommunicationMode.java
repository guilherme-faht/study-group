
package br.com.credisfera.grupo.guice;

import br.com.credisfera.grupo.guice.constant.CommunicationModel;

public interface CommunicationMode {

    public CommunicationModel getMode();
    
    public boolean sendMessage(String message);

}
