package org;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogExamp {
    private static final Logger logg = LoggerFactory.getLogger(LogExamp.class);
        public static void main(String[] args) {
            logg.error("Error");
            logg.warn("Warning");
        }
    }