/***********************************************************************
 * Copyright (c) 2003-2004 The Apache Software Foundation.             *
 * All rights reserved.                                                *
 * ------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License"); you *
 * may not use this file except in compliance with the License. You    *
 * may obtain a copy of the License at:                                *
 *                                                                     *
 *     http://www.apache.org/licenses/LICENSE-2.0                      *
 *                                                                     *
 * Unless required by applicable law or agreed to in writing, software *
 * distributed under the License is distributed on an "AS IS" BASIS,   *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or     *
 * implied.  See the License for the specific language governing       *
 * permissions and limitations under the License.                      *
 ***********************************************************************/
package org.apache.jsieve.samples.james;

import javax.mail.MessagingException;

/**
 * Class <code>DestinationException</code> is thrown when a target
 * destionaition is invalid.
 */
public class DestinationException extends MessagingException
{

    /**
     * Constructor for DestinationException.
     */
    public DestinationException()
    {
        super();
    }

    /**
     * Constructor for DestinationException.
     * @param arg0
     */
    public DestinationException(String arg0)
    {
        super(arg0);
    }

    /**
     * Constructor for DestinationException.
     * @param arg0
     * @param arg1
     */
    public DestinationException(String arg0, Exception arg1)
    {
        super(arg0, arg1);
    }

}
