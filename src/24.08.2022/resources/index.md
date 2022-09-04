[Back to main Page](./../../../README.md)

# Resources
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.

## Wichtigste Klassen

### Main

```java
public class Main {

	public static void main(String... args) {
		Competition c = new Competition("Rotsee Regatta");
		Ship ship1 = new Ship(1, "Alinghi");
		Ship ship2 = new Ship(2, "Red Baron");
		Ship ship3 = new Ship(3, "Blue Lagoon");
		c.addShip(ship1); //add ships to competition
		c.addShip(ship2);
		c.addShip(ship3);
		c.start(); //start competition
		c.printResult(); //print ships with time

		System.out.println("\n\nGenerated UML:");
		UMLGenerator umlGenerator = new UMLGenerator();
		System.out.println(umlGenerator.generateUmlByPackage(Main.class.getPackageName()));
	}
	
}
```

### Ship

```java
public class Ship {

	private int nummer;
	private String name;
	private int time;

	public int getNummer() {
		return this.nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return this.time;
	}

	public void race() {
		Random random = new Random();
		this.time = random.nextInt(300) + 300;
	}

	public Ship(int nummer, String name) {

		this.nummer = nummer;
		this.name = name;
	}
}
```

### Competition
```java
public class Competition {
	private String name;
	private List<Ship> ships = new ArrayList<>();
	
	public Competition(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addShip(Ship ship) {
		if(ships.size() > 5) {
			System.err.println("Can't add a new Ship");
		}	
		this.ships.add(ship);
	}
	
	public void start() {
		for(Ship ship : this.ships) {
			ship.race();
		}
	}
	public void printResult() {
		for(Ship ship : this.ships) {
			System.out.println(String.format("Number: %s Name: %s Time: %s", ship.getNummer(), ship.getName(), ship.getTime()));
		}
	}
}
```
### UML Generator
```java
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
	
	
	private Set<Class> findAllClasses(String packageName) {
	    Reflections reflections = new Reflections(packageName, new SubTypesScanner(false));
	    return reflections.getSubTypesOf(Object.class)
	      .stream()
	      .collect(Collectors.toSet());
	}
}
```
