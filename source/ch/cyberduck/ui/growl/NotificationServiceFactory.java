package ch.cyberduck.ui.growl;

/*
 * Copyright (c) 2002-2014 David Kocher. All rights reserved.
 * http://cyberduck.io/
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
 * feedback@cyberduck.io
 */

import ch.cyberduck.core.Factory;

/**
 * @version $Id: GrowlFactory.java 5451 2009-10-09 08:34:10Z dkocher $
 */
public class NotificationServiceFactory extends Factory<NotificationService> {

    private static NotificationService notifier;

    public NotificationServiceFactory() {
        super("factory.notification.class");
    }

    public static synchronized NotificationService get() {
        if(null == notifier) {
            notifier = new NotificationServiceFactory().create();
        }
        return notifier;
    }
}
