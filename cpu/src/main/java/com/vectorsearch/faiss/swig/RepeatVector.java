/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class RepeatVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RepeatVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RepeatVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_RepeatVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RepeatVector() {
    this(swigfaissJNI.new_RepeatVector(), true);
  }

  public void push_back(Repeat arg0) {
    swigfaissJNI.RepeatVector_push_back(swigCPtr, this, Repeat.getCPtr(arg0), arg0);
  }

  public void clear() {
    swigfaissJNI.RepeatVector_clear(swigCPtr, this);
  }

  public Repeat data() {
    long cPtr = swigfaissJNI.RepeatVector_data(swigCPtr, this);
    return (cPtr == 0) ? null : new Repeat(cPtr, false);
  }

  public long size() {
    return swigfaissJNI.RepeatVector_size(swigCPtr, this);
  }

  public Repeat at(long n) {
    return new Repeat(swigfaissJNI.RepeatVector_at(swigCPtr, this, n), true);
  }

  public void resize(long n) {
    swigfaissJNI.RepeatVector_resize(swigCPtr, this, n);
  }

  public void swap(RepeatVector other) {
    swigfaissJNI.RepeatVector_swap(swigCPtr, this, RepeatVector.getCPtr(other), other);
  }
}
