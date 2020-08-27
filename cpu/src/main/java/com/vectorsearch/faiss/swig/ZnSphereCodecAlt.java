/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class ZnSphereCodecAlt extends ZnSphereCodec {
  private transient long swigCPtr;

  protected ZnSphereCodecAlt(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.ZnSphereCodecAlt_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZnSphereCodecAlt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_ZnSphereCodecAlt(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setUse_rec(boolean value) {
    swigfaissJNI.ZnSphereCodecAlt_use_rec_set(swigCPtr, this, value);
  }

  public boolean getUse_rec() {
    return swigfaissJNI.ZnSphereCodecAlt_use_rec_get(swigCPtr, this);
  }

  public void setZnc_rec(ZnSphereCodecRec value) {
    swigfaissJNI.ZnSphereCodecAlt_znc_rec_set(
        swigCPtr, this, ZnSphereCodecRec.getCPtr(value), value);
  }

  public ZnSphereCodecRec getZnc_rec() {
    long cPtr = swigfaissJNI.ZnSphereCodecAlt_znc_rec_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ZnSphereCodecRec(cPtr, false);
  }

  public ZnSphereCodecAlt(int dim, int r2) {
    this(swigfaissJNI.new_ZnSphereCodecAlt(dim, r2), true);
  }

  public long encode(SWIGTYPE_p_float x) {
    return swigfaissJNI.ZnSphereCodecAlt_encode(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x));
  }

  public void decode(long code, SWIGTYPE_p_float c) {
    swigfaissJNI.ZnSphereCodecAlt_decode(swigCPtr, this, code, SWIGTYPE_p_float.getCPtr(c));
  }
}
