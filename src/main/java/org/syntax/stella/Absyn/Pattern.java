// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public abstract class Pattern implements java.io.Serializable {
  public abstract <R,A> R accept(Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(PatternVariant p, A arg);
    public R visit(PatternTuple p, A arg);
    public R visit(PatternRecord p, A arg);
    public R visit(PatternList p, A arg);
    public R visit(PatternCons p, A arg);
    public R visit(PatternFalse p, A arg);
    public R visit(PatternTrue p, A arg);
    public R visit(PatternInt p, A arg);
    public R visit(PatternSucc p, A arg);
    public R visit(PatternVar p, A arg);

  }

}
