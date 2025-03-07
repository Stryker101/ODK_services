/*
 * Copyright (C) 2016 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opendatakit.services.sync.service.exceptions;

import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;

public class ServerDoesNotRecognizeAppNameException extends HttpClientWebException {

  private static final long serialVersionUID = 1L;

  public ServerDoesNotRecognizeAppNameException(String message, Exception e,
                                                HttpUriRequestBase request, CloseableHttpResponse response) {
    super(message, e, request, response);
  }

  public ServerDoesNotRecognizeAppNameException(String message,
                                                HttpUriRequestBase request, CloseableHttpResponse response) {
    super(message, request, response);
  }

}
