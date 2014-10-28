﻿// 
// Copyright (c) 2010-2013 Yves Langisch. All rights reserved.
// http://cyberduck.ch/
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
// yves@cyberduck.ch
// 

using System;
using System.Security.Cryptography;
using System.Text;
using ch.cyberduck.core;
using ch.cyberduck.core.local;
using java.io;
using org.apache.commons.io;

namespace Ch.Cyberduck.Core.Local
{
    public sealed class WindowsTemporaryFileService : TemporaryFileService
    {
        protected override String shorten(string path) {
            if (path.Length > 240)
            {
                return CalculateMD5Hash(path);
            }
            return path;
        }

        private static string CalculateMD5Hash(string input)
        {
            MD5 md5 = MD5.Create();
            byte[] hash = md5.ComputeHash(Encoding.UTF8.GetBytes(input));
            return Convert.ToBase64String(hash);
        }
    }
}