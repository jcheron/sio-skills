package viikingit.emusic.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import viikingit.emusic.models.Cartes;
import viikingit.emusic.models.Parent;
import viikingit.emusic.repository.ICartesRepository;
import viikingit.emusic.repository.IParentRepository;

@Controller
public class CartesControlleur {

	@Autowired
	private ICartesRepository carteRepo;

	@Autowired
	private IParentRepository parentRepo;

	@GetMapping("myCard/{id}")
	public String formCarteLog(ModelMap model,@AuthenticationPrincipal Parent authUSer) {
		if(authUSer.getCarte()== null) {
			Cartes cb=new Cartes();
			cb.setUser(authUSer);
			authUSer.setCarte(cb);
			carteRepo.save(cb);
		}
		
		model.put("userCo",authUSer);
		return "/user/FormCartes";
	}

	@PostMapping("myCard/edit")
	public RedirectView addCarte(ModelMap model,@AuthenticationPrincipal Parent authUSer, @ModelAttribute Cartes carte) {
		int toChange = authUSer.getCarte().getId();
		Cartes toAdd =carte;
		toAdd.setId(toChange);
		toAdd.setUser(authUSer);
		authUSer.setCarte(toAdd);
		carteRepo.save(toAdd);
		return new RedirectView("/");
	}

}
