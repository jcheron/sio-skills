Dans le cadre du projet E-Music j'ai analysé un cahier des charges, celui-ci permet de m'adapter à la conception et la modélisation d'une solution applicative en m'adaptant aux besoins et contraintes.

Les principaux objectifs sont :

- Permettre aux parents de réserver des cours de musique ainsi que d'accèder à un emploi du temps et des factures
- Permettre aux enfants d'également possèder un compte pour accèder à l'emploi du temps
- Permmettre aux professeurs de gérer leurs cours ainsi que la panification, et la location d'instruments

Pour ça j'ai donc crée différentes classes java spécialisé tel que des controlleurs, des repository, modèles, ...

Exemple de code dans le controller de "cours" afin de permettre la création de ces derniers :

'''@GetMapping("newCours")
	public String newCours(ModelMap model, @AuthenticationPrincipal Parent authUser) {
		model.addAttribute("cours", new Cours());
		model.addAttribute("type_cours", typecours.findAll());
		model.addAttribute("instruments", instruments.findAll());
		model.put("userCo", authUser);
		return "cours/formNewCours";
	}
	
'''

