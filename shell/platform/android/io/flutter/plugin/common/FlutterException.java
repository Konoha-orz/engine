// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugin.common;

import io.flutter.BuildConfig;

/**
 * Thrown to indicate that a Flutter method invocation failed on the Flutter side.
 */
public class FlutterException extends RuntimeException {
  public final String code;
  public final Object details;

  FlutterException(String code, String message, Object details) {
    super(message);
    if (BuildConfig.DEBUG && code == null) {
      throw new AssertionError("Parameter code must not be null.");
    }
    this.code = code;
    this.details = details;
  }
}
