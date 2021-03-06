/*
 * Copyright (c) Microsoft Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.playwright;

import java.util.*;

/**
 * When browser context is created with the {@code videosPath} option, each page has a video object associated with it.
 * <p>
 */
public interface Video {
  /**
   * Returns the file system path this video will be recorded to. The video is guaranteed to be written to the filesystem
   * <p>
   * upon closing the browser context.
   */
  String path();
}

