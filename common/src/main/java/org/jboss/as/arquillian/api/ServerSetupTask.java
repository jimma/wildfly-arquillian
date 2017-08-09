/*
 * Copyright 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.as.arquillian.api;

import org.jboss.as.arquillian.container.ManagementClient;

/**
 *
 * A task which is run before deployment that allows the client to customize the server config.
 *
 * @author Stuart Douglas
 */
public interface ServerSetupTask {

    void setup(ManagementClient managementClient, String containerId) throws Exception;

    void tearDown(ManagementClient managementClient, String containerId) throws Exception;
}
