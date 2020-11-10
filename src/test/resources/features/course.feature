Feature: Parcours de recherche d'un article

  Scenario: Recherche d'une article connu
	  Given je connais déjà l'article
	  When je le cherche dans les rayons
	  Then je le trouve à sa place
