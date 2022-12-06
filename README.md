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
         - var emf = Persistence.createEntityManagerFactory("name");
          
  ### Create entity manager from emf
         - var em = emf.createEntityManager();


