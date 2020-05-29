package com.journaldev.Ref;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-03
 * @Description: com.journaldev.Ref
 * @Version:1.0
 */
@Deprecated
public class ConcreteClass extends BaseClass implements BaseInterface {
    public int publicInt;
    private String privateString = "private String";
    protected boolean protectedBoolean;
    Object defaultObject;

    public ConcreteClass(int i) {
        this.publicInt = i;
    }

    @Override
    public void method1() {
        System.out.println("Method1 impl.");
    }

    @Override
    public int method2(String str) {
        System.out.println("Method2 impl.");
        return 0;
    }

    @Override
    public int method4() {
        System.out.println("method4 overriden.");
        return 0;
    }

    public int method5(int i) {
        System.out.println("Method4 overriden.");
        return 0;
    }

    public class ConcreteClassPublicClass {
    }

    private class ConcreteClassPrivateClass {
    }

    protected class ConcreteClassProtectedClass {
    }

    class ConcreteClassDefaultClass {
    }

    enum ConcreteClassDefaultEnum {
    }

    public enum ConcreteClassPublicEnum {
    }

    public interface ConcreteClassPublicInterface {
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<?> concreteClass = ConcreteClass.class;
        System.out.println(concreteClass);

        concreteClass = new ConcreteClass(5).getClass();
        System.out.println(concreteClass);
        try {
            concreteClass = Class.forName("com.journaldev.Ref.ConcreteClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(concreteClass.getCanonicalName());

        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());
        System.out.println(booleanClass);

        Class<?> doubleClass = Double.class;
        System.out.println(doubleClass.getCanonicalName());
        doubleClass = Double.TYPE;
        System.out.println(doubleClass.getCanonicalName());

        Class<?> cDoubleArray = Class.forName("[D");
        System.out.println(cDoubleArray.getCanonicalName());

        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName());

        Class<?> superClass = Class.forName("com.journaldev.Ref.ConcreteClass").getSuperclass();
        System.out.println(superClass.getCanonicalName());
        System.out.println(Object.class.getSuperclass());
        System.out.println(int.class.getSuperclass());

        Class<?>[] classes = concreteClass.getClasses();
        System.out.println(Arrays.toString(classes));
        System.out.println(classes.length);

        Class<?>[] declaredClasses = concreteClass.getDeclaredClasses();
        System.out.println(Arrays.toString(declaredClasses));
        System.out.println(declaredClasses.length);

        Class<?> innerClass = Class.forName("com.journaldev.Ref.ConcreteClass$ConcreteClassDefaultClass");
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());
        System.out.println(Class.forName("com.journaldev.Ref.ConcreteClass").getPackage().getName());

        System.out.println(concreteClass.getModifiers());
        System.out.println(Modifier.toString(concreteClass.getModifiers()));

        System.out.println(Class.forName("com.journaldev.Ref.BaseClass").getModifiers());

        TypeVariable<? extends Class<?>>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();

        for (TypeVariable<?>  typeVariable:typeParameters
             ) {
            System.out.println(typeVariable.getName() + " ,");

        }

        Type[] genericInterfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
        System.out.println(Arrays.toString(genericInterfaces));

        System.out.println(Class.forName("java.util.HashMap").getInterfaces());

        Type[] types=Class.forName("com.journaldev.Ref.ConcreteClass").getGenericInterfaces();
        System.out.println(Arrays.toString(types));

        System.out.println(Arrays.toString(concreteClass.getInterfaces()));

        Method[] methods = Class.forName("com.journaldev.Ref.ConcreteClass").getMethods();
        System.out.println(Arrays.toString(methods));

        Constructor<?>[] constructors = Class.forName("com.journaldev.Ref.ConcreteClass").getConstructors();
        System.out.println(Arrays.toString(constructors));

        Field[] fields = Class.forName("com.journaldev.Ref.ConcreteClass").getFields();
        System.out.println(Arrays.toString(fields));

        Annotation[] annotations=Class.forName("com.journaldev.Ref.ConcreteClass").getAnnotations();
        System.out.println(Arrays.toString(annotations));

        Field field = Class.forName("com.journaldev.Ref.ConcreteClass").getField("baseInt");
        System.out.println(field);

        try {
            Field field1 = Class.forName("com.journaldev.Ref.ConcreteClass").getField("interfaceInt");
            Class<?> field1DeclaringClass = field1.getDeclaringClass();
            System.out.println(field1DeclaringClass.getCanonicalName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(field.getType());

        Field publicInt = Class.forName("com.journaldev.Ref.ConcreteClass").getField("publicInt");
        ConcreteClass concreteClass1 = new ConcreteClass(5);
        System.out.println(publicInt.get(concreteClass1));
        publicInt.setInt(concreteClass1, 1010);
        System.out.println(publicInt.get(concreteClass1));

        Field privateField = Class.forName("com.journaldev.Ref.ConcreteClass").getDeclaredField("privateString");
        privateField.setAccessible(true);
        ConcreteClass objTest = new ConcreteClass(1);
        System.out.println(privateField.get(objTest));
        privateField.set(objTest, "private string updated");
        System.out.println(privateField.get(objTest));

        Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
        Class<?>[] parameterTypes = method.getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes));
        Class<?> returnType = method.getReturnType();
        System.out.println(returnType);
        System.out.println(Modifier.toString(method.getModifiers()));

        Method method1 = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
//        method1.invoke()
        Map<String, String> map=new HashMap<>();
        map.put("k1", "v2");
        try {
            method1.invoke(map, "k2", "v2");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(map);

        Method method2 = Class.forName("com.journaldev.Ref.BaseClass").getDeclaredMethod("method3");
        method2.setAccessible(true);
        method2.invoke(null);

        Constructor<?> constructor = Class.forName("com.journaldev.Ref.ConcreteClass").getConstructor(int.class);
        System.out.println(constructor.getName());
        System.out.println(Arrays.toString(constructor.getParameterTypes()));

        Constructor<?> constructor1 = Class.forName("java.util.HashMap").getConstructor(null);
        System.out.println(Arrays.toString(constructor1.getParameterTypes()));

        Object myObj = constructor.newInstance(10);
        Method myObjMethod = myObj.getClass().getMethod("method1", null);
        myObjMethod.invoke(myObj, null);

    }



}
