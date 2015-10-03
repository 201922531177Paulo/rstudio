/*
 * AceAfterCommandExecutedEvent.java
 *
 * Copyright (C) 2009-12 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.source.editors.text.ace;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class AceAfterCommandExecutedEvent extends GwtEvent<AceAfterCommandExecutedEvent.Handler>
{
   public AceAfterCommandExecutedEvent(JavaScriptObject event)
   {
      event_ = event;
   }
   
   public JavaScriptObject getCommandData()
   {
      return event_;
   }
   
   private final JavaScriptObject event_;
   
   // Boilerplate ----
   
   public interface Handler extends EventHandler
   {
      void onAceAfterCommandExecuted(AceAfterCommandExecutedEvent event);
   }
   
   @Override
   public Type<Handler> getAssociatedType()
   {
      return TYPE;
   }

   @Override
   protected void dispatch(Handler handler)
   {
      handler.onAceAfterCommandExecuted(this);
   }

   public static final Type<Handler> TYPE = new Type<Handler>();
}
