/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.spring.springConfigDsl.AbstractArtefact;
import org.xtext.spring.springConfigDsl.AbstractKeyValue;
import org.xtext.spring.springConfigDsl.Advise;
import org.xtext.spring.springConfigDsl.AfterAdvise;
import org.xtext.spring.springConfigDsl.AfterReturning;
import org.xtext.spring.springConfigDsl.AfterThowing;
import org.xtext.spring.springConfigDsl.Alias;
import org.xtext.spring.springConfigDsl.AnnotationConfig;
import org.xtext.spring.springConfigDsl.AopAdvisor;
import org.xtext.spring.springConfigDsl.AopAspect;
import org.xtext.spring.springConfigDsl.AopAspectJAutoproxy;
import org.xtext.spring.springConfigDsl.AopConfig;
import org.xtext.spring.springConfigDsl.AopDefaultImplInterface;
import org.xtext.spring.springConfigDsl.AopDelegateImplRef;
import org.xtext.spring.springConfigDsl.AopInclude;
import org.xtext.spring.springConfigDsl.AopPointcut;
import org.xtext.spring.springConfigDsl.AopScopedProxy;
import org.xtext.spring.springConfigDsl.AroundAdvise;
import org.xtext.spring.springConfigDsl.Aspect;
import org.xtext.spring.springConfigDsl.Attribute;
import org.xtext.spring.springConfigDsl.AutoWiredType;
import org.xtext.spring.springConfigDsl.BeforeAdvise;
import org.xtext.spring.springConfigDsl.ClassOrFactory;
import org.xtext.spring.springConfigDsl.Collection;
import org.xtext.spring.springConfigDsl.Component;
import org.xtext.spring.springConfigDsl.ComponentScan;
import org.xtext.spring.springConfigDsl.Configuration;
import org.xtext.spring.springConfigDsl.Context;
import org.xtext.spring.springConfigDsl.CreationMethod;
import org.xtext.spring.springConfigDsl.DataString;
import org.xtext.spring.springConfigDsl.DeclareParents;
import org.xtext.spring.springConfigDsl.DefaultableBoolean;
import org.xtext.spring.springConfigDsl.EnumIsolation;
import org.xtext.spring.springConfigDsl.EnumScopedProxy;
import org.xtext.spring.springConfigDsl.EnumTypeFilter;
import org.xtext.spring.springConfigDsl.ExcludeFilter;
import org.xtext.spring.springConfigDsl.Factory;
import org.xtext.spring.springConfigDsl.Feature;
import org.xtext.spring.springConfigDsl.Http;
import org.xtext.spring.springConfigDsl.Import;
import org.xtext.spring.springConfigDsl.IncludeFilter;
import org.xtext.spring.springConfigDsl.Interface;
import org.xtext.spring.springConfigDsl.Key;
import org.xtext.spring.springConfigDsl.LoadTimeWeaver;
import org.xtext.spring.springConfigDsl.LookupMethod;
import org.xtext.spring.springConfigDsl.MVC;
import org.xtext.spring.springConfigDsl.Map;
import org.xtext.spring.springConfigDsl.MapEntry;
import org.xtext.spring.springConfigDsl.MbeanExport;
import org.xtext.spring.springConfigDsl.MbeanRegistrationEnum;
import org.xtext.spring.springConfigDsl.MbeanServer;
import org.xtext.spring.springConfigDsl.Meta;
import org.xtext.spring.springConfigDsl.Prop;
import org.xtext.spring.springConfigDsl.PropagationEnum;
import org.xtext.spring.springConfigDsl.PropertyFile;
import org.xtext.spring.springConfigDsl.PropertyHolder;
import org.xtext.spring.springConfigDsl.PropertyOverride;
import org.xtext.spring.springConfigDsl.PropertyPlaceholder;
import org.xtext.spring.springConfigDsl.Props;
import org.xtext.spring.springConfigDsl.Qualifier;
import org.xtext.spring.springConfigDsl.QualifierAttribute;
import org.xtext.spring.springConfigDsl.Reference;
import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.SpringConfigured;
import org.xtext.spring.springConfigDsl.SpringProject;
import org.xtext.spring.springConfigDsl.SpringSecurity;
import org.xtext.spring.springConfigDsl.TxAdvise;
import org.xtext.spring.springConfigDsl.TxAnnotation;
import org.xtext.spring.springConfigDsl.TxAttribute;
import org.xtext.spring.springConfigDsl.TxJtaTransactionManager;
import org.xtext.spring.springConfigDsl.TxMethod;
import org.xtext.spring.springConfigDsl.UtilConstant;
import org.xtext.spring.springConfigDsl.UtilList;
import org.xtext.spring.springConfigDsl.UtilMap;
import org.xtext.spring.springConfigDsl.UtilProperties;
import org.xtext.spring.springConfigDsl.UtilPropertyPath;
import org.xtext.spring.springConfigDsl.UtilSet;
import org.xtext.spring.springConfigDsl.sBoolean;
import org.xtext.spring.springConfigDsl.sList;
import org.xtext.spring.springConfigDsl.sSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpringConfigDslFactoryImpl extends EFactoryImpl implements SpringConfigDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpringConfigDslFactory init()
  {
    try
    {
      SpringConfigDslFactory theSpringConfigDslFactory = (SpringConfigDslFactory)EPackage.Registry.INSTANCE.getEFactory(SpringConfigDslPackage.eNS_URI);
      if (theSpringConfigDslFactory != null)
      {
        return theSpringConfigDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpringConfigDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpringConfigDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpringConfigDslPackage.SPRING_PROJECT: return createSpringProject();
      case SpringConfigDslPackage.ABSTRACT_KEY_VALUE: return createAbstractKeyValue();
      case SpringConfigDslPackage.ABSTRACT_ARTEFACT: return createAbstractArtefact();
      case SpringConfigDslPackage.COLLECTION: return createCollection();
      case SpringConfigDslPackage.CONFIGURATION: return createConfiguration();
      case SpringConfigDslPackage.MVC: return createMVC();
      case SpringConfigDslPackage.HTTP: return createHttp();
      case SpringConfigDslPackage.SPRING_SECURITY: return createSpringSecurity();
      case SpringConfigDslPackage.ALIAS: return createAlias();
      case SpringConfigDslPackage.IMPORT: return createImport();
      case SpringConfigDslPackage.CONTEXT: return createContext();
      case SpringConfigDslPackage.ANNOTATION_CONFIG: return createAnnotationConfig();
      case SpringConfigDslPackage.COMPONENT_SCAN: return createComponentScan();
      case SpringConfigDslPackage.INCLUDE_FILTER: return createIncludeFilter();
      case SpringConfigDslPackage.EXCLUDE_FILTER: return createExcludeFilter();
      case SpringConfigDslPackage.LOAD_TIME_WEAVER: return createLoadTimeWeaver();
      case SpringConfigDslPackage.MBEAN_EXPORT: return createMbeanExport();
      case SpringConfigDslPackage.MBEAN_SERVER: return createMbeanServer();
      case SpringConfigDslPackage.PROPERTY_HOLDER: return createPropertyHolder();
      case SpringConfigDslPackage.PROPERTY_PLACEHOLDER: return createPropertyPlaceholder();
      case SpringConfigDslPackage.PROPERTY_OVERRIDE: return createPropertyOverride();
      case SpringConfigDslPackage.SPRING_CONFIGURED: return createSpringConfigured();
      case SpringConfigDslPackage.ASPECT: return createAspect();
      case SpringConfigDslPackage.AOP_ASPECT_JAUTOPROXY: return createAopAspectJAutoproxy();
      case SpringConfigDslPackage.AOP_INCLUDE: return createAopInclude();
      case SpringConfigDslPackage.AOP_CONFIG: return createAopConfig();
      case SpringConfigDslPackage.AOP_POINTCUT: return createAopPointcut();
      case SpringConfigDslPackage.AOP_ADVISOR: return createAopAdvisor();
      case SpringConfigDslPackage.AOP_ASPECT: return createAopAspect();
      case SpringConfigDslPackage.DECLARE_PARENTS: return createDeclareParents();
      case SpringConfigDslPackage.INTERFACE: return createInterface();
      case SpringConfigDslPackage.AOP_DEFAULT_IMPL_INTERFACE: return createAopDefaultImplInterface();
      case SpringConfigDslPackage.AOP_DELEGATE_IMPL_REF: return createAopDelegateImplRef();
      case SpringConfigDslPackage.ADVISE: return createAdvise();
      case SpringConfigDslPackage.BEFORE_ADVISE: return createBeforeAdvise();
      case SpringConfigDslPackage.AFTER_ADVISE: return createAfterAdvise();
      case SpringConfigDslPackage.AROUND_ADVISE: return createAroundAdvise();
      case SpringConfigDslPackage.AFTER_RETURNING: return createAfterReturning();
      case SpringConfigDslPackage.AFTER_THOWING: return createAfterThowing();
      case SpringConfigDslPackage.TX_ANNOTATION: return createTxAnnotation();
      case SpringConfigDslPackage.TX_ADVISE: return createTxAdvise();
      case SpringConfigDslPackage.TX_ATTRIBUTE: return createTxAttribute();
      case SpringConfigDslPackage.TX_METHOD: return createTxMethod();
      case SpringConfigDslPackage.TX_JTA_TRANSACTION_MANAGER: return createTxJtaTransactionManager();
      case SpringConfigDslPackage.COMPONENT: return createComponent();
      case SpringConfigDslPackage.CREATION_METHOD: return createCreationMethod();
      case SpringConfigDslPackage.CLASS_OR_FACTORY: return createClassOrFactory();
      case SpringConfigDslPackage.FACTORY: return createFactory();
      case SpringConfigDslPackage.CLASS: return createClass();
      case SpringConfigDslPackage.AOP_SCOPED_PROXY: return createAopScopedProxy();
      case SpringConfigDslPackage.FEATURE: return createFeature();
      case SpringConfigDslPackage.ATTRIBUTE: return createAttribute();
      case SpringConfigDslPackage.REFERENCE: return createReference();
      case SpringConfigDslPackage.LOOKUP_METHOD: return createLookupMethod();
      case SpringConfigDslPackage.QUALIFIER: return createQualifier();
      case SpringConfigDslPackage.META: return createMeta();
      case SpringConfigDslPackage.QUALIFIER_ATTRIBUTE: return createQualifierAttribute();
      case SpringConfigDslPackage.SLIST: return createsList();
      case SpringConfigDslPackage.SSET: return createsSet();
      case SpringConfigDslPackage.PROPS: return createProps();
      case SpringConfigDslPackage.PROP: return createProp();
      case SpringConfigDslPackage.MAP: return createMap();
      case SpringConfigDslPackage.MAP_ENTRY: return createMapEntry();
      case SpringConfigDslPackage.KEY: return createKey();
      case SpringConfigDslPackage.UTIL_CONSTANT: return createUtilConstant();
      case SpringConfigDslPackage.UTIL_PROPERTY_PATH: return createUtilPropertyPath();
      case SpringConfigDslPackage.UTIL_PROPERTIES: return createUtilProperties();
      case SpringConfigDslPackage.UTIL_LIST: return createUtilList();
      case SpringConfigDslPackage.UTIL_MAP: return createUtilMap();
      case SpringConfigDslPackage.UTIL_SET: return createUtilSet();
      case SpringConfigDslPackage.PROPERTY_FILE: return createPropertyFile();
      case SpringConfigDslPackage.DATA_STRING: return createDataString();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpringConfigDslPackage.SBOOLEAN:
        return createsBooleanFromString(eDataType, initialValue);
      case SpringConfigDslPackage.DEFAULTABLE_BOOLEAN:
        return createDefaultableBooleanFromString(eDataType, initialValue);
      case SpringConfigDslPackage.AUTO_WIRED_TYPE:
        return createAutoWiredTypeFromString(eDataType, initialValue);
      case SpringConfigDslPackage.ENUM_SCOPED_PROXY:
        return createEnumScopedProxyFromString(eDataType, initialValue);
      case SpringConfigDslPackage.ENUM_TYPE_FILTER:
        return createEnumTypeFilterFromString(eDataType, initialValue);
      case SpringConfigDslPackage.MBEAN_REGISTRATION_ENUM:
        return createMbeanRegistrationEnumFromString(eDataType, initialValue);
      case SpringConfigDslPackage.ENUM_ISOLATION:
        return createEnumIsolationFromString(eDataType, initialValue);
      case SpringConfigDslPackage.PROPAGATION_ENUM:
        return createPropagationEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpringConfigDslPackage.SBOOLEAN:
        return convertsBooleanToString(eDataType, instanceValue);
      case SpringConfigDslPackage.DEFAULTABLE_BOOLEAN:
        return convertDefaultableBooleanToString(eDataType, instanceValue);
      case SpringConfigDslPackage.AUTO_WIRED_TYPE:
        return convertAutoWiredTypeToString(eDataType, instanceValue);
      case SpringConfigDslPackage.ENUM_SCOPED_PROXY:
        return convertEnumScopedProxyToString(eDataType, instanceValue);
      case SpringConfigDslPackage.ENUM_TYPE_FILTER:
        return convertEnumTypeFilterToString(eDataType, instanceValue);
      case SpringConfigDslPackage.MBEAN_REGISTRATION_ENUM:
        return convertMbeanRegistrationEnumToString(eDataType, instanceValue);
      case SpringConfigDslPackage.ENUM_ISOLATION:
        return convertEnumIsolationToString(eDataType, instanceValue);
      case SpringConfigDslPackage.PROPAGATION_ENUM:
        return convertPropagationEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpringProject createSpringProject()
  {
    SpringProjectImpl springProject = new SpringProjectImpl();
    return springProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractKeyValue createAbstractKeyValue()
  {
    AbstractKeyValueImpl abstractKeyValue = new AbstractKeyValueImpl();
    return abstractKeyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractArtefact createAbstractArtefact()
  {
    AbstractArtefactImpl abstractArtefact = new AbstractArtefactImpl();
    return abstractArtefact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MVC createMVC()
  {
    MVCImpl mvc = new MVCImpl();
    return mvc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Http createHttp()
  {
    HttpImpl http = new HttpImpl();
    return http;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpringSecurity createSpringSecurity()
  {
    SpringSecurityImpl springSecurity = new SpringSecurityImpl();
    return springSecurity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias createAlias()
  {
    AliasImpl alias = new AliasImpl();
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationConfig createAnnotationConfig()
  {
    AnnotationConfigImpl annotationConfig = new AnnotationConfigImpl();
    return annotationConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentScan createComponentScan()
  {
    ComponentScanImpl componentScan = new ComponentScanImpl();
    return componentScan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeFilter createIncludeFilter()
  {
    IncludeFilterImpl includeFilter = new IncludeFilterImpl();
    return includeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExcludeFilter createExcludeFilter()
  {
    ExcludeFilterImpl excludeFilter = new ExcludeFilterImpl();
    return excludeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadTimeWeaver createLoadTimeWeaver()
  {
    LoadTimeWeaverImpl loadTimeWeaver = new LoadTimeWeaverImpl();
    return loadTimeWeaver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MbeanExport createMbeanExport()
  {
    MbeanExportImpl mbeanExport = new MbeanExportImpl();
    return mbeanExport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MbeanServer createMbeanServer()
  {
    MbeanServerImpl mbeanServer = new MbeanServerImpl();
    return mbeanServer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyHolder createPropertyHolder()
  {
    PropertyHolderImpl propertyHolder = new PropertyHolderImpl();
    return propertyHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyPlaceholder createPropertyPlaceholder()
  {
    PropertyPlaceholderImpl propertyPlaceholder = new PropertyPlaceholderImpl();
    return propertyPlaceholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyOverride createPropertyOverride()
  {
    PropertyOverrideImpl propertyOverride = new PropertyOverrideImpl();
    return propertyOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpringConfigured createSpringConfigured()
  {
    SpringConfiguredImpl springConfigured = new SpringConfiguredImpl();
    return springConfigured;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aspect createAspect()
  {
    AspectImpl aspect = new AspectImpl();
    return aspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopAspectJAutoproxy createAopAspectJAutoproxy()
  {
    AopAspectJAutoproxyImpl aopAspectJAutoproxy = new AopAspectJAutoproxyImpl();
    return aopAspectJAutoproxy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopInclude createAopInclude()
  {
    AopIncludeImpl aopInclude = new AopIncludeImpl();
    return aopInclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopConfig createAopConfig()
  {
    AopConfigImpl aopConfig = new AopConfigImpl();
    return aopConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopPointcut createAopPointcut()
  {
    AopPointcutImpl aopPointcut = new AopPointcutImpl();
    return aopPointcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopAdvisor createAopAdvisor()
  {
    AopAdvisorImpl aopAdvisor = new AopAdvisorImpl();
    return aopAdvisor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopAspect createAopAspect()
  {
    AopAspectImpl aopAspect = new AopAspectImpl();
    return aopAspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclareParents createDeclareParents()
  {
    DeclareParentsImpl declareParents = new DeclareParentsImpl();
    return declareParents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopDefaultImplInterface createAopDefaultImplInterface()
  {
    AopDefaultImplInterfaceImpl aopDefaultImplInterface = new AopDefaultImplInterfaceImpl();
    return aopDefaultImplInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopDelegateImplRef createAopDelegateImplRef()
  {
    AopDelegateImplRefImpl aopDelegateImplRef = new AopDelegateImplRefImpl();
    return aopDelegateImplRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Advise createAdvise()
  {
    AdviseImpl advise = new AdviseImpl();
    return advise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeforeAdvise createBeforeAdvise()
  {
    BeforeAdviseImpl beforeAdvise = new BeforeAdviseImpl();
    return beforeAdvise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterAdvise createAfterAdvise()
  {
    AfterAdviseImpl afterAdvise = new AfterAdviseImpl();
    return afterAdvise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AroundAdvise createAroundAdvise()
  {
    AroundAdviseImpl aroundAdvise = new AroundAdviseImpl();
    return aroundAdvise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterReturning createAfterReturning()
  {
    AfterReturningImpl afterReturning = new AfterReturningImpl();
    return afterReturning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterThowing createAfterThowing()
  {
    AfterThowingImpl afterThowing = new AfterThowingImpl();
    return afterThowing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxAnnotation createTxAnnotation()
  {
    TxAnnotationImpl txAnnotation = new TxAnnotationImpl();
    return txAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxAdvise createTxAdvise()
  {
    TxAdviseImpl txAdvise = new TxAdviseImpl();
    return txAdvise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxAttribute createTxAttribute()
  {
    TxAttributeImpl txAttribute = new TxAttributeImpl();
    return txAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxMethod createTxMethod()
  {
    TxMethodImpl txMethod = new TxMethodImpl();
    return txMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxJtaTransactionManager createTxJtaTransactionManager()
  {
    TxJtaTransactionManagerImpl txJtaTransactionManager = new TxJtaTransactionManagerImpl();
    return txJtaTransactionManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreationMethod createCreationMethod()
  {
    CreationMethodImpl creationMethod = new CreationMethodImpl();
    return creationMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOrFactory createClassOrFactory()
  {
    ClassOrFactoryImpl classOrFactory = new ClassOrFactoryImpl();
    return classOrFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factory createFactory()
  {
    FactoryImpl factory = new FactoryImpl();
    return factory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.spring.springConfigDsl.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AopScopedProxy createAopScopedProxy()
  {
    AopScopedProxyImpl aopScopedProxy = new AopScopedProxyImpl();
    return aopScopedProxy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupMethod createLookupMethod()
  {
    LookupMethodImpl lookupMethod = new LookupMethodImpl();
    return lookupMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualifier createQualifier()
  {
    QualifierImpl qualifier = new QualifierImpl();
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Meta createMeta()
  {
    MetaImpl meta = new MetaImpl();
    return meta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifierAttribute createQualifierAttribute()
  {
    QualifierAttributeImpl qualifierAttribute = new QualifierAttributeImpl();
    return qualifierAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sList createsList()
  {
    sListImpl sList = new sListImpl();
    return sList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sSet createsSet()
  {
    sSetImpl sSet = new sSetImpl();
    return sSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Props createProps()
  {
    PropsImpl props = new PropsImpl();
    return props;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prop createProp()
  {
    PropImpl prop = new PropImpl();
    return prop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapEntry createMapEntry()
  {
    MapEntryImpl mapEntry = new MapEntryImpl();
    return mapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtilConstant createUtilConstant()
  {
    UtilConstantImpl utilConstant = new UtilConstantImpl();
    return utilConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtilPropertyPath createUtilPropertyPath()
  {
    UtilPropertyPathImpl utilPropertyPath = new UtilPropertyPathImpl();
    return utilPropertyPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtilProperties createUtilProperties()
  {
    UtilPropertiesImpl utilProperties = new UtilPropertiesImpl();
    return utilProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtilList createUtilList()
  {
    UtilListImpl utilList = new UtilListImpl();
    return utilList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtilMap createUtilMap()
  {
    UtilMapImpl utilMap = new UtilMapImpl();
    return utilMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtilSet createUtilSet()
  {
    UtilSetImpl utilSet = new UtilSetImpl();
    return utilSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyFile createPropertyFile()
  {
    PropertyFileImpl propertyFile = new PropertyFileImpl();
    return propertyFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataString createDataString()
  {
    DataStringImpl dataString = new DataStringImpl();
    return dataString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sBoolean createsBooleanFromString(EDataType eDataType, String initialValue)
  {
    sBoolean result = sBoolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertsBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultableBoolean createDefaultableBooleanFromString(EDataType eDataType, String initialValue)
  {
    DefaultableBoolean result = DefaultableBoolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDefaultableBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoWiredType createAutoWiredTypeFromString(EDataType eDataType, String initialValue)
  {
    AutoWiredType result = AutoWiredType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAutoWiredTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumScopedProxy createEnumScopedProxyFromString(EDataType eDataType, String initialValue)
  {
    EnumScopedProxy result = EnumScopedProxy.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumScopedProxyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTypeFilter createEnumTypeFilterFromString(EDataType eDataType, String initialValue)
  {
    EnumTypeFilter result = EnumTypeFilter.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumTypeFilterToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MbeanRegistrationEnum createMbeanRegistrationEnumFromString(EDataType eDataType, String initialValue)
  {
    MbeanRegistrationEnum result = MbeanRegistrationEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMbeanRegistrationEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumIsolation createEnumIsolationFromString(EDataType eDataType, String initialValue)
  {
    EnumIsolation result = EnumIsolation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumIsolationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropagationEnum createPropagationEnumFromString(EDataType eDataType, String initialValue)
  {
    PropagationEnum result = PropagationEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropagationEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpringConfigDslPackage getSpringConfigDslPackage()
  {
    return (SpringConfigDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpringConfigDslPackage getPackage()
  {
    return SpringConfigDslPackage.eINSTANCE;
  }

} //SpringConfigDslFactoryImpl
