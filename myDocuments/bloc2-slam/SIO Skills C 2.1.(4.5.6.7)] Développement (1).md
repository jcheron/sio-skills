

Durant le projet E-Music j’ai utilisé le framework spring boot.

Compétences utilisés :

\-

\-

Utilisation de composants d’accès aux données

Exploitation des ressources du cadre applicatif (framework)

Pour la compétence composants d'accès aux données nous avons donc utilisé le module du

framework Spring Data JPA qui permet d'interagir avec une base de données.

Voici un exemple de son implémentation :

Voici l’implémentation d’une interface JPA, cette interface permet donc d’accéder aux

données grâce au fait que l’on a étendu **CrudRepository** à l’interfac.

Voici comment injecter le repository dans le code :

Voici l’exemple d’une lecture dans la base de données :

Le but est de trouver tous les enfants qui appartiennent au responsable.





Voici l'exemple de mettre à jour des données dans la base de données :

Pour mettre à jour les données de l’utilisateur connecté, on récupère cette utilisateur grâce

aux modules webSecurity, puis on met à jour les données de cette utilisateur grâce à nos

méthodes set, puis on les sauvegarde grâce à JPA via notre repository.

Pour plus d’exemple consulté le repository Github du projet e-music :

<https://github.com/KilianL55/E-Music>

