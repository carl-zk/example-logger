package com.example.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

/**
 * @author carl
 */
public class Tests {
    /**
     * without log4j-jcl
     */
    @Test
    public void commons_logging_directly() {
        Log log = LogFactory.getLog(Tests.class);
        log.info("commons_logging_directly");
    }

    /**
     * with log4j-jcl
     */
    @Test
    public void commons_logging_via_log4j() {
        Log log = LogFactory.getLog(Tests.class);
        log.info("commons_logging_via_log4j");
    }

    @Test
    public void log4j2_logging_directly() {
        Logger logger = LogManager.getLogger(Tests.class);
        logger.info("log4j2_logging_directly");
    }

    /**
     * with log4j-slf4j18-impl
     */
    @Test
    public void slf4j_via_log4j2() {
        org.slf4j.Logger logger = LoggerFactory.getLogger(Tests.class);
        logger.info("slf4j_via_log4j2");
    }
}
