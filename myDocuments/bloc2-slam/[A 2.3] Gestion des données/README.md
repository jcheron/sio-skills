Dans le cadre du projet d'application E-music ,une base de donn�es type H2(fichier) a �t� cr�e  car �tant un crit�re du cahier des charges.
Base dont le sch�ma est disponible sous forme de capture d'�cran : "sch�ma bdd"(� noter que la  repr�sentation de la base de donn�e n'est pas la version finale ,et est donc suceptible de changer d'ici la fin du projet en question)

L'exploitation des donn�es de la base est effectu�  par l'intermediaire de CRUD qui est une interface pour g�rer une base de donn�es sans avoir � effectu� de requ�te SQL,facilitant grandement la manipulation des donn�es.

En effet, CRUD dispose de m�thode pr�existant pour cr�er; modifier; supprimer; trouver; etc... une donn�e.
Mais il est tout � fait possible de cr�er sois m�me une requ�t personnalis�e pour des besoins sp�cifique � la base de donn�e

La capture d'�cran "Crud" illustre la pr�sentation de l'interface CRUD qui n�cessite <la Classe voulu ,la nature de l'id>

Puis en seconde ligne , il s'agit d'un requ�te personnalis� qui sera traduit en SQL par CRUD pour trouver une donn�e par son username.

La Base de donn�es est accesible une fois l'application lanc�e depuis l'url de l'application + "/h2-console",ce qui affiche un �cran de connexion qui une fois log nous donne acc�s a la base de donn�es .La capture d'�cran "h2 console" illsutre la pr�sentation de la base de donn�es.

