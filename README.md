# sio-skills
Suivi des compétences à évaluer en BTS Services Informatiques aux Organisations (SIO)

## Installation
- Faire un fork de ce repository sur votre compte github
- Importer les issues (Activités et compétences) à partir du fichier csv
  - Installer globalement githubCsvTool
```bash
npm install -g github-csv-tools
```
  - Créer un token github (nécessaire à l'authentification) : https://github.com/settings/tokens
  - Exécuter l'import :
```bash
githubCsvTools myProjectData.csv
```
