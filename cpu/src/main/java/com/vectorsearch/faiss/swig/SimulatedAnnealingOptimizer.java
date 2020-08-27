/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class SimulatedAnnealingOptimizer extends SimulatedAnnealingParameters {
  private transient long swigCPtr;

  protected SimulatedAnnealingOptimizer(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.SimulatedAnnealingOptimizer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimulatedAnnealingOptimizer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_SimulatedAnnealingOptimizer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setObj(PermutationObjective value) {
    swigfaissJNI.SimulatedAnnealingOptimizer_obj_set(
        swigCPtr, this, PermutationObjective.getCPtr(value), value);
  }

  public PermutationObjective getObj() {
    long cPtr = swigfaissJNI.SimulatedAnnealingOptimizer_obj_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PermutationObjective(cPtr, false);
  }

  public void setN(int value) {
    swigfaissJNI.SimulatedAnnealingOptimizer_n_set(swigCPtr, this, value);
  }

  public int getN() {
    return swigfaissJNI.SimulatedAnnealingOptimizer_n_get(swigCPtr, this);
  }

  public void setLogfile(SWIGTYPE_p_FILE value) {
    swigfaissJNI.SimulatedAnnealingOptimizer_logfile_set(
        swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(value));
  }

  public SWIGTYPE_p_FILE getLogfile() {
    long cPtr = swigfaissJNI.SimulatedAnnealingOptimizer_logfile_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public SimulatedAnnealingOptimizer(PermutationObjective obj, SimulatedAnnealingParameters p) {
    this(
        swigfaissJNI.new_SimulatedAnnealingOptimizer(
            PermutationObjective.getCPtr(obj), obj, SimulatedAnnealingParameters.getCPtr(p), p),
        true);
  }

  public void setRnd(RandomGenerator value) {
    swigfaissJNI.SimulatedAnnealingOptimizer_rnd_set(
        swigCPtr, this, RandomGenerator.getCPtr(value), value);
  }

  public RandomGenerator getRnd() {
    long cPtr = swigfaissJNI.SimulatedAnnealingOptimizer_rnd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RandomGenerator(cPtr, false);
  }

  public void setInit_cost(double value) {
    swigfaissJNI.SimulatedAnnealingOptimizer_init_cost_set(swigCPtr, this, value);
  }

  public double getInit_cost() {
    return swigfaissJNI.SimulatedAnnealingOptimizer_init_cost_get(swigCPtr, this);
  }

  public double optimize(SWIGTYPE_p_int perm) {
    return swigfaissJNI.SimulatedAnnealingOptimizer_optimize(
        swigCPtr, this, SWIGTYPE_p_int.getCPtr(perm));
  }

  public double run_optimization(SWIGTYPE_p_int best_perm) {
    return swigfaissJNI.SimulatedAnnealingOptimizer_run_optimization(
        swigCPtr, this, SWIGTYPE_p_int.getCPtr(best_perm));
  }
}
