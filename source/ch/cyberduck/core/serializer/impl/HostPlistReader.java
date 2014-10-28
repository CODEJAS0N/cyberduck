package ch.cyberduck.core.serializer.impl;

/*
 * Copyright (c) 2009 David Kocher. All rights reserved.
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
 * Bug fixes, suggestions and comments should be sent to:
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Host;
import ch.cyberduck.core.HostReaderFactory;
import ch.cyberduck.core.serializer.HostDictionary;
import ch.cyberduck.core.serializer.Reader;
import ch.cyberduck.ui.cocoa.foundation.NSDictionary;

/**
 * @version $Id$
 */
public class HostPlistReader extends PlistReader<Host> {

    @Override
    public Host deserialize(final NSDictionary dict) {
        return new HostDictionary().deserialize(dict);
    }
}