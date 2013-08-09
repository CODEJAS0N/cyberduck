package ch.cyberduck.ui.cocoa.delegate;

/*
 * Copyright (c) 2002-2010 David Kocher. All rights reserved.
 *
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

import ch.cyberduck.core.DescriptiveUrl;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.UrlProvider;
import ch.cyberduck.core.cdn.DistributionConfiguration;
import ch.cyberduck.ui.cocoa.application.NSEvent;
import ch.cyberduck.ui.cocoa.application.NSPasteboard;
import ch.cyberduck.ui.cocoa.foundation.NSArray;
import ch.cyberduck.ui.cocoa.foundation.NSString;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @version $Id:$
 */
public abstract class CopyURLMenuDelegate extends URLMenuDelegate {
    private static Logger log = Logger.getLogger(CopyURLMenuDelegate.class);

    @Override
    protected String getKeyEquivalent() {
        return "c";
    }

    @Override
    protected int getModifierMask() {
        return NSEvent.NSCommandKeyMask | NSEvent.NSShiftKeyMask;
    }

    @Override
    protected List<DescriptiveUrl> getURLs(Path selected) {
        final ArrayList<DescriptiveUrl> list = new ArrayList<DescriptiveUrl>();
        list.addAll(this.getSession().getFeature(UrlProvider.class).toUrl(selected));
        list.addAll(this.getSession().getFeature(DistributionConfiguration.class).toUrl(selected));
        return list;
    }

    @Override
    public void handle(final List<String> selected) {
        final StringBuilder url = new StringBuilder();
        for(Iterator<String> iter = selected.iterator(); iter.hasNext(); ) {
            url.append(iter.next());
            if(iter.hasNext()) {
                url.append("\n");
            }
        }
        final NSPasteboard pboard = NSPasteboard.generalPasteboard();
        pboard.declareTypes(NSArray.arrayWithObject(NSString.stringWithString(NSPasteboard.StringPboardType)), null);
        if(!pboard.setStringForType(url.toString(), NSPasteboard.StringPboardType)) {
            log.error(String.format("Error writing URL to %s", NSPasteboard.StringPboardType));
        }
    }
}
