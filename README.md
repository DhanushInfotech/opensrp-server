# opensrp-server


<a href="https://travis-ci.org/DhanushInfotech/opensrp-server"> <img src="https://travis-ci.org/DhanushInfotech/opensrp-server.svg?branch=doctor-plugin">  </img> </a>
<a href='https://coveralls.io/github/DhanushInfotech/opensrp-server?branch=doctor-plugin'><img src='https://coveralls.io/repos/github/DhanushInfotech/opensrp-server/badge.svg?branch=doctor-plugin' alt='Coverage Status' /></a> 


<b>For a full server build one needs to configure the environment with technology components/programs to install OpenSRP.</b>

1) JDK 1.6 or above (1.7 is recommended)

2) Development Editor

3) CouchDB - port :5984

4) PostgresSQL 9.1

5) ActiveMQ 5.4.2

6) Maven 2 or above

7) Apache-Tomcat 6 or above / Jetty.


Follow the steps below for the Installation of each Component for Linux

1) Install jdk1.7 to run the application
  
  Run the following command from terminal: 
	sudo apt-get install openjdk-7-jdk.  
  	After installing Java, set JAVA_HOME variable

2) For development environment install preferred Java editor Eclipse, NetBeans IDE
    Clone OpenSRP Server git repository from https://github.com/DhanushInfotech/opensrp-server using
    git clone https://github.com/DhanushInfotech/opensrp-server.git

3) For data storage system install No-SQL and browser based database server CouchDB. CouchDB 1.2 is recommended. As CouchDB is     installed from linux store so its version is depended on linux version. To install CouchDB run the following command from terminal:

  $ sudo apt-get install couchdb
  		
	Browse in the url : http://localhost:5984/_utils

	As alternative to install from linux apt-get, install from source also offers more flexibility and cleaner install.
	Install CouchDB prequisites
	
    $ sudo apt-get install g++
    $ sudo apt-get install erlang-base erlang-dev erlang-eunit erlang-nox
    $ sudo apt-get install libmozjs185-dev libicu-dev libcurl4-gnutls-dev libtool
 
	Then go to CouchDB site and choose to download from sources. After download CouchDB, extract it to your preferred folder.
	In a terminal, go to the folder where you extract your CouchDB and run the following command

		$ ./configure
		$ make
		$ sudo make install 
	
	Start CouchDB

		$ sudo couchdb

		Apache CouchDB 1.2.0 (LogLevel=info) is starting.
		Apache CouchDB has started. Time to relax.
		[info] [<0.32.0>] Apache CouchDB has started on http://127.0.0.1:5984/


4) To use OpenSRP reporting module it needs to install PostgreSQL 9.1 or above. To install PostgreSQL execute the commands step by step 

		sudo apt-get install postgresql postgresql-contrib
		
	a) Connect to the default database with user postgres:
		sudo -u postgres psql template1
		
	b) Set the password for user postgres, then exit psql (Ctrl-D) :
		ALTER USER postgres with encrypted password 'xxxxxxx';
		
	c) Edit the pg_hba.conf file :
		sudo vi /etc/postgresql/9.1/main/pg_hba.conf
		Change "peer" to "md5" on the line concerningpostgres:
		local all postgres peer md5
		
	d) Restart the database :
		sudo /etc/init.d/postgresql restart
		
	When postgresql service stops use the command to start
		sudo service postgresql start

5) For using JMS, Quartz, Motech etc. we will need to install Apache ActiveMQ. To install Apache ActiveMQ download it from Apache ActiveMQ 	Site Extract your download to your preferred folder, for example /home/apache-activemq or move it to /opt where optional software package are intendet to be placed

		sudo mv apache-activemq-x.x.x /opt

	Add some configuration to wrapper.conf file by the command
	
		sudo vi /opt/apache-activemq-x.x.x/bin/linux-x86-64/wrapper.conf

	In wrapper.conf configure home and base paths as your directory path and save
	
		set.default.ACTIVEMQ_HOME=/opt/apache-activemq-x.x.x
		set.default.ACTIVEMQ_BASE=/opt/apache-activemq-x.x.x

	Create a soft link in init.d to create an ActiveMQ service
	
		sudo ln -s /opt/apache-activemq-x.x.x/bin/linux-x86-64/activemq /etc/init.d/activemq
		sudo service activemq  start

	To be ensured check the following urls:
		http://localhost:8161/fileserver/

6) Install Maven 2 or above

	sudo apt-get install maven
	Run mvn clean install  
	from the root directory of opensrp-server

7) Install apache-tomcat server or jetty server

	a) Use Maven
	
   	   Navigate to opensrp-server/drishti-reporting directory and run mvn jetty:run
   	   Navigate to opensrp-server/drishti-web directory and run mvn jetty:run

8) To run tests

	mvn test

