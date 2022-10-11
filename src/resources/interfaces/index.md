# Interfaces
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.

## Wichtigste Klasse
Dieses Mal habe ich zu meinem Game mehrere Waffen hinzugefügt. Diese sind so Modeliert, dass alle von dem Wapon Interface erben

### Wapon Interface

```java
package dev.bbzbl.m320.wapon;

import java.util.Random;

public interface Wapon {
	
	
	public int use(int ap);
	
}
```


### Sword
```java 

package dev.bbzbl.m320.wapon;

import java.util.Random;

public class Sword  implements Wapon{

	Random random = new Random();

	@Override
	public int use(int ap) {
		return ap * random.nextInt(10) * 2;
	}
	
}
```

### Pistol

```java
package dev.bbzbl.m320.wapon;

import java.util.Random;

public class Pistol implements Wapon{

	Random random = new Random();
	
	@Override
	public int use(int ap) {
		return random.nextInt(10) * ap * 5;
	}
	

}
```