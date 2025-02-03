package ax4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ax7.Message;

@Component
public class LifeCycle {
	
	@Autowired @Qualifier("sms")
	private Message m;

	public LifeCycle() {
		System.out.println("Life-cycle constructor");
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("Life-cycle init");
	}
	
	@PreDestroy
	public void teardown() {
		System.out.println("Life-cycle destroy");
	}
}
