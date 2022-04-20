package cat.itacademy.barcelonactiva.bargunyo.alfonso.s04.t02.n01.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="fruites")
public class Fruita implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name= "NOMBRE", nullable=false,length = 50, unique=true)
	private String nom;
	@Column(name="QuANTITAT QUILOS")
	private int quantitatQuilos;
	
	
	
	public Fruita(int id, String nom, int quantitatQuilos) {
		
		Id = id;
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;
	}
	
	public Fruita() {
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}
	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}


}
