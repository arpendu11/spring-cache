# spring-cache
A Spring Boot app to handle multiple caching strategies for REST API
Basically, this repo is implemented by default with Ehcache, but it also supports caching with Redis cluster.

In order to use Redis cluster, do the following steps:
* Open application.properties, and enable the properties commented out and provide required information about your cluster.
* Go to com/practice/config/EhCacheConfig.java, disable all the annotations.
* Go to com/practice/SpringCacheApplication.java, enable @EnableCaching annotation.

## Explanation
* [Caching strategies for REST API in Java using Spring Boot](https://arpendu.hashnode.dev/caching-strategies-for-rest-api-in-java-using-spring-boot-ckd2qt2np00w2scs12fs1db8a)
