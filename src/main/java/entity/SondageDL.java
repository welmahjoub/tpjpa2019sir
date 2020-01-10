package entity;

import java.util.List;

import javax.persistence.OneToMany;

public class SondageDL extends Sondage {

	@OneToMany(mappedBy = "sondage")
	private List<DateReunion> dateProposees;

	@OneToMany(mappedBy = "sondage")
	private List<LieuReunion> lieuProposees;
}
