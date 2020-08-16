/**
 * generated by Xtext 2.22.0
 */
package org.xtext.niste15.mdsd.android.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.niste15.mdsd.android.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidFactoryImpl extends EFactoryImpl implements AndroidFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroidFactory init()
  {
    try
    {
      AndroidFactory theAndroidFactory = (AndroidFactory)EPackage.Registry.INSTANCE.getEFactory(AndroidPackage.eNS_URI);
      if (theAndroidFactory != null)
      {
        return theAndroidFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AndroidFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidFactoryImpl()
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
      case AndroidPackage.MODEL: return createModel();
      case AndroidPackage.APPLICATION: return createApplication();
      case AndroidPackage.PANE: return createPane();
      case AndroidPackage.FRAME: return createFrame();
      case AndroidPackage.ELEMENTS: return createElements();
      case AndroidPackage.TEXT: return createText();
      case AndroidPackage.BUTTON: return createButton();
      case AndroidPackage.CONSTRAINT: return createConstraint();
      case AndroidPackage.CONSTRAINT_TYPE_VERTICAL: return createConstraintTypeVertical();
      case AndroidPackage.CONSTRAINT_PARAMETER: return createConstraintParameter();
      case AndroidPackage.RIGHT_OF: return createRightOf();
      case AndroidPackage.LEFT_OF: return createLeftOf();
      case AndroidPackage.BOTTOM_OF: return createBottomOf();
      case AndroidPackage.TOP_OF: return createTopOf();
      case AndroidPackage.PERSENTAGE: return createPersentage();
      case AndroidPackage.RIGHT: return createRight();
      case AndroidPackage.LEFT: return createLeft();
      case AndroidPackage.TOP: return createTop();
      case AndroidPackage.BOTTOM: return createBottom();
      case AndroidPackage.MIDDLE: return createMiddle();
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
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pane createPane()
  {
    PaneImpl pane = new PaneImpl();
    return pane;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Frame createFrame()
  {
    FrameImpl frame = new FrameImpl();
    return frame;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Elements createElements()
  {
    ElementsImpl elements = new ElementsImpl();
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstraintTypeVertical createConstraintTypeVertical()
  {
    ConstraintTypeVerticalImpl constraintTypeVertical = new ConstraintTypeVerticalImpl();
    return constraintTypeVertical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstraintParameter createConstraintParameter()
  {
    ConstraintParameterImpl constraintParameter = new ConstraintParameterImpl();
    return constraintParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RightOf createRightOf()
  {
    RightOfImpl rightOf = new RightOfImpl();
    return rightOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LeftOf createLeftOf()
  {
    LeftOfImpl leftOf = new LeftOfImpl();
    return leftOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BottomOf createBottomOf()
  {
    BottomOfImpl bottomOf = new BottomOfImpl();
    return bottomOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TopOf createTopOf()
  {
    TopOfImpl topOf = new TopOfImpl();
    return topOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Persentage createPersentage()
  {
    PersentageImpl persentage = new PersentageImpl();
    return persentage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Right createRight()
  {
    RightImpl right = new RightImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Left createLeft()
  {
    LeftImpl left = new LeftImpl();
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Top createTop()
  {
    TopImpl top = new TopImpl();
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bottom createBottom()
  {
    BottomImpl bottom = new BottomImpl();
    return bottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Middle createMiddle()
  {
    MiddleImpl middle = new MiddleImpl();
    return middle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndroidPackage getAndroidPackage()
  {
    return (AndroidPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AndroidPackage getPackage()
  {
    return AndroidPackage.eINSTANCE;
  }

} //AndroidFactoryImpl