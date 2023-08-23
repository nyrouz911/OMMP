// package esprit.tn.OMMP.dao;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

// @Repository
// public class UserDAO {

//     private final JdbcTemplate jdbcTemplate;

//     @Autowired
//     public UserDAO(JdbcTemplate jdbcTemplate) {
//         this.jdbcTemplate = jdbcTemplate;
//     }

//     public int getUserCount() {
//         return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users", Integer.class);
//     }
// }



// // In this structure:

// // The class is named UserDao, which is a common convention for a Data Access Object.
// // The @Repository annotation indicates that this class is a Spring-managed component responsible for data access.
// // The @Autowired annotation on the constructor injects the JdbcTemplate bean into the UserDao class.
// // The getUserCount method uses the injected jdbcTemplate instance to execute a SQL query and return the user count.