# Installation Guide for FutureTransactionService CLI
## Go to project directory
## package it using below command
$ mvn -e package

## Then run the jar file as below
$ java -jar target/FutureTransactions-1.0.jar "./Input.txt" "2010-08-20"


## Output is shown as below
2018-05-14 22:28:54.907  INFO 5840 --- [           main] c.a.s.config.FutureCLIConntroller        : Starting FutureCLIConntroller v1.0 on LENOVO wit
2018-05-14 22:28:54.916  INFO 5840 --- [           main] c.a.s.config.FutureCLIConntroller        : No active profile set, falling back to default p
2018-05-14 22:28:54.981  INFO 5840 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotatio
2018-05-14 22:28:55.614  INFO 5840 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
Output generated at /temp/2010-08-20.csv
2018-05-14 22:28:55.653  INFO 5840 --- [           main] c.a.s.config.FutureCLIConntroller        : Started FutureCLIConntroller in 1.154 seconds (J
2018-05-14 22:28:55.655  INFO 5840 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.A
2018-05-14 22:28:55.657  INFO 5840 --- [       Thread-2] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
