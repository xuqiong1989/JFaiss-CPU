/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class ZnSphereSearch {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ZnSphereSearch(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZnSphereSearch obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_ZnSphereSearch(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDimS(int value) {
    swigfaissJNI.ZnSphereSearch_dimS_set(swigCPtr, this, value);
  }

  public int getDimS() {
    return swigfaissJNI.ZnSphereSearch_dimS_get(swigCPtr, this);
  }

  public void setR2(int value) {
    swigfaissJNI.ZnSphereSearch_r2_set(swigCPtr, this, value);
  }

  public int getR2() {
    return swigfaissJNI.ZnSphereSearch_r2_get(swigCPtr, this);
  }

  public void setNatom(int value) {
    swigfaissJNI.ZnSphereSearch_natom_set(swigCPtr, this, value);
  }

  public int getNatom() {
    return swigfaissJNI.ZnSphereSearch_natom_get(swigCPtr, this);
  }

  public void setVoc(FloatVector value) {
    swigfaissJNI.ZnSphereSearch_voc_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getVoc() {
    long cPtr = swigfaissJNI.ZnSphereSearch_voc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public ZnSphereSearch(int dim, int r2) {
    this(swigfaissJNI.new_ZnSphereSearch(dim, r2), true);
  }

  public float search(SWIGTYPE_p_float x, SWIGTYPE_p_float c) {
    return swigfaissJNI.ZnSphereSearch_search__SWIG_0(
        swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(c));
  }

  public float search(
      SWIGTYPE_p_float x,
      SWIGTYPE_p_float c,
      SWIGTYPE_p_float tmp,
      SWIGTYPE_p_int tmp_int,
      SWIGTYPE_p_int ibest_out) {
    return swigfaissJNI.ZnSphereSearch_search__SWIG_1(
        swigCPtr,
        this,
        SWIGTYPE_p_float.getCPtr(x),
        SWIGTYPE_p_float.getCPtr(c),
        SWIGTYPE_p_float.getCPtr(tmp),
        SWIGTYPE_p_int.getCPtr(tmp_int),
        SWIGTYPE_p_int.getCPtr(ibest_out));
  }

  public float search(
      SWIGTYPE_p_float x, SWIGTYPE_p_float c, SWIGTYPE_p_float tmp, SWIGTYPE_p_int tmp_int) {
    return swigfaissJNI.ZnSphereSearch_search__SWIG_2(
        swigCPtr,
        this,
        SWIGTYPE_p_float.getCPtr(x),
        SWIGTYPE_p_float.getCPtr(c),
        SWIGTYPE_p_float.getCPtr(tmp),
        SWIGTYPE_p_int.getCPtr(tmp_int));
  }

  public void search_multi(
      int n, SWIGTYPE_p_float x, SWIGTYPE_p_float c_out, SWIGTYPE_p_float dp_out) {
    swigfaissJNI.ZnSphereSearch_search_multi(
        swigCPtr,
        this,
        n,
        SWIGTYPE_p_float.getCPtr(x),
        SWIGTYPE_p_float.getCPtr(c_out),
        SWIGTYPE_p_float.getCPtr(dp_out));
  }
}
