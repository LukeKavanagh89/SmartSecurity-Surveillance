package jmdnsfiles;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;


public class SmartSecurityDiscover {
	
	private static class OfficeListener implements ServiceListener {
		 @Override
	        public void serviceAdded(ServiceEvent event) {
	            System.out.println("Service added: " + event.getInfo());
	        }
		 
		 @Override
	        public void serviceResolved(ServiceEvent event) {
	            System.out.println("Service resolved: " + event.getInfo());
	        }
		 
		 @Override
	        public void serviceRemoved(ServiceEvent event) {
	            System.out.println("Service removed: " + event.getInfo());
		 }
	
	}
	
	public static void main(String[] args) throws InterruptedException  {
		try {
			//Create a JHmDNS Instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			//Service Listener is added
			jmdns.addServiceListener("_http._tcp.local.", new OfficeListener());
			
			Thread.sleep(30000);
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
		}
	}

}
