package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sondage {
	
private String lien; 

@Temporal(TemporalType.DATE)
private Date dateCreation;

@OneToMany(mappedBy = "sondage")
private List<DateReunion> dateProposees;

@OneToMany(mappedBy = "sondage")
private List<Choix> choix;

@Id
@GeneratedValue
private long id;

@ManyToOne(targetEntity=Utilisateur.class)
private Utilisateur user;

public String getLien() {
	return lien;
}

public void setLien(String lien) {
	this.lien = lien;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

public Utilisateur getUser() {
	return user;
}

public void setUser(Utilisateur user) {
	this.user = user;
}



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}
}
