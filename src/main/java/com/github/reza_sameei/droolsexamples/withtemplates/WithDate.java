package com.github.reza_sameei.droolsexamples.withtemplates;

import java.time.Instant;
import java.util.Date;

public interface WithDate {

    Date getDate();

    /*
    default Date getDate() {
        return Date.from(Instant.now());
    }
    */

    class RealImpl implements WithDate {

        private final Date date;

        public RealImpl() {
            date = Date.from(Instant.now());
        }

        public Date getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "RealImpl{" +
                    "date=" + date +
                    '}';
        }
    }
}
