package entity;

import java.util.List;

import javax.persistence.OneToMany;

public class SondageLieu extends Sondage {



	@OneToMany(mappedBy = "sondage")
	private List<LieuReunion> lieuProposees;
}
