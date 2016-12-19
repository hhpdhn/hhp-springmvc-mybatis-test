package andy.quartz;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import andy.service.UserService;

@Component
public class JobOne{
	private static final Logger LOGGER = Logger.getLogger(JobOne.class);
	
	@Autowired
	private UserService userService;
	
	protected void jobHand() {
		LOGGER.info("schedule JobOne!!!!");
		String invokeUserService = userService.invokeUserService();
		LOGGER.info(invokeUserService);
	}

}
