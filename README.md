# JAVA JPA
## JPA Project Creation
	-Create Maven Project
	-Add dependencies
		-hibernate-core
		-h2-database
		-junit-jupiter-api
		-junit-jupiter-engine

	-Create folder on src/main/resources/META-INF
	-Convert to JPA Project
		-add database connection

## Entity Manager
  ### Create entity manager factory (emf) from Persistence
         var emf = Persistence.createEntityManagerFactory("name");
          
  ### Create entity manager from emf
         var em = emf.createEntityManager();

## Data type of Entity Class

	- Java primitve types
	- java.lang.String
	- Enumerated types
	- Other entities and/or collections of entities
	- Embeddable classes
	- Other serializable types
		- Wrappers of Java primitive types
		- java.math.BigInteger
		- java.math.BigDecimal
		- java.util.Date
		- java.util.Calendar
		- java.sql.Date
		- java.sql.Time
		- java.sql.Timestamp
		- User-defined serializable types
		- byte[]
		- Byte[]
		- char[]
		- Character[]
		
### Entity class should implement Serializable Interface coz we need to do this if we used Cache for this entity.

