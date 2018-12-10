#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ${NAME} {
    
    private final static Logger log = LogManager.getLogger(${NAME}.class);
    
    
    
}
