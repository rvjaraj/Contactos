/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.appdis.testejb.utils;

import ec.edu.ups.appdis.testejb.business.ContactosONRemote;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicio
 */
public class ConecionServer {
    public ContactosONRemote contactosONRemote;
    
    public void instanciarEJBRemote() throws Exception {
        try {
            final Hashtable<String, Comparable> jndiProperties
                    = new Hashtable<String, Comparable>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");
            jndiProperties.put("jboss.naming.client.ejb.context", true);

            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "admin");
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "admin");

            final Context context = new InitialContext(jndiProperties);

            final String lookupName = "ejb:/testejb/ContactosON!ec.edu.ups.appdis.testejb.business.ContactosONRemote";

            //this.memberRegistration = (MemberRegistrationRemote) context.lookup(lookupName);  
            //Conecta al servidor y devuelve la isntacia remota de lookupName
            this.contactosONRemote = (ContactosONRemote) context.lookup(lookupName);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
    public ContactosONRemote getRemote(){
        try {
            this.instanciarEJBRemote();
            return this.contactosONRemote;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
