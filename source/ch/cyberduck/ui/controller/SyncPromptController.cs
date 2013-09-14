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

using System.Collections.Generic;
using ch.cyberduck.core;
using ch.cyberduck.core.transfer;
using ch.cyberduck.core.transfer.synchronisation;

namespace Ch.Cyberduck.Ui.Controller
{
    internal class SyncPromptController : TransferPromptController
    {
        public SyncPromptController(WindowController parent, Transfer transfer) : base(parent, transfer)
        {
            ;
        }

        protected override string TransferName
        {
            get { return "Synchronize"; }
        }

        public override TransferAction prompt()
        {
            TransferPromptModel = new SyncPromptModel(this, Transfer);
            Action = TransferAction.ACTION_OVERWRITE;
            return base.prompt();
        }

        protected override void View_ChangedActionEvent()
        {
            TransferAction selected = View.SelectedAction;
            if (Action.equals(selected))
            {
                return;
            }
            Preferences.instance().setProperty("queue.sync.action.default", selected.toString());
            ((SyncTransfer) Transfer).setTransferAction(selected);
            ReloadData();
        }

        protected override void PopulateActions()
        {
            IDictionary<TransferAction, string> actions = new Dictionary<TransferAction, string>();

            TransferAction defaultAction = ((SyncTransfer) Transfer).getTransferAction();

            actions.Add(SyncTransfer.ACTION_DOWNLOAD, SyncTransfer.ACTION_DOWNLOAD.getTitle());
            actions.Add(SyncTransfer.ACTION_UPLOAD, SyncTransfer.ACTION_UPLOAD.getTitle());
            actions.Add(SyncTransfer.ACTION_MIRROR, SyncTransfer.ACTION_MIRROR.getTitle());
            View.PopulateActions(actions);

            View.SelectedAction = defaultAction;
        }
    }
}