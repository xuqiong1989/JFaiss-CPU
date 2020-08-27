/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class IndexRefineFlat extends Index {
  private transient long swigCPtr;

  protected IndexRefineFlat(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexRefineFlat_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexRefineFlat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexRefineFlat(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setRefine_index(IndexFlat value) {
    swigfaissJNI.IndexRefineFlat_refine_index_set(swigCPtr, this, IndexFlat.getCPtr(value), value);
  }

  public IndexFlat getRefine_index() {
    long cPtr = swigfaissJNI.IndexRefineFlat_refine_index_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IndexFlat(cPtr, false);
  }

  public void setBase_index(Index value) {
    swigfaissJNI.IndexRefineFlat_base_index_set(swigCPtr, this, Index.getCPtr(value), value);
  }

  public Index getBase_index() {
    long cPtr = swigfaissJNI.IndexRefineFlat_base_index_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Index(cPtr, false);
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.IndexRefineFlat_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.IndexRefineFlat_own_fields_get(swigCPtr, this);
  }

  public void setK_factor(float value) {
    swigfaissJNI.IndexRefineFlat_k_factor_set(swigCPtr, this, value);
  }

  public float getK_factor() {
    return swigfaissJNI.IndexRefineFlat_k_factor_get(swigCPtr, this);
  }

  public IndexRefineFlat(Index base_index) {
    this(swigfaissJNI.new_IndexRefineFlat__SWIG_0(Index.getCPtr(base_index), base_index), true);
  }

  public IndexRefineFlat() {
    this(swigfaissJNI.new_IndexRefineFlat__SWIG_1(), true);
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexRefineFlat_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexRefineFlat_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void reset() {
    swigfaissJNI.IndexRefineFlat_reset(swigCPtr, this);
  }

  public void search(
      int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexRefineFlat_search(
        swigCPtr,
        this,
        n,
        SWIGTYPE_p_float.getCPtr(x),
        k,
        SWIGTYPE_p_float.getCPtr(distances),
        SWIGTYPE_p_long.getCPtr(labels));
  }
}
