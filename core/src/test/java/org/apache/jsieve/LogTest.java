/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.jsieve;

import org.apache.jsieve.exception.SieveException;
import org.apache.jsieve.parser.generated.ParseException;
import org.apache.jsieve.utils.JUnitUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class LogTest
 */
public class LogTest {

    /**
     * Test for Command 'log'.
     */
    @org.junit.Test
    public void testLogDebug() {
        boolean isTestPassed = false;
        String script = "log :debug \"Log a debug message.\";";

        try {
            JUnitUtils.interpret(JUnitUtils.createMail(), script);
            isTestPassed = true;
        } catch (ParseException e) {
        } catch (SieveException e) {
        }
        Assert.assertTrue(isTestPassed);
    }

    /**
     * Test for Command 'log'.
     */
    @Test
    public void testLogError() {
        boolean isTestPassed = false;
        String script = "log :error \"Log an error message.\";";

        try {
            JUnitUtils.interpret(JUnitUtils.createMail(), script);
            isTestPassed = true;
        } catch (ParseException e) {
        } catch (SieveException e) {
        }
        Assert.assertTrue(isTestPassed);
    }

    /**
     * Test for Command 'log'.
     */
    @Test
    public void testLogInfo() {
        boolean isTestPassed = false;
        String script = "log :info \"Log an info message.\";";

        try {
            JUnitUtils.interpret(JUnitUtils.createMail(), script);
            isTestPassed = true;
        } catch (ParseException e) {
        } catch (SieveException e) {
        }
        Assert.assertTrue(isTestPassed);
    }

    /**
     * Test for Command 'log'.
     */
    @Test
    public void testLogTrace() {
        boolean isTestPassed = false;
        String script = "log :trace \"Log a trace message.\";";

        try {
            JUnitUtils.interpret(JUnitUtils.createMail(), script);
            isTestPassed = true;
        } catch (ParseException e) {
        } catch (SieveException e) {
        }
        Assert.assertTrue(isTestPassed);
    }

    /**
     * Test for Command 'log'.
     */
    @Test
    public void testLogWarn() {
        boolean isTestPassed = false;
        String script = "log :warn \"Log a warning message.\";";

        try {
            JUnitUtils.interpret(JUnitUtils.createMail(), script);
            isTestPassed = true;
        } catch (ParseException e) {
        } catch (SieveException e) {
        }
        Assert.assertTrue(isTestPassed);
    }

    /**
     * Test for Command 'log'.
     */
    @Test
    public void testLogDefault() {
        boolean isTestPassed = false;
        String script = "log \"Log a default message.\";";

        try {
            JUnitUtils.interpret(JUnitUtils.createMail(), script);
            isTestPassed = true;
        } catch (ParseException e) {
        } catch (SieveException e) {
        }
        Assert.assertTrue(isTestPassed);
    }

}
