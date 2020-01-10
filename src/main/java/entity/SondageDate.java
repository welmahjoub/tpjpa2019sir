package entity;

import java.util.List;

import javax.persistence.OneToMany;

public class SondageDate extends Sondage {

	@OneToMany(mappedBy = "sondage")
	private List<DateReunion> dateProposees;

}
