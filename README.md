# spring-cache
A Spring Boot app to handle multiple caching strategies for REST API
Basically, this repo is implemented by default with Ehcache, but it also supports caching with Redis cluster.

In order to use Redis cluster, do the following steps:
* Open application.properties, and enable the properties commented out and provide required information about your cluster.
* Go to com/practice/config/EhCacheConfig.java, disable all the annotations.
* Go to com/practice/SpringCacheApplication.java, enable @EnableCaching annotation.


