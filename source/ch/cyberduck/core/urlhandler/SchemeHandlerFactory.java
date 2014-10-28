package ch.cyberduck.core.urlhandler;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.Factory;
import ch.cyberduck.core.Scheme;
import ch.cyberduck.core.local.Application;

import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @version $Id$
 */
public class SchemeHandlerFactory extends Factory<SchemeHandler> {
    private static final Logger log = Logger.getLogger(SchemeHandlerFactory.class);

    protected SchemeHandlerFactory() {
        super("factory.schemehandler.class");
    }

    public static SchemeHandler get() {
        return new SchemeHandlerFactory().create();
    }

}
