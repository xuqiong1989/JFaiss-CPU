/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class ThreadedIndexBaseBinary extends IndexBinary {
  private transient long swigCPtr;

  protected ThreadedIndexBaseBinary(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.ThreadedIndexBaseBinary_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ThreadedIndexBaseBinary obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_ThreadedIndexBaseBinary(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void addIndex(IndexBinary index) {
    swigfaissJNI.ThreadedIndexBaseBinary_addIndex(
        swigCPtr, this, IndexBinary.getCPtr(index), index);
  }

  public void removeIndex(IndexBinary index) {
    swigfaissJNI.ThreadedIndexBaseBinary_removeIndex(
        swigCPtr, this, IndexBinary.getCPtr(index), index);
  }

  public void runOnIndex(SWIGTYPE_p_std__functionT_void_fint_faiss__IndexBinary_pF_t f) {
    swigfaissJNI.ThreadedIndexBaseBinary_runOnIndex__SWIG_0(
        swigCPtr, this, SWIGTYPE_p_std__functionT_void_fint_faiss__IndexBinary_pF_t.getCPtr(f));
  }

  public void runOnIndex(SWIGTYPE_p_std__functionT_void_fint_faiss__IndexBinary_const_pF_t f) {
    swigfaissJNI.ThreadedIndexBaseBinary_runOnIndex__SWIG_1(
        swigCPtr,
        this,
        SWIGTYPE_p_std__functionT_void_fint_faiss__IndexBinary_const_pF_t.getCPtr(f));
  }

  public void reset() {
    swigfaissJNI.ThreadedIndexBaseBinary_reset(swigCPtr, this);
  }

  public int count() {
    return swigfaissJNI.ThreadedIndexBaseBinary_count(swigCPtr, this);
  }

  public IndexBinary at(int i) {
    long cPtr = swigfaissJNI.ThreadedIndexBaseBinary_at__SWIG_0(swigCPtr, this, i);
    return (cPtr == 0) ? null : new IndexBinary(cPtr, false);
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.ThreadedIndexBaseBinary_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.ThreadedIndexBaseBinary_own_fields_get(swigCPtr, this);
  }
}
