//package br.com.rhribeiro25.forum.configuration
//
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.test.context.DynamicPropertyRegistry
//import org.springframework.test.context.DynamicPropertySource
//import org.testcontainers.containers.GenericContainer
//import org.testcontainers.containers.MySQLContainer
//import org.testcontainers.junit.jupiter.Container
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//abstract class DatabaseContainerConfiguration {
//
//    companion object {
//        @Container
//        private val mysqlContainer = MySQLContainer<Nothing>("mysql:latest").apply {
//            withDatabaseName("testdb")
//            withUsername("joao")
//            withPassword("12345")
//            withReuse(true)
//        }
//
//        @Container
//        private val redisContainer = GenericContainer<Nothing>("redis:latest").apply {
//            withExposedPorts(6379)
//        }
//
//        @JvmStatic
//        @DynamicPropertySource
//        fun properties(registry: DynamicPropertyRegistry) {
//            registry.add("spring.datasource.url", br.com.rhribeiro25.forum.configuration.DatabaseContainerConfiguration.Companion.mysqlContainer::getJdbcUrl)
//            registry.add("spring.datasource.password", br.com.rhribeiro25.forum.configuration.DatabaseContainerConfiguration.Companion.mysqlContainer::getPassword)
//            registry.add("spring.datasource.username", br.com.rhribeiro25.forum.configuration.DatabaseContainerConfiguration.Companion.mysqlContainer::getUsername)
//
//            registry.add("spring.redis.host", br.com.rhribeiro25.forum.configuration.DatabaseContainerConfiguration.Companion.redisContainer::getContainerIpAddress)
//            registry.add("spring.redis.port", br.com.rhribeiro25.forum.configuration.DatabaseContainerConfiguration.Companion.redisContainer::getFirstMappedPort)
//        }
//    }
//}