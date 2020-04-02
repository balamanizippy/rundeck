/*
 * Copyright 2020 Rundeck, Inc. (http://rundeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rundeck.app.gui;

public interface UmdModule {
    /**
     * The name of the Umd module.
     * @return
     */
    String getModuleName();

    /**
     * The path from which to load the Umd module using the <asset:javascript /> tag
     * @return
     */
    String getAssetPath();

    /**
     * The url from which to load the stylesheet associated with the module using the <asset:stylesheet /> tag
     * @return null if no css
     */
    default String getCssAssetPath() { return null; };

    /**
     * If this UMD module contains vue components that need to be registered with the global Vue object
     * set this to true
     * @return
     */
    default boolean hasVueComponents() {return false; };

    /**
     * If the UMD module has an initializer method that should be invoked after the page loads
     * specify it here.
     */
    default String getInitMethod() { return null; }
}