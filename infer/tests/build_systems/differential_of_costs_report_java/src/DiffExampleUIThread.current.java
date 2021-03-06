/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
 
import android.support.annotation.UiThread;

// This class has the following costs:
// 3 constant, 1 linear
// constructor: constant
// f1: constant
// f2: linear
// f3: constant

public class DiffExampleUIThread {

  @UiThread
  public void f1(int x) {
    x++;
  }


  @UiThread
  public void f2(int x) {
    for (int i = 0; i < x; i++) {}
  } 


  @UiThread
  public void f3(int x) {
   f1(x);
}

}
