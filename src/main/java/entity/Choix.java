package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Choix {
	
	@Id
	@GeneratedValue
	long id;
	
private Date datechoisie;
private String preferenceAliments, allergies ;

@ManyToOne
private Utilisateur user;

@ManyToOne
private Sondage sondage;


public Date getDatechoisie() {
	return datechoisie;
}
public void setDatechoisie(Date datechoisie) {
	this.datechoisie = datechoisie;
}
public String getPreferenceAliments() {
	return preferenceAliments;
}
public void setPreferenceAliments(String preferenceAliments) {
	this.preferenceAliments = preferenceAliments;
}
public String getAllergies() {
	return allergies;
}

public void setAllergies(String allergies) {
	this.allergies = allergies;
}
public Utilisateur getUser() {
	return user;
}
public void setUser(Utilisateur user) {
	this.user = user;
}
public Sondage getSondage() {
	return sondage;
}
public void setSondage(Sondage sondage) {
	this.sondage = sondage;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

}
