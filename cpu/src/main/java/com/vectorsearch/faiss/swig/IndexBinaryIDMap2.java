/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class IndexBinaryIDMap2 extends IndexBinaryIDMap {
  private transient long swigCPtr;

  protected IndexBinaryIDMap2(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexBinaryIDMap2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexBinaryIDMap2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexBinaryIDMap2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setRev_map(SWIGTYPE_p_std__unordered_mapT_long_long_t value) {
    swigfaissJNI.IndexBinaryIDMap2_rev_map_set(
        swigCPtr, this, SWIGTYPE_p_std__unordered_mapT_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__unordered_mapT_long_long_t getRev_map() {
    return new SWIGTYPE_p_std__unordered_mapT_long_long_t(
        swigfaissJNI.IndexBinaryIDMap2_rev_map_get(swigCPtr, this), true);
  }

  public IndexBinaryIDMap2(IndexBinary index) {
    this(swigfaissJNI.new_IndexBinaryIDMap2__SWIG_0(IndexBinary.getCPtr(index), index), true);
  }

  public void construct_rev_map() {
    swigfaissJNI.IndexBinaryIDMap2_construct_rev_map(swigCPtr, this);
  }

  public void add_with_ids(int n, SWIGTYPE_p_unsigned_char x, SWIGTYPE_p_long xids) {
    swigfaissJNI.IndexBinaryIDMap2_add_with_ids(
        swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids));
  }

  public long remove_ids(IDSelector sel) {
    return swigfaissJNI.IndexBinaryIDMap2_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel);
  }

  public void reconstruct(int key, SWIGTYPE_p_unsigned_char recons) {
    swigfaissJNI.IndexBinaryIDMap2_reconstruct(
        swigCPtr, this, key, SWIGTYPE_p_unsigned_char.getCPtr(recons));
  }

  public IndexBinaryIDMap2() {
    this(swigfaissJNI.new_IndexBinaryIDMap2__SWIG_1(), true);
  }
}
