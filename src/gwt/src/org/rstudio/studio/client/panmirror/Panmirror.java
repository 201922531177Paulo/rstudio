/*
 * Panmirror.java
 *
 * Copyright (C) 2009-20 by RStudio, Inc.
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
package org.rstudio.studio.client.panmirror;

import org.rstudio.core.client.ExternalJavaScriptLoader;
import org.rstudio.studio.client.panmirror.command.PanmirrorCommands;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;;



@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Panmirror 
{

   @JsOverlay
   public static void load(ExternalJavaScriptLoader.Callback onLoaded) {    
      panmirrorLoader_.addCallback(onLoaded);
   }
   
   public static PanmirrorEvents Events;
   public static PanmirrorCommands Commands;
   
   
   
   @JsOverlay
   private static final ExternalJavaScriptLoader panmirrorLoader_ =
     new ExternalJavaScriptLoader("js/panmirror/panmirror.js");
   
}