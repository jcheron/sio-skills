# SIO-skills
[![GitHub tag](https://img.shields.io/github/tag/jcheron/sio-skills?include_prereleases=&sort=semver&color=blue)](https://github.com/jcheron/sio-skills/releases/)
[![License](https://img.shields.io/badge/License-MIT-blue)](#license)
[![issues - sio-skills](https://img.shields.io/github/issues/jcheron/sio-skills)](https://github.com/jcheron/sio-skills/issues)

Suivi des compétences en BTS Services Informatiques aux Organisations (SIO)

## Rôle

Ce repository vous permet :
- de créer un pool de ressources relatif à l'acquisition de vos compétences.
- de solliciter vos évaluateurs pour validation.

## Installation
- Faire un [fork de ce repository](https://github.com/jcheron/sio-skills/fork) sur votre compte github.
- Ajouter votre enseignant à la liste des collaborateurs du projet forké. 
- Activer les `issues` dans les settings du repository.
- Importer les issues (Activités et compétences) à partir du fichier [issues-import.csv](src/issues-import.csv)
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
- Faire une Pull request vers votre propre repository et solliciter une review de votre enseignant pour validation.

> :no_entry_sign: **Attention**
> - Ne pas créer de **pdf**, mais des fichiers **md** => qui donnent la possibilité de faire la revue
> - Ne pas faire de liens vers Google drive, mais dépôser les documents dans un sous dossier du repository

Si la compétence ne requiert aucun document (mais uniquement des liens) :
- Ajouter quand-même un fichier README.md (ou autre) justifiant de sa mise en oeuvre.
- Faire un ping à votre enseignant (@jcheron) dans l'issue concernée.

### Rythme
- Solliciter 1 à 2 validations par mois au minimum.
- L'objectif est de couvrir l'ensemble des compétences (19 issues) sur la 2ᵉ année de formation.
- Certaines compétences peuvent ne pas être soumises à validation (c'est votre choix).

### Validations soumises
Si vous êtes cités, vous devez faire une demande de validation avant la date indiquée (Validation de compétences avec PR)

#### Stage - S1
- [@Louka](https://github.com/Louka-Fauvel)
- [@Lhans22](https://github.com/Lhans22)
- [@Lorvaill](https://github.com/Lorvaill)
- [@KilianL55](https://github.com/KilianL55)
- [@Xeltax](https://github.com/Xeltax)
- [@Sabrrii](https://github.com/Sabrrii)
- [@PaulG0](https://github.com/PaulG0)
  
#### Archives
- [2023](doc/validations/validations-2023.md)


