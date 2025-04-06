# Projet GL - Partie 2  
**Nom :** Bourge Perrine

---

## Améliorations apportées :

---

### Ajout de documentation en anglais  
Ajouter de la documentation améliore la clarté du code. Cela permet de comprendre rapidement le rôle d’une méthode sans devoir lire en détail toute son implémentation. Cela facilite également le travail collaboratif.

**Commits :**  
- [d0049a8](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/d0049a895348a4d2a7ca54fcc33d7917fb05efb9)  
- [777fd5b](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/777fd5b372a442a1cbcc91d0d3375d9f8e14b4b6)

---

### Simplification et décomposition d’une méthode  
Des méthodes longues ont été décomposées en plusieurs plus petites. Cela permet une meilleure lisibilité, facilite la maintenance, et respecte le principe de responsabilité unique (Single Responsibility Principle).

**Commits :**  
- [84c35ee](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/84c35eeceb746a7d4f01b610e48c4d0516a3c207)  
- [fe7f0af](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/fe7f0af6451df99c24e314d32343c554429175a5)

---

### Suppression et remplacement de code déprécié  
Les méthodes obsolètes ont été remplacées par des alternatives plus récentes, ce qui permet d’assurer la compatibilité avec les nouvelles versions des bibliothèques utilisées.

**Commits :**  
- [69e036e](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/69e036e965c027e4226a1880215b910a2aa22d24)  
- [323c060](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/323c0602ea045c243fb4d21e345d17af5cb0f1dc)

---

### Suppression de "nombres magiques"  
Les valeurs numériques utilisées directement dans le code ont été remplacées par des constantes nommées, déclarées en haut de la classe. Cela améliore la compréhension et permet une modification centralisée.

**Commit :**  
- [68a770d](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/68a770d0e47b8cf664370de7805328b01bbaffbb)

---

### Suppression de code mort  
Du code inutilisé a été supprimé, ce qui réduit l’encombrement et améliore la lisibilité générale du projet.

**Commit :**  
- [9842b0d](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/9842b0d082ea5e7b9692e1f07cd6256addc48e07)

---

### Réorganisation de l’ordre des attributs et des méthodes  
Les variables et méthodes ont été réorganisées selon les conventions suivantes :  
- Constantes `static final` en haut  
- Attributs d’instance ensuite  
- Méthodes par visibilité : `public`, puis `protected`, `private`  

Cela permet une lecture plus cohérente et structurée des classes.

**Commits :**  
- [a8b529e](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/a8b529edffe30154d8c4bbc3596d8c0ef5dac44f)  
- [f943722](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/f94372294a4e8d162f71a999baddbf3505581201)

---

### Lancement d’une exception en cas de valeur non reconnue  
Une méthode a été modifiée pour qu’elle lève explicitement une exception lorsqu’elle reçoit une valeur invalide ou inconnue. Cela permet d’éviter des comportements silencieux ou inattendus.

**Commit :**  
- [83536e2](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/83536e284f55c8d063e5c7ab367651d2a81e12f9)

---

### Ajout d’un try-catch pour gérer les erreurs  
Une méthode a été modifiée pour mieux gérer les exceptions. Elle gérait auparavant les erreurs en retournant `-1`, ce qui pouvait poser problème car l’erreur n’était pas clairement définie. L’utilisation d’un bloc `try-catch` permet de clarifier le traitement des erreurs et de simplifier leur gestion.

**Commit :**  
- [f7c3dc3](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/f7c3dc30e0f057da7902e3c9c1eda6f2c0ff15ee)

---

### Suppression de code commenté  
Une méthode contenait du code commenté qui n’était donc pas utile et nuisait à la clarté.

**Commit :**  
- [f2271c8](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/f2271c819a245a10fd50760f190709d06a8090b1)

---

### Modification du nom d’une classe  
Le nom d’une classe a été mis à jour pour mieux refléter sa fonction. Étant une classe de test, il était pertinent d’ajouter le terme `Test` dans son nom pour en comprendre la finalité sans avoir à ouvrir le fichier.

**Commit :**  
- [6c63968](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/6c63968a4486aacc651d1e0fa9e8c3549f980305)

---

### Ajout d’un test  
Suppression d’un `@Ignore` qui empêchait l’exécution d’un test sans raison apparente. Cela permet d’améliorer la couverture de test.

**Commit :**  
- [9de3777](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/9de37779ca9244c168fdedc3cf939363838a8bbc)

---

### Suppression de duplication de code
Ajout d'une classe abstraite contenant le code qui était à l'origine dupliqué dans deux classes différentes. Cela permet de faciliter la maintenance, car si il faut modifier cette partie du projet, il faut le faire qu'à un seul endroit.

**Commit :** 
- [771d5ac](https://github.com/Perrine1/webmagic_Bourge_Perrine/commit/771d5ac6f777a2eb60895cfe9fc46cb1e8647945)

---

## Tentatives d’améliorations non abouties :

---

### Traduction des commentaires en chinois  
Beaucoup de commentaires sont en chinois, ce qui rend une partie du projet peu claire pour les personnes ne parlant pas cette langue. Il serait donc pertinent d’uniformiser les commentaires afin qu’ils soient tous proposés en anglais, comme c’est déjà le cas pour le *README* principal. Néanmoins, ne parlant pas cette langue, je ne peux pas effectuer cette modification.

---

### Décomposition d’une "God class"  
J’ai essayé de décomposer la classe `Spider`, qui est une *God class*, mais je n’y suis pas parvenue. Elle gère beaucoup trop de choses à la fois et il est très difficile de la refactorer à cause de toutes ses imbrications. L’idée était de la diviser en six classes :  
- `Spider`, qui coordonnerait les autres  
- `RequestManager`, pour la gestion des requêtes  
- `PipelineRequest`, pour les pipelines  
- `DownloaderManager`, pour les téléchargements  
- `ThreadManager`, pour la gestion des threads  
- `SpiderListenerManager`, pour les événements

---

### Simplification d’un test  
J’ai tenté de modifier la classe de test `XpathSelectorTest` en créant un fichier HTML, à appeler dans une variable, afin de simplifier la gestion de cette classe. Cependant, je n’y suis pas parvenue. J’ai rencontré des difficultés pour créer le fichier HTML à cause de sa taille, et il fallait également adapter le format pour qu’il soit valide.
