package dev.bbzbl.m320.generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

public class UMLGenerator {
	
	private String generateFields(Class<?> cls) {
		List<String> fields = new ArrayList<>();
		for(Field field : cls.getDeclaredFields()) {
			String accesModifiere = (field.getModifiers() & Modifier.PUBLIC) != 0 ? "+" : "-";
			String fieldName = field.getName();
			String dataType = field.getType().getSimpleName();
			fields.add(accesModifiere +  fieldName  +  " : " + dataType);
		}
		
		
		return String.join("\n", fields);
	}
	
	private String generateMethods(Class<?> cls) {
		List<String> methods = new ArrayList<>();
		for(Method method : cls.getDeclaredMethods()) {
			String accesModifiere = (method.getModifiers() & Modifier.PUBLIC) != 0 ? "+" : "-";
			String paramethers = "";
			for(Parameter paramether : method.getParameters()) {
				paramethers += paramether.getName() +  " : " + paramether.getType().getSimpleName() + " ";
			}
			String name = method.getName() + "("+paramethers+")";

			String returnValue = method.getReturnType().getSimpleName();
			
			methods.add(accesModifiere + name +" : " + returnValue);
		}
		return String.join("\n", methods);
	}
	
	private String generateConstructors(Class<?> cls) {
		List<String> construtors = new ArrayList<>();
		for(Constructor<?> constructor : cls.getDeclaredConstructors()) {
			String accesModifiere = (constructor.getModifiers() & Modifier.PUBLIC) != 0 ? "+" : "-";
			String paramethers = "";
			for(Parameter paramether : constructor.getParameters()) {
				paramethers += paramether.getName() +  " : " + paramether.getType().getSimpleName() + " ";
			}
			String name = cls.getSimpleName() + "("+paramethers+")";
			
			construtors.add(accesModifiere + name);
		}
		return String.join("\n", construtors);
	}
	
	public String generateUml(Class<?> cls){
		String fields = generateFields(cls);
		String constructors = generateConstructors(cls);
		String methods = generateMethods(cls);
		
		
		String uml = "Package: " + cls.getPackageName() + "\n";
		uml +=  "Name: " + cls.getSimpleName() + "\n";
		uml += "---\n";
		uml += fields +"\n";
		uml += "---\n";
		uml += constructors + "\n";
		uml += methods;
		
		return uml;
		
	}
	

	public String generateUmlByPackage(String packageName) {

		String uml = "";
		for(Class<?> cls : findAllClasses(packageName)) {
			uml += "**************************************\n";
			uml += generateUml(cls) + "\n\n";
			uml += "**************************************\n";
		}
		
		return uml;
	}
	
	
	public Set<Class> findAllClasses(String packageName) {
	    Reflections reflections = new Reflections(packageName, new SubTypesScanner(false));
	    return reflections.getSubTypesOf(Object.class)
	      .stream()
	      .collect(Collectors.toSet());
	}
}