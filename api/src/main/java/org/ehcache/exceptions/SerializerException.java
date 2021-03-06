/*
 * Copyright Terracotta, Inc.
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

package org.ehcache.exceptions;

/**
 * Exception thrown by a {@link org.ehcache.Cache} when a store cannot serialize or deserialize a value.
 * @author Ludovic Orban
 */
public class SerializerException extends RuntimeException {

  public SerializerException() {
    super();
  }

  public SerializerException(final String message) {
    super(message);
  }

  public SerializerException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public SerializerException(final Throwable cause) {
    super(cause);
  }

}
