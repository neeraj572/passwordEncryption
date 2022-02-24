# passwordEncryption
saving encrypted password using BCryptPasswordEncoder

in this spring starter project i have saved password after encrypting in database
to perform the encryption i have performed below steps 
1> add spring security dependency in pom.xml
2> spring.datasource.generate-unique-name=false  // add this line in application.properties file
3> @SpringBootApplication(exclude=SecurityAutoConfiguration.class) //add this in class from which application execution starts(the class which is marked with the annotation @SpringBootApplication
4> in serviceImpl class create reference variable of password encoder class and store object address of BCryptPasswordEncoder for example:-  PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
5>now use encode method and getter and setter methods to set the get the encrypted password.
done!!!
