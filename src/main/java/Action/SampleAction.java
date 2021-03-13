package Action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;


public class SampleAction extends ActionSupport {

    private static Logger logger = Logger.getLogger(SampleAction.class);
    public String execute() {
        System.out.println("init");
//        logger.info("init start");
        return SUCCESS;
    }

    public String test() {
        System.out.println("into");
        return SUCCESS;
    }

}
