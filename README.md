# sio-skills
Suivi des compétences en BTS Services Informatiques aux Organisations (SIO)

## Rôle

Ce repository vous permet :
- de créer un pool de ressources relatif à l'acquisition de vos compétences.
- de solliciter vos évaluateurs pour validation.

## Installation
- Faire un [fork de ce repository](https://github.com/jcheron/sio-skills/fork) sur votre compte github.
- Ajouter votre enseignant à la liste des collaborateurs du projet forké. 
- Importer les issues (Activités et compétences) à partir du fichier [issues-import.csv](blob/main/src/issues-import.csv)
  - Installer globalement githubCsvTool
```bash
npm install -g github-csv-tools
```
  - Créer un [token github](https://github.com/settings/tokens) (nécessaire à l'authentification).
  - Exécuter l'import :
```bash
githubCsvTools issues-import.csv
```
- Avec Zenhub, ajouter les issues dans le product backlog.
- Transformer les activités sans compétences en `Epics` et associer leur les compétences (issues) adéquates.
- Ajouter les story points sur les issues.

## Compétences
### Travailler sur une compétence
- Migrer la compétence (issue) vers la colonne `In progress`
- Si des documents doivent être ajoutés au repository, créer une branche correspondant à l'issue. 

### Valider une compétence
- Toute validation requiert des éléments de preuve :
  - liens vers vos productions (repositories, sources),
  - documentation des réalisations, manipulations, mises en oeuvre.
  - documents produits (documents d'analyse, plan de tests, documentation...).
- Publier ces documents vers une branche spécifique, dans le dossier myDocuments
- Ajouter éventuellement un fichier README si vous ajoutez des fichiers, dans chacun des nouveaux dossiers.  
- Faire une Pull request et solliciter une review de votre enseignant pour validation.

Si la compétence ne requiert aucun document (mais uniquement des liens) :
- Mettre un commentaire sur l'issue.
- Faire un ping à votre enseignant (@jcheron) dans l'issue concernée.

### Rythme
- Solliciter 1 à 2 validations par mois au minimum.
- L'objectif est de couvrir l'ensemble des compétences (19 issues) sur la 2ème année de formation.
- Certaines compétences peuvent ne pas être soumises à validation (c'est votre choix).
  


