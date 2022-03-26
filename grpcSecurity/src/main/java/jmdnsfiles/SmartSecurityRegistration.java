package jmdnsfiles;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class SmartSecurityRegistration {
	
	public static void main(String[] args) throws InterruptedException{
		
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
			ServiceInfo lock = ServiceInfo.create("_http._tcp.local.","lock", 50051, "Manage Locks");
			jmdns.registerService(lock);
			
			ServiceInfo camera = ServiceInfo.create("_http._tcp.local.","camera", 50052, "Manage cameras and survailance");
			jmdns.registerService(camera);
			
			ServiceInfo alarm = ServiceInfo.create("_http._tcp.local.","alarm", 50053, "Manage Alarm system");
			jmdns.registerService(alarm);
			
			Thread.sleep(25000);
			
			jmdns.unregisterAllServices();
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
