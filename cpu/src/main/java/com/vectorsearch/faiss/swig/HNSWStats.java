/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class HNSWStats {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HNSWStats(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HNSWStats obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_HNSWStats(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setN1(long value) {
    swigfaissJNI.HNSWStats_n1_set(swigCPtr, this, value);
  }

  public long getN1() {
    return swigfaissJNI.HNSWStats_n1_get(swigCPtr, this);
  }

  public void setN2(long value) {
    swigfaissJNI.HNSWStats_n2_set(swigCPtr, this, value);
  }

  public long getN2() {
    return swigfaissJNI.HNSWStats_n2_get(swigCPtr, this);
  }

  public void setN3(long value) {
    swigfaissJNI.HNSWStats_n3_set(swigCPtr, this, value);
  }

  public long getN3() {
    return swigfaissJNI.HNSWStats_n3_get(swigCPtr, this);
  }

  public void setNdis(long value) {
    swigfaissJNI.HNSWStats_ndis_set(swigCPtr, this, value);
  }

  public long getNdis() {
    return swigfaissJNI.HNSWStats_ndis_get(swigCPtr, this);
  }

  public void setNreorder(long value) {
    swigfaissJNI.HNSWStats_nreorder_set(swigCPtr, this, value);
  }

  public long getNreorder() {
    return swigfaissJNI.HNSWStats_nreorder_get(swigCPtr, this);
  }

  public void setView(boolean value) {
    swigfaissJNI.HNSWStats_view_set(swigCPtr, this, value);
  }

  public boolean getView() {
    return swigfaissJNI.HNSWStats_view_get(swigCPtr, this);
  }

  public HNSWStats() {
    this(swigfaissJNI.new_HNSWStats(), true);
  }

  public void reset() {
    swigfaissJNI.HNSWStats_reset(swigCPtr, this);
  }
}
