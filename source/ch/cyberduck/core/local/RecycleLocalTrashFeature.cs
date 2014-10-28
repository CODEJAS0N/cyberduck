//
// Copyright (c) 2010-2014 Yves Langisch. All rights reserved.
// http://cyberduck.io/
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
//
// Bug fixes, suggestions and comments should be sent to:
// yves@cyberduck.io
//

using ch.cyberduck.core.local;
using LocalTrashFactory = ch.cyberduck.core.local.LocalTrashFactory;
using Trash = ch.cyberduck.core.local.features.Trash;

namespace Ch.Cyberduck.Core.Local
{
    public sealed class RecycleLocalTrashFeature : Trash
    {
        public void trash(ch.cyberduck.core.Local file)
        {
            if (file.exists())
            {
                Microsoft.VisualBasic.FileIO.FileSystem.DeleteFile(file.getAbsolute(),
                                Microsoft.VisualBasic.FileIO.UIOption.OnlyErrorDialogs,
                                Microsoft.VisualBasic.FileIO.RecycleOption.SendToRecycleBin);
            }
        }
    }
}