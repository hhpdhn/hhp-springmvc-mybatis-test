package andy.cxf;

import javax.jws.WebService;

@WebService()
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}

}
