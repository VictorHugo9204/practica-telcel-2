package mx.com.telcel.practica.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class UserModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="identifier")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	@Column(name="name")
	private String name;	
	
	@Column(name="lastname")
	private String lastName;	
	
	@Column(name="age")
	private int age;
		
	@Column(name="email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name="rol_id" , referencedColumnName="id")
	private RolModel rol;
	
	
	
}
