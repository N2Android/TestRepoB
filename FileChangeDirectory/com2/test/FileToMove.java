import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

public class FileToMove {
    public static void main(String[] args) {
        String testString = "Some testing String!";

       Logger logger = Logger.getLogger(componentClass);
        
       logger.setLevel(Level.ALL);
       logger.log(level, testString);
    }
}