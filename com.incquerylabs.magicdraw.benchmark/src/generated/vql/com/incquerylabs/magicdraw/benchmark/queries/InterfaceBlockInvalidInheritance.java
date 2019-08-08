/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.InterfaceBlock;
import util.GeneralizedClassifier;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern interfaceBlockInvalidInheritance(interfaceBlock : Class) {
 *         	find sysml.InterfaceBlock(interfaceBlock, _);
 *         	find util.generalizedClassifier(interfaceBlock, general);
 *         	neg find sysml.InterfaceBlock(general, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class InterfaceBlockInvalidInheritance extends BaseGeneratedEMFQuerySpecification<InterfaceBlockInvalidInheritance.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.interfaceBlockInvalidInheritance pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fInterfaceBlock;
    
    private static List<String> parameterNames = makeImmutableList("interfaceBlock");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      this.fInterfaceBlock = pInterfaceBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("interfaceBlock".equals(parameterName)) return this.fInterfaceBlock;
      return null;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getInterfaceBlock() {
      return this.fInterfaceBlock;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("interfaceBlock".equals(parameterName) ) {
          this.fInterfaceBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setInterfaceBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInterfaceBlock = pInterfaceBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.interfaceBlockInvalidInheritance";
    }
    
    @Override
    public List<String> parameterNames() {
      return InterfaceBlockInvalidInheritance.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInterfaceBlock};
    }
    
    @Override
    public InterfaceBlockInvalidInheritance.Match toImmutable() {
      return isMutable() ? newMatch(fInterfaceBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"interfaceBlock\"=" + prettyPrintValue(fInterfaceBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fInterfaceBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof InterfaceBlockInvalidInheritance.Match)) {
          InterfaceBlockInvalidInheritance.Match other = (InterfaceBlockInvalidInheritance.Match) obj;
          return Objects.equals(fInterfaceBlock, other.fInterfaceBlock);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public InterfaceBlockInvalidInheritance specification() {
      return InterfaceBlockInvalidInheritance.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static InterfaceBlockInvalidInheritance.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static InterfaceBlockInvalidInheritance.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return new Mutable(pInterfaceBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static InterfaceBlockInvalidInheritance.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return new Immutable(pInterfaceBlock);
    }
    
    private static final class Mutable extends InterfaceBlockInvalidInheritance.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
        super(pInterfaceBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends InterfaceBlockInvalidInheritance.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
        super(pInterfaceBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.interfaceBlockInvalidInheritance pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern interfaceBlockInvalidInheritance(interfaceBlock : Class) {
   * 	find sysml.InterfaceBlock(interfaceBlock, _);
   * 	find util.generalizedClassifier(interfaceBlock, general);
   * 	neg find sysml.InterfaceBlock(general, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see InterfaceBlockInvalidInheritance
   * 
   */
  public static class Matcher extends BaseMatcher<InterfaceBlockInvalidInheritance.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static InterfaceBlockInvalidInheritance.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static InterfaceBlockInvalidInheritance.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_INTERFACEBLOCK = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InterfaceBlockInvalidInheritance.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<InterfaceBlockInvalidInheritance.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return rawStreamAllMatches(new Object[]{pInterfaceBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<InterfaceBlockInvalidInheritance.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return rawStreamAllMatches(new Object[]{pInterfaceBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<InterfaceBlockInvalidInheritance.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pInterfaceBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return rawHasMatch(new Object[]{pInterfaceBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return rawCountMatches(new Object[]{pInterfaceBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock, final Consumer<? super InterfaceBlockInvalidInheritance.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInterfaceBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInterfaceBlock the fixed value of pattern parameter interfaceBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public InterfaceBlockInvalidInheritance.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pInterfaceBlock) {
      return InterfaceBlockInvalidInheritance.Match.newMatch(pInterfaceBlock);
    }
    
    /**
     * Retrieve the set of values that occur in matches for interfaceBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfinterfaceBlock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_INTERFACEBLOCK, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for interfaceBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfinterfaceBlock() {
      return rawStreamAllValuesOfinterfaceBlock(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for interfaceBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfinterfaceBlock() {
      return rawStreamAllValuesOfinterfaceBlock(emptyArray());
    }
    
    @Override
    protected InterfaceBlockInvalidInheritance.Match tupleToMatch(final Tuple t) {
      try {
          return InterfaceBlockInvalidInheritance.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_INTERFACEBLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InterfaceBlockInvalidInheritance.Match arrayToMatch(final Object[] match) {
      try {
          return InterfaceBlockInvalidInheritance.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_INTERFACEBLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InterfaceBlockInvalidInheritance.Match arrayToMatchMutable(final Object[] match) {
      try {
          return InterfaceBlockInvalidInheritance.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_INTERFACEBLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<InterfaceBlockInvalidInheritance.Matcher> querySpecification() {
      return InterfaceBlockInvalidInheritance.instance();
    }
  }
  
  private InterfaceBlockInvalidInheritance() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static InterfaceBlockInvalidInheritance instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected InterfaceBlockInvalidInheritance.Matcher instantiate(final ViatraQueryEngine engine) {
    return InterfaceBlockInvalidInheritance.Matcher.on(engine);
  }
  
  @Override
  public InterfaceBlockInvalidInheritance.Matcher instantiate() {
    return InterfaceBlockInvalidInheritance.Matcher.create();
  }
  
  @Override
  public InterfaceBlockInvalidInheritance.Match newEmptyMatch() {
    return InterfaceBlockInvalidInheritance.Match.newEmptyMatch();
  }
  
  @Override
  public InterfaceBlockInvalidInheritance.Match newMatch(final Object... parameters) {
    return InterfaceBlockInvalidInheritance.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.InterfaceBlockInvalidInheritance (visibility: PUBLIC, simpleName: InterfaceBlockInvalidInheritance, identifier: com.incquerylabs.magicdraw.benchmark.queries.InterfaceBlockInvalidInheritance, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.InterfaceBlockInvalidInheritance (visibility: PUBLIC, simpleName: InterfaceBlockInvalidInheritance, identifier: com.incquerylabs.magicdraw.benchmark.queries.InterfaceBlockInvalidInheritance, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final InterfaceBlockInvalidInheritance INSTANCE = new InterfaceBlockInvalidInheritance();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final InterfaceBlockInvalidInheritance.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_interfaceBlock = new PParameter("interfaceBlock", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_interfaceBlock);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.interfaceBlockInvalidInheritance";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("interfaceBlock");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_interfaceBlock = body.getOrCreateVariableByName("interfaceBlock");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_general = body.getOrCreateVariableByName("general");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_interfaceBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_interfaceBlock, parameter_interfaceBlock)
          ));
          // 	find sysml.InterfaceBlock(interfaceBlock, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_interfaceBlock, var___0_), InterfaceBlock.instance().getInternalQueryRepresentation());
          // 	find util.generalizedClassifier(interfaceBlock, general)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_interfaceBlock, var_general), GeneralizedClassifier.instance().getInternalQueryRepresentation());
          // 	neg find sysml.InterfaceBlock(general, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_general, var___1_), InterfaceBlock.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
