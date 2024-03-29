AppFuse Basic Struts Archetype
--------------------------------------------------------------------------------
If you're reading this then you've created your new project using Maven and
appfuse-basic-struts.  You have only created the shell of an AppFuse Java EE
application.  The project object model (pom) is defined in the file pom.xml.
The application is ready to run as a web application. The pom.xml file is
pre-defined with Hibernate as a persistence model and Struts 2 as the web
framework.

To get started, please complete the following steps:

1. Download and install your favorite database.  MySQL is the default for appfuse 
   projects but we're doing our testing for PostgreSQL. Note that with
   PostgreSQL, you'll need a database called "exampleapp" owned by a 
   postgres user.

2. Run "mvn jetty:run-war" and view the application at http://localhost:8080.  For
   PostgreSQL run "mvn jetty:run-war -Ppostgresql"

3. More information can be found at:

   http://appfuse.org/display/APF/QuickStart+Guide

4.  You can now login with admin/admin or user/user

