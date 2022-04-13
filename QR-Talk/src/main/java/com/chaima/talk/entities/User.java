package com.chaima.talk.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Document(collection =  "user")
	public class User {

		@Id
	    private String id_user;
		@Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
	    private String email;
	    private String password;
	    private String pseudo;
	    private String image;
	

		//private List<Publication> pub;
		public User( String email, String password,String pseudo ) {
			super();
			this.email = email;
			this.password = password;
			this.pseudo = pseudo;
		
		}
		public User( String email, String password,String pseudo,String image ) {
			super();
			this.email = email;
			this.password = password;
			this.pseudo = pseudo;
			this.image=image;
		
		}
}
