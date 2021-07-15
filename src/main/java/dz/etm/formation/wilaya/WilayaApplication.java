package dz.etm.formation.wilaya;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class WilayaApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(WilayaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		jdbcTemplate.query("select id,actif,compte_creation,compte_maj,date_creation,date_maj,nom_arabe,nom_latin,nom_tamazight from wilaya", 
			    (rs, rowNum) -> new Wilaya( rs.getInt(1), rs.getBoolean(2), rs.getInt(3),
			        		   rs.getInt(4), rs.getString(5), rs.getString(6),
			        		   rs.getString(7), rs.getString(8), rs.getString(9) )
			        		   ).forEach( w -> System.out.println(w.toString()) );
		
	}	

}
