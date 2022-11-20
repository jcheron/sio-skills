Dans le cadre du projet d'application E-music ,une base de données type H2(fichier) a été crée  car étant un critère du cahier des charges.
Base dont le schéma est disponible sous forme de capture d'écran : "schéma bdd"(à noter que la  représentation de la base de donnée n'est pas la version finale ,et est donc suceptible de changer d'ici la fin du projet en question)

L'exploitation des données de la base est effectué  par l'intermediaire de CRUD qui est une interface pour gérer une base de données sans avoir à effectué de requête SQL,facilitant grandement la manipulation des données.

En effet, CRUD dispose de méthode préexistant pour créer; modifier; supprimer; trouver; etc... une donnée.
Mais il est tout à fait possible de créer sois même une requêt personnalisée pour des besoins spécifique à la base de donnée

La capture d'écran "Crud" illustre la présentation de l'interface CRUD qui nécessite <la Classe voulu ,la nature de l'id>

Puis en seconde ligne , il s'agit d'un requête personnalisé qui sera traduit en SQL par CRUD pour trouver une donnée par son username.

La Base de données est accesible une fois l'application lancée depuis l'url de l'application + "/h2-console",ce qui affiche un écran de connexion qui une fois log nous donne accès a la base de données .La capture d'écran "h2 console" illsutre la présentation de la base de données.

